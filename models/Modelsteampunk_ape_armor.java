// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelsteampunk_ape_armor extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer rightfoot;
	private final ModelRenderer leftfoot;

	public Modelsteampunk_ape_armor() {
		textureWidth = 128;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.setTextureOffset(0, 13).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);
		Head.setTextureOffset(0, 0).addBox(-5.0F, -6.0F, -6.0F, 10.0F, 2.0F, 11.0F, -0.1F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(0, 45).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.25F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.setTextureOffset(12, 36).addBox(-3.0F, 7.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.25F, false);
		RightArm.setTextureOffset(31, 0).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.25F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.setTextureOffset(31, 0).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.25F, false);
		LeftArm.setTextureOffset(12, 36).addBox(-1.0F, 7.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.25F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightLeg.setTextureOffset(0, 29).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.25F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftLeg.setTextureOffset(0, 29).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.25F, false);

		rightfoot = new ModelRenderer(this);
		rightfoot.setRotationPoint(-1.9F, 12.0F, 0.0F);
		rightfoot.setTextureOffset(24, 13).addBox(-2.0F, 8.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.25F, false);

		leftfoot = new ModelRenderer(this);
		leftfoot.setRotationPoint(1.9F, 12.0F, 0.0F);
		leftfoot.setTextureOffset(24, 13).addBox(-2.0F, 8.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.25F, false);
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
		rightfoot.render(matrixStack, buffer, packedLight, packedOverlay);
		leftfoot.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}