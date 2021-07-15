// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelfarao_armor extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;

	public Modelfarao_armor() {
		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);
		Head.setTextureOffset(0, 62).addBox(-7.5F, -3.0F, -2.0F, 15.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 62).addBox(-7.5F, -3.0F, -2.5F, 15.0F, 1.0F, 1.0F, -0.001F, false);
		Head.setTextureOffset(0, 62).addBox(-7.0F, -4.0F, -2.0F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 62).addBox(-7.0F, -4.0F, -2.25F, 14.0F, 1.0F, 1.0F, 0.1F, false);
		Head.setTextureOffset(0, 62).addBox(-6.5F, -5.0F, -2.0F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 62).addBox(-6.0F, -6.0F, -2.0F, 12.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 62).addBox(-5.5F, -7.0F, -2.0F, 11.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 62).addBox(-4.05F, -9.0F, -2.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 62).addBox(-3.55F, -10.0F, -2.0F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 58).addBox(-3.55F, -8.0F, -5.0F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(2, 60).addBox(-8.0F, -2.0F, -2.0F, 16.0F, 3.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(2, 60).addBox(-8.0F, -2.0F, -3.0F, 16.0F, 3.0F, 1.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.25F, false);
		Body.setTextureOffset(16, 43).addBox(-4.0F, 11.0F, -2.0F, 8.0F, 1.0F, 4.0F, 0.35F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.setTextureOffset(0, 18).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);
		RightArm.setTextureOffset(0, 53).addBox(-3.0F, 2.775F, -2.0F, 4.0F, 1.0F, 4.0F, 0.35F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.setTextureOffset(0, 64).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightLeg.setTextureOffset(0, 35).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftLeg.setTextureOffset(0, 35).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}