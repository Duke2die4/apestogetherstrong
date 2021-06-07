package net.mcreator.apesstrongtogether.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.apesstrongtogether.entity.Mob2Entity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class Mob2Renderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(Mob2Entity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelmob2(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("apes_strong_together:textures/mob2.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelmob2 extends EntityModel<Entity> {
		private final ModelRenderer rleg;
		private final ModelRenderer cube_r1;
		private final ModelRenderer lleg;
		private final ModelRenderer cube_r2;
		private final ModelRenderer larm;
		private final ModelRenderer cube_r3;
		private final ModelRenderer rarm;
		private final ModelRenderer cube_r4;
		private final ModelRenderer bb_main;
		private final ModelRenderer cube_r5;
		public Modelmob2() {
			textureWidth = 32;
			textureHeight = 32;
			rleg = new ModelRenderer(this);
			rleg.setRotationPoint(-2.0F, 21.0F, 1.0F);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(2.125F, -4.5F, -0.5F);
			rleg.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 1.5708F, 0.0F);
			cube_r1.setTextureOffset(12, 23).addBox(-2.125F, 4.5F, -2.5F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			lleg = new ModelRenderer(this);
			lleg.setRotationPoint(2.0F, 21.0F, 1.0F);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(-1.875F, -4.5F, -0.5F);
			lleg.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 1.5708F, 0.0F);
			cube_r2.setTextureOffset(21, 0).addBox(-2.125F, 4.5F, 0.5F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			larm = new ModelRenderer(this);
			larm.setRotationPoint(4.0F, 17.0F, 1.0F);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(-3.875F, -0.5F, -0.5F);
			larm.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.0F, 1.5708F, 0.0F);
			cube_r3.setTextureOffset(0, 14).addBox(-1.125F, -0.5F, 3.5F, 2.0F, 5.0F, 1.0F, 0.0F, false);
			rarm = new ModelRenderer(this);
			rarm.setRotationPoint(-3.0F, 17.0F, 1.0F);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(3.125F, -0.5F, -0.5F);
			rarm.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.0F, 1.5708F, 0.0F);
			cube_r4.setTextureOffset(0, 0).addBox(-1.125F, -0.5F, -4.5F, 2.0F, 5.0F, 1.0F, 0.0F, false);
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.125F, -7.5F, 0.5F);
			bb_main.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.0F, 1.5708F, 0.0F);
			cube_r5.setTextureOffset(0, 14).addBox(-4.125F, -9.5F, -3.5F, 7.0F, 0.0F, 7.0F, 0.0F, false);
			cube_r5.setTextureOffset(14, 14).addBox(2.875F, -2.5F, -3.5F, 1.0F, 2.0F, 7.0F, 0.0F, false);
			cube_r5.setTextureOffset(0, 21).addBox(-2.125F, -9.5F, -1.5F, 3.0F, 7.0F, 3.0F, 0.0F, false);
			cube_r5.setTextureOffset(0, 0).addBox(-4.125F, -2.5F, -3.5F, 7.0F, 7.0F, 7.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			rleg.render(matrixStack, buffer, packedLight, packedOverlay);
			lleg.render(matrixStack, buffer, packedLight, packedOverlay);
			larm.render(matrixStack, buffer, packedLight, packedOverlay);
			rarm.render(matrixStack, buffer, packedLight, packedOverlay);
			bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.lleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.larm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.rleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.rarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		}
	}
}
