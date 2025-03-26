
package net.mcreator.zhengelssaditions.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.zhengelssaditions.init.ZhengelssAditionsModItems;
import net.mcreator.zhengelssaditions.init.ZhengelssAditionsModEnchantments;

import java.util.List;

public class AutofillEnchantment extends Enchantment {
	private static final EnchantmentCategory ENCHANTMENT_CATEGORY = EnchantmentCategory.create("zhengelss_aditions_autofill",
			item -> Ingredient
					.of(new ItemStack(ZhengelssAditionsModItems.WOODENHAMMER.get()), new ItemStack(ZhengelssAditionsModItems.STONEHAMMER.get()), new ItemStack(ZhengelssAditionsModItems.GRANITEHAMMER.get()),
							new ItemStack(ZhengelssAditionsModItems.ANDESITEHAMMER.get()), new ItemStack(ZhengelssAditionsModItems.DIORITEHAMMER.get()), new ItemStack(ZhengelssAditionsModItems.DEEPSLATEHAMMER.get()),
							new ItemStack(ZhengelssAditionsModItems.COPPERHAMMER.get()), new ItemStack(ZhengelssAditionsModItems.EXPOSEDCOPPERHAMMER.get()), new ItemStack(ZhengelssAditionsModItems.WEATHEREDCOPPERHAMMER.get()),
							new ItemStack(ZhengelssAditionsModItems.OXIDIZEDCOPPERHAMMER.get()), new ItemStack(ZhengelssAditionsModItems.WAXEDCOPPERHAMMER.get()), new ItemStack(ZhengelssAditionsModItems.WAXEDEXPOSEDCOPPERHAMMER.get()),
							new ItemStack(ZhengelssAditionsModItems.WAXEDWEATHEREDCOPPERHAMMER.get()), new ItemStack(ZhengelssAditionsModItems.GOLDENHAMMER.get()), new ItemStack(ZhengelssAditionsModItems.IRONHAMMER.get()),
							new ItemStack(ZhengelssAditionsModItems.AMETHYSTHAMMER.get()), new ItemStack(ZhengelssAditionsModItems.DIAMONDHAMMER.get()), new ItemStack(ZhengelssAditionsModItems.NETHERITEHAMMER.get()),
							new ItemStack(ZhengelssAditionsModItems.COBBLEDDEEPSLATESKYTHE.get()), new ItemStack(ZhengelssAditionsModItems.WOODENSCYTHE.get()), new ItemStack(ZhengelssAditionsModItems.STONESCYTHE.get()),
							new ItemStack(ZhengelssAditionsModItems.ANDESITESCYTHE.get()), new ItemStack(ZhengelssAditionsModItems.DIORITESCYTHE.get()), new ItemStack(ZhengelssAditionsModItems.GRANITESCYTHE.get()),
							new ItemStack(ZhengelssAditionsModItems.COPPERSCYTHE.get()), new ItemStack(ZhengelssAditionsModItems.EXPOSEDCOPPERSKYTHE.get()), new ItemStack(ZhengelssAditionsModItems.WEATHEREDCOPPERSKYTHE.get()),
							new ItemStack(ZhengelssAditionsModItems.OXIDIZEDCOPPERSKYTHE.get()), new ItemStack(ZhengelssAditionsModItems.IRONSCYTHE.get()), new ItemStack(ZhengelssAditionsModItems.DIAMONDSKYTHE.get()),
							new ItemStack(ZhengelssAditionsModItems.AMETHYSTSCYTHE.get()), new ItemStack(ZhengelssAditionsModItems.GOLDSKYTHE.get()), new ItemStack(ZhengelssAditionsModItems.NETHERITESKYTHE.get()),
							new ItemStack(ZhengelssAditionsModItems.WAXEDCOPPERSKYTHE.get()), new ItemStack(ZhengelssAditionsModItems.WAXEDEXPOSEDCOPPERSKYTHE.get()), new ItemStack(ZhengelssAditionsModItems.WAXEDWEATHEREDCOPPERSKYTHE.get()))
					.test(new ItemStack(item)));

	public AutofillEnchantment() {
		super(Enchantment.Rarity.COMMON, ENCHANTMENT_CATEGORY, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
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
		return super.checkCompatibility(enchantment) && !List.of(ZhengelssAditionsModEnchantments.NETHERFARMER.get()).contains(enchantment);
	}
}
