package net.mariu73.opalescence.block;

import net.mariu73.opalescence.Opalescence;
import net.mariu73.opalescence.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Opalescence.MOD_ID);

    public static final DeferredBlock<Block> OPAL = registerBlock("opal",
            () -> new OpalBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final DeferredBlock<Block> OPAL_STAIRS = registerBlock("opal_stairs",
            () -> new StairBlock(ModBlocks.OPAL.get().defaultBlockState(), BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final DeferredBlock<Block> OPAL_SLAB = registerBlock("opal_slab",
            () -> new SlabBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_GRAY)));


    public static final DeferredBlock<Block> OPAL_CRYSTAL_BLOCK = registerBlock("opal_crystal_block",
            () -> new OpalBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.AMETHYST_BLOCK).mapColor(MapColor.COLOR_LIGHT_GRAY)));

    public static final DeferredBlock<Block> BUDDING_OPAL = registerBlock("budding_opal",
            () -> new BuddingOpalBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_GRAY).randomTicks()));
    public static final DeferredBlock<Block> OPAL_CRYSTAL_CLUSTER = registerBlock("opal_crystal_cluster",
            () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.AMETHYST_CLUSTER).lightLevel((light) -> 9).mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final DeferredBlock<Block> LARGE_OPAL_CRYSTAL_BUD = registerBlock("large_opal_crystal_bud",
            () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.LARGE_AMETHYST_BUD).lightLevel((light) -> 6).mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final DeferredBlock<Block> MEDIUM_OPAL_CRYSTAL_BUD = registerBlock("medium_opal_crystal_bud",
            () -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.MEDIUM_AMETHYST_BUD).lightLevel((light) -> 4).mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final DeferredBlock<Block> SMALL_OPAL_CRYSTAL_BUD = registerBlock("small_opal_crystal_bud",
            () -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.SMALL_AMETHYST_BUD).lightLevel((light) -> 1).mapColor(MapColor.COLOR_LIGHT_GRAY)));

    public static final DeferredBlock<Block> OPAL_BRICKS = registerBlock("opal_bricks",
            () -> new OpalBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final DeferredBlock<Block> OPAL_BRICKS_STAIRS = registerBlock("opal_bricks_stairs",
            () -> new StairBlock(ModBlocks.OPAL_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final DeferredBlock<Block> OPAL_BRICKS_SLAB = registerBlock("opal_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_GRAY)));

    public static final DeferredBlock<Block> SMALL_OPAL_BRICKS = registerBlock("small_opal_bricks",
            () -> new OpalBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final DeferredBlock<Block> SMALL_OPAL_BRICKS_STAIRS = registerBlock("small_opal_bricks_stairs",
            () -> new StairBlock(ModBlocks.SMALL_OPAL_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final DeferredBlock<Block> SMALL_OPAL_BRICKS_SLAB = registerBlock("small_opal_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_GRAY)));

    public static final DeferredBlock<Block> POLISHED_OPAL = registerBlock("polished_opal",
            () -> new OpalBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final DeferredBlock<Block> POLISHED_OPAL_STAIRS = registerBlock("polished_opal_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_OPAL.get().defaultBlockState(), BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final DeferredBlock<Block> POLISHED_OPAL_SLAB = registerBlock("polished_opal_slab",
            () -> new SlabBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_GRAY)));

    public static final DeferredBlock<Block> CHISELED_OPAL = registerBlock("chiseled_opal",
            () -> new OpalBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final DeferredBlock<Block> OPAL_PILLAR = registerBlock("opal_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final DeferredBlock<Block> CUT_OPAL = registerBlock("cut_opal",
            () -> new OpalBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_GRAY)));

    public static final DeferredBlock<Block> OPAL_TILES = registerBlock("opal_tiles",
            () -> new OpalBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final DeferredBlock<Block> OPAL_TILES_STAIRS = registerBlock("opal_tiles_stairs",
            () -> new StairBlock(ModBlocks.OPAL_TILES.get().defaultBlockState(), BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final DeferredBlock<Block> OPAL_TILES_SLAB = registerBlock("opal_tiles_slab",
            () -> new SlabBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_GRAY)));

    public static final DeferredBlock<Block> SMALL_OPAL_TILES = registerBlock("small_opal_tiles",
            () -> new OpalBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final DeferredBlock<Block> SMALL_OPAL_TILES_STAIRS = registerBlock("small_opal_tiles_stairs",
            () -> new StairBlock(ModBlocks.SMALL_OPAL_TILES.get().defaultBlockState(), BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final DeferredBlock<Block> SMALL_OPAL_TILES_SLAB = registerBlock("small_opal_tiles_slab",
            () -> new SlabBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_GRAY)));

    public static final DeferredBlock<Block> OPAL_GLASS = registerBlock("opal_glass",
            () -> new TransparentBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.GLASS).noOcclusion().mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final DeferredBlock<Block> OPAL_GLASS_PANE = registerBlock("opal_glass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.GLASS).noOcclusion().mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final DeferredBlock<Block> OPAL_TILING = registerBlock("opal_tiling",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_GRAY)));


    public static final DeferredBlock<Block> MOONLIT_OPAL = registerBlock("moonlit_opal",
            () -> new MoonOpalBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final DeferredBlock<Block> MOONLIT_OPAL_STAIRS = registerBlock("moonlit_opal_stairs",
            () -> new StairBlock(ModBlocks.MOONLIT_OPAL.get().defaultBlockState(), BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final DeferredBlock<Block> MOONLIT_OPAL_SLAB = registerBlock("moonlit_opal_slab",
            () -> new SlabBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final DeferredBlock<Block> MOONLIT_OPAL_CRYSTAL_BLOCK = registerBlock("moonlit_opal_crystal_block",
            () -> new MoonOpalBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.AMETHYST_BLOCK).mapColor(MapColor.COLOR_LIGHT_BLUE)));

    public static final DeferredBlock<Block> MOONLIT_OPAL_CRYSTAL_CLUSTER = registerBlock("moonlit_opal_crystal_cluster",
            () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.AMETHYST_CLUSTER).lightLevel((light) -> 11).mapColor(MapColor.COLOR_LIGHT_BLUE)));


    public static final DeferredBlock<Block> MOONLIT_OPAL_BRICKS = registerBlock("moonlit_opal_bricks",
            () -> new MoonOpalBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final DeferredBlock<Block> MOONLIT_OPAL_BRICKS_STAIRS = registerBlock("moonlit_opal_bricks_stairs",
            () -> new StairBlock(ModBlocks.MOONLIT_OPAL_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final DeferredBlock<Block> MOONLIT_OPAL_BRICKS_SLAB = registerBlock("moonlit_opal_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_BLUE)));

    public static final DeferredBlock<Block> SMALL_MOONLIT_OPAL_BRICKS = registerBlock("small_moonlit_opal_bricks",
            () -> new MoonOpalBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final DeferredBlock<Block> SMALL_MOONLIT_OPAL_BRICKS_STAIRS = registerBlock("small_moonlit_opal_bricks_stairs",
            () -> new StairBlock(ModBlocks.SMALL_MOONLIT_OPAL_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final DeferredBlock<Block> SMALL_MOONLIT_OPAL_BRICKS_SLAB = registerBlock("small_moonlit_opal_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_BLUE)));

    public static final DeferredBlock<Block> POLISHED_MOONLIT_OPAL = registerBlock("polished_moonlit_opal",
            () -> new MoonOpalBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final DeferredBlock<Block> POLISHED_MOONLIT_OPAL_STAIRS = registerBlock("polished_moonlit_opal_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_MOONLIT_OPAL.get().defaultBlockState(), BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final DeferredBlock<Block> POLISHED_MOONLIT_OPAL_SLAB = registerBlock("polished_moonlit_opal_slab",
            () -> new SlabBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_BLUE)));

    public static final DeferredBlock<Block> CHISELED_MOONLIT_OPAL = registerBlock("chiseled_moonlit_opal",
            () -> new MoonOpalBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final DeferredBlock<Block> MOONLIT_OPAL_PILLAR = registerBlock("moonlit_opal_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final DeferredBlock<Block> CUT_MOONLIT_OPAL = registerBlock("cut_moonlit_opal",
            () -> new OpalBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_BLUE)));

    public static final DeferredBlock<Block> MOONLIT_OPAL_TILES = registerBlock("moonlit_opal_tiles",
            () -> new OpalBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final DeferredBlock<Block> MOONLIT_OPAL_TILES_STAIRS = registerBlock("moonlit_opal_tiles_stairs",
            () -> new StairBlock(ModBlocks.MOONLIT_OPAL_TILES.get().defaultBlockState(), BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final DeferredBlock<Block> MOONLIT_OPAL_TILES_SLAB = registerBlock("moonlit_opal_tiles_slab",
            () -> new SlabBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_BLUE)));

    public static final DeferredBlock<Block> SMALL_MOONLIT_OPAL_TILES = registerBlock("small_moonlit_opal_tiles",
            () -> new OpalBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final DeferredBlock<Block> SMALL_MOONLIT_OPAL_TILES_STAIRS = registerBlock("small_moonlit_opal_tiles_stairs",
            () -> new StairBlock(ModBlocks.SMALL_MOONLIT_OPAL_TILES.get().defaultBlockState(), BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final DeferredBlock<Block> SMALL_MOONLIT_OPAL_TILES_SLAB = registerBlock("small_moonlit_opal_tiles_slab",
            () -> new SlabBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_BLUE)));

    public static final DeferredBlock<Block> MOONLIT_OPAL_GLASS = registerBlock("moonlit_opal_glass",
            () -> new TransparentBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.GLASS).noOcclusion().mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final DeferredBlock<Block> MOONLIT_OPAL_GLASS_PANE = registerBlock("moonlit_opal_glass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.GLASS).noOcclusion().mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final DeferredBlock<Block> MOONLIT_TILING = registerBlock("moonlit_tiling",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_BLUE)));


    public static final DeferredBlock<Block> UNPLEASANT_OPAL = registerBlock("unpleasant_opal",
            () -> new OpalBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_BROWN)));
    public static final DeferredBlock<Block> UNPLEASANT_OPAL_STAIRS = registerBlock("unpleasant_opal_stairs",
            () -> new StairBlock(ModBlocks.UNPLEASANT_OPAL.get().defaultBlockState(), BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_BROWN)));
    public static final DeferredBlock<Block> UNPLEASANT_OPAL_SLAB = registerBlock("unpleasant_opal_slab",
            () -> new SlabBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_BROWN)));

    public static final DeferredBlock<Block> UNPLEASANT_OPAL_CRYSTAL_BLOCK = registerBlock("unpleasant_opal_crystal_block",
            () -> new OpalBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.AMETHYST_BLOCK).mapColor(MapColor.COLOR_BROWN)));

    public static final DeferredBlock<Block> UNPLEASANT_OPAL_CRYSTAL_CLUSTER = registerBlock("unpleasant_opal_crystal_cluster",
            () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.AMETHYST_CLUSTER).lightLevel((light) -> 2).mapColor(MapColor.COLOR_BROWN)));

    public static final DeferredBlock<Block> UNPLEASANT_OPAL_GLASS = registerBlock("unpleasant_opal_glass",
            () -> new TransparentBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.GLASS).noOcclusion().mapColor(MapColor.COLOR_BROWN)));
    public static final DeferredBlock<Block> UNPLEASANT_OPAL_GLASS_PANE = registerBlock("unpleasant_opal_glass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.GLASS).noOcclusion().mapColor(MapColor.COLOR_BROWN)));
    public static final DeferredBlock<Block> FAMILIAR_TILING = registerBlock("familiar_tiling",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).mapColor(MapColor.COLOR_BROWN)));


    public static final DeferredBlock<Block> FIREBLU = registerBlock("fireblu",
            () -> new Block(BlockBehaviour.Properties
                    .ofLegacyCopy(Blocks.STONE).lightLevel((light) -> 1).mapColor(MapColor.COLOR_RED)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> DeferredItem<Item> registerBlockItem(String name, DeferredBlock<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
