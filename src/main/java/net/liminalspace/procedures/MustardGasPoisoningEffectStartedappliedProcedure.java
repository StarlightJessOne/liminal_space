package net.liminalspace.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.liminalspace.init.LiminalSpaceModDamageSources;

public class MustardGasPoisoningEffectStartedappliedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double baseRate = 0;
		double rateWithAmplifier = 0;
		entity.hurt(LiminalSpaceModDamageSources.MUSTARD_POISONING, 1);
	}
}
