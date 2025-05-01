package net.mariu73.opalescence;

import com.mojang.logging.LogUtils;
import net.mariu73.opalescence.block.ModBlocks;
import net.mariu73.opalescence.item.ModCreativeModeTabs;
import net.mariu73.opalescence.item.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(Opalescence.MOD_ID)
public class Opalescence
{
    public static final String MOD_ID = "opalescence";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Opalescence(IEventBus modEventBus)
    {
        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
    }
}
