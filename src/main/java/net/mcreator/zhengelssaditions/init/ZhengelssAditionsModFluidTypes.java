
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zhengelssaditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.zhengelssaditions.fluid.types.SweetwaterFluidType;
import net.mcreator.zhengelssaditions.ZhengelssAditionsMod;

public class ZhengelssAditionsModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, ZhengelssAditionsMod.MODID);
	public static final RegistryObject<FluidType> SWEETWATER_TYPE = REGISTRY.register("sweetwater", () -> new SweetwaterFluidType());
}
