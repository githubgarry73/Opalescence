package net.mariu73.opalescence.item;

import net.mariu73.opalescence.Opalescence;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(Opalescence.MOD_ID);

    public static final DeferredItem<Item> OPAL_CRYSTAL = ITEMS.register("opal_crystal",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MOONLIT_OPAL_CRYSTAL = ITEMS.register("moonlit_opal_crystal",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPLEASANT_OPAL_CRYSTAL = ITEMS.register("unpleasant_opal_crystal",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
