
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zhengelssaditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.zhengelssaditions.world.inventory.XpfierguiMenu;
import net.mcreator.zhengelssaditions.world.inventory.UpgradingtableguiMenu;
import net.mcreator.zhengelssaditions.world.inventory.ObsidianfurnaceguiMenu;
import net.mcreator.zhengelssaditions.world.inventory.FoundryguiMenu;
import net.mcreator.zhengelssaditions.ZhengelssAditionsMod;

public class ZhengelssAditionsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, ZhengelssAditionsMod.MODID);
	public static final RegistryObject<MenuType<UpgradingtableguiMenu>> UPGRADINGTABLEGUI = REGISTRY.register("upgradingtablegui", () -> IForgeMenuType.create(UpgradingtableguiMenu::new));
	public static final RegistryObject<MenuType<ObsidianfurnaceguiMenu>> OBSIDIANFURNACEGUI = REGISTRY.register("obsidianfurnacegui", () -> IForgeMenuType.create(ObsidianfurnaceguiMenu::new));
	public static final RegistryObject<MenuType<XpfierguiMenu>> XPFIERGUI = REGISTRY.register("xpfiergui", () -> IForgeMenuType.create(XpfierguiMenu::new));
	public static final RegistryObject<MenuType<FoundryguiMenu>> FOUNDRYGUI = REGISTRY.register("foundrygui", () -> IForgeMenuType.create(FoundryguiMenu::new));
}
