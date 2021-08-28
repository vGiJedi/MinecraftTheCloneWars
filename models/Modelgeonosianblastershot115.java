// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelgeonosianblastershot115 extends EntityModel<Entity> {
	private final ModelRenderer geonosianblastershot;

	public Modelgeonosianblastershot115() {
		textureWidth = 64;
		textureHeight = 64;

		geonosianblastershot = new ModelRenderer(this);
		geonosianblastershot.setRotationPoint(0.0F, 24.0F, 0.0F);
		geonosianblastershot.setTextureOffset(10, 10).addBox(-4.0F, -4.0F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		geonosianblastershot.setTextureOffset(0, 9).addBox(-1.0F, -10.0F, 1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		geonosianblastershot.setTextureOffset(0, 6).addBox(-1.0F, -10.0F, -2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		geonosianblastershot.setTextureOffset(0, 3).addBox(-2.0F, -10.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		geonosianblastershot.setTextureOffset(0, 0).addBox(1.0F, -10.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		geonosianblastershot.setTextureOffset(18, 10).addBox(2.0F, -7.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		geonosianblastershot.setTextureOffset(10, 18).addBox(-3.0F, -7.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		geonosianblastershot.setTextureOffset(18, 4).addBox(-2.0F, -7.0F, -3.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		geonosianblastershot.setTextureOffset(18, 2).addBox(-2.0F, -7.0F, 2.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		geonosianblastershot.setTextureOffset(18, 0).addBox(-3.0F, -4.0F, 3.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		geonosianblastershot.setTextureOffset(0, 18).addBox(-3.0F, -4.0F, -4.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		geonosianblastershot.setTextureOffset(10, 0).addBox(3.0F, -4.0F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		geonosianblastershot.setTextureOffset(0, 9).addBox(4.0F, -1.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		geonosianblastershot.setTextureOffset(17, 8).addBox(-4.0F, -1.0F, 4.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		geonosianblastershot.setTextureOffset(17, 17).addBox(-4.0F, -1.0F, -5.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		geonosianblastershot.setTextureOffset(0, 0).addBox(-5.0F, -1.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		geonosianblastershot.render(matrixStack, buffer, packedLight, packedOverlay);
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