
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zhengelssaditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.zhengelssaditions.fluid.SweetwaterFluid;
import net.mcreator.zhengelssaditions.ZhengelssAditionsMod;

public class ZhengelssAditionsModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, ZhengelssAditionsMod.MODID);
	public static final RegistryObject<FlowingFluid> SWEETWATER = REGISTRY.register("sweetwater", () -> new SweetwaterFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_SWEETWATER = REGISTRY.register("flowing_sweetwater", () -> new SweetwaterFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(SWEETWATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_SWEETWATER.get(), RenderType.translucent());
		}
	}
}
