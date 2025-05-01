package net.mariu73.opalescence.block;

import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class OpalBlock extends Block {

    public OpalBlock(Properties pProperties) {
        super(pProperties);
    }

    // TODO: eliminate the block classes and move the color getters into the event class

    public static int getBlockColor(BlockState state, BlockAndTintGetter blockAndTintGetter, BlockPos pos, int i) {
        return getColor(pos.getX(), pos.getY(), pos.getZ());
    }

    public static int getItemColor(ItemStack stack, int i) {
        LocalPlayer player = Minecraft.getInstance().player;
        if (player != null) return getColor(player.getX(), player.getY() + 1, player.getZ());
        return -1;
    }

    public static int getColor(double x, double y, double z) {
        float hue = (float)(Math.sin(x / 32f) + y / 24f + z / 48d);
        hue = hue - (int) hue;
        return Mth.hsvToRgb(hue,0.45f,1);
    }

}
