// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class Modelfivesbackpackandpauldron extends EntityModel {
	private final ModelRenderer Body;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightArm;

	public Modelfivesbackpackandpauldron() {
		textureWidth = 128;
		textureHeight = 128;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 16, 1, -3.5F, 2.25F, 1.5F, 7, 9, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 35, 45, -4.0F, 8.5F, 2.5F, 2, 3, 2, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 2, 14, -4.0F, 0.5F, 2.5F, 2, 6, 2, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 35, 29, -3.5F, 5.6F, 3.0F, 1, 6, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 6, 3, -3.5F, 0.35F, 3.0F, 1, 3, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 16, 31, -2.0F, 1.0F, 2.25F, 5, 10, 2, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 3, 40, 1.5F, 9.5F, 2.75F, 2, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 3, 35, 1.25F, 4.5F, 2.75F, 2, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 3, 32, 1.25F, 3.0F, 2.75F, 2, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 36, 16, -1.5F, 1.5F, 3.5F, 4, 9, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 16, 46, -1.25F, 6.25F, 3.7F, 1, 4, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 34, 7, -1.25F, 1.65F, 3.7F, 1, 2, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 3, 25, 0.25F, 2.65F, 3.7F, 2, 2, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 3, 48, 0.0F, 9.25F, 3.7F, 2, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 1, 44, 0.0F, 8.0F, 3.7F, 2, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 24, 46, 0.0F, 6.75F, 3.7F, 1, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 58, -3.5F, 0.25F, -2.5F, 7, 2, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 52, -3.5F, 2.25F, -2.1F, 7, 3, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 21, 53, -2.0F, 5.25F, -2.1F, 4, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 35, 53, -1.5F, 6.25F, -2.1F, 3, 2, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 48, 49, -3.45F, 0.75F, -3.5F, 2, 4, 2, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 68, 3.5F, 0.75F, -3.0F, 5, 1, 6, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 27, 58, -8.5F, 0.75F, -3.0F, 5, 1, 6, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 25, 67, 3.5F, -0.25F, -3.0F, 6, 1, 6, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 42, 0, -9.5F, -0.25F, -3.0F, 6, 1, 6, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 47, 10, 4.5F, -1.0F, -2.0F, 6, 1, 4, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 42, 34, -10.5F, -1.0F, -2.0F, 6, 1, 4, 0.0F, false));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 15, 14, -0.5F, 4.5F, -2.5F, 3, 5, 5, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 58, 24, 0.5F, 5.0F, -3.6F, 1, 4, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 49, 19, 0.5F, 6.5F, -2.6F, 1, 1, 1, 0.0F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(0.0F, 24.0F, 0.0F);

	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Body.render(f5);
		LeftArm.render(f5);
		RightArm.render(f5);
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