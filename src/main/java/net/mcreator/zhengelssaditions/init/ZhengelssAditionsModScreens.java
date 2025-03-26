
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zhengelssaditions.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.zhengelssaditions.client.gui.XpfierguiScreen;
import net.mcreator.zhengelssaditions.client.gui.UpgradingtableguiScreen;
import net.mcreator.zhengelssaditions.client.gui.ObsidianfurnaceguiScreen;
import net.mcreator.zhengelssaditions.client.gui.FoundryguiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ZhengelssAditionsModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(ZhengelssAditionsModMenus.UPGRADINGTABLEGUI.get(), UpgradingtableguiScreen::new);
			MenuScreens.register(ZhengelssAditionsModMenus.OBSIDIANFURNACEGUI.get(), ObsidianfurnaceguiScreen::new);
			MenuScreens.register(ZhengelssAditionsModMenus.XPFIERGUI.get(), XpfierguiScreen::new);
			MenuScreens.register(ZhengelssAditionsModMenus.FOUNDRYGUI.get(), FoundryguiScreen::new);
		});
	}
}
