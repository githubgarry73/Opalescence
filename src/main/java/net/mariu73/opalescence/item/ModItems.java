package net.mariu73.opalescence.item;

import net.mariu73.opalescence.Opalescence;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Opalescence.MOD_ID);

    public static final RegistryObject<Item> OPAL_CRYSTAL = ITEMS.register("opal_crystal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOONLIT_OPAL_CRYSTAL = ITEMS.register("moonlit_opal_crystal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> UNPLEASANT_OPAL_CRYSTAL = ITEMS.register("unpleasant_opal_crystal",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
