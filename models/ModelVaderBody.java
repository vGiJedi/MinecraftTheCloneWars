// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class ModelVaderBody extends EntityModel {
	private final ModelRenderer Body;
	private final ModelRenderer Body_r1;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;

	public ModelVaderBody() {
		textureWidth = 128;
		textureHeight = 128;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 0, -2.0F, 0.0F, -2.5F, 4, 4, 4, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 11, 2.0F, 0.0F, -2.5F, 2, 3, 4, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 20, 2.5F, 0.5F, -2.6F, 1, 2, 4, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 28, 0.5F, 0.5F, -2.6F, 1, 3, 4, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 38, -1.5F, 0.5F, -2.6F, 1, 3, 4, 0.0F, true));
		Body.cubeList.add(new ModelBox(Body, 0, 47, -3.5F, 0.5F, -2.6F, 1, 2, 4, 0.0F, true));
		Body.cubeList.add(new ModelBox(Body, 19, 0, -4.0F, 0.0F, -2.5F, 2, 3, 4, 0.0F, true));
		Body.cubeList.add(new ModelBox(Body, 51, 0, -1.0F, 9.5F, -2.4F, 2, 2, 4, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 45, 8, -4.0F, 10.0F, -2.05F, 8, 1, 4, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 55, 15, 1.5F, 9.5F, -2.4F, 2, 2, 4, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 40, 17, -3.5F, 9.5F, -2.4F, 2, 2, 4, 0.0F, true));
		Body.cubeList.add(new ModelBox(Body, 23, 36, 3.5F, 12.0F, -2.4F, 1, 10, 5, 0.0F, true));
		Body.cubeList.add(new ModelBox(Body, 0, 60, -4.5F, 12.0F, -2.4F, 1, 10, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 18, 62, -3.5F, 12.0F, 1.6F, 7, 10, 1, 0.0F, false));

		Body_r1 = new ModelRenderer(this);
		Body_r1.setRotationPoint(-3.25F, -1.0F, -10.0F);
		Body.addChild(Body_r1);
		setRotationAngle(Body_r1, -1.4399F, 0.0F, 0.0F);
		Body_r1.cubeList.add(new ModelBox(Body_r1, 14, 32, -4.75F, -13.0F, 2.0F, 16, 1, 24, 0.0F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.cubeList.add(new ModelBox(RightArm, 38, 63, -1.25F, -2.25F, -2.5F, 2, 3, 5, 0.0F, true));
		RightArm.cubeList.add(new ModelBox(RightArm, 55, 61, -3.25F, -2.25F, -2.5F, 2, 4, 5, 0.0F, true));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 16, 26, -0.75F, -2.25F, -2.5F, 2, 3, 5, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 17, 12, 1.25F, -2.25F, -2.5F, 2, 4, 5, 0.0F, false));
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