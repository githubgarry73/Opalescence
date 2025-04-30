package net.mariu73.opalescence;

import com.mojang.logging.LogUtils;
import net.mariu73.opalescence.block.ModBlocks;
import net.mariu73.opalescence.item.ModCreativeModeTabs;
import net.mariu73.opalescence.item.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(Opalescence.MOD_ID)
public class Opalescence
{
    public static final String MOD_ID = "opalescence";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Opalescence()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
