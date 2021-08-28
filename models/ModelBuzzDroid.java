// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class ModelBuzzDroid extends EntityModel {
	private final ModelRenderer BuzzDroid;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer RightLeg;
	private final ModelRenderer cube_r3;
	private final ModelRenderer Leftleg;
	private final ModelRenderer cube_r4;
	private final ModelRenderer MiddleLeg;
	private final ModelRenderer cube_r5;

	public ModelBuzzDroid() {
		textureWidth = 64;
		textureHeight = 64;

		BuzzDroid = new ModelRenderer(this);
		BuzzDroid.setRotationPoint(0.0F, 24.0F, 0.0F);
		BuzzDroid.cubeList.add(new ModelBox(BuzzDroid, 25, 25, -0.5F, -4.5F, -5.0F, 1, 2, 5, 0.0F, false));
		BuzzDroid.cubeList.add(new ModelBox(BuzzDroid, 26, 7, -2.0F, -2.75F, -4.5F, 4, 1, 2, 0.0F, false));
		BuzzDroid.cubeList.add(new ModelBox(BuzzDroid, 7, 30, -1.0F, -4.0F, -4.96F, 2, 2, 3, 0.0F, false));
		BuzzDroid.cubeList.add(new ModelBox(BuzzDroid, 0, 6, -0.5F, -8.0F, -3.96F, 1, 1, 2, 0.0F, false));
		BuzzDroid.cubeList.add(new ModelBox(BuzzDroid, 20, 32, -1.0F, -7.75F, -4.96F, 2, 2, 4, 0.0F, false));
		BuzzDroid.cubeList.add(new ModelBox(BuzzDroid, 32, 32, -0.5F, -7.6F, -5.0F, 1, 1, 5, 0.0F, false));
		BuzzDroid.cubeList.add(new ModelBox(BuzzDroid, 16, 23, -1.0F, -6.0F, -5.75F, 2, 2, 5, 0.0F, false));
		BuzzDroid.cubeList.add(new ModelBox(BuzzDroid, 0, 22, -1.5F, -6.5F, -5.5F, 3, 3, 5, 0.0F, false));
		BuzzDroid.cubeList.add(new ModelBox(BuzzDroid, 6, 36, 1.5F, -6.5F, -0.5F, 1, 3, 3, 0.0F, false));
		BuzzDroid.cubeList.add(new ModelBox(BuzzDroid, 37, 20, 0.75F, -5.5F, -0.3F, 1, 1, 3, 0.0F, false));
		BuzzDroid.cubeList.add(new ModelBox(BuzzDroid, 37, 26, -1.75F, -5.5F, -0.3F, 1, 1, 3, 0.0F, false));
		BuzzDroid.cubeList.add(new ModelBox(BuzzDroid, 14, 36, -2.5F, -6.5F, -0.5F, 1, 3, 3, 0.0F, false));
		BuzzDroid.cubeList.add(new ModelBox(BuzzDroid, 38, 38, -0.5F, -6.75F, -0.3F, 1, 1, 3, 0.0F, false));
		BuzzDroid.cubeList.add(new ModelBox(BuzzDroid, 39, 30, -0.5F, -4.25F, -0.3F, 1, 1, 3, 0.0F, false));
		BuzzDroid.cubeList.add(new ModelBox(BuzzDroid, 26, 0, -1.5F, -7.0F, -0.5F, 3, 4, 3, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(4.5F, -6.5F, -2.5F);
		BuzzDroid.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.6545F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 20, -4.0F, -1.5F, 0.0F, 10, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 13, 6.0F, -2.5F, -1.0F, 1, 3, 3, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 42, 5.0F, -3.5F, -2.0F, 1, 5, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 34, 38, 4.0F, -4.5F, -3.0F, 1, 7, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 36, 2.0F, -4.5F, 4.0F, 2, 7, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 1, 2.0F, -5.5F, -4.0F, 2, 1, 9, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 13, 2.0F, 2.5F, -4.0F, 2, 1, 9, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 35, 10, 2.0F, -4.5F, -4.0F, 2, 7, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 19, 30, 1.0F, -5.5F, -4.0F, 1, 2, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 26, 13, 1.0F, -5.5F, 4.0F, 1, 2, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 19, 33, 1.0F, -5.5F, -3.0F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 33, 1.0F, 2.5F, -3.0F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 19, 1.0F, 2.5F, 3.0F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 26, 16, 1.0F, -5.5F, 3.0F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 30, 1.0F, 1.5F, -4.0F, 1, 2, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 26, 19, 1.0F, 1.5F, 4.0F, 1, 2, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 38, 4.0F, -4.5F, 3.0F, 1, 7, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 42, 5.0F, -3.5F, 2.0F, 1, 5, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 36, 4, 5.0F, 0.5F, -1.0F, 1, 1, 3, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 19, 4.0F, 1.5F, -2.0F, 1, 1, 5, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 30, 4.0F, -4.5F, -2.0F, 1, 1, 5, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 32, 25, 5.0F, -3.5F, -1.0F, 1, 1, 3, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-4.5F, -6.5F, -2.5F);
		BuzzDroid.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.6545F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -7.0F, -2.5F, -1.0F, 1, 3, 3, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 41, 8, -6.0F, -3.5F, -2.0F, 1, 5, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 22, 38, -5.0F, -4.5F, -3.0F, 1, 7, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 10, -4.0F, -4.5F, 4.0F, 2, 7, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 10, -4.0F, -5.5F, -4.0F, 2, 1, 9, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -4.0F, 2.5F, -4.0F, 2, 1, 9, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 13, 0, -4.0F, -4.5F, -4.0F, 2, 7, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 5, 0, -2.0F, -5.5F, -4.0F, 1, 2, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 13, -2.0F, -5.5F, 4.0F, 1, 2, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 4, 6, -2.0F, -5.5F, -3.0F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 25, 23, -2.0F, 2.5F, -3.0F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 7, -2.0F, 2.5F, 3.0F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 5, 17, -2.0F, -5.5F, 3.0F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 25, 25, -2.0F, 1.5F, -4.0F, 1, 2, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 23, -2.0F, 1.5F, 4.0F, 1, 2, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 26, 38, -5.0F, -4.5F, 3.0F, 1, 7, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 6, 42, -6.0F, -3.5F, 2.0F, 1, 5, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 28, 32, -6.0F, 0.5F, -1.0F, 1, 1, 3, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 26, 13, -5.0F, 1.5F, -2.0F, 1, 1, 5, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 30, -5.0F, -4.5F, -2.0F, 1, 1, 5, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 11, 23, -6.0F, -3.5F, -1.0F, 1, 1, 3, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 13, 11, -6.0F, -1.5F, 0.0F, 10, 1, 1, 0.0F, false));

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(5.0F, 22.5F, -5.5F);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-10.0F, 0.0F, 0.0F);
		RightLeg.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 35, 0, -1.0F, 1.25F, 1.54F, 4, 1, 1, 0.0F, false));

		Leftleg = new ModelRenderer(this);
		Leftleg.setRotationPoint(5.0F, 22.5F, -5.5F);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		Leftleg.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 37, 18, -3.0F, 1.25F, 1.54F, 4, 1, 1, 0.0F, false));

		MiddleLeg = new ModelRenderer(this);
		MiddleLeg.setRotationPoint(0.0F, 24.0F, 0.0F);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-2.5F, -2.5F, -0.5F);
		MiddleLeg.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.7418F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 22, 2.0F, -1.75F, -2.54F, 1, 4, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		BuzzDroid.render(f5);
		RightLeg.render(f5);
		Leftleg.render(f5);
		MiddleLeg.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.Leftleg.rotateAngleZ = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.RightLeg.rotateAngleZ = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}