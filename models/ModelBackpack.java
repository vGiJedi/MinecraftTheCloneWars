// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class ModelBackpack extends EntityModel {
	private final ModelRenderer Body;

	public ModelBackpack() {
		textureWidth = 128;
		textureHeight = 128;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 34, -3.0F, 1.0F, 2.0F, 6, 8, 4, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 22, 36, -2.0F, 0.8F, 2.2F, 4, 2, 4, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 35, 25, -2.5F, 9.0F, 2.0F, 5, 1, 3, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 34, 16, -2.0F, 8.5F, 4.5F, 4, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 38, 0, -3.5F, 5.25F, 1.25F, 1, 3, 4, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 50, 14, 2.5F, 5.25F, 1.25F, 1, 3, 4, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 53, 26, 2.5F, 1.25F, 1.25F, 1, 3, 4, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 43, 39, -3.5F, 1.25F, 1.25F, 1, 3, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Body.render(f5);
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