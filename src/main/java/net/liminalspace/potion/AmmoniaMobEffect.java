package net.liminalspace.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class AmmoniaMobEffect extends MobEffect {
	public AmmoniaMobEffect() {
		super(MobEffectCategory.HARMFUL, -1);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
