package luu.indepth.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldAccess;

public class Puffball extends Block {
    public Puffball(Settings settings) {
        super(settings);
    }

    public void onBroken(WorldAccess world, BlockPos pos, BlockState state) {

    }
}
