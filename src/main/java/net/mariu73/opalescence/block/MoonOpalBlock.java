package net.mariu73.opalescence.block;

import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class MoonOpalBlock extends Block {

    public MoonOpalBlock(Properties pProperties) {
        super(pProperties);
    }

    public static int getBlockColor(BlockState state, BlockAndTintGetter blockAndTintGetter, BlockPos pos, int i) {
        return getColor(pos.getX(), pos.getY(), pos.getZ());
    }

    public static int getItemColor(ItemStack stack, int i) {
        LocalPlayer player = Minecraft.getInstance().player;
        if (player != null) return getColor(player.getX(), player.getY() + 1, player.getZ());
        return -1;
    }

    public static int getColor(double x, double y, double z) {
        float zeroToOne = (float)(Math.sin(z / 32f) + y / 24f + x / 48d);
        zeroToOne = Math.abs(zeroToOne - (int) zeroToOne);
        float hue = Math.abs(zeroToOne - 0.5f) / 2 + 0.5f;
        float saturation = (Math.abs(zeroToOne - 0.5f) / 2 + 0.25f) / 3;
        return Mth.hsvToRgb(hue,saturation,1);
    }

}
