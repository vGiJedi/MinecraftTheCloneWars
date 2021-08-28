// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class ModelFixerBackpack extends EntityModel {
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;

	public ModelFixerBackpack() {
		textureWidth = 128;
		textureHeight = 128;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 29, -4.0F, 1.5F, 2.0F, 8, 7, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 16, -4.0F, 1.0F, 3.0F, 8, 6, 3, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 37, 50, -5.0F, 1.5F, 3.5F, 10, 2, 2, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 56, -6.0F, 1.0F, 3.0F, 1, 3, 3, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 65, 5.0F, 1.0F, 3.0F, 1, 3, 3, 0.0F, true));
		Body.cubeList.add(new ModelBox(Body, 13, 57, -6.0F, 4.0F, 4.0F, 1, 2, 2, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 13, 65, 5.0F, 4.0F, 4.0F, 1, 2, 2, 0.0F, true));
		Body.cubeList.add(new ModelBox(Body, 30, 6, -6.0F, 6.0F, 5.0F, 1, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 29, 13, 5.0F, 6.0F, 5.0F, 1, 1, 1, 0.0F, true));
		Body.cubeList.add(new ModelBox(Body, 28, 20, -6.0F, -5.0F, 4.5F, 1, 6, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 25, 31, -5.0F, -5.0F, 4.5F, 10, 1, 1, 0.0F, true));
		Body.cubeList.add(new ModelBox(Body, 37, 18, 5.0F, -5.0F, 4.5F, 1, 6, 1, 0.0F, true));
		Body.cubeList.add(new ModelBox(Body, 25, 37, 4.5F, -8.0F, 4.0F, 2, 3, 2, 0.0F, true));
		Body.cubeList.add(new ModelBox(Body, 0, 42, -4.5F, 6.0F, 5.0F, 9, 2, 2, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 46, 0, -4.25F, 7.5F, 4.5F, 1, 3, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 52, 0, 3.25F, 7.5F, 4.5F, 1, 3, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 38, 7, 0.25F, 7.5F, 4.5F, 1, 3, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 54, 17, -1.25F, 7.5F, 4.5F, 1, 3, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 49, 27, -3.25F, 9.5F, 4.5F, 2, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 25, 0, 1.25F, 9.5F, 4.5F, 2, 1, 1, 0.0F, true));
		Body.cubeList.add(new ModelBox(Body, 0, 49, -4.5F, 7.0F, 3.0F, 9, 2, 2, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 0, -2.5F, 0.5F, 2.5F, 5, 6, 4, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 50, 8, -1.5F, 1.5F, 2.75F, 1, 2, 4, 0.0F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(0.0F, 24.0F, 0.0F);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(0.0F, 24.0F, 0.0F);

	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Body.render(f5);
		RightArm.render(f5);
		LeftArm.render(f5);
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