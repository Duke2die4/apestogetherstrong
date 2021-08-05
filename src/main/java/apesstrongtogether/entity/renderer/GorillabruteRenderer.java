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

import apesstrongtogether.entity.GorillabruteEntity;

@OnlyIn(Dist.CLIENT)
public class GorillabruteRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(GorillabruteEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelgorilla2(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("apes_strong_together:textures/gorilla_standing.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelgorilla2 extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer cube_r1;
		private final ModelRenderer rightarm;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer rightleg;
		private final ModelRenderer leftleg;
		private final ModelRenderer leftarm;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		private final ModelRenderer bb_main;
		private final ModelRenderer cube_r6;
		public Modelgorilla2() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.5F, -9.25F, 2.525F);
			head.setTextureOffset(0, 43).addBox(-5.0F, -8.0F, -4.525F, 9.0F, 9.0F, 9.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-4.0F, -4.0F, -6.525F, 7.0F, 5.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 7).addBox(-4.0F, -7.0F, -5.525F, 7.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(2.0F, -1.5F, 2.575F);
			head.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.3054F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(36, 43).addBox(-6.0F, -8.0F, -4.0F, 7.0F, 8.0F, 8.0F, -0.2F, false);
			rightarm = new ModelRenderer(this);
			rightarm.setRotationPoint(-8.5F, -5.5F, 2.5F);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(-0.5F, 6.75F, -12.0F);
			rightarm.addChild(cube_r2);
			setRotationAngle(cube_r2, -1.0472F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(48, 0).addBox(-5.5F, -7.5F, -4.5F, 7.0F, 7.0F, 7.0F, 0.0F, false);
			cube_r2.setTextureOffset(48, 0).addBox(-5.5F, -17.5F, -4.5F, 7.0F, 7.0F, 7.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(-0.5F, 7.75F, -13.0F);
			rightarm.addChild(cube_r3);
			setRotationAngle(cube_r3, -1.0472F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(58, 25).addBox(-3.5F, -0.5F, -20.5F, 3.0F, 3.0F, 22.0F, 0.0F, false);
			cube_r3.setTextureOffset(58, 26).addBox(-4.5F, -12.5F, -4.5F, 5.0F, 16.0F, 5.0F, 0.0F, false);
			rightleg = new ModelRenderer(this);
			rightleg.setRotationPoint(-3.5F, 9.5F, 3.5F);
			rightleg.setTextureOffset(51, 59).addBox(-3.0F, 0.5F, -2.5F, 5.0F, 13.0F, 5.0F, 1.1F, false);
			leftleg = new ModelRenderer(this);
			leftleg.setRotationPoint(3.5F, 9.5F, 3.5F);
			leftleg.setTextureOffset(31, 59).addBox(-2.0F, 0.5F, -2.5F, 5.0F, 13.0F, 5.0F, 1.1F, false);
			leftarm = new ModelRenderer(this);
			leftarm.setRotationPoint(8.5F, -5.5F, 2.5F);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(-0.5F, 6.75F, -12.0F);
			leftarm.addChild(cube_r4);
			setRotationAngle(cube_r4, -1.0472F, 0.0F, 0.0F);
			cube_r4.setTextureOffset(48, 0).addBox(-0.5F, -7.5F, -4.5F, 7.0F, 7.0F, 7.0F, 0.0F, true);
			cube_r4.setTextureOffset(48, 0).addBox(-0.5F, -17.5F, -4.5F, 7.0F, 7.0F, 7.0F, 0.0F, true);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(-0.5F, 7.75F, -13.0F);
			leftarm.addChild(cube_r5);
			setRotationAngle(cube_r5, -1.0472F, 0.0F, 0.0F);
			cube_r5.setTextureOffset(58, 26).addBox(0.5F, -12.5F, -4.5F, 5.0F, 16.0F, 5.0F, 0.0F, true);
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(-1.0F, -23.429F, -0.9712F);
			bb_main.addChild(cube_r6);
			setRotationAngle(cube_r6, -1.5272F, 0.0F, 0.0F);
			cube_r6.setTextureOffset(0, 26).addBox(-7.5F, -8.0F, -9.0F, 17.0F, 8.0F, 9.0F, 0.1F, false);
			cube_r6.setTextureOffset(0, 0).addBox(-6.5F, -8.0F, -9.0F, 15.0F, 8.0F, 18.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
			rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
			leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
			leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
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
			this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}
}
