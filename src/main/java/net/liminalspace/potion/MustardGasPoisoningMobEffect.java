package net.liminalspace.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.liminalspace.procedures.MustardGasPoisoningEffectStartedappliedProcedure;

public class MustardGasPoisoningMobEffect extends MobEffect {
	public MustardGasPoisoningMobEffect() {
		super(MobEffectCategory.HARMFUL, -6711040);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		MustardGasPoisoningEffectStartedappliedProcedure.execute(entity.level, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
