package net.liminalspace.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.liminalspace.init.LiminalSpaceModParticleTypes;
import net.liminalspace.init.LiminalSpaceModMobEffects;
import net.liminalspace.init.LiminalSpaceModDamageSources;

public class MustardGasProjectileHitsPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (LiminalSpaceModParticleTypes.MUSTARD_PARTICLE.get()), x, y, z, 100, 3, 3, 3, 1);
			entity.hurt(LiminalSpaceModDamageSources.MUSTARD_POISONING, 1);
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(LiminalSpaceModMobEffects.MUSTARD_GAS_POISONING.get(), 1200, 1, false, false));
		}
	}
}
