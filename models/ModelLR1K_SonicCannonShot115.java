// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelLR1K_SonicCannonShot115 extends EntityModel<Entity> {
	private final ModelRenderer LR1KSonicCannonShot;

	public ModelLR1K_SonicCannonShot115() {
		textureWidth = 128;
		textureHeight = 128;

		LR1KSonicCannonShot = new ModelRenderer(this);
		LR1KSonicCannonShot.setRotationPoint(0.0F, 24.0F, 0.0F);
		LR1KSonicCannonShot.setTextureOffset(30, 0).addBox(-12.0F, -12.0F, -9.0F, 3.0F, 3.0F, 18.0F, 0.0F, false);
		LR1KSonicCannonShot.setTextureOffset(0, 27).addBox(-3.0F, -30.0F, 3.0F, 6.0F, 3.0F, 3.0F, 0.0F, false);
		LR1KSonicCannonShot.setTextureOffset(0, 18).addBox(-3.0F, -30.0F, -6.0F, 6.0F, 3.0F, 3.0F, 0.0F, false);
		LR1KSonicCannonShot.setTextureOffset(0, 9).addBox(-6.0F, -30.0F, -3.0F, 3.0F, 3.0F, 6.0F, 0.0F, false);
		LR1KSonicCannonShot.setTextureOffset(0, 0).addBox(3.0F, -30.0F, -3.0F, 3.0F, 3.0F, 6.0F, 0.0F, false);
		LR1KSonicCannonShot.setTextureOffset(54, 30).addBox(6.0F, -21.0F, -6.0F, 3.0F, 3.0F, 12.0F, 0.0F, false);
		LR1KSonicCannonShot.setTextureOffset(30, 54).addBox(-9.0F, -21.0F, -6.0F, 3.0F, 3.0F, 12.0F, 0.0F, false);
		LR1KSonicCannonShot.setTextureOffset(54, 12).addBox(-6.0F, -21.0F, -9.0F, 12.0F, 3.0F, 3.0F, 0.0F, false);
		LR1KSonicCannonShot.setTextureOffset(54, 6).addBox(-6.0F, -21.0F, 6.0F, 12.0F, 3.0F, 3.0F, 0.0F, false);
		LR1KSonicCannonShot.setTextureOffset(54, 0).addBox(-9.0F, -12.0F, 9.0F, 18.0F, 3.0F, 3.0F, 0.0F, false);
		LR1KSonicCannonShot.setTextureOffset(0, 54).addBox(-9.0F, -12.0F, -12.0F, 18.0F, 3.0F, 3.0F, 0.0F, false);
		LR1KSonicCannonShot.setTextureOffset(30, 30).addBox(9.0F, -12.0F, -9.0F, 3.0F, 3.0F, 18.0F, 0.0F, false);
		LR1KSonicCannonShot.setTextureOffset(0, 27).addBox(12.0F, -3.0F, -12.0F, 3.0F, 3.0F, 24.0F, 0.0F, false);
		LR1KSonicCannonShot.setTextureOffset(51, 24).addBox(-12.0F, -3.0F, 12.0F, 24.0F, 3.0F, 3.0F, 0.0F, false);
		LR1KSonicCannonShot.setTextureOffset(51, 51).addBox(-12.0F, -3.0F, -15.0F, 24.0F, 3.0F, 3.0F, 0.0F, false);
		LR1KSonicCannonShot.setTextureOffset(0, 0).addBox(-15.0F, -3.0F, -12.0F, 3.0F, 3.0F, 24.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		LR1KSonicCannonShot.render(matrixStack, buffer, packedLight, packedOverlay);
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