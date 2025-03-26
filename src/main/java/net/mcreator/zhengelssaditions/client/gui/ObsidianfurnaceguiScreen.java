package net.mcreator.zhengelssaditions.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.zhengelssaditions.world.inventory.ObsidianfurnaceguiMenu;
import net.mcreator.zhengelssaditions.procedures.HeatindicatorProcedure;
import net.mcreator.zhengelssaditions.procedures.Heatindicator2Procedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ObsidianfurnaceguiScreen extends AbstractContainerScreen<ObsidianfurnaceguiMenu> {
	private final static HashMap<String, Object> guistate = ObsidianfurnaceguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public ObsidianfurnaceguiScreen(ObsidianfurnaceguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("zhengelss_aditions:textures/screens/obsidianfurnacegui.png");

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

		guiGraphics.blit(new ResourceLocation("zhengelss_aditions:textures/screens/arrow.png"), this.leftPos + 87, this.topPos + 16, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("zhengelss_aditions:textures/screens/arrow.png"), this.leftPos + 60, this.topPos + 16, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("zhengelss_aditions:textures/screens/heat_meter.png"), this.leftPos + 80, this.topPos + 17, Mth.clamp((int) Heatindicator2Procedure.execute(world, x, y, z) * 6, 0, 84), 0, 6, 16, 90, 16);

		guiGraphics.blit(new ResourceLocation("zhengelss_aditions:textures/screens/furnace_fire.png"), this.leftPos + 75, this.topPos + 33, Mth.clamp((int) HeatindicatorProcedure.execute(world, x, y, z) * 14, 0, 196), 0, 14, 14, 210, 14);

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
