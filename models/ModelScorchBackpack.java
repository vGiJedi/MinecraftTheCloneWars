// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class ModelScorchBackpack extends EntityModel {
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;

	public ModelScorchBackpack() {
		textureWidth = 128;
		textureHeight = 128;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 29, -3.5F, 1.5F, 2.0F, 7, 7, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 16, -4.0F, 1.0F, 3.0F, 8, 6, 3, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 41, -3.5F, 4.5F, 5.0F, 7, 3, 2, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 22, 0, -5.5F, 3.0F, 4.25F, 11, 3, 2, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 28, 10, 4.25F, -6.0F, 4.75F, 1, 14, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 50, 18, -5.25F, -6.0F, 4.75F, 1, 14, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 49, -4.0F, 7.0F, 3.0F, 8, 2, 2, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 56, 3.5F, 7.5F, 4.0F, 2, 1, 2, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 62, -5.5F, 7.5F, 4.0F, 2, 1, 2, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 67, -3.0F, 6.5F, 4.0F, 6, 2, 2, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 24, 49, 0.5F, 6.75F, 4.5F, 2, 2, 2, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 23, 41, -2.5F, 6.75F, 4.5F, 2, 2, 2, 0.0F, false));
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