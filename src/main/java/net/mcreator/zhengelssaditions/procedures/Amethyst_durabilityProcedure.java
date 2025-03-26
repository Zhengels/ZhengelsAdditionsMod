package net.mcreator.zhengelssaditions.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class Amethyst_durabilityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		itemstack.getOrCreateTag().putDouble("durablility", (itemstack.getOrCreateTag().getDouble("durablility") + 1));
		if (itemstack.getOrCreateTag().getDouble("durablility") >= 60 && EnchantmentHelper.getItemEnchantmentLevel(Enchantments.UNBREAKING, itemstack) != 0) {
			if (Math.random() < 0.001) {
				{
					ItemStack _ist = itemstack;
					if (_ist.hurt(255, RandomSource.create(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item.break")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item.break")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
			}
		} else if (itemstack.getOrCreateTag().getDouble("durablility") >= 60) {
			if (Math.random() < 0.014) {
				{
					ItemStack _ist = itemstack;
					if (_ist.hurt(255, RandomSource.create(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item.break")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item.break")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
			}
		} else if (itemstack.getOrCreateTag().getDouble("durablility") >= 15) {
			if (Math.random() < 0.007) {
				{
					ItemStack _ist = itemstack;
					if (_ist.hurt(255, RandomSource.create(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item.break")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item.break")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
			}
		}
	}
}
