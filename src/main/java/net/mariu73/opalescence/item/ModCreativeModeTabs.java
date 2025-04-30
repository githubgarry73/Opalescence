package net.mariu73.opalescence.item;

import net.mariu73.opalescence.Opalescence;
import net.mariu73.opalescence.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Opalescence.MOD_ID);

    public static final RegistryObject<CreativeModeTab> OPALESCENCE_TAB = CREATIVE_MODE_TABS.register("opalescence_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.OPAL.get()))
                    .title(Component.translatable("creativetab.opalescence_tab"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        for(RegistryObject<Block> block: ModBlocks.BLOCKS.getEntries()){
                            output.accept(block.get());
                        }
                        for(RegistryObject<Item> item: ModItems.ITEMS.getEntries()){
                            output.accept(item.get());
                        }
                    }))
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
