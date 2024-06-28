package net.liminalspace.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;

import net.liminalspace.world.inventory.ChemicalExtratorMachineMenu;
import net.liminalspace.procedures.PowerlevelBar3Procedure;
import net.liminalspace.procedures.PowerLevelBarProcedure;
import net.liminalspace.procedures.PowerLevelBar7Procedure;
import net.liminalspace.procedures.PowerLevelBar6Procedure;
import net.liminalspace.procedures.PowerLevelBar5Procedure;
import net.liminalspace.procedures.PowerLevelBar4Procedure;
import net.liminalspace.procedures.PowerLevelBar2Procedure;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class ChemicalExtratorMachineScreen extends AbstractContainerScreen<ChemicalExtratorMachineMenu> {
	private final static HashMap<String, Object> guistate = ChemicalExtratorMachineMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public ChemicalExtratorMachineScreen(ChemicalExtratorMachineMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("liminal_space:textures/screens/chemical_extrator_machine.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("liminal_space:textures/screens/power_level_zero.png"));
		this.blit(ms, this.leftPos + 11, this.topPos + 28, 0, 0, 9, 36, 9, 36);

		RenderSystem.setShaderTexture(0, new ResourceLocation("liminal_space:textures/screens/right_arrow.png"));
		this.blit(ms, this.leftPos + 73, this.topPos + 37, 0, 0, 22, 15, 22, 15);

		RenderSystem.setShaderTexture(0, new ResourceLocation("liminal_space:textures/screens/blasting_extreme.png"));
		this.blit(ms, this.leftPos + 46, this.topPos + 35, 0, 0, 18, 18, 18, 18);

		if (PowerLevelBar7Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("liminal_space:textures/screens/power_level_zero.png"));
			this.blit(ms, this.leftPos + 11, this.topPos + 28, 0, 0, 9, 36, 9, 36);
		}
		if (PowerLevelBar6Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("liminal_space:textures/screens/power_level_1.png"));
			this.blit(ms, this.leftPos + 11, this.topPos + 28, 0, 0, 9, 36, 9, 36);
		}
		if (PowerLevelBar5Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("liminal_space:textures/screens/power_level_2.png"));
			this.blit(ms, this.leftPos + 11, this.topPos + 28, 0, 0, 9, 36, 9, 36);
		}
		if (PowerLevelBar4Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("liminal_space:textures/screens/power_level_3.png"));
			this.blit(ms, this.leftPos + 11, this.topPos + 28, 0, 0, 9, 36, 9, 36);
		}
		if (PowerlevelBar3Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("liminal_space:textures/screens/power_level_4.png"));
			this.blit(ms, this.leftPos + 11, this.topPos + 28, 0, 0, 9, 36, 9, 36);
		}
		if (PowerLevelBar2Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("liminal_space:textures/screens/power_level_5.png"));
			this.blit(ms, this.leftPos + 11, this.topPos + 28, 0, 0, 9, 36, 9, 36);
		}
		if (PowerLevelBarProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("liminal_space:textures/screens/power_level_6.png"));
			this.blit(ms, this.leftPos + 11, this.topPos + 28, 0, 0, 9, 36, 9, 36);
		}
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
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.liminal_space.chemical_extrator_machine.label_chemical_extractor_machine"), 18, 4, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.liminal_space.chemical_extrator_machine.label_inventory"), 6, 73, -12829636);
	}

	@Override
	public void init() {
		super.init();
	}
}
