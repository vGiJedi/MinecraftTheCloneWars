// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class ModelAmmoBagAndBackpack extends EntityModel {
	private final ModelRenderer Body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;

	public ModelAmmoBagAndBackpack() {
		textureWidth = 128;
		textureHeight = 128;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 0, 4.0F, 12.0F, -3.0F, 2, 7, 6, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 28, -9.0F, -1.0F, -3.0F, 5, 1, 6, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 38, -7.0F, 0.0F, -3.0F, 3, 1, 6, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 21, 0, 4.5F, 12.5F, -3.5F, 1, 6, 7, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 49, 4.25F, 12.5F, -2.0F, 2, 2, 4, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 41, 0, -3.0F, 1.0F, 2.0F, 6, 8, 4, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 43, 16, -2.0F, 0.8F, 2.2F, 4, 2, 4, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 43, 28, -2.5F, 9.0F, 2.0F, 5, 1, 3, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 46, 35, -2.0F, 8.5F, 4.5F, 4, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 44, 40, -3.5F, 5.25F, 1.25F, 1, 3, 4, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 42, 49, 2.5F, 5.25F, 1.25F, 1, 3, 4, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 29, 48, 2.5F, 1.25F, 1.25F, 1, 3, 4, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 58, -3.5F, 1.25F, 1.25F, 1, 3, 4, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(6.0F, 7.0F, -2.0F);
		Body.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.9599F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 31, 31, -2.0F, 3.5F, -1.0F, 1, 2, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 37, -4.0F, 3.5F, -1.0F, 1, 2, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 23, 41, -6.0F, 3.5F, -1.0F, 1, 2, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 19, -12.0F, 4.0F, -0.5F, 16, 1, 5, 0.0F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);

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