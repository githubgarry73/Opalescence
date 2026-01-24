package net.mariu73.opalescence.block;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.Nullable;

public class EmissableSlabBlock extends SlabBlock {

    public static final BooleanProperty EMISSIVE = EmissableBlock.EMISSIVE;

    public EmissableSlabBlock(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.defaultBlockState().setValue(EMISSIVE, false));
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(new Property[]{TYPE, WATERLOGGED, EMISSIVE});
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        ItemStack itemInHand = pPlayer.getItemInHand(pHand);
        if (itemInHand.is(Items.GLOW_INK_SAC)) {
            if (!pLevel.isClientSide) {
                pLevel.playSound(null, pPos, SoundEvents.AMETHYST_BLOCK_STEP, SoundSource.BLOCKS, 0.6f, 1.2f);
                pLevel.setBlockAndUpdate(pPos, pState.cycle(EMISSIVE));
            }
            return InteractionResult.SUCCESS;
        }
        return super.use(pState, pLevel, pPos, pPlayer, pHand, pHit);
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext pContext) {
        BlockState ret = super.getStateForPlacement(pContext);
        if (pContext.getPlayer() != null && pContext.getPlayer().getItemInHand(InteractionHand.OFF_HAND).is(Items.GLOW_INK_SAC)) {
            return ret.setValue(EMISSIVE, true);
        }
        return ret;
    }

    @Override
    public void onPlace(BlockState pState, Level pLevel, BlockPos pPos, BlockState pOldState, boolean pMovedByPiston) {
        if (pState.getValue(EMISSIVE) && !pLevel.isClientSide) {
            pLevel.playSound(null, pPos, SoundEvents.AMETHYST_BLOCK_STEP, SoundSource.BLOCKS, 0.6f, 1.2f);
        }
        super.onPlace(pState, pLevel, pPos, pOldState, pMovedByPiston);
    }
}
