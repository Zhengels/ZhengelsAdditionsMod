package net.mcreator.zhengelssaditions.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.zhengelssaditions.world.inventory.FoundryguiMenu;
import net.mcreator.zhengelssaditions.procedures.FoundrysmeltingindicatorProcedure;
import net.mcreator.zhengelssaditions.procedures.FoundryheatindicatorProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class FoundryguiScreen extends AbstractContainerScreen<FoundryguiMenu> {
	private final static HashMap<String, Object> guistate = FoundryguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public FoundryguiScreen(FoundryguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("zhengelss_aditions:textures/screens/foundrygui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("zhengelss_aditions:textures/screens/foundry_deco_1.png"), this.leftPos + 76, this.topPos + 9, 0, 0, 22, 60, 22, 60);

		guiGraphics.blit(new ResourceLocation("zhengelss_aditions:textures/screens/faucet.png"), this.leftPos + 97, this.topPos + 35, Mth.clamp((int) FoundrysmeltingindicatorProcedure.execute(world, x, y, z) * 7, 0, 84), 0, 7, 12, 91, 12);

		guiGraphics.blit(new ResourceLocation("zhengelss_aditions:textures/screens/foundry_heat.png"), this.leftPos + 79, this.topPos + 43, Mth.clamp((int) FoundryheatindicatorProcedure.execute(world, x, y, z) * 16, 0, 112), 0, 16, 16, 128, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
	}
}
