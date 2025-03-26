
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zhengelssaditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.zhengelssaditions.block.entity.XpfierBlockEntity;
import net.mcreator.zhengelssaditions.block.entity.ObsidianfurnaceBlockEntity;
import net.mcreator.zhengelssaditions.block.entity.MetalurgisttableBlockEntity;
import net.mcreator.zhengelssaditions.block.entity.FoundryBlockEntity;
import net.mcreator.zhengelssaditions.ZhengelssAditionsMod;

public class ZhengelssAditionsModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ZhengelssAditionsMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> METALURGISTTABLE = register("metalurgisttable", ZhengelssAditionsModBlocks.METALURGISTTABLE, MetalurgisttableBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> OBSIDIANFURNACE = register("obsidianfurnace", ZhengelssAditionsModBlocks.OBSIDIANFURNACE, ObsidianfurnaceBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> XPFIER = register("xpfier", ZhengelssAditionsModBlocks.XPFIER, XpfierBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FOUNDRY = register("foundry", ZhengelssAditionsModBlocks.FOUNDRY, FoundryBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
