
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zhengelssaditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.zhengelssaditions.entity.TestarrowprojEntity;
import net.mcreator.zhengelssaditions.entity.ShrapnelEntity;
import net.mcreator.zhengelssaditions.ZhengelssAditionsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ZhengelssAditionsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ZhengelssAditionsMod.MODID);
	public static final RegistryObject<EntityType<ShrapnelEntity>> SHRAPNEL = register("shrapnel",
			EntityType.Builder.<ShrapnelEntity>of(ShrapnelEntity::new, MobCategory.MISC).setCustomClientFactory(ShrapnelEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TestarrowprojEntity>> TESTARROWPROJ = register("testarrowproj",
			EntityType.Builder.<TestarrowprojEntity>of(TestarrowprojEntity::new, MobCategory.MISC).setCustomClientFactory(TestarrowprojEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}
}
