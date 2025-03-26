
package net.mcreator.zhengelssaditions.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.List;

@JeiPlugin
public class ZhengelssAditionsModJeiInformation implements IModPlugin {
	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("zhengelss_aditions:information");
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		registration.addIngredientInfo(List.of(new ItemStack(ZhengelssAditionsModBlocks.LIGHTINGRUNE.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.zhengelss_aditions.lightingruneinfo"));
		registration.addIngredientInfo(List.of(new ItemStack(ZhengelssAditionsModBlocks.FIRERUNE.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.zhengelss_aditions.fireruneinfo"));
		registration.addIngredientInfo(List.of(new ItemStack(ZhengelssAditionsModBlocks.SLOWDOWNRUNE.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.zhengelss_aditions.slowdownruneinfo"));
		registration.addIngredientInfo(List.of(new ItemStack(ZhengelssAditionsModItems.LAVAAXE.get()), new ItemStack(ZhengelssAditionsModItems.LAVAPICKAXE.get()), new ItemStack(ZhengelssAditionsModItems.LAVASWORD.get()),
				new ItemStack(ZhengelssAditionsModItems.LAVASHOVEL.get()), new ItemStack(ZhengelssAditionsModItems.LAVAHOE.get()), new ItemStack(ZhengelssAditionsModItems.LAVASKYTHE.get()), new ItemStack(ZhengelssAditionsModItems.LAVAHAMMER.get())),
				VanillaTypes.ITEM_STACK, Component.translatable("jei.zhengelss_aditions.lavatoolinfo_1"));
		registration.addIngredientInfo(List.of(new ItemStack(ZhengelssAditionsModItems.TOOLTRIM.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.zhengelss_aditions.tooltrimdesc"));
		registration.addIngredientInfo(List.of(new ItemStack(ZhengelssAditionsModItems.AMETHYSTTOTEM.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.zhengelss_aditions.amethysttotemdesc"));
		registration.addIngredientInfo(List.of(new ItemStack(ZhengelssAditionsModItems.OBSIDIANTOTEM.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.zhengelss_aditions.obsidiantotrmdesc"));
		registration.addIngredientInfo(List.of(new ItemStack(ZhengelssAditionsModBlocks.OBSIDIANFURNACE.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.zhengelss_aditions.obsidianfurnacedesc"));
		registration.addIngredientInfo(List.of(new ItemStack(ZhengelssAditionsModItems.EXPIRIENCEBIT.get()), new ItemStack(ZhengelssAditionsModItems.EXPIRIENCEPIECE.get()), new ItemStack(ZhengelssAditionsModItems.EXPIRIENCESHARD.get()),
				new ItemStack(ZhengelssAditionsModItems.EXPIRIENCEROCK.get()), new ItemStack(ZhengelssAditionsModItems.EXPIRIENCEBOULDER.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.zhengelss_aditions.xpinfo"));
		registration.addIngredientInfo(List.of(new ItemStack(ZhengelssAditionsModItems.LAVAAXE.get()), new ItemStack(ZhengelssAditionsModItems.LAVAPICKAXE.get()), new ItemStack(ZhengelssAditionsModItems.LAVASWORD.get()),
				new ItemStack(ZhengelssAditionsModItems.LAVASHOVEL.get()), new ItemStack(ZhengelssAditionsModItems.LAVAHOE.get()), new ItemStack(ZhengelssAditionsModItems.LAVASKYTHE.get()), new ItemStack(ZhengelssAditionsModItems.LAVAHAMMER.get())),
				VanillaTypes.ITEM_STACK, Component.translatable("jei.zhengelss_aditions.lavatoolsinfo"));
	}
}
