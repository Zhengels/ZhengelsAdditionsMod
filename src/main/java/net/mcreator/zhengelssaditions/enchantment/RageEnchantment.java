
package net.mcreator.zhengelssaditions.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.zhengelssaditions.init.ZhengelssAditionsModItems;

public class RageEnchantment extends Enchantment {
	private static final EnchantmentCategory ENCHANTMENT_CATEGORY = EnchantmentCategory.create("zhengelss_aditions_rage",
			item -> Ingredient.of(new ItemStack(ZhengelssAditionsModItems.IRONKNUCKLES.get()), new ItemStack(ZhengelssAditionsModItems.GOLDENKNUCKLES.get()), new ItemStack(ZhengelssAditionsModItems.DIAMONDKNUCKLES.get()),
					new ItemStack(ZhengelssAditionsModItems.NETHERITEKNUCKLES.get()), new ItemStack(ZhengelssAditionsModItems.COPPERKNUCKLES.get()), new ItemStack(ZhengelssAditionsModItems.EXPOSEDCOPPERKNUCKLES.get()),
					new ItemStack(ZhengelssAditionsModItems.WEATHEREDCOPPERKNUCKLES.get()), new ItemStack(ZhengelssAditionsModItems.OXIDIZEDCOPPERKNUCKLES.get()), new ItemStack(ZhengelssAditionsModItems.WAXEDCOPPERKNUCKLES.get()),
					new ItemStack(ZhengelssAditionsModItems.WAXEDEXPOSEDCOPPERKNUCKLES.get()), new ItemStack(ZhengelssAditionsModItems.WAXEDWEATHEREDCOPPERKNUCKLES.get())).test(new ItemStack(item)));

	public RageEnchantment() {
		super(Enchantment.Rarity.RARE, ENCHANTMENT_CATEGORY, EquipmentSlot.values());
	}

	@Override
	public int getMinCost(int level) {
		return 1 + level * 10;
	}

	@Override
	public int getMaxCost(int level) {
		return 6 + level * 10;
	}
}
