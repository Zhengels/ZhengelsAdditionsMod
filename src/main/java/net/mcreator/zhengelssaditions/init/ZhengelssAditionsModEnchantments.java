
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zhengelssaditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.zhengelssaditions.enchantment.RageEnchantment;
import net.mcreator.zhengelssaditions.enchantment.NetherfarmerEnchantment;
import net.mcreator.zhengelssaditions.enchantment.AutofillEnchantment;
import net.mcreator.zhengelssaditions.ZhengelssAditionsMod;

public class ZhengelssAditionsModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, ZhengelssAditionsMod.MODID);
	public static final RegistryObject<Enchantment> NETHERFARMER = REGISTRY.register("netherfarmer", () -> new NetherfarmerEnchantment());
	public static final RegistryObject<Enchantment> AUTOFILL = REGISTRY.register("autofill", () -> new AutofillEnchantment());
	public static final RegistryObject<Enchantment> RAGE = REGISTRY.register("rage", () -> new RageEnchantment());
}
