package net.mariu73.opalescence.util;

import net.mariu73.opalescence.Opalescence;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModBlockTags {

    public static TagKey<Block> MAKES_OPAL_UNPLEASANT = tag("makes_opal_unpleasant");
    public static TagKey<Block> MAKES_OPAL_MOONLIT = tag("makes_opal_moonlit");

    private static TagKey<Block> tag(String name){
        return BlockTags.create(ResourceLocation.fromNamespaceAndPath(Opalescence.MOD_ID, name));
    }
}
