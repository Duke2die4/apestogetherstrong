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

import apesstrongtogether.entity.Bossape2Entity;

@OnlyIn(Dist.CLIENT)
public class Bossape2Renderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(Bossape2Entity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelApe4(), 1.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("apes_strong_together:textures/ape4.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class ModelApe4 extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer body_r1;
		private final ModelRenderer rightleg;
		private final ModelRenderer rightleg_r1;
		private final ModelRenderer rightleg_r2;
		private final ModelRenderer leftleg;
		private final ModelRenderer rightleg_r3;
		private final ModelRenderer rightleg_r4;
		private final ModelRenderer rightarm;
		private final ModelRenderer cube_r5_r1;
		private final ModelRenderer rightarm_r1;
		private final ModelRenderer rightarm_r2;
		private final ModelRenderer rightarm_r3;
		private final ModelRenderer leftarm;
		private final ModelRenderer cube_r6_r1;
		private final ModelRenderer rightarm_r4;
		private final ModelRenderer rightarm_r5;
		private final ModelRenderer rightarm_r6;
		private final ModelRenderer neck;
		private final ModelRenderer body_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		public ModelApe4() {
			textureWidth = 64;
			textureHeight = 64;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 12.0F, 0.0F);
			body_r1 = new ModelRenderer(this);
			body_r1.setRotationPoint(0.0F, 7.0F, 0.0F);
			body.addChild(body_r1);
			setRotationAngle(body_r1, -0.3491F, 0.0F, 0.0F);
			body_r1.setTextureOffset(0, 0).addBox(-4.1F, -11.7714F, -8.0417F, 8.0F, 6.0F, 16.0F, 1.0F, false);
			body_r1.setTextureOffset(0, 6).addBox(-0.1F, -18.7714F, -8.0417F, 0.0F, 6.0F, 16.0F, 0.0F, false);
			rightleg = new ModelRenderer(this);
			rightleg.setRotationPoint(-6.0F, 11.7894F, 7.8132F);
			setRotationAngle(rightleg, -0.3927F, 0.0F, 0.0F);
			rightleg.setTextureOffset(32, 32).addBox(-0.1F, -0.7999F, -1.3397F, 2.0F, 6.0F, 4.0F, 1.0F, false);
			rightleg_r1 = new ModelRenderer(this);
			rightleg_r1.setRotationPoint(0.891F, 7.9452F, 1.0339F);
			rightleg.addChild(rightleg_r1);
			setRotationAngle(rightleg_r1, 0.4363F, 0.0F, 0.0F);
			rightleg_r1.setTextureOffset(24, 40).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 4.0F, 2.0F, 1.0F, false);
			rightleg_r2 = new ModelRenderer(this);
			rightleg_r2.setRotationPoint(7.9F, 18.777F, -1.7356F);
			rightleg.addChild(rightleg_r2);
			setRotationAngle(rightleg_r2, 0.3927F, 0.0F, 0.0F);
			rightleg_r2.setTextureOffset(32, 12).addBox(-8.0F, -5.503F, 4.8461F, 2.0F, 1.0F, 3.0F, 1.0F, false);
			leftleg = new ModelRenderer(this);
			leftleg.setRotationPoint(6.0F, 11.7894F, 7.8132F);
			setRotationAngle(leftleg, -0.3927F, 0.0F, 0.0F);
			leftleg.setTextureOffset(32, 22).addBox(-2.1F, -0.7238F, -1.7223F, 2.0F, 6.0F, 4.0F, 1.0F, false);
			rightleg_r3 = new ModelRenderer(this);
			rightleg_r3.setRotationPoint(-1.091F, 8.0213F, 0.6512F);
			leftleg.addChild(rightleg_r3);
			setRotationAngle(rightleg_r3, 0.4363F, 0.0F, 0.0F);
			rightleg_r3.setTextureOffset(16, 40).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 4.0F, 2.0F, 1.0F, false);
			rightleg_r4 = new ModelRenderer(this);
			rightleg_r4.setRotationPoint(-8.1F, 18.8531F, -2.1183F);
			leftleg.addChild(rightleg_r4);
			setRotationAngle(rightleg_r4, 0.3927F, 0.0F, 0.0F);
			rightleg_r4.setTextureOffset(5, 12).addBox(6.0F, -5.503F, 4.8461F, 2.0F, 1.0F, 3.0F, 1.0F, false);
			rightarm = new ModelRenderer(this);
			rightarm.setRotationPoint(-6.0F, 9.0F, -1.5F);
			cube_r5_r1 = new ModelRenderer(this);
			cube_r5_r1.setRotationPoint(-1.1F, -4.5209F, -0.0376F);
			rightarm.addChild(cube_r5_r1);
			setRotationAngle(cube_r5_r1, -0.2618F, 0.0F, 0.0F);
			cube_r5_r1.setTextureOffset(0, 55).addBox(1.0F, -1.5F, -2.0F, 0.0F, 3.0F, 6.0F, 0.0F, false);
			rightarm_r1 = new ModelRenderer(this);
			rightarm_r1.setRotationPoint(0.9F, 10.322F, 1.0606F);
			rightarm.addChild(rightarm_r1);
			setRotationAngle(rightarm_r1, 0.1309F, 0.0F, 0.0F);
			rightarm_r1.setTextureOffset(8, 38).addBox(-1.0F, -4.0F, -4.4F, 2.0F, 4.0F, 2.0F, 0.98F, false);
			rightarm_r2 = new ModelRenderer(this);
			rightarm_r2.setRotationPoint(7.9F, 19.5F, 1.919F);
			rightarm.addChild(rightarm_r2);
			setRotationAngle(rightarm_r2, 0.1309F, 0.0F, 0.0F);
			rightarm_r2.setTextureOffset(41, 29).addBox(-7.9F, -8.0F, -3.5F, 2.0F, 2.0F, 3.0F, 1.0F, false);
			rightarm_r3 = new ModelRenderer(this);
			rightarm_r3.setRotationPoint(0.9F, 3.5F, 0.919F);
			rightarm.addChild(rightarm_r3);
			setRotationAngle(rightarm_r3, -0.2618F, 0.0F, 0.0F);
			rightarm_r3.setTextureOffset(32, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 8.0F, 4.0F, 1.0F, false);
			leftarm = new ModelRenderer(this);
			leftarm.setRotationPoint(6.0F, 9.0F, -1.5F);
			cube_r6_r1 = new ModelRenderer(this);
			cube_r6_r1.setRotationPoint(-13.1F, -4.5209F, -0.0376F);
			leftarm.addChild(cube_r6_r1);
			setRotationAngle(cube_r6_r1, -0.2618F, 0.0F, 0.0F);
			cube_r6_r1.setTextureOffset(0, 55).addBox(13.0F, -1.5F, -2.0F, 0.0F, 3.0F, 6.0F, 0.0F, false);
			rightarm_r4 = new ModelRenderer(this);
			rightarm_r4.setRotationPoint(-1.08F, 11.3901F, 1.9879F);
			leftarm.addChild(rightarm_r4);
			setRotationAngle(rightarm_r4, 0.1309F, 0.0F, 0.0F);
			rightarm_r4.setTextureOffset(0, 38).addBox(-1.0F, -5.2F, -5.2F, 2.0F, 4.0F, 2.0F, 0.98F, false);
			rightarm_r5 = new ModelRenderer(this);
			rightarm_r5.setRotationPoint(-1.1F, 14.3734F, -1.2775F);
			leftarm.addChild(rightarm_r5);
			setRotationAngle(rightarm_r5, 0.1309F, 0.0F, 0.0F);
			rightarm_r5.setTextureOffset(41, 9).addBox(-1.1F, -2.2F, -1.2F, 2.0F, 2.0F, 3.0F, 1.0F, false);
			rightarm_r6 = new ModelRenderer(this);
			rightarm_r6.setRotationPoint(-1.1F, 3.5F, 0.919F);
			leftarm.addChild(rightarm_r6);
			setRotationAngle(rightarm_r6, -0.2618F, 0.0F, 0.0F);
			rightarm_r6.setTextureOffset(20, 28).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 8.0F, 4.0F, 1.0F, false);
			neck = new ModelRenderer(this);
			neck.setRotationPoint(0.1F, 7.0F, -6.5F);
			body_r2 = new ModelRenderer(this);
			body_r2.setRotationPoint(-0.3F, 7.9F, 3.1F);
			neck.addChild(body_r2);
			setRotationAngle(body_r2, -0.3491F, 0.0F, 0.0F);
			body_r2.setTextureOffset(0, 0).addBox(-1.3F, -6.7111F, -7.4849F, 2.0F, 3.0F, 6.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(-0.5F, 10.6F, 1.3F);
			neck.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.2182F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(0, 28).addBox(-2.6F, -12.6067F, -2.5551F, 6.0F, 6.0F, 4.0F, 0.0F, false);
			cube_r3.setTextureOffset(0, 8).addBox(0.4F, -15.6067F, -2.5551F, 0.0F, 3.0F, 4.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(-0.5F, 9.5102F, -1.6712F);
			neck.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.2182F, 0.0F, 0.0F);
			cube_r4.setTextureOffset(0, 9).addBox(-2.7F, -11.0067F, -0.5551F, 6.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(-0.5F, 11.4F, -0.7F);
			neck.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.2182F, 0.0F, 0.0F);
			cube_r5.setTextureOffset(40, 0).addBox(-1.6F, -9.4067F, -1.4551F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
			leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
			rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
			leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
			neck.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.rightarm.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.neck.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.neck.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.leftarm.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}
}
