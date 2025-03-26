package net.mcreator.zhengelssaditions.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.zhengelssaditions.init.ZhengelssAditionsModEnchantments;

public class KnucklesarmtickProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("zhengelss_aditions:knuckles")))) {
			if (itemstack.getOrCreateTag().getDouble("rage") > 15) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 5, 2, false, false));
			} else if (itemstack.getOrCreateTag().getDouble("rage") > 10) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 5, 1, false, false));
			} else if (itemstack.getOrCreateTag().getDouble("rage") > 5) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 5, 0, false, false));
			}
			if (itemstack.getOrCreateTag().getDouble("rage") > 24 && EnchantmentHelper.getItemEnchantmentLevel(ZhengelssAditionsModEnchantments.RAGE.get(), itemstack) != 0) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 5, 1, false, false));
			} else if (itemstack.getOrCreateTag().getDouble("rage") > 7 && EnchantmentHelper.getItemEnchantmentLevel(ZhengelssAditionsModEnchantments.RAGE.get(), itemstack) != 0) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 5, 0, false, false));
			}
		}
	}
}
