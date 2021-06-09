// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class ModelApe3 extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer body_r1_r1;
	private final ModelRenderer leftleg;
	private final ModelRenderer cube_r1;
	private final ModelRenderer rightleg;
	private final ModelRenderer cube_r2;
	private final ModelRenderer rightarm;
	private final ModelRenderer leftarm;
	private final ModelRenderer neck;
	private final ModelRenderer body_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r5_r1;

	public ModelApe3() {
		textureWidth = 32;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 17.0F, 0.0F);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(0.0F, 2.0F, 0.0F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, -0.3491F, 0.0F, 0.0F);

		body_r1_r1 = new ModelRenderer(this);
		body_r1_r1.setRotationPoint(0.0F, -9.5F, 1.0F);
		body_r1.addChild(body_r1_r1);
		setRotationAngle(body_r1_r1, -0.2618F, 0.0F, 0.0F);
		body_r1_r1.setTextureOffset(0, 0).addBox(-2.0F, -1.5F, -4.0F, 4.0F, 3.0F, 8.0F, 2.0F, false);

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(5.5F, 14.0F, 9.0F);
		leftleg.setTextureOffset(10, 19).addBox(-1.5F, 5.497F, -1.0539F, 1.0F, 3.0F, 1.0F, 1.991F, false);
		leftleg.setTextureOffset(16, 4).addBox(-3.0F, 7.997F, -5.1539F, 2.0F, 1.0F, 2.0F, 1.4F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-3.0F, 6.0F, -5.0F);
		leftleg.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.2182F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(14, 15).addBox(1.5F, -7.0F, 3.0F, 1.0F, 3.0F, 2.0F, 2.0F, false);

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-5.5F, 14.0F, 9.0F);
		rightleg.setTextureOffset(6, 16).addBox(1.0F, 7.997F, -5.1539F, 2.0F, 1.0F, 2.0F, 1.4F, false);
		rightleg.setTextureOffset(19, 19).addBox(0.5F, 5.497F, -1.0539F, 1.0F, 3.0F, 1.0F, 1.991F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(3.0F, 5.2F, -5.0F);
		rightleg.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.2182F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(0, 16).addBox(-2.5F, -5.219F, 3.1732F, 1.0F, 3.0F, 2.0F, 2.0F, false);

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-5.0F, 9.0F, -0.5F);
		rightarm.setTextureOffset(10, 11).addBox(0.0F, -1.0F, -1.5F, 1.0F, 4.0F, 2.0F, 2.0F, false);
		rightarm.setTextureOffset(8, 11).addBox(0.0F, 11.9F, -1.2F, 1.0F, 1.0F, 1.0F, 2.2F, false);
		rightarm.setTextureOffset(6, 19).addBox(0.0F, 6.3F, -1.0F, 1.0F, 4.0F, 1.0F, 1.991F, false);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(5.0F, 9.0F, -0.5F);
		leftarm.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -1.5F, 1.0F, 4.0F, 2.0F, 2.0F, false);
		leftarm.setTextureOffset(16, 11).addBox(-1.0F, 6.3F, -1.0F, 1.0F, 4.0F, 1.0F, 1.991F, false);
		leftarm.setTextureOffset(4, 0).addBox(-1.0F, 11.9F, -1.2F, 1.0F, 1.0F, 1.0F, 2.2F, false);

		neck = new ModelRenderer(this);
		neck.setRotationPoint(0.5F, 9.0F, -1.5F);

		body_r2 = new ModelRenderer(this);
		body_r2.setRotationPoint(-0.3F, -2.1F, 0.1F);
		neck.addChild(body_r2);
		setRotationAngle(body_r2, -0.3491F, 0.0F, 0.0F);
		body_r2.setTextureOffset(16, 0).addBox(-0.7F, -0.5397F, -1.4432F, 1.0F, 2.0F, 3.0F, 2.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.5F, 8.6F, -1.7F);
		neck.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.2182F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(0, 11).addBox(-1.5F, -7.0F, -1.0F, 3.0F, 3.0F, 2.0F, 2.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.5F, 7.5102F, -4.6712F);
		neck.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.2182F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(0, 6).addBox(-1.6F, -2.4F, -1.0F, 3.0F, 1.0F, 3.0F, 1.8F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-0.5F, 9.4F, -3.7F);
		neck.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.2182F, 0.0F, 0.0F);

		cube_r5_r1 = new ModelRenderer(this);
		cube_r5_r1.setRotationPoint(0.0F, -5.4F, -4.8F);
		cube_r5.addChild(cube_r5_r1);
		setRotationAngle(cube_r5_r1, -1.6581F, 0.0F, 0.0F);
		cube_r5_r1.setTextureOffset(18, 15).addBox(-1.0F, -8.4F, -5.1F, 2.0F, 1.0F, 1.0F, 2.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
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

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.rightarm.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.neck.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.neck.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leftarm.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}