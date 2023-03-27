package luu.indepth.block.custom;

import net.minecraft.block.*;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Optional;

public class DepthsFungusBlock extends MushroomPlantBlock {
    protected static final VoxelShape SHAPE = Block.createCuboidShape(7.0, 0.0, 7.0, 11.0, 10.0, 11.0);
	private final RegistryKey<ConfiguredFeature<?, ?>> featureKey;

	public DepthsFungusBlock(Settings settings, RegistryKey<ConfiguredFeature<?, ?>> featureKey) {
		super(settings, featureKey);
		this.featureKey = featureKey;
	}

	@Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Vec3d vec3d = state.getModelOffset(world, pos);
        return SHAPE.offset(vec3d.x, vec3d.y, vec3d.z);
    }

	@Override
	public boolean trySpawningBigMushroom(ServerWorld world, BlockPos pos, BlockState state, Random random) {
		Optional<RegistryEntry.Reference<ConfiguredFeature<?, ?>>> optional = world.getRegistryManager().get(RegistryKeys.CONFIGURED_FEATURE).getEntry(this.featureKey);
		if (optional.isEmpty()) {
			return false;
		}
		world.removeBlock(pos, false);
		if (((ConfiguredFeature<?, ?>)((RegistryEntry<?>)optional.get()).value()).generate(world, world.getChunkManager().getChunkGenerator(), random, pos)) {
			return true;
		}
		world.setBlockState(pos, state, Block.NOTIFY_ALL);
		return false;
	}

  	@Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isIn(BlockTags.NYLIUM) || floor.isIn(BlockTags.BASE_STONE_NETHER) || floor.isIn(BlockTags.DIRT) ||
				floor.isIn(BlockTags.BASE_STONE_OVERWORLD) || floor.isOf(Blocks.MYCELIUM) ||
				floor.isOf(Blocks.SOUL_SOIL) || super.canPlantOnTop(floor, world, pos);
    }

	@Override
	public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state, boolean isClient) { return true; }

	@Override
	public boolean canGrow(World world, net.minecraft.util.math.random.Random random, BlockPos pos, BlockState state) { return true; }

	@Override
	public void grow(ServerWorld world, net.minecraft.util.math.random.Random random, BlockPos pos, BlockState state) {
		this.trySpawningBigMushroom(world, pos, state, random);
	}
}
