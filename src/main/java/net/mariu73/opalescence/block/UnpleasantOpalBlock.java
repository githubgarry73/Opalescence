package net.mariu73.opalescence.block;

import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.joml.Vector3f;

import java.awt.*;

public class UnpleasantOpalBlock extends Block {
    public UnpleasantOpalBlock(Properties pProperties) {
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
        float hue = (float)(Math.cos(x / 16f) + y / 16f + z / 24d);
        hue = Math.abs(hue - (int) hue);
        hue *= 3;
        int third = (int) hue;
        float zeroToOne = hue - third;
        Vector3f startColor = new Vector3f(155, 83, 0);
        Vector3f endColor = new Vector3f(253, 46, 246);
        Vector3f thirdColor = new Vector3f(34,215,29);
        if (third == 1) {
            startColor = endColor;
            endColor = thirdColor;
        }
        if (third == 2) {
            endColor = startColor;
            startColor = thirdColor;
        }
        Vector3f RGBcolor = startColor.lerp(endColor, zeroToOne);
        return vectorToRGB(RGBcolor);
    }

    public static int vectorToRGB (Vector3f vector) {
        return ((255 << 8 | (int) vector.x()) << 8 | (int) vector.y()) << 8 | (int) vector.z();
    }

}
