package luu.indepth.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.Direction;
import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import org.joml.Quaternionf;


public class PantherTrunk extends PillarBlock implements RotationAxis {

    protected static final VoxelShape Y_SHAPE = Block.createCuboidShape(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
    protected static final VoxelShape Z_SHAPE = Block.createCuboidShape(5.0, 5.0, 0.0, 11.0, 11.0, 16.0);
    protected static final VoxelShape X_SHAPE = Block.createCuboidShape(0.0, 5.0, 5.0, 16.0, 11.0, 11.0);


    public static final EnumProperty<Direction.Axis> AXIS = Properties.AXIS;


    public PantherTrunk(AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(AXIS, Direction.Axis.Y));
    }


    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return PantherTrunk.changeRotation(state, rotation);
    }

    public static BlockState changeRotation(BlockState state, BlockRotation rotation) {
        switch (rotation) {
            case COUNTERCLOCKWISE_90:
            case CLOCKWISE_90: {
                switch (state.get(AXIS)) {
                    case X: {
                        return state.with(AXIS, Direction.Axis.Z);
                    }
                    case Z: {
                        return state.with(AXIS, Direction.Axis.X);
                    }
                    }
                return state.with(AXIS, Direction.Axis.Y);
            }
        }
        return state;
    }



    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AXIS);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(AXIS, ctx.getSide().getAxis());
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction.Axis i = state.get(AXIS);
        return switch (i) {
            case X -> X_SHAPE;
            case Z -> Z_SHAPE;
            case Y -> Y_SHAPE;
        };
    }


    @Override
    public Quaternionf rotation(float rad) {
        return null;
    }
}