
package net.mcreator.zhengelssaditions.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.zhengelssaditions.init.ZhengelssAditionsModItems;
import net.mcreator.zhengelssaditions.init.ZhengelssAditionsModEnchantments;

import java.util.List;

public class NetherfarmerEnchantment extends Enchantment {
	private static final EnchantmentCategory ENCHANTMENT_CATEGORY = EnchantmentCategory.create("zhengelss_aditions_netherfarmer",
			item -> Ingredient.of(new ItemStack(ZhengelssAditionsModItems.WOODENSCYTHE.get()), new ItemStack(ZhengelssAditionsModItems.STONESCYTHE.get()), new ItemStack(ZhengelssAditionsModItems.ANDESITESCYTHE.get()),
					new ItemStack(ZhengelssAditionsModItems.DIORITESCYTHE.get()), new ItemStack(ZhengelssAditionsModItems.GRANITESCYTHE.get()), new ItemStack(ZhengelssAditionsModItems.COPPERSCYTHE.get()),
					new ItemStack(ZhengelssAditionsModItems.EXPOSEDCOPPERSKYTHE.get()), new ItemStack(ZhengelssAditionsModItems.WEATHEREDCOPPERSKYTHE.get()), new ItemStack(ZhengelssAditionsModItems.OXIDIZEDCOPPERSKYTHE.get()),
					new ItemStack(ZhengelssAditionsModItems.IRONSCYTHE.get()), new ItemStack(ZhengelssAditionsModItems.DIAMONDSKYTHE.get()), new ItemStack(ZhengelssAditionsModItems.AMETHYSTSCYTHE.get()),
					new ItemStack(ZhengelssAditionsModItems.GOLDSKYTHE.get()), new ItemStack(ZhengelssAditionsModItems.NETHERITESKYTHE.get()), new ItemStack(ZhengelssAditionsModItems.WAXEDCOPPERSKYTHE.get()),
					new ItemStack(ZhengelssAditionsModItems.WAXEDEXPOSEDCOPPERSKYTHE.get()), new ItemStack(ZhengelssAditionsModItems.WAXEDWEATHEREDCOPPERSKYTHE.get())).test(new ItemStack(item)));

	public NetherfarmerEnchantment() {
		super(Enchantment.Rarity.UNCOMMON, ENCHANTMENT_CATEGORY, EquipmentSlot.values());
	}

	@Override
	public int getMinCost(int level) {
		return 1 + level * 10;
	}

	@Override
	public int getMaxCost(int level) {
		return 6 + level * 10;
	}

	@Override
	protected boolean checkCompatibility(Enchantment enchantment) {
		return super.checkCompatibility(enchantment) && !List.of(ZhengelssAditionsModEnchantments.AUTOFILL.get()).contains(enchantment);
	}
}
