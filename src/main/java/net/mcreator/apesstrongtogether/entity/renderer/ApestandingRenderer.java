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

import apesstrongtogether.entity.ApestandingEntity;

@OnlyIn(Dist.CLIENT)
public class ApestandingRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ApestandingEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelApe_standing(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("apes_strong_together:textures/ape_standing.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelApe_standing extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer body_r1;
		private final ModelRenderer body_r1_r1;
		private final ModelRenderer leftleg;
		private final ModelRenderer leftleg_r1;
		private final ModelRenderer cube_r4_r1;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r1_r1;
		private final ModelRenderer rightleg;
		private final ModelRenderer rightleg_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3_r1;
		private final ModelRenderer rightarm;
		private final ModelRenderer rightarm_r1;
		private final ModelRenderer rightarm_r2;
		private final ModelRenderer rightarm_r3;
		private final ModelRenderer leftarm;
		private final ModelRenderer leftarm_r1;
		private final ModelRenderer rightarm_r4;
		private final ModelRenderer leftarm_r2;
		private final ModelRenderer neck;
		private final ModelRenderer body_r2;
		private final ModelRenderer body_r2_r1;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4_r2;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r4_r3;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r5_r1;
		public ModelApe_standing() {
			textureWidth = 32;
			textureHeight = 32;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 17.0F, 0.0F);
			body_r1 = new ModelRenderer(this);
			body_r1.setRotationPoint(0.0F, 2.0F, 0.0F);
			body.addChild(body_r1);
			setRotationAngle(body_r1, -0.3491F, 0.0F, 0.0F);
			body_r1_r1 = new ModelRenderer(this);
			body_r1_r1.setRotationPoint(-0.0059F, 0.5532F, 0.2465F);
			body_r1.addChild(body_r1_r1);
			setRotationAngle(body_r1_r1, -1.0472F, 0.0F, 0.0F);
			body_r1_r1.setTextureOffset(0, 0).addBox(-1.9941F, -5.4213F, -8.1705F, 4.0F, 3.0F, 8.0F, 0.0F, false);
			leftleg = new ModelRenderer(this);
			leftleg.setRotationPoint(2.5F, 19.5F, 3.5F);
			setRotationAngle(leftleg, 1.1345F, 0.0F, 0.0F);
			leftleg_r1 = new ModelRenderer(this);
			leftleg_r1.setRotationPoint(-2.5059F, -2.9895F, -3.535F);
			leftleg.addChild(leftleg_r1);
			setRotationAngle(leftleg_r1, -1.0472F, 0.0F, 0.0F);
			leftleg_r1.setTextureOffset(0, 5).addBox(1.5059F, 2.3966F, 1.8909F, 2.0F, 1.0F, 2.0F, -0.6F, false);
			leftleg_r1.setTextureOffset(18, 13).addBox(2.0059F, -0.1034F, 2.9909F, 1.0F, 3.0F, 1.0F, -0.009F, false);
			cube_r4_r1 = new ModelRenderer(this);
			cube_r4_r1.setRotationPoint(-2.5059F, 1.3576F, -2.6037F);
			leftleg.addChild(cube_r4_r1);
			setRotationAngle(cube_r4_r1, -1.2654F, 0.0F, 0.0F);
			cube_r4_r1.setTextureOffset(18, 17).addBox(2.0059F, -0.9144F, -1.496F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 1.4063F, 0.4226F);
			leftleg.addChild(cube_r1);
			setRotationAngle(cube_r1, -0.2182F, 0.0F, 0.0F);
			cube_r1_r1 = new ModelRenderer(this);
			cube_r1_r1.setRotationPoint(-2.5059F, 0.4703F, -3.9495F);
			cube_r1.addChild(cube_r1_r1);
			setRotationAngle(cube_r1_r1, -1.0472F, 0.0F, 0.0F);
			cube_r1_r1.setTextureOffset(0, 18).addBox(2.0059F, -4.6644F, -0.996F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			rightleg = new ModelRenderer(this);
			rightleg.setRotationPoint(-2.5F, 19.5F, 3.5F);
			setRotationAngle(rightleg, 1.1345F, 0.0F, 0.0F);
			rightleg_r1 = new ModelRenderer(this);
			rightleg_r1.setRotationPoint(2.4941F, -2.5832F, -3.3624F);
			rightleg.addChild(rightleg_r1);
			setRotationAngle(rightleg_r1, -1.0472F, 0.0F, 0.0F);
			rightleg_r1.setTextureOffset(18, 13).addBox(-2.9941F, -0.1034F, 2.9909F, 1.0F, 3.0F, 1.0F, -0.009F, false);
			rightleg_r1.setTextureOffset(0, 5).addBox(-3.4941F, 2.3966F, 1.8909F, 2.0F, 1.0F, 2.0F, -0.6F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, 1.0126F, 0.5952F);
			rightleg.addChild(cube_r2);
			setRotationAngle(cube_r2, -0.2182F, 0.0F, 0.0F);
			cube_r3_r1 = new ModelRenderer(this);
			cube_r3_r1.setRotationPoint(2.4941F, 1.2513F, -3.7763F);
			cube_r2.addChild(cube_r3_r1);
			setRotationAngle(cube_r3_r1, -1.0472F, 0.0F, 0.0F);
			cube_r3_r1.setTextureOffset(18, 17).addBox(-2.9941F, -1.6644F, -0.996F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r3_r1.setTextureOffset(12, 16).addBox(-2.9941F, -4.6644F, -0.996F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			rightarm = new ModelRenderer(this);
			rightarm.setRotationPoint(-2.5F, 11.9F, 2.5F);
			setRotationAngle(rightarm, 0.48F, 0.0F, 0.0F);
			rightarm_r1 = new ModelRenderer(this);
			rightarm_r1.setRotationPoint(2.4941F, 2.7042F, -1.9576F);
			rightarm.addChild(rightarm_r1);
			setRotationAngle(rightarm_r1, -1.4835F, 0.0F, 0.0F);
			rightarm_r1.setTextureOffset(6, 18).addBox(-2.9941F, 0.4458F, -1.5424F, 1.0F, 4.0F, 1.0F, -0.009F, false);
			rightarm_r1.setTextureOffset(18, 17).addBox(-2.9941F, 1.0458F, -1.7424F, 1.0F, 1.0F, 1.0F, 0.2F, false);
			rightarm_r1.setTextureOffset(0, 11).addBox(-2.9941F, 4.2958F, -5.7424F, 1.0F, 1.0F, 6.0F, -0.2F, false);
			rightarm_r1.setTextureOffset(18, 19).addBox(-2.9941F, 4.0458F, -1.7424F, 1.0F, 1.0F, 1.0F, 0.2F, false);
			rightarm_r2 = new ModelRenderer(this);
			rightarm_r2.setRotationPoint(2.4941F, 2.7042F, -1.9576F);
			rightarm.addChild(rightarm_r2);
			setRotationAngle(rightarm_r2, -0.48F, 0.0F, 0.0F);
			rightarm_r2.setTextureOffset(18, 17).addBox(-2.2441F, -3.9542F, -0.2424F, 1.0F, 1.0F, 1.0F, 1.0F, false);
			rightarm_r3 = new ModelRenderer(this);
			rightarm_r3.setRotationPoint(2.4941F, 2.7042F, -1.9576F);
			rightarm.addChild(rightarm_r3);
			setRotationAngle(rightarm_r3, -1.0472F, 0.0F, 0.0F);
			rightarm_r3.setTextureOffset(0, 11).addBox(-2.9941F, -3.6042F, -2.0424F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			leftarm = new ModelRenderer(this);
			leftarm.setRotationPoint(2.5F, 11.9F, 2.5F);
			setRotationAngle(leftarm, 0.48F, 0.0F, 0.0F);
			leftarm_r1 = new ModelRenderer(this);
			leftarm_r1.setRotationPoint(-2.5059F, 2.7042F, -1.9576F);
			leftarm.addChild(leftarm_r1);
			setRotationAngle(leftarm_r1, -1.4835F, 0.0F, 0.0F);
			leftarm_r1.setTextureOffset(18, 19).addBox(2.0059F, 3.7958F, -1.7424F, 1.0F, 1.0F, 1.0F, 0.2F, false);
			leftarm_r1.setTextureOffset(18, 17).addBox(2.0059F, 1.0458F, -1.7424F, 1.0F, 1.0F, 1.0F, 0.2F, false);
			leftarm_r1.setTextureOffset(6, 18).addBox(2.0059F, 0.1958F, -1.5424F, 1.0F, 4.0F, 1.0F, -0.009F, false);
			rightarm_r4 = new ModelRenderer(this);
			rightarm_r4.setRotationPoint(-2.5059F, 2.7042F, -1.9576F);
			leftarm.addChild(rightarm_r4);
			setRotationAngle(rightarm_r4, -0.48F, 0.0F, 0.0F);
			rightarm_r4.setTextureOffset(18, 17).addBox(1.7559F, -3.9542F, -0.2424F, 1.0F, 1.0F, 1.0F, 1.0F, false);
			leftarm_r2 = new ModelRenderer(this);
			leftarm_r2.setRotationPoint(-2.5059F, 2.7042F, -1.9576F);
			leftarm.addChild(leftarm_r2);
			setRotationAngle(leftarm_r2, -1.0472F, 0.0F, 0.0F);
			leftarm_r2.setTextureOffset(0, 11).addBox(2.0059F, -3.6042F, -2.0424F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			neck = new ModelRenderer(this);
			neck.setRotationPoint(0.0F, 11.0F, 3.0F);
			setRotationAngle(neck, 0.6981F, 0.0F, 0.0F);
			body_r2 = new ModelRenderer(this);
			body_r2.setRotationPoint(0.2F, 2.6637F, -6.0493F);
			neck.addChild(body_r2);
			setRotationAngle(body_r2, -0.3491F, 0.0F, 0.0F);
			body_r2_r1 = new ModelRenderer(this);
			body_r2_r1.setRotationPoint(-0.2059F, 3.2843F, 3.1984F);
			body_r2.addChild(body_r2_r1);
			setRotationAngle(body_r2_r1, -1.0472F, 0.0F, 0.0F);
			body_r2_r1.setTextureOffset(0, 0).addBox(-0.4941F, -5.9272F, -8.9897F, 1.0F, 2.0F, 3.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, 5.3637F, -7.8493F);
			neck.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.2182F, 0.0F, 0.0F);
			cube_r4_r2 = new ModelRenderer(this);
			cube_r4_r2.setRotationPoint(-0.0059F, 2.0157F, 2.9656F);
			cube_r3.addChild(cube_r4_r2);
			setRotationAngle(cube_r4_r2, -1.0472F, 0.0F, 0.0F);
			cube_r4_r2.setTextureOffset(8, 11).addBox(-1.4941F, -10.4503F, -6.0676F, 3.0F, 3.0F, 2.0F, 0.25F, false);
			cube_r4_r2.setTextureOffset(16, 0).addBox(-1.4941F, -10.4503F, -6.0676F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, 4.2739F, -10.8205F);
			neck.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.2182F, 0.0F, 0.0F);
			cube_r4_r3 = new ModelRenderer(this);
			cube_r4_r3.setRotationPoint(-0.0059F, 3.7229F, 5.6304F);
			cube_r4.addChild(cube_r4_r3);
			setRotationAngle(cube_r4_r3, -1.0472F, 0.0F, 0.0F);
			cube_r4_r3.setTextureOffset(16, 5).addBox(-1.5941F, -10.5575F, -6.7324F, 3.0F, 1.0F, 1.0F, -0.2F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.0F, 6.1637F, -9.8493F);
			neck.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.2182F, 0.0F, 0.0F);
			cube_r5_r1 = new ModelRenderer(this);
			cube_r5_r1.setRotationPoint(-0.0059F, 1.6677F, 5.0914F);
			cube_r5.addChild(cube_r5_r1);
			setRotationAngle(cube_r5_r1, -1.0472F, 0.0F, 0.0F);
			cube_r5_r1.setTextureOffset(16, 11).addBox(-0.9941F, -8.9022F, -7.0933F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
			rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
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
			this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.neck.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.neck.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}
}
