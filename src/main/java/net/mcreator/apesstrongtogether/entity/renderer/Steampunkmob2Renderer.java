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

import net.mcreator.apesstrongtogether.entity.Steampunkmob2Entity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class Steampunkmob2Renderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(Steampunkmob2Entity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelsteampunkmob2(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("apes_strong_together:textures/steampunkmob2_2.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelsteampunkmob2 extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer body;
		private final ModelRenderer rightleg;
		private final ModelRenderer leftleg;
		private final ModelRenderer rightArm;
		private final ModelRenderer body_r1;
		private final ModelRenderer body_r2;
		private final ModelRenderer leftArm;
		private final ModelRenderer body_r3;
		private final ModelRenderer body_r4;
		public Modelsteampunkmob2() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -7.5625F, -3.125F);
			setRotationAngle(head, 0.0F, 0.0873F, 0.0F);
			head.setTextureOffset(25, 54).addBox(-1.0F, -1.4375F, -2.875F, 2.0F, 2.0F, 5.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(0.0F, 0.0625F, -4.375F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.0F, 0.7854F, 0.0F);
			head_r1.setTextureOffset(22, 45).addBox(-2.5F, 0.25F, -2.0F, 5.0F, 3.0F, 5.0F, 0.0F, false);
			head_r1.setTextureOffset(42, 45).addBox(-2.5F, -2.0F, -2.0F, 5.0F, 1.0F, 5.0F, 0.0F, false);
			head_r1.setTextureOffset(50, 5).addBox(-2.0F, -2.5F, -1.5F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(0, 64).addBox(-7.3646F, -0.9153F, 0.0F, 3.0F, 5.0F, 3.0F, 1.0F, false);
			body.setTextureOffset(28, 18).addBox(-3.0F, 10.0F, -3.0F, 6.0F, 3.0F, 8.0F, 0.52F, false);
			body.setTextureOffset(0, 35).addBox(-3.0F, -10.0F, -3.0F, 6.0F, 4.0F, 5.0F, -0.52F, false);
			body.setTextureOffset(0, 64).addBox(4.3646F, -0.9153F, 0.0F, 3.0F, 5.0F, 3.0F, 1.0F, true);
			body.setTextureOffset(0, 0).addBox(-5.0F, 0.0F, -4.0F, 10.0F, 4.0F, 9.0F, 0.32F, false);
			body.setTextureOffset(0, 0).addBox(-5.0F, -5.0F, -4.0F, 10.0F, 4.0F, 9.0F, 0.52F, false);
			body.setTextureOffset(30, 29).addBox(-4.0F, 2.0F, -2.0F, 8.0F, 10.0F, 6.0F, 0.52F, false);
			body.setTextureOffset(0, 13).addBox(-6.0F, -6.0F, -2.0F, 12.0F, 7.0F, 6.0F, 0.52F, false);
			body.setTextureOffset(0, 13).addBox(-6.0F, -6.0F, -2.0F, 12.0F, 7.0F, 6.0F, 0.52F, false);
			body.setTextureOffset(0, 26).addBox(-5.0F, 8.0F, -3.0F, 10.0F, 1.0F, 8.0F, 0.22F, false);
			body.setTextureOffset(0, 26).addBox(-5.0F, 6.0F, -3.0F, 10.0F, 1.0F, 8.0F, 0.22F, false);
			body.setTextureOffset(0, 26).addBox(-5.0F, 4.0F, -3.0F, 10.0F, 1.0F, 8.0F, 0.22F, false);
			rightleg = new ModelRenderer(this);
			rightleg.setRotationPoint(-4.0F, 12.0F, 2.0F);
			rightleg.setTextureOffset(32, 9).addBox(-3.0F, 9.0F, -4.0F, 6.0F, 3.0F, 6.0F, 0.0F, false);
			rightleg.setTextureOffset(14, 53).addBox(-2.0F, 7.0F, -3.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			rightleg.setTextureOffset(38, 51).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			rightleg.setTextureOffset(58, 32).addBox(-1.0F, 1.0F, -2.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			leftleg = new ModelRenderer(this);
			leftleg.setRotationPoint(4.0F, 12.0F, 2.0F);
			leftleg.setTextureOffset(14, 53).addBox(-2.0F, 7.0F, -3.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			leftleg.setTextureOffset(38, 51).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			leftleg.setTextureOffset(32, 9).addBox(-3.0F, 9.0F, -4.0F, 6.0F, 3.0F, 6.0F, 0.0F, false);
			leftleg.setTextureOffset(22, 35).addBox(-1.0F, 1.0F, -2.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			rightArm = new ModelRenderer(this);
			rightArm.setRotationPoint(-5.0F, -4.0F, 0.0F);
			setRotationAngle(rightArm, 0.0F, 0.0F, 0.1745F);
			rightArm.setTextureOffset(0, 44).addBox(-5.0F, -1.0F, -2.0F, 5.0F, 3.0F, 6.0F, 1.5F, false);
			rightArm.setTextureOffset(0, 0).addBox(-2.9694F, -5.6875F, 1.0F, 1.0F, 4.0F, 1.0F, 1.0F, false);
			body_r1 = new ModelRenderer(this);
			body_r1.setRotationPoint(-3.5F, 6.5F, 1.5F);
			rightArm.addChild(body_r1);
			setRotationAngle(body_r1, 0.0F, 0.0F, 0.3054F);
			body_r1.setTextureOffset(4, 0).addBox(-4.0F, 4.0F, -0.25F, 0.0F, 4.0F, 0.0F, 1.0F, false);
			body_r1.setTextureOffset(3, 0).addBox(-4.0F, 8.5F, -0.25F, 0.0F, 5.0F, 0.0F, 0.5F, false);
			body_r1.setTextureOffset(3, 0).addBox(-4.0F, 12.5F, -0.25F, 0.0F, 5.0F, 0.0F, 1.0F, false);
			body_r1.setTextureOffset(0, 53).addBox(-2.0F, 12.5F, -1.5F, 4.0F, 5.0F, 3.0F, 1.0F, false);
			body_r1.setTextureOffset(54, 51).addBox(-2.5F, 3.5F, -1.5F, 3.0F, 5.0F, 3.0F, 1.0F, false);
			body_r1.setTextureOffset(0, 0).addBox(-1.5F, -2.5F, -0.5F, 1.0F, 4.0F, 1.0F, 1.0F, false);
			body_r2 = new ModelRenderer(this);
			body_r2.setRotationPoint(-6.709F, 13.3522F, 1.5F);
			rightArm.addChild(body_r2);
			setRotationAngle(body_r2, 0.0F, 0.0F, 0.3054F);
			body_r2.setTextureOffset(1, 3).addBox(-0.5F, 3.0F, -0.5F, 1.0F, 0.0F, 1.0F, 1.0F, false);
			leftArm = new ModelRenderer(this);
			leftArm.setRotationPoint(5.0F, -4.0F, 0.0F);
			setRotationAngle(leftArm, 0.0F, 0.0F, -0.1745F);
			leftArm.setTextureOffset(0, 44).addBox(0.0F, -1.0F, -2.0F, 5.0F, 3.0F, 6.0F, 1.5F, true);
			leftArm.setTextureOffset(0, 0).addBox(1.9694F, -5.6875F, 1.0F, 1.0F, 4.0F, 1.0F, 1.0F, true);
			body_r3 = new ModelRenderer(this);
			body_r3.setRotationPoint(3.5F, 6.5F, 1.5F);
			leftArm.addChild(body_r3);
			setRotationAngle(body_r3, 0.0F, 0.0F, -0.3054F);
			body_r3.setTextureOffset(4, 0).addBox(4.0F, 4.0F, -0.25F, 0.0F, 4.0F, 0.0F, 1.0F, true);
			body_r3.setTextureOffset(3, 0).addBox(4.0F, 8.5F, -0.25F, 0.0F, 5.0F, 0.0F, 0.5F, true);
			body_r3.setTextureOffset(3, 0).addBox(4.0F, 12.5F, -0.25F, 0.0F, 5.0F, 0.0F, 1.0F, true);
			body_r3.setTextureOffset(0, 53).addBox(-2.0F, 12.5F, -1.5F, 4.0F, 5.0F, 3.0F, 1.0F, true);
			body_r3.setTextureOffset(54, 51).addBox(-0.5F, 3.5F, -1.5F, 3.0F, 5.0F, 3.0F, 1.0F, true);
			body_r3.setTextureOffset(0, 0).addBox(0.5F, -2.5F, -0.5F, 1.0F, 4.0F, 1.0F, 1.0F, true);
			body_r4 = new ModelRenderer(this);
			body_r4.setRotationPoint(6.709F, 13.3522F, 1.5F);
			leftArm.addChild(body_r4);
			setRotationAngle(body_r4, 0.0F, 0.0F, -0.3054F);
			body_r4.setTextureOffset(1, 3).addBox(-0.5F, 3.0F, -0.5F, 1.0F, 0.0F, 1.0F, 1.0F, true);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
			leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
			rightArm.render(matrixStack, buffer, packedLight, packedOverlay);
			leftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.rightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.leftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		}
	}
}
