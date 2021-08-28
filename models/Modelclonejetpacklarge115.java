// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelclonejetpacklarge115 extends EntityModel<Entity> {
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;

	public Modelclonejetpacklarge115() {
		textureWidth = 128;
		textureHeight = 128;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(0, 1).addBox(-3.5F, 2.0F, 1.25F, 7.0F, 7.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(39, 0).addBox(1.5F, 3.0F, 2.25F, 2.0F, 6.0F, 2.0F, 0.0F, false);
		Body.setTextureOffset(39, 13).addBox(-3.5F, 3.0F, 2.25F, 2.0F, 6.0F, 2.0F, 0.0F, false);
		Body.setTextureOffset(38, 23).addBox(2.0F, 3.5F, 2.5F, 1.0F, 5.0F, 2.0F, 0.0F, false);
		Body.setTextureOffset(40, 34).addBox(-3.0F, 3.5F, 2.5F, 1.0F, 5.0F, 2.0F, 0.0F, false);
		Body.setTextureOffset(28, 36).addBox(-3.5F, 9.65F, 2.25F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		Body.setTextureOffset(26, 30).addBox(1.5F, 9.65F, 2.25F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		Body.setTextureOffset(14, 30).addBox(-1.0F, 2.25F, 2.25F, 2.0F, 7.0F, 2.0F, 0.0F, false);
		Body.setTextureOffset(41, 44).addBox(-0.5F, 9.5F, 2.75F, 1.0F, 0.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(34, 42).addBox(-0.5F, 0.5F, 2.75F, 1.0F, 9.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(27, 43).addBox(-3.0F, 1.75F, 2.75F, 1.0F, 9.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(18, 23).addBox(-3.0F, 10.85F, 2.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(22, 13).addBox(2.0F, 10.85F, 2.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(18, 43).addBox(2.0F, 1.75F, 2.75F, 1.0F, 9.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(20, 0).addBox(-1.5F, 3.0F, 2.25F, 3.0F, 6.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(24, 18).addBox(-1.5F, 0.0F, 1.25F, 3.0F, 2.0F, 1.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(0.0F, 24.0F, 0.0F);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(0.0F, 24.0F, 0.0F);

	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}