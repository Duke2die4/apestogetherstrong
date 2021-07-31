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

import apesstrongtogether.entity.Steampunkmob1Entity;

@OnlyIn(Dist.CLIENT)
public class Steampunkmob1Renderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(Steampunkmob1Entity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelsteampunkmob1(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("apes_strong_together:textures/steampunkmob1.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelsteampunkmob1 extends EntityModel<Entity> {
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
		public Modelsteampunkmob1() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 5.4375F, -5.125F);
			setRotationAngle(head, 0.0F, 0.0873F, 0.0F);
			head.setTextureOffset(18, 23).addBox(-1.0F, -1.4375F, -2.875F, 2.0F, 2.0F, 5.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(0.0F, 0.0625F, -4.375F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.0F, 0.7854F, 0.0F);
			head_r1.setTextureOffset(17, 48).addBox(-2.5F, 0.25F, -2.0F, 5.0F, 3.0F, 5.0F, 0.0F, false);
			head_r1.setTextureOffset(34, 0).addBox(-2.5F, -2.0F, -2.0F, 5.0F, 1.0F, 5.0F, 0.0F, false);
			head_r1.setTextureOffset(37, 49).addBox(-2.0F, -2.5F, -1.5F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(36, 6).addBox(-3.0F, 10.0F, -3.0F, 6.0F, 3.0F, 8.0F, 0.52F, false);
			body.setTextureOffset(0, 31).addBox(-5.0F, 0.0F, -4.0F, 10.0F, 4.0F, 9.0F, 0.52F, false);
			body.setTextureOffset(0, 14).addBox(-6.0F, 2.0F, -2.0F, 12.0F, 10.0F, 6.0F, 0.52F, false);
			body.setTextureOffset(0, 0).addBox(-6.0F, 3.0F, -5.0F, 12.0F, 4.0F, 10.0F, 0.5F, false);
			body.setTextureOffset(26, 20).addBox(-5.0F, 8.0F, -5.0F, 10.0F, 1.0F, 10.0F, 0.52F, false);
			rightleg = new ModelRenderer(this);
			rightleg.setRotationPoint(-4.0F, 12.0F, 2.0F);
			rightleg.setTextureOffset(32, 40).addBox(-3.0F, 9.0F, -4.0F, 6.0F, 3.0F, 6.0F, 0.0F, false);
			rightleg.setTextureOffset(54, 0).addBox(-2.0F, 7.0F, -3.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			rightleg.setTextureOffset(52, 45).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			rightleg.setTextureOffset(0, 30).addBox(-1.0F, 1.0F, -2.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			leftleg = new ModelRenderer(this);
			leftleg.setRotationPoint(4.0F, 12.0F, 2.0F);
			leftleg.setTextureOffset(53, 53).addBox(-2.0F, 7.0F, -3.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			leftleg.setTextureOffset(50, 36).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			leftleg.setTextureOffset(29, 31).addBox(-3.0F, 9.0F, -4.0F, 6.0F, 3.0F, 6.0F, 0.0F, false);
			leftleg.setTextureOffset(0, 0).addBox(-1.0F, 1.0F, -2.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			rightArm = new ModelRenderer(this);
			rightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			setRotationAngle(rightArm, 0.0F, 0.0F, 0.1745F);
			rightArm.setTextureOffset(0, 44).addBox(-5.0F, -1.0F, -2.0F, 5.0F, 3.0F, 6.0F, 0.5101F, false);
			body_r1 = new ModelRenderer(this);
			body_r1.setRotationPoint(-3.5F, 6.5F, 1.5F);
			rightArm.addChild(body_r1);
			setRotationAngle(body_r1, 0.0F, 0.0F, 0.3054F);
			body_r1.setTextureOffset(0, 53).addBox(-2.0F, 8.5F, -1.5F, 4.0F, 5.0F, 3.0F, 0.5101F, false);
			body_r1.setTextureOffset(14, 56).addBox(-2.5F, 1.5F, -1.5F, 3.0F, 5.0F, 3.0F, 0.5101F, false);
			body_r1.setTextureOffset(0, 14).addBox(-1.5F, -3.5F, -0.5F, 1.0F, 4.0F, 1.0F, 0.5101F, false);
			body_r2 = new ModelRenderer(this);
			body_r2.setRotationPoint(-6.709F, 13.3522F, 1.5F);
			rightArm.addChild(body_r2);
			setRotationAngle(body_r2, 0.0F, 0.0F, 0.3054F);
			body_r2.setTextureOffset(0, 17).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, 0.5101F, false);
			leftArm = new ModelRenderer(this);
			leftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			leftArm.setTextureOffset(0, 44).addBox(0.0F, -1.0F, -2.0F, 5.0F, 3.0F, 6.0F, 0.5101F, true);
			body_r3 = new ModelRenderer(this);
			body_r3.setRotationPoint(3.5F, 6.5F, 1.5F);
			leftArm.addChild(body_r3);
			setRotationAngle(body_r3, 0.0F, 0.0F, -0.3054F);
			body_r3.setTextureOffset(0, 53).addBox(-2.0F, 8.5F, -1.5F, 4.0F, 5.0F, 3.0F, 0.5101F, true);
			body_r3.setTextureOffset(14, 56).addBox(-0.5F, 1.5F, -1.5F, 3.0F, 5.0F, 3.0F, 0.5101F, true);
			body_r3.setTextureOffset(0, 14).addBox(0.5F, -3.5F, -0.5F, 1.0F, 4.0F, 1.0F, 0.5101F, true);
			body_r4 = new ModelRenderer(this);
			body_r4.setRotationPoint(6.709F, 13.3522F, 1.5F);
			leftArm.addChild(body_r4);
			setRotationAngle(body_r4, 0.0F, 0.0F, -0.3054F);
			body_r4.setTextureOffset(0, 17).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, 0.5101F, true);
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
