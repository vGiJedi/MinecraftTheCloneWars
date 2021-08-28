// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelCommandoBackpackStandard115 extends EntityModel<Entity> {
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;

	public ModelCommandoBackpackStandard115() {
		textureWidth = 128;
		textureHeight = 128;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(0, 29).addBox(-4.0F, 1.5F, 2.0F, 8.0F, 7.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(0, 16).addBox(-4.0F, 1.0F, 3.0F, 8.0F, 6.0F, 3.0F, 0.0F, false);
		Body.setTextureOffset(37, 50).addBox(-4.5F, 1.5F, 3.5F, 9.0F, 2.0F, 2.0F, 0.0F, false);
		Body.setTextureOffset(0, 42).addBox(-4.5F, 6.0F, 5.0F, 9.0F, 2.0F, 2.0F, 0.0F, false);
		Body.setTextureOffset(46, 0).addBox(-4.25F, 7.5F, 4.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(45, 0).addBox(3.25F, 7.5F, 4.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(45, 7).addBox(0.25F, 7.5F, 4.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(44, 14).addBox(-1.25F, 7.5F, 4.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(44, 0).addBox(-3.25F, 9.5F, 4.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(36, 0).addBox(1.25F, 9.5F, 4.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		Body.setTextureOffset(0, 49).addBox(-4.5F, 7.0F, 3.0F, 9.0F, 2.0F, 2.0F, 0.0F, false);
		Body.setTextureOffset(0, 0).addBox(-2.5F, 0.5F, 2.5F, 5.0F, 6.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(50, 8).addBox(-1.5F, 1.5F, 2.75F, 1.0F, 2.0F, 4.0F, 0.0F, false);

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