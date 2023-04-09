package luu.indepth.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CampfireBlock;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class ModCampfireBlock extends CampfireBlock {
	private final boolean emitsParticles;
	public static final BooleanProperty SIGNAL_FIRE = Properties.SIGNAL_FIRE;

	public ModCampfireBlock(boolean emitsParticles, int fireDamage, Settings settings) {
		super(emitsParticles, fireDamage, settings); 	this.emitsParticles = emitsParticles;
		this.setDefaultState(this.stateManager.getDefaultState().with(LIT, true)
				.with(SIGNAL_FIRE, false).with(WATERLOGGED, false).with(FACING, Direction.NORTH));}

	@Override public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
		if (state.get(LIT)) {
			if (random.nextInt(10) == 0) {
				world.playSound((double)pos.getX() + 0.5, (double)pos.getY() + 0.5, (double)pos.getZ() + 0.5,
						SoundEvents.BLOCK_CAMPFIRE_CRACKLE, SoundCategory.BLOCKS, 0.5F + random.nextFloat(),
						random.nextFloat() * 0.7F + 0.6F, false); }

			if (this.emitsParticles && random.nextInt(5) == 0) {
				for (int i = 0; i < random.nextInt(1) + 1; ++i) {
					world.addParticle(ParticleTypes.LAVA,
							(double) pos.getX() + 0.5, (double) pos.getY() + 0.5, (double) pos.getZ() + 0.5,
							random.nextFloat(), 5.0E-5, random.nextFloat());}}

			spawnSmokeParticle(world, pos, state.get(SIGNAL_FIRE), true); } }

	public static void spawnSmokeParticle(World world, BlockPos pos, boolean isSignal, boolean lotsOfSmoke) {
		Random random = world.getRandom();
		DefaultParticleType defaultParticleType = isSignal ? ParticleTypes.CAMPFIRE_SIGNAL_SMOKE : ParticleTypes.CAMPFIRE_COSY_SMOKE;
		world.addImportantParticle(defaultParticleType, true,
				(double)pos.getX() + 0.5 + random.nextDouble() / 3.0 * (double)(random.nextBoolean() ? 1 : -1),
				(double)pos.getY() + random.nextDouble() + random.nextDouble() + random.nextDouble(),
				(double)pos.getZ() + 0.5 + random.nextDouble() / 3.0 * (double)(random.nextBoolean() ? 1 : -1),
				0.0, 0.0017, 0.0);
		if (lotsOfSmoke) {
			world.addParticle(ParticleTypes.CLOUD,
					(double)pos.getX() + 0.5 + random.nextDouble() / 4.0 * (double)(random.nextBoolean() ? 1 : -1),
					(double)pos.getY() + 0.7,
					(double)pos.getZ() + 0.5 + random.nextDouble() / 4.0 * (double)(random.nextBoolean() ? 1 : -1),
					0.0, 0.0015, 0.0);
		}}

	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(LIT, SIGNAL_FIRE, WATERLOGGED, FACING); } }












