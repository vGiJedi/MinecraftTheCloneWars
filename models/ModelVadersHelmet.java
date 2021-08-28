// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class ModelVadersHelmet extends EntityModel {
	private final ModelRenderer Head;

	public ModelVadersHelmet() {
		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -9.0F, -4.0F, 8, 2, 8, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 13, -3.5F, -9.5F, -3.5F, 7, 2, 7, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 24, -2.5F, -9.75F, -2.5F, 5, 2, 5, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 33, -1.0F, -6.5F, -5.0F, 2, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 37, -4.0F, -7.5F, -5.0F, 8, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 41, 3.25F, -7.5F, -4.0F, 1, 1, 8, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 35, 0, -4.25F, -7.5F, -4.0F, 1, 1, 8, 0.0F, true));
		Head.cubeList.add(new ModelBox(Head, 34, 11, -4.0F, -7.5F, 3.25F, 8, 1, 1, 0.0F, true));
		Head.cubeList.add(new ModelBox(Head, 32, 16, 3.5F, -6.5F, -5.0F, 1, 1, 10, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 33, 29, 4.0F, -5.5F, -3.5F, 1, 1, 9, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 26, 29, 4.0F, -5.5F, -4.5F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 28, 35, -5.0F, -5.5F, -4.5F, 1, 1, 1, 0.0F, true));
		Head.cubeList.add(new ModelBox(Head, 32, 41, -5.0F, -5.5F, -3.5F, 1, 1, 9, 0.0F, true));
		Head.cubeList.add(new ModelBox(Head, 0, 53, 4.5F, -4.5F, -3.0F, 1, 2, 9, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 32, 53, -5.5F, -4.5F, -3.0F, 1, 2, 9, 0.0F, true));
		Head.cubeList.add(new ModelBox(Head, 56, 0, 5.0F, -2.5F, -1.5F, 1, 2, 8, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 28, 42, 5.0F, -2.5F, -2.5F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 21, 41, -6.0F, -2.5F, -2.5F, 1, 1, 1, 0.0F, true));
		Head.cubeList.add(new ModelBox(Head, 0, 67, -6.0F, -2.5F, -1.5F, 1, 2, 8, 0.0F, true));
		Head.cubeList.add(new ModelBox(Head, 31, 66, -5.0F, -2.5F, 5.5F, 10, 2, 1, 0.0F, true));
		Head.cubeList.add(new ModelBox(Head, 33, 72, -4.5F, -4.5F, 5.0F, 9, 2, 1, 0.0F, true));
		Head.cubeList.add(new ModelBox(Head, 59, 13, -3.5F, -6.5F, 4.0F, 7, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 57, 18, -4.0F, -5.5F, 4.5F, 8, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 58, 25, -4.5F, -6.5F, -5.0F, 1, 1, 10, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Head.render(f5);
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