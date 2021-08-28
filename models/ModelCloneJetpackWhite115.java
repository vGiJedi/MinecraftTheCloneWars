// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelCloneJetpackWhite115 extends EntityModel<Entity> {
	private final ModelRenderer Body;

	public ModelCloneJetpackWhite115() {
		textureWidth = 128;
		textureHeight = 128;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(0, 0).addBox(-1.5F, 2.0F, 1.0F, 3.0F, 5.0F, 2.0F, 0.0F, false);
		Body.setTextureOffset(0, 10).addBox(-2.0F, 1.0F, 2.5F, 4.0F, 5.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(0, 18).addBox(-2.0F, 4.0F, 2.75F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(0, 22).addBox(-2.0F, 2.0F, 2.75F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(0, 28).addBox(-4.0F, 0.75F, 2.0F, 3.0F, 10.0F, 2.0F, 0.0F, false);
		Body.setTextureOffset(0, 44).addBox(-3.0F, 1.75F, 2.2F, 1.0F, 8.0F, 2.0F, 0.0F, false);
		Body.setTextureOffset(9, 43).addBox(2.0F, 1.75F, 2.2F, 1.0F, 8.0F, 2.0F, 0.0F, true);
		Body.setTextureOffset(14, 0).addBox(-3.5F, 10.75F, 1.75F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		Body.setTextureOffset(14, 7).addBox(-3.25F, 0.5F, 1.75F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		Body.setTextureOffset(28, 0).addBox(1.25F, 0.5F, 1.75F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		Body.setTextureOffset(28, 9).addBox(1.5F, 10.75F, 1.75F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		Body.setTextureOffset(31, 16).addBox(1.0F, 0.75F, 2.0F, 3.0F, 10.0F, 2.0F, 0.0F, true);
		Body.setTextureOffset(16, 16).addBox(-0.5F, 5.0F, 2.2F, 1.0F, 5.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
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