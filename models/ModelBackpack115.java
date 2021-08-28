// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelBackpack115 extends EntityModel<Entity> {
	private final ModelRenderer Body;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightArm;

	public ModelBackpack115() {
		textureWidth = 128;
		textureHeight = 128;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(0, 34).addBox(-3.0F, 1.0F, 2.0F, 6.0F, 8.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(22, 36).addBox(-2.0F, 0.8F, 2.2F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(35, 25).addBox(-2.5F, 9.0F, 2.0F, 5.0F, 1.0F, 3.0F, 0.0F, false);
		Body.setTextureOffset(34, 16).addBox(-2.0F, 8.5F, 4.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(38, 0).addBox(-3.5F, 5.25F, 1.25F, 1.0F, 3.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(50, 14).addBox(2.5F, 5.25F, 1.25F, 1.0F, 3.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(53, 26).addBox(2.5F, 1.25F, 1.25F, 1.0F, 3.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(43, 39).addBox(-3.5F, 1.25F, 1.25F, 1.0F, 3.0F, 4.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(0.0F, 24.0F, 0.0F);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(0.0F, 24.0F, 0.0F);

	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
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