
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zhengelssaditions.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ZhengelssAditionsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ZhengelssAditionsModEntities.SHRAPNEL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ZhengelssAditionsModEntities.TESTARROWPROJ.get(), ThrownItemRenderer::new);
	}
}
