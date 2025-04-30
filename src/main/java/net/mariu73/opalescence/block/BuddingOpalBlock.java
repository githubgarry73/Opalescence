package net.mariu73.opalescence.block;

import net.mariu73.opalescence.util.ModBlockTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;

import static net.minecraft.world.level.block.ComposterBlock.LEVEL;

public class BuddingOpalBlock extends OpalBlock {
    public static final int GROWTH_CHANCE = 2;
    private static final Direction[] DIRECTIONS = Direction.values();

    public BuddingOpalBlock(BlockBehaviour.Properties pProperties) {
        super(pProperties);
    }

    public void randomTick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
        if (pLevel.isClientSide) return;
        if (pRandom.nextInt(GROWTH_CHANCE) == 0) {
            Direction direction = DIRECTIONS[pRandom.nextInt(DIRECTIONS.length)];
            BlockPos dirPos = pPos.relative(direction);
            boolean skylight = pLevel.canSeeSky(dirPos);
            BlockState dirState = pLevel.getBlockState(dirPos);
            Block cluster = null;
            if (canClusterGrowAtState(dirState)) {
                cluster = ModBlocks.SMALL_OPAL_CRYSTAL_BUD.get();
            } else if (dirState.is(ModBlocks.SMALL_OPAL_CRYSTAL_BUD.get()) && dirState.getValue(AmethystClusterBlock.FACING) == direction) {
                cluster = ModBlocks.MEDIUM_OPAL_CRYSTAL_BUD.get();
            } else if (dirState.is(ModBlocks.MEDIUM_OPAL_CRYSTAL_BUD.get()) && dirState.getValue(AmethystClusterBlock.FACING) == direction) {
                cluster = ModBlocks.LARGE_OPAL_CRYSTAL_BUD.get();
            } else if (dirState.is(ModBlocks.LARGE_OPAL_CRYSTAL_BUD.get()) && dirState.getValue(AmethystClusterBlock.FACING) == direction) {
                cluster = ModBlocks.OPAL_CRYSTAL_CLUSTER.get();
            } else if (dirState.is(ModBlocks.OPAL_CRYSTAL_CLUSTER.get()) && dirState.getValue(AmethystClusterBlock.FACING) == direction) {
                if (isUnpleasant(pLevel.getBlockState(pPos.below()))) {
                    cluster = ModBlocks.UNPLEASANT_OPAL_CRYSTAL_CLUSTER.get();
                } else if (pLevel.getBlockState(pPos.below()).is(ModBlockTags.MAKES_OPAL_MOONLIT)) {
                    cluster = ModBlocks.MOONLIT_OPAL_CRYSTAL_CLUSTER.get();
                }
            } else if (dirState.is(ModBlocks.OPAL_CRYSTAL_CLUSTER.get()) && dirState.getValue(AmethystClusterBlock.FACING) == direction
                    && skylight
                    && (pLevel.getMoonPhase() < 3 || pLevel.getMoonPhase() > 5)
                    && pLevel.getTimeOfDay(pLevel.dayTime()) > 0.35f
                    && pLevel.getTimeOfDay(pLevel.dayTime()) < 0.65f) {
                cluster = ModBlocks.MOONLIT_OPAL_CRYSTAL_CLUSTER.get();
            }



            if (cluster != null) {
                BlockState newState = (BlockState)((BlockState) cluster.defaultBlockState().setValue(AmethystClusterBlock.FACING, direction)).setValue(AmethystClusterBlock.WATERLOGGED, dirState.getFluidState().getType() == Fluids.WATER);
                pLevel.setBlockAndUpdate(dirPos, newState);
            }

        }
    }

    public static boolean canClusterGrowAtState(BlockState pState) {
        return pState.isAir() || pState.is(Blocks.WATER) && pState.getFluidState().getAmount() == 8;
    }

    private boolean isUnpleasant(BlockState state) {
        return state.is(ModBlockTags.MAKES_OPAL_UNPLEASANT) || state == Blocks.COMPOSTER.defaultBlockState().setValue(LEVEL, 8);
    }
}
