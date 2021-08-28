// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class ModelCloneJetpackWhite extends EntityModel {
	private final ModelRenderer Body;

	public ModelCloneJetpackWhite() {
		textureWidth = 128;
		textureHeight = 128;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 0, -1.5F, 2.0F, 1.0F, 3, 5, 2, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 10, -2.0F, 1.0F, 2.5F, 4, 5, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 18, -2.0F, 4.0F, 2.75F, 4, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 22, -2.0F, 2.0F, 2.75F, 4, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 28, -4.0F, 0.75F, 2.0F, 3, 10, 2, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 44, -3.0F, 1.75F, 2.2F, 1, 8, 2, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 9, 43, 2.0F, 1.75F, 2.2F, 1, 8, 2, 0.0F, true));
		Body.cubeList.add(new ModelBox(Body, 14, 0, -3.5F, 10.75F, 1.75F, 2, 1, 2, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 14, 7, -3.25F, 0.5F, 1.75F, 2, 1, 2, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 28, 0, 1.25F, 0.5F, 1.75F, 2, 1, 2, 0.0F, true));
		Body.cubeList.add(new ModelBox(Body, 28, 9, 1.5F, 10.75F, 1.75F, 2, 1, 2, 0.0F, true));
		Body.cubeList.add(new ModelBox(Body, 31, 16, 1.0F, 0.75F, 2.0F, 3, 10, 2, 0.0F, true));
		Body.cubeList.add(new ModelBox(Body, 16, 16, -0.5F, 5.0F, 2.2F, 1, 5, 1, 0.0F, false));
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