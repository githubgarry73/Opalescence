package net.mariu73.opalescence.event;

import net.mariu73.opalescence.block.ModBlocks;
import net.mariu73.opalescence.block.MoonOpalBlock;
import net.mariu73.opalescence.block.OpalBlock;
import net.mariu73.opalescence.block.UnpleasantOpalBlock;
import net.mariu73.opalescence.item.ModItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockColorRegisterEvent {

    @SubscribeEvent
    public static void registerBlockColors(RegisterColorHandlersEvent.Block event) {
        event.register((state, blockAndTintGetter, pos, i) -> pos != null ? OpalBlock.getBlockColor(state, blockAndTintGetter, pos, i) : -1,
                ModBlocks.OPAL.get(),
                ModBlocks.OPAL_CRYSTAL_BLOCK.get(),
                ModBlocks.BUDDING_OPAL.get(),
                ModBlocks.OPAL_CRYSTAL_CLUSTER.get(),
                ModBlocks.LARGE_OPAL_CRYSTAL_BUD.get(),
                ModBlocks.MEDIUM_OPAL_CRYSTAL_BUD.get(),
                ModBlocks.SMALL_OPAL_CRYSTAL_BUD.get(),

                ModBlocks.OPAL_STAIRS.get(),
                ModBlocks.OPAL_SLAB.get(),

                ModBlocks.OPAL_BRICKS.get(),
                ModBlocks.OPAL_BRICKS_STAIRS.get(),
                ModBlocks.OPAL_BRICKS_SLAB.get(),

                ModBlocks.SMALL_OPAL_BRICKS.get(),
                ModBlocks.SMALL_OPAL_BRICKS_STAIRS.get(),
                ModBlocks.SMALL_OPAL_BRICKS_SLAB.get(),

                ModBlocks.POLISHED_OPAL.get(),
                ModBlocks.POLISHED_OPAL_STAIRS.get(),
                ModBlocks.POLISHED_OPAL_SLAB.get(),

                ModBlocks.CHISELED_OPAL.get(),
                ModBlocks.OPAL_PILLAR.get(),
                ModBlocks.CUT_OPAL.get(),

                ModBlocks.OPAL_TILES.get(),
                ModBlocks.OPAL_TILES_STAIRS.get(),
                ModBlocks.OPAL_TILES_SLAB.get(),

                ModBlocks.SMALL_OPAL_TILES.get(),
                ModBlocks.SMALL_OPAL_TILES_STAIRS.get(),
                ModBlocks.SMALL_OPAL_TILES_SLAB.get(),

                ModBlocks.OPAL_GLASS.get(),
                ModBlocks.OPAL_GLASS_PANE.get()
        );
        event.register((state, blockAndTintGetter, pos, i) -> pos != null ? MoonOpalBlock.getBlockColor(state, blockAndTintGetter, pos, i) : -1,
                ModBlocks.MOONLIT_OPAL_CRYSTAL_CLUSTER.get(),
                ModBlocks.MOONLIT_OPAL_CRYSTAL_BLOCK.get(),

                ModBlocks.MOONLIT_OPAL.get(),
                ModBlocks.MOONLIT_OPAL_STAIRS.get(),
                ModBlocks.MOONLIT_OPAL_SLAB.get(),

                ModBlocks.MOONLIT_OPAL_BRICKS.get(),
                ModBlocks.MOONLIT_OPAL_BRICKS_STAIRS.get(),
                ModBlocks.MOONLIT_OPAL_BRICKS_SLAB.get(),

                ModBlocks.SMALL_MOONLIT_OPAL_BRICKS.get(),
                ModBlocks.SMALL_MOONLIT_OPAL_BRICKS_STAIRS.get(),
                ModBlocks.SMALL_MOONLIT_OPAL_BRICKS_SLAB.get(),

                ModBlocks.POLISHED_MOONLIT_OPAL.get(),
                ModBlocks.POLISHED_MOONLIT_OPAL_STAIRS.get(),
                ModBlocks.POLISHED_MOONLIT_OPAL_SLAB.get(),

                ModBlocks.CHISELED_MOONLIT_OPAL.get(),
                ModBlocks.MOONLIT_OPAL_PILLAR.get(),
                ModBlocks.CUT_MOONLIT_OPAL.get(),

                ModBlocks.MOONLIT_OPAL_TILES.get(),
                ModBlocks.MOONLIT_OPAL_TILES_STAIRS.get(),
                ModBlocks.MOONLIT_OPAL_TILES_SLAB.get(),

                ModBlocks.SMALL_MOONLIT_OPAL_TILES.get(),
                ModBlocks.SMALL_MOONLIT_OPAL_TILES_STAIRS.get(),
                ModBlocks.SMALL_MOONLIT_OPAL_TILES_SLAB.get(),

                ModBlocks.MOONLIT_OPAL_GLASS.get(),
                ModBlocks.MOONLIT_OPAL_GLASS_PANE.get()
        );
        event.register((state, blockAndTintGetter, pos, i) -> pos != null ? UnpleasantOpalBlock.getBlockColor(state, blockAndTintGetter, pos, i) : -1,
                ModBlocks.UNPLEASANT_OPAL_CRYSTAL_CLUSTER.get(),
                ModBlocks.UNPLEASANT_OPAL.get(),
                ModBlocks.UNPLEASANT_OPAL_SLAB.get(),
                ModBlocks.UNPLEASANT_OPAL_STAIRS.get(),
                ModBlocks.UNPLEASANT_OPAL_CRYSTAL_BLOCK.get(),

                ModBlocks.UNPLEASANT_OPAL_GLASS.get(),
                ModBlocks.UNPLEASANT_OPAL_GLASS_PANE.get()
        );
    }

    @SubscribeEvent
    public static void itemColorHandlerEvent(final RegisterColorHandlersEvent.Item event) {
        event.register(OpalBlock::getItemColor,
                ModItems.OPAL_CRYSTAL.get(),
                ModBlocks.OPAL.get().asItem(),
                ModBlocks.OPAL_CRYSTAL_BLOCK.get().asItem(),
                ModBlocks.BUDDING_OPAL.get().asItem(),
                ModBlocks.OPAL_CRYSTAL_CLUSTER.get().asItem(),
                ModBlocks.LARGE_OPAL_CRYSTAL_BUD.get().asItem(),
                ModBlocks.MEDIUM_OPAL_CRYSTAL_BUD.get().asItem(),
                ModBlocks.SMALL_OPAL_CRYSTAL_BUD.get().asItem(),

                ModBlocks.OPAL_STAIRS.get().asItem().asItem(),
                ModBlocks.OPAL_SLAB.get().asItem().asItem(),

                ModBlocks.OPAL_BRICKS.get().asItem(),
                ModBlocks.OPAL_BRICKS_STAIRS.get().asItem(),
                ModBlocks.OPAL_BRICKS_SLAB.get().asItem(),

                ModBlocks.SMALL_OPAL_BRICKS.get().asItem(),
                ModBlocks.SMALL_OPAL_BRICKS_STAIRS.get().asItem(),
                ModBlocks.SMALL_OPAL_BRICKS_SLAB.get().asItem(),

                ModBlocks.POLISHED_OPAL.get().asItem(),
                ModBlocks.POLISHED_OPAL_STAIRS.get().asItem(),
                ModBlocks.POLISHED_OPAL_SLAB.get().asItem(),

                ModBlocks.CHISELED_OPAL.get().asItem(),
                ModBlocks.OPAL_PILLAR.get().asItem(),
                ModBlocks.CUT_OPAL.get().asItem(),

                ModBlocks.OPAL_TILES.get().asItem(),
                ModBlocks.OPAL_TILES_STAIRS.get().asItem(),
                ModBlocks.OPAL_TILES_SLAB.get().asItem(),

                ModBlocks.SMALL_OPAL_TILES.get().asItem(),
                ModBlocks.SMALL_OPAL_TILES_STAIRS.get().asItem(),
                ModBlocks.SMALL_OPAL_TILES_SLAB.get().asItem(),

                ModBlocks.OPAL_GLASS.get().asItem(),
                ModBlocks.OPAL_GLASS_PANE.get().asItem()
        );
        event.register(MoonOpalBlock::getItemColor,
                ModItems.MOONLIT_OPAL_CRYSTAL.get(),
                ModBlocks.MOONLIT_OPAL_CRYSTAL_CLUSTER.get().asItem(),
                ModBlocks.MOONLIT_OPAL_CRYSTAL_BLOCK.get().asItem(),

                ModBlocks.MOONLIT_OPAL.get().asItem(),
                ModBlocks.MOONLIT_OPAL_STAIRS.get().asItem(),
                ModBlocks.MOONLIT_OPAL_SLAB.get().asItem(),

                ModBlocks.MOONLIT_OPAL_BRICKS.get().asItem(),
                ModBlocks.MOONLIT_OPAL_BRICKS_STAIRS.get().asItem(),
                ModBlocks.MOONLIT_OPAL_BRICKS_SLAB.get().asItem(),

                ModBlocks.SMALL_MOONLIT_OPAL_BRICKS.get().asItem(),
                ModBlocks.SMALL_MOONLIT_OPAL_BRICKS_STAIRS.get().asItem(),
                ModBlocks.SMALL_MOONLIT_OPAL_BRICKS_SLAB.get().asItem(),

                ModBlocks.POLISHED_MOONLIT_OPAL.get().asItem(),
                ModBlocks.POLISHED_MOONLIT_OPAL_STAIRS.get().asItem(),
                ModBlocks.POLISHED_MOONLIT_OPAL_SLAB.get().asItem(),

                ModBlocks.CHISELED_MOONLIT_OPAL.get().asItem(),
                ModBlocks.MOONLIT_OPAL_PILLAR.get().asItem(),
                ModBlocks.CUT_MOONLIT_OPAL.get().asItem(),

                ModBlocks.MOONLIT_OPAL_TILES.get().asItem(),
                ModBlocks.MOONLIT_OPAL_TILES_STAIRS.get().asItem(),
                ModBlocks.MOONLIT_OPAL_TILES_SLAB.get().asItem(),

                ModBlocks.SMALL_MOONLIT_OPAL_TILES.get().asItem(),
                ModBlocks.SMALL_MOONLIT_OPAL_TILES_STAIRS.get().asItem(),
                ModBlocks.SMALL_MOONLIT_OPAL_TILES_SLAB.get().asItem(),

                ModBlocks.MOONLIT_OPAL_GLASS.get().asItem(),
                ModBlocks.MOONLIT_OPAL_GLASS_PANE.get().asItem()
        );
        event.register(UnpleasantOpalBlock::getItemColor,
                ModItems.UNPLEASANT_OPAL_CRYSTAL.get(),
                ModBlocks.UNPLEASANT_OPAL_CRYSTAL_CLUSTER.get().asItem(),
                ModBlocks.UNPLEASANT_OPAL.get().asItem(),
                ModBlocks.UNPLEASANT_OPAL_SLAB.get().asItem(),
                ModBlocks.UNPLEASANT_OPAL_STAIRS.get().asItem(),
                ModBlocks.UNPLEASANT_OPAL_CRYSTAL_BLOCK.get().asItem(),

                ModBlocks.UNPLEASANT_OPAL_GLASS.get().asItem(),
                ModBlocks.UNPLEASANT_OPAL_GLASS_PANE.get().asItem()
        );
    }
}
