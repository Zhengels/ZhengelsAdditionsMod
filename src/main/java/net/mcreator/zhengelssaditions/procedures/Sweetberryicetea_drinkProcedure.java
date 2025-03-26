package net.mcreator.zhengelssaditions.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class Sweetberryicetea_drinkProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.clearFire();
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.HEAL, 5, 0, false, false));
	}
}
