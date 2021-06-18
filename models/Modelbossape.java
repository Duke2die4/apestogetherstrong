// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelbossape extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer head;
	private final ModelRenderer body_r2;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer head_r3;
	private final ModelRenderer jaw;
	private final ModelRenderer rightarm;
	private final ModelRenderer arm1_r1;
	private final ModelRenderer arm0_r1;
	private final ModelRenderer bone4;
	private final ModelRenderer arm2_r1;
	private final ModelRenderer leftarm;
	private final ModelRenderer arm2_r2;
	private final ModelRenderer arm1_r2;
	private final ModelRenderer bone3;
	private final ModelRenderer arm3_r1;
	private final ModelRenderer Rightleg;
	private final ModelRenderer leg1_r1;
	private final ModelRenderer leg0_r1;
	private final ModelRenderer bone;
	private final ModelRenderer leftleg;
	private final ModelRenderer leg2_r1;
	private final ModelRenderer leg1_r2;
	private final ModelRenderer bone2;

	public Modelbossape() {
		textureWidth = 256;
		textureHeight = 256;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 2.375F, 8.625F);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(0.0F, 1.625F, 2.875F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, 1.0036F, 0.0F, 0.0F);
		body_r1.setTextureOffset(36, 114).addBox(-7.0F, -15.0F, -7.5F, 14.0F, 13.0F, 2.0F, 0.0F, false);
		body_r1.setTextureOffset(84, 101).addBox(-9.0F, -34.0F, -8.5F, 18.0F, 19.0F, 3.0F, 0.0F, false);
		body_r1.setTextureOffset(0, 0).addBox(-9.0F, -34.0F, -5.5F, 18.0F, 36.0F, 11.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -16.375F, -23.625F);
		body.addChild(head);
		head.setTextureOffset(43, 32).addBox(-8.0F, -10.0F, -10.5F, 16.0F, 15.0F, 15.0F, 0.0F, false);

		body_r2 = new ModelRenderer(this);
		body_r2.setRotationPoint(0.0F, -6.0F, -5.5F);
		head.addChild(body_r2);
		setRotationAngle(body_r2, -0.7418F, 0.0F, 0.0F);
		body_r2.setTextureOffset(85, 80).addBox(-7.0F, -9.0F, -5.5F, 14.0F, 10.0F, 11.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(0.0F, -0.5F, -12.0F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.0F, 0.0F, -0.7854F);
		head_r1.setTextureOffset(47, 0).addBox(-1.5F, -3.5F, -1.1F, 5.0F, 5.0F, 3.0F, 0.0F, false);

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(0.0F, -7.5707F, -10.5151F);
		head.addChild(head_r2);
		setRotationAngle(head_r2, -0.2182F, 0.0F, 0.0F);
		head_r2.setTextureOffset(58, 20).addBox(-7.0F, -1.5F, -1.5F, 14.0F, 3.0F, 3.0F, 0.0F, false);

		head_r3 = new ModelRenderer(this);
		head_r3.setRotationPoint(0.0F, -4.0F, -12.0F);
		head.addChild(head_r3);
		setRotationAngle(head_r3, -0.3491F, 0.0F, 0.0F);
		head_r3.setTextureOffset(29, 79).addBox(-2.0F, -3.0F, -0.5F, 4.0F, 6.0F, 3.0F, 0.0F, false);

		jaw = new ModelRenderer(this);
		jaw.setRotationPoint(0.0F, 3.0F, 1.0F);
		head.addChild(jaw);
		jaw.setTextureOffset(26, 160).addBox(-8.0F, -4.8F, -14.5F, 16.0F, 5.0F, 15.0F, 0.4F, false);
		jaw.setTextureOffset(58, 0).addBox(-8.0F, 1.0F, -14.5F, 16.0F, 5.0F, 15.0F, 0.4F, false);

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-9.0F, -14.375F, -17.625F);
		body.addChild(rightarm);
		rightarm.setTextureOffset(0, 112).addBox(-10.4F, 15.6428F, -15.8066F, 10.0F, 8.0F, 8.0F, -0.1F, false);

		arm1_r1 = new ModelRenderer(this);
		arm1_r1.setRotationPoint(-5.0F, 8.5F, -4.5F);
		rightarm.addChild(arm1_r1);
		setRotationAngle(arm1_r1, -0.48F, 0.0F, 0.0F);
		arm1_r1.setTextureOffset(0, 49).addBox(-7.0F, -17.0F, -8.5F, 12.0F, 17.0F, 13.0F, 0.0F, false);

		arm0_r1 = new ModelRenderer(this);
		arm0_r1.setRotationPoint(-5.4F, 8.1F, -4.4F);
		rightarm.addChild(arm0_r1);
		setRotationAngle(arm0_r1, -0.48F, 0.0F, 0.0F);
		arm0_r1.setTextureOffset(0, 79).addBox(-5.0F, -12.0F, -6.5F, 10.0F, 24.0F, 9.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-5.0F, 20.1428F, -9.3066F);
		rightarm.addChild(bone4);
		bone4.setTextureOffset(38, 91).addBox(-6.0F, -2.0F, -8.5F, 12.0F, 12.0F, 11.0F, 0.0F, false);

		arm2_r1 = new ModelRenderer(this);
		arm2_r1.setRotationPoint(0.0F, 10.0F, -3.0F);
		bone4.addChild(arm2_r1);
		setRotationAngle(arm2_r1, 0.9163F, 0.0F, 0.0F);
		arm2_r1.setTextureOffset(90, 20).addBox(-6.0F, -4.4F, -3.3F, 12.0F, 12.0F, 11.0F, -0.1F, false);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(9.0F, -14.375F, -17.625F);
		body.addChild(leftarm);
		leftarm.setTextureOffset(0, 112).addBox(0.4F, 15.6428F, -15.8066F, 10.0F, 8.0F, 8.0F, -0.1F, true);

		arm2_r2 = new ModelRenderer(this);
		arm2_r2.setRotationPoint(5.0F, 8.5F, -4.5F);
		leftarm.addChild(arm2_r2);
		setRotationAngle(arm2_r2, -0.48F, 0.0F, 0.0F);
		arm2_r2.setTextureOffset(0, 49).addBox(-5.0F, -17.0F, -8.5F, 12.0F, 17.0F, 13.0F, 0.0F, true);

		arm1_r2 = new ModelRenderer(this);
		arm1_r2.setRotationPoint(5.4F, 8.1F, -4.4F);
		leftarm.addChild(arm1_r2);
		setRotationAngle(arm1_r2, -0.48F, 0.0F, 0.0F);
		arm1_r2.setTextureOffset(0, 79).addBox(-5.0F, -12.0F, -6.5F, 10.0F, 24.0F, 9.0F, 0.0F, true);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(5.0F, 20.1428F, -9.3066F);
		leftarm.addChild(bone3);
		bone3.setTextureOffset(38, 91).addBox(-6.0F, -2.0F, -8.5F, 12.0F, 12.0F, 11.0F, 0.0F, true);

		arm3_r1 = new ModelRenderer(this);
		arm3_r1.setRotationPoint(0.0F, 10.0F, -3.0F);
		bone3.addChild(arm3_r1);
		setRotationAngle(arm3_r1, 0.9163F, 0.0F, 0.0F);
		arm3_r1.setTextureOffset(90, 20).addBox(-6.0F, -4.4F, -3.3F, 12.0F, 12.0F, 11.0F, -0.1F, true);

		Rightleg = new ModelRenderer(this);
		Rightleg.setRotationPoint(-9.0F, -1.375F, 1.375F);
		body.addChild(Rightleg);

		leg1_r1 = new ModelRenderer(this);
		leg1_r1.setRotationPoint(-4.5F, 16.0F, -0.5F);
		Rightleg.addChild(leg1_r1);
		setRotationAngle(leg1_r1, -0.3927F, 0.0F, 0.0F);
		leg1_r1.setTextureOffset(119, 116).addBox(-5.0F, -8.0F, -8.5F, 8.0F, 9.0F, 7.0F, 0.0F, false);

		leg0_r1 = new ModelRenderer(this);
		leg0_r1.setRotationPoint(-5.0F, 6.0F, 5.0F);
		Rightleg.addChild(leg0_r1);
		setRotationAngle(leg0_r1, -0.3927F, 0.0F, 0.0F);
		leg0_r1.setTextureOffset(50, 62).addBox(-5.5F, -10.0F, -12.0F, 11.0F, 17.0F, 12.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-4.5F, 13.3499F, -5.7685F);
		Rightleg.addChild(bone);
		bone.setTextureOffset(95, 52).addBox(-6.0F, -1.0F, -4.5F, 10.0F, 9.0F, 10.0F, 0.0F, false);
		bone.setTextureOffset(105, 0).addBox(-5.0F, 8.0F, -7.5F, 8.0F, 2.0F, 12.0F, 0.0F, false);

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(9.0F, -1.375F, 1.375F);
		body.addChild(leftleg);

		leg2_r1 = new ModelRenderer(this);
		leg2_r1.setRotationPoint(5.875F, 16.0F, -0.5F);
		leftleg.addChild(leg2_r1);
		setRotationAngle(leg2_r1, -0.3927F, 0.0F, 0.0F);
		leg2_r1.setTextureOffset(119, 116).addBox(-5.0F, -8.0F, -8.5F, 8.0F, 9.0F, 7.0F, 0.0F, true);

		leg1_r2 = new ModelRenderer(this);
		leg1_r2.setRotationPoint(5.375F, 6.0F, 5.0F);
		leftleg.addChild(leg1_r2);
		setRotationAngle(leg1_r2, -0.3927F, 0.0F, 0.0F);
		leg1_r2.setTextureOffset(50, 62).addBox(-5.5F, -10.0F, -12.0F, 11.0F, 17.0F, 12.0F, 0.0F, true);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(5.875F, 13.3499F, -5.7685F);
		leftleg.addChild(bone2);
		bone2.setTextureOffset(95, 52).addBox(-6.0F, -1.0F, -4.5F, 10.0F, 9.0F, 10.0F, 0.0F, true);
		bone2.setTextureOffset(105, 0).addBox(-5.0F, 8.0F, -7.5F, 8.0F, 2.0F, 12.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.Rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.jaw.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.rightarm.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leftarm.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}