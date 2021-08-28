// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class Modelclonejetpacklarge extends EntityModel {
	private final ModelRenderer Body;

	public Modelclonejetpacklarge() {
		textureWidth = 128;
		textureHeight = 128;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 1, -3.5F, 2.0F, 1.25F, 7, 7, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 39, 0, 1.5F, 3.0F, 2.25F, 2, 6, 2, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 39, 13, -3.5F, 3.0F, 2.25F, 2, 6, 2, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 38, 23, 2.0F, 3.5F, 2.5F, 1, 5, 2, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 40, 34, -3.0F, 3.5F, 2.5F, 1, 5, 2, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 28, 36, -3.5F, 9.65F, 2.25F, 2, 2, 2, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 26, 30, 1.5F, 9.65F, 2.25F, 2, 2, 2, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 14, 30, -1.0F, 2.25F, 2.25F, 2, 7, 2, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 41, 44, -0.5F, 9.5F, 2.75F, 1, 0, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 34, 42, -0.5F, 0.5F, 2.75F, 1, 9, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 27, 43, -3.0F, 1.75F, 2.75F, 1, 9, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 18, 23, -3.0F, 10.85F, 2.75F, 1, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 22, 13, 2.0F, 10.85F, 2.75F, 1, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 18, 43, 2.0F, 1.75F, 2.75F, 1, 9, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 20, 0, -1.5F, 3.0F, 2.25F, 3, 6, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 24, 18, -1.5F, 0.0F, 1.25F, 3, 2, 1, 0.0F, false));
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