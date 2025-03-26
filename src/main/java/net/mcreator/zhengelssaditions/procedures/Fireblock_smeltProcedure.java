package net.mcreator.zhengelssaditions.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.SimpleContainer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import java.util.Map;

public class Fireblock_smeltProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ItemStack b2 = ItemStack.EMPTY;
		ItemStack b3 = ItemStack.EMPTY;
		ItemStack b4 = ItemStack.EMPTY;
		ItemStack b5 = ItemStack.EMPTY;
		ItemStack b6 = ItemStack.EMPTY;
		ItemStack b1 = ItemStack.EMPTY;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FLAME, (x + 0.5), (y + 0.5), (z + 0.5), 25, 0.35, 0.35, 0.35, 0.01);
		if (!(((world instanceof Level _lvlSmeltResult
				? _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer((new ItemStack((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock()))), _lvlSmeltResult)
						.map(recipe -> recipe.getResultItem(_lvlSmeltResult.registryAccess()).copy()).orElse(ItemStack.EMPTY)
				: ItemStack.EMPTY).getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()).getBlock() == Blocks.AIR)) {
			b2 = (new ItemStack((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock())).copy();
			{
				BlockPos _bp = BlockPos.containing(x - 1, y, z);
				BlockState _bs = ((world instanceof Level _lvlSmeltResult
						? _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer(b2), _lvlSmeltResult).map(recipe -> recipe.getResultItem(_lvlSmeltResult.registryAccess()).copy()).orElse(ItemStack.EMPTY)
						: ItemStack.EMPTY).getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState());
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
		if (!(((world instanceof Level _lvlSmeltResult
				? _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer((new ItemStack((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock()))), _lvlSmeltResult)
						.map(recipe -> recipe.getResultItem(_lvlSmeltResult.registryAccess()).copy()).orElse(ItemStack.EMPTY)
				: ItemStack.EMPTY).getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()).getBlock() == Blocks.AIR)) {
			b1 = (new ItemStack((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock())).copy();
			{
				BlockPos _bp = BlockPos.containing(x + 1, y, z);
				BlockState _bs = ((world instanceof Level _lvlSmeltResult
						? _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer(b1), _lvlSmeltResult).map(recipe -> recipe.getResultItem(_lvlSmeltResult.registryAccess()).copy()).orElse(ItemStack.EMPTY)
						: ItemStack.EMPTY).getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState());
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
		if (!(((world instanceof Level _lvlSmeltResult
				? _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer((new ItemStack((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock()))), _lvlSmeltResult)
						.map(recipe -> recipe.getResultItem(_lvlSmeltResult.registryAccess()).copy()).orElse(ItemStack.EMPTY)
				: ItemStack.EMPTY).getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()).getBlock() == Blocks.AIR)) {
			b3 = (new ItemStack((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock())).copy();
			{
				BlockPos _bp = BlockPos.containing(x, y + 1, z);
				BlockState _bs = ((world instanceof Level _lvlSmeltResult
						? _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer(b3), _lvlSmeltResult).map(recipe -> recipe.getResultItem(_lvlSmeltResult.registryAccess()).copy()).orElse(ItemStack.EMPTY)
						: ItemStack.EMPTY).getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState());
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
		if (!(((world instanceof Level _lvlSmeltResult
				? _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer((new ItemStack((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock()))), _lvlSmeltResult)
						.map(recipe -> recipe.getResultItem(_lvlSmeltResult.registryAccess()).copy()).orElse(ItemStack.EMPTY)
				: ItemStack.EMPTY).getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()).getBlock() == Blocks.AIR)) {
			b4 = (new ItemStack((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock())).copy();
			{
				BlockPos _bp = BlockPos.containing(x, y - 1, z);
				BlockState _bs = ((world instanceof Level _lvlSmeltResult
						? _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer(b4), _lvlSmeltResult).map(recipe -> recipe.getResultItem(_lvlSmeltResult.registryAccess()).copy()).orElse(ItemStack.EMPTY)
						: ItemStack.EMPTY).getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState());
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
		if (!(((world instanceof Level _lvlSmeltResult
				? _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer((new ItemStack((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock()))), _lvlSmeltResult)
						.map(recipe -> recipe.getResultItem(_lvlSmeltResult.registryAccess()).copy()).orElse(ItemStack.EMPTY)
				: ItemStack.EMPTY).getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()).getBlock() == Blocks.AIR)) {
			b5 = (new ItemStack((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock())).copy();
			{
				BlockPos _bp = BlockPos.containing(x, y, z - 1);
				BlockState _bs = ((world instanceof Level _lvlSmeltResult
						? _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer(b5), _lvlSmeltResult).map(recipe -> recipe.getResultItem(_lvlSmeltResult.registryAccess()).copy()).orElse(ItemStack.EMPTY)
						: ItemStack.EMPTY).getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState());
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
		if (!(((world instanceof Level _lvlSmeltResult
				? _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer((new ItemStack((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock()))), _lvlSmeltResult)
						.map(recipe -> recipe.getResultItem(_lvlSmeltResult.registryAccess()).copy()).orElse(ItemStack.EMPTY)
				: ItemStack.EMPTY).getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()).getBlock() == Blocks.AIR)) {
			b6 = (new ItemStack((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock())).copy();
			{
				BlockPos _bp = BlockPos.containing(x, y, z + 1);
				BlockState _bs = ((world instanceof Level _lvlSmeltResult
						? _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer(b6), _lvlSmeltResult).map(recipe -> recipe.getResultItem(_lvlSmeltResult.registryAccess()).copy()).orElse(ItemStack.EMPTY)
						: ItemStack.EMPTY).getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState());
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
	}
}
