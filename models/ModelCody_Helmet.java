// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class ModelCody_Helmet extends EntityModel {
	private final ModelRenderer Head;

	public ModelCody_Helmet() {
		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 78, -4.5F, -10.5F, 0.5F, 1, 7, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 89, 4.25F, -5.5F, -1.0F, 1, 3, 2, 0.0F, true));
		Head.cubeList.add(new ModelBox(Head, 0, 96, 4.0F, -4.5F, -0.5F, 1, 1, 1, 0.0F, true));
		Head.cubeList.add(new ModelBox(Head, 0, 100, 4.25F, -9.5F, -0.5F, 1, 4, 1, 0.0F, true));
		Head.cubeList.add(new ModelBox(Head, 0, 118, -3.5F, -7.5F, -5.0F, 7, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 9, 77, -0.5F, -8.5F, -3.5F, 1, 1, 7, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 9, 87, 1.5F, -8.25F, -3.0F, 1, 1, 6, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 13, 97, -2.5F, -8.25F, -3.0F, 1, 1, 6, 0.0F, true));
		Head.cubeList.add(new ModelBox(Head, 15, 107, 3.5F, -7.75F, -5.5F, 1, 1, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 17, 112, -5.0F, -7.0F, -6.0F, 10, 1, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 28, 78, -5.0F, -7.0F, -4.0F, 1, 1, 5, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 27, 88, 4.0F, -7.0F, -4.0F, 1, 1, 5, 0.0F, true));
		Head.cubeList.add(new ModelBox(Head, 31, 98, -5.0F, -6.0F, -6.0F, 1, 1, 6, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 23, 118, 4.0F, -6.0F, -6.0F, 1, 1, 6, 0.0F, true));
		Head.cubeList.add(new ModelBox(Head, 45, 79, -5.0F, -5.0F, -6.0F, 1, 1, 5, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 67, 4.0F, -5.0F, -6.0F, 1, 1, 5, 0.0F, true));
		Head.cubeList.add(new ModelBox(Head, 16, 68, -5.0F, -4.0F, -5.0F, 1, 1, 4, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 46, 89, 4.0F, -4.0F, -5.0F, 1, 1, 4, 0.0F, true));
		Head.cubeList.add(new ModelBox(Head, 44, 108, -5.0F, -3.0F, -4.0F, 1, 1, 3, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 43, 116, 4.0F, -3.0F, -4.0F, 1, 1, 3, 0.0F, true));
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