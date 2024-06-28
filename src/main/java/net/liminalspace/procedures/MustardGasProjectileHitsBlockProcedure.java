package net.liminalspace.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.liminalspace.init.LiminalSpaceModParticleTypes;

public class MustardGasProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double baseRate = 0;
		double rateWithAmplifier = 0;
		double particleRadius = 0;
		double particleAmount = 0;
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (LiminalSpaceModParticleTypes.MUSTARD_PARTICLE.get()), x, y, z, 100, 3, 3, 3, 1);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 3, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 3, 1, false);
			}
		}
	}
}
