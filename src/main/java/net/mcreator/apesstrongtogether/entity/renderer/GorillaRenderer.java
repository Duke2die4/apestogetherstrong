package apesstrongtogether.entity.renderer;

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

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

import apesstrongtogether.entity.GorillaEntity;

@OnlyIn(Dist.CLIENT)
public class GorillaRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(GorillaEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelgorilla(), 1.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("apes_strong_together:textures/gorilla.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelgorilla extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer cube_r1;
		private final ModelRenderer rightarm;
		private final ModelRenderer leftarm;
		private final ModelRenderer rightleg;
		private final ModelRenderer leftleg;
		private final ModelRenderer bb_main;
		private final ModelRenderer cube_r2;
		public Modelgorilla() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(-0.5F, 0.75F, -1.475F);
			head.setTextureOffset(0, 26).addBox(-4.5F, -3.75F, -4.525F, 9.0F, 9.0F, 9.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-3.5F, 0.25F, -6.525F, 7.0F, 5.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 7).addBox(-3.5F, -2.75F, -5.525F, 7.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(2.5F, 2.75F, 2.575F);
			head.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.3054F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(36, 26).addBox(-6.0F, -8.0F, -4.0F, 7.0F, 8.0F, 8.0F, -0.2F, false);
			rightarm = new ModelRenderer(this);
			rightarm.setRotationPoint(-8.5F, 4.5F, -1.5F);
			rightarm.setTextureOffset(0, 44).addBox(-2.5F, -1.5F, -2.5F, 5.0F, 21.0F, 5.0F, 0.0F, false);
			leftarm = new ModelRenderer(this);
			leftarm.setRotationPoint(7.5F, 4.5F, -1.5F);
			leftarm.setTextureOffset(31, 42).addBox(-2.5F, -1.5F, -2.5F, 5.0F, 21.0F, 5.0F, 0.0F, false);
			rightleg = new ModelRenderer(this);
			rightleg.setRotationPoint(-6.5F, 11.5F, 12.5F);
			rightleg.setTextureOffset(52, 0).addBox(-2.5F, -0.5F, -2.5F, 5.0F, 13.0F, 5.0F, 1.1F, false);
			leftleg = new ModelRenderer(this);
			leftleg.setRotationPoint(5.5F, 11.5F, 12.5F);
			leftleg.setTextureOffset(51, 42).addBox(-2.5F, -0.5F, -2.5F, 5.0F, 13.0F, 5.0F, 1.1F, false);
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(-3.0F, -14.0F, 0.0F);
			bb_main.addChild(cube_r2);
			setRotationAngle(cube_r2, -0.2182F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(0, 0).addBox(-6.0F, -8.0F, -3.0F, 17.0F, 8.0F, 18.0F, 0.1F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
			leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
			rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
			leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
			bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.rightarm.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.leftarm.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		}
	}
}
