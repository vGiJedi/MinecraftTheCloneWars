// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class ModelMouseDroid extends EntityModel {
	private final ModelRenderer MainBody;
	private final ModelRenderer Wheels;

	public ModelMouseDroid() {
		textureWidth = 64;
		textureHeight = 64;

		MainBody = new ModelRenderer(this);
		MainBody.setRotationPoint(0.0F, 24.0F, 0.0F);
		MainBody.cubeList.add(new ModelBox(MainBody, 0, 23, -3.0F, -2.0F, -4.0F, 6, 1, 9, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 0, 0, -3.5F, -3.0F, -5.0F, 7, 1, 11, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 0, 12, -3.0F, -4.0F, -4.5F, 6, 1, 10, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 22, 12, -3.0F, -5.0F, -3.75F, 6, 1, 9, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 21, 23, -3.0F, -6.0F, -3.0F, 6, 1, 8, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 25, 0, -3.0F, -7.0F, -2.5F, 6, 1, 7, 0.0F, false));

		Wheels = new ModelRenderer(this);
		Wheels.setRotationPoint(0.0F, 0.0F, 1.0F);
		MainBody.addChild(Wheels);
		Wheels.cubeList.add(new ModelBox(Wheels, 0, 16, 1.5F, -2.0F, -4.0F, 2, 2, 2, 0.0F, false));
		Wheels.cubeList.add(new ModelBox(Wheels, 0, 8, 2.75F, -1.5F, -3.5F, 1, 1, 1, 0.0F, false));
		Wheels.cubeList.add(new ModelBox(Wheels, 0, 33, -3.5F, -5.5F, -2.0F, 7, 1, 1, 0.0F, false));
		Wheels.cubeList.add(new ModelBox(Wheels, 29, 32, -3.5F, -5.5F, 0.0F, 7, 1, 1, 0.0F, false));
		Wheels.cubeList.add(new ModelBox(Wheels, 25, 8, -3.5F, -5.5F, 2.0F, 7, 1, 1, 0.0F, false));
		Wheels.cubeList.add(new ModelBox(Wheels, 7, 7, 2.75F, -1.5F, 1.5F, 1, 1, 1, 0.0F, false));
		Wheels.cubeList.add(new ModelBox(Wheels, 6, 4, -3.75F, -1.5F, 1.5F, 1, 1, 1, 0.0F, false));
		Wheels.cubeList.add(new ModelBox(Wheels, 6, 0, -3.75F, -1.5F, -3.5F, 1, 1, 1, 0.0F, false));
		Wheels.cubeList.add(new ModelBox(Wheels, 0, 12, -3.5F, -2.0F, -4.0F, 2, 2, 2, 0.0F, false));
		Wheels.cubeList.add(new ModelBox(Wheels, 0, 4, 1.5F, -2.0F, 1.0F, 2, 2, 2, 0.0F, false));
		Wheels.cubeList.add(new ModelBox(Wheels, 0, 0, -3.5F, -2.0F, 1.0F, 2, 2, 2, 0.0F, false));
		Wheels.cubeList.add(new ModelBox(Wheels, 27, 34, -2.5F, -7.5F, -2.0F, 5, 1, 1, 0.0F, false));
		Wheels.cubeList.add(new ModelBox(Wheels, 16, 33, -2.5F, -7.5F, 2.0F, 5, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		MainBody.render(f5);
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