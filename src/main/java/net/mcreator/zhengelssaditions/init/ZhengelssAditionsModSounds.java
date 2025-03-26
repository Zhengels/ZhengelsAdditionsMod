
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zhengelssaditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.zhengelssaditions.ZhengelssAditionsMod;

public class ZhengelssAditionsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ZhengelssAditionsMod.MODID);
	public static final RegistryObject<SoundEvent> LIGHTSWORD_HIT_2 = REGISTRY.register("lightsword_hit_2", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("zhengelss_aditions", "lightsword_hit_2")));
	public static final RegistryObject<SoundEvent> LIGHTSWORD_MISS = REGISTRY.register("lightsword_miss", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("zhengelss_aditions", "lightsword_miss")));
	public static final RegistryObject<SoundEvent> LIGHTSWORD_EQUIP = REGISTRY.register("lightsword_equip", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("zhengelss_aditions", "lightsword_equip")));
	public static final RegistryObject<SoundEvent> LIGHTSWORD_HIT = REGISTRY.register("lightsword_hit", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("zhengelss_aditions", "lightsword_hit")));
	public static final RegistryObject<SoundEvent> LIGHT_SWORD_MISS_2 = REGISTRY.register("light_sword_miss_2", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("zhengelss_aditions", "light_sword_miss_2")));
	public static final RegistryObject<SoundEvent> LIGHT_SWORD_HIT_3 = REGISTRY.register("light_sword_hit_3", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("zhengelss_aditions", "light_sword_hit_3")));
	public static final RegistryObject<SoundEvent> FIRE_SWORD_HIT = REGISTRY.register("fire_sword_hit", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("zhengelss_aditions", "fire_sword_hit")));
	public static final RegistryObject<SoundEvent> FIRE_SWORD_MISS = REGISTRY.register("fire_sword_miss", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("zhengelss_aditions", "fire_sword_miss")));
}
