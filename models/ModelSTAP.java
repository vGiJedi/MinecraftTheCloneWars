// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class ModelSTAP extends EntityModel {
	private final ModelRenderer STAP;
	private final ModelRenderer cube_r9_r1;
	private final ModelRenderer cube_r8_r1;
	private final ModelRenderer cube_r7_r1;
	private final ModelRenderer cube_r6_r1;
	private final ModelRenderer cube_r5_r1;
	private final ModelRenderer cube_r4_r1;
	private final ModelRenderer cube_r3_r1;
	private final ModelRenderer cube_r2_r1;
	private final ModelRenderer cube_r1_r1;

	public ModelSTAP() {
		textureWidth = 64;
		textureHeight = 64;

		STAP = new ModelRenderer(this);
		STAP.setRotationPoint(0.0F, 24.0F, -5.0F);
		STAP.cubeList.add(new ModelBox(STAP, 0, 0, -2.0F, -31.5F, -11.0F, 4, 3, 10, 0.0F, false));
		STAP.cubeList.add(new ModelBox(STAP, 31, 32, 1.0F, -30.5F, -1.0F, 1, 2, 1, 0.0F, false));
		STAP.cubeList.add(new ModelBox(STAP, 12, 26, -2.0F, -30.5F, -1.0F, 1, 2, 1, 0.0F, false));
		STAP.cubeList.add(new ModelBox(STAP, 18, 3, -0.5F, -31.75F, -10.75F, 1, 3, 10, 0.0F, false));
		STAP.cubeList.add(new ModelBox(STAP, 0, 13, -1.5F, -31.0F, -12.0F, 3, 3, 10, 0.0F, false));
		STAP.cubeList.add(new ModelBox(STAP, 18, 19, -1.5F, -32.0F, -10.0F, 3, 3, 8, 0.0F, false));
		STAP.cubeList.add(new ModelBox(STAP, 35, 40, -5.0F, -31.25F, -8.0F, 3, 3, 5, 0.0F, false));
		STAP.cubeList.add(new ModelBox(STAP, 44, 15, 2.0F, -31.25F, -7.0F, 3, 3, 4, 0.0F, false));
		STAP.cubeList.add(new ModelBox(STAP, 42, 27, 2.5F, -30.75F, -12.0F, 2, 2, 5, 0.0F, false));
		STAP.cubeList.add(new ModelBox(STAP, 39, 5, 3.0F, -30.25F, -19.0F, 1, 1, 7, 0.0F, false));
		STAP.cubeList.add(new ModelBox(STAP, 19, 38, -4.0F, -30.25F, -19.0F, 1, 1, 7, 0.0F, false));
		STAP.cubeList.add(new ModelBox(STAP, 0, 40, -4.5F, -30.75F, -12.0F, 2, 2, 5, 0.0F, false));

		cube_r9_r1 = new ModelRenderer(this);
		cube_r9_r1.setRotationPoint(0.0F, 1.9276F, 2.5982F);
		STAP.addChild(cube_r9_r1);
		setRotationAngle(cube_r9_r1, -0.2182F, 0.0F, 0.0F);
		cube_r9_r1.cubeList.add(new ModelBox(cube_r9_r1, 18, 46, 3.25F, -13.0F, -10.0F, 2, 1, 5, 0.0F, false));
		cube_r9_r1.cubeList.add(new ModelBox(cube_r9_r1, 9, 45, -5.25F, -13.0F, -10.0F, 2, 1, 5, 0.0F, false));

		cube_r8_r1 = new ModelRenderer(this);
		cube_r8_r1.setRotationPoint(0.0F, 3.0656F, -10.412F);
		STAP.addChild(cube_r8_r1);
		setRotationAngle(cube_r8_r1, -1.1781F, 0.0F, 0.0F);
		cube_r8_r1.cubeList.add(new ModelBox(cube_r8_r1, 0, 47, -0.5F, -14.5F, -29.0F, 1, 1, 5, 0.0F, false));
		cube_r8_r1.cubeList.add(new ModelBox(cube_r8_r1, 9, 51, -0.5F, -14.5F, -24.0F, 1, 3, 3, 0.0F, false));

		cube_r7_r1 = new ModelRenderer(this);
		cube_r7_r1.setRotationPoint(1.6196F, 0.0F, 6.2287F);
		STAP.addChild(cube_r7_r1);
		setRotationAngle(cube_r7_r1, 0.0F, -0.6545F, 0.0F);
		cube_r7_r1.cubeList.add(new ModelBox(cube_r7_r1, 0, 8, -5.0F, -30.5F, -7.0F, 4, 1, 1, 0.0F, false));

		cube_r6_r1 = new ModelRenderer(this);
		cube_r6_r1.setRotationPoint(-5.8649F, 0.0625F, 8.0F);
		STAP.addChild(cube_r6_r1);
		setRotationAngle(cube_r6_r1, 0.0F, -1.5708F, -0.0436F);
		cube_r6_r1.cubeList.add(new ModelBox(cube_r6_r1, 18, 2, -8.0F, -29.5F, -12.0F, 1, 3, 1, 0.0F, false));

		cube_r5_r1 = new ModelRenderer(this);
		cube_r5_r1.setRotationPoint(5.8649F, 0.0625F, 8.0F);
		STAP.addChild(cube_r5_r1);
		setRotationAngle(cube_r5_r1, 0.0F, 1.5708F, 0.0436F);
		cube_r5_r1.cubeList.add(new ModelBox(cube_r5_r1, 24, 2, 7.0F, -29.5F, -12.0F, 1, 3, 1, 0.0F, false));

		cube_r4_r1 = new ModelRenderer(this);
		cube_r4_r1.setRotationPoint(-1.6196F, 0.0F, 6.2287F);
		STAP.addChild(cube_r4_r1);
		setRotationAngle(cube_r4_r1, 0.0F, 0.6545F, 0.0F);
		cube_r4_r1.cubeList.add(new ModelBox(cube_r4_r1, 18, 7, 1.0F, -30.5F, -7.0F, 4, 1, 1, 0.0F, false));

		cube_r3_r1 = new ModelRenderer(this);
		cube_r3_r1.setRotationPoint(0.0F, 6.1603F, -2.0096F);
		STAP.addChild(cube_r3_r1);
		setRotationAngle(cube_r3_r1, -0.5236F, 0.0F, 0.0F);
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 45, 52, 0.25F, -23.0F, -20.5F, 1, 2, 3, 0.0F, false));
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 20, 37, 0.25F, -27.0F, -18.5F, 1, 4, 1, 0.0F, false));
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 32, 19, -1.25F, -27.0F, -18.5F, 1, 4, 1, 0.0F, false));
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 30, 4, 0.25F, -27.0F, -20.5F, 1, 4, 1, 0.0F, false));
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 16, 30, -1.25F, -27.0F, -20.5F, 1, 4, 1, 0.0F, false));
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 51, 22, 0.25F, -30.0F, -20.5F, 1, 3, 3, 0.0F, false));
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 29, 51, -1.25F, -30.0F, -20.5F, 1, 3, 3, 0.0F, false));
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 17, 52, -1.25F, -23.0F, -20.5F, 1, 2, 3, 0.0F, false));

		cube_r2_r1 = new ModelRenderer(this);
		cube_r2_r1.setRotationPoint(0.0F, -0.8985F, 5.5722F);
		STAP.addChild(cube_r2_r1);
		setRotationAngle(cube_r2_r1, 0.0873F, 0.0F, 0.0F);
		cube_r2_r1.cubeList.add(new ModelBox(cube_r2_r1, 27, 46, 3.5F, -20.25F, -12.5F, 1, 1, 4, 0.0F, false));
		cube_r2_r1.cubeList.add(new ModelBox(cube_r2_r1, 18, 2, -4.5F, -20.25F, -12.5F, 1, 1, 4, 0.0F, false));

		cube_r1_r1 = new ModelRenderer(this);
		cube_r1_r1.setRotationPoint(0.0F, -0.91F, 5.8338F);
		STAP.addChild(cube_r1_r1);
		setRotationAngle(cube_r1_r1, 0.0873F, 0.0F, 0.0F);
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 51, 41, -1.0F, -6.0F, -10.0F, 2, 4, 2, 0.0F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 0, 26, -0.5F, -5.0F, -11.0F, 1, 2, 1, 0.0F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 0, 53, -1.0F, -8.0F, -12.0F, 2, 3, 2, 0.0F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 28, 40, -1.5F, -10.0F, -13.0F, 3, 2, 3, 0.0F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 10, 37, 3.0F, -22.0F, -13.5F, 2, 2, 6, 0.0F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 32, 19, -5.0F, -22.0F, -13.5F, 2, 2, 6, 0.0F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 47, 47, 2.75F, -21.5F, -12.5F, 3, 1, 4, 0.0F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 48, 5, 3.5F, -22.75F, -12.5F, 1, 1, 4, 0.0F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 48, 0, -4.5F, -22.75F, -12.5F, 1, 1, 4, 0.0F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 46, 36, -5.75F, -21.5F, -12.5F, 3, 1, 4, 0.0F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 31, 32, -5.5F, -22.5F, -13.0F, 3, 3, 5, 0.0F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 30, 4, 2.5F, -22.5F, -13.0F, 3, 3, 5, 0.0F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 16, 19, -1.0F, -23.0F, -12.5F, 2, 2, 2, 0.0F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 16, 30, -2.5F, -22.0F, -14.0F, 5, 2, 5, 0.0F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 41, 48, -0.5F, -21.5F, -9.75F, 1, 10, 1, 0.0F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 37, 48, -0.5F, -21.5F, -13.5F, 1, 10, 1, 0.0F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 25, 52, -0.5F, -25.5F, -14.5F, 1, 7, 1, 0.0F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 40, 13, -1.0F, -24.0F, -14.25F, 2, 1, 2, 0.0F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 0, 13, -1.0F, -20.0F, -13.75F, 2, 6, 2, 0.0F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 0, 0, -1.5F, -23.0F, -14.25F, 3, 6, 2, 0.0F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 16, 16, -7.0F, -12.0F, -9.0F, 14, 1, 2, 0.0F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 18, 0, -7.0F, -12.0F, -10.0F, 14, 1, 1, 0.0F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 30, 2, -5.0F, -12.0F, -11.0F, 10, 1, 1, 0.0F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 31, 30, -3.0F, -12.0F, -12.0F, 6, 1, 1, 0.0F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 0, 26, -2.0F, -20.0F, -13.0F, 4, 10, 4, 0.0F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 6, 13, -0.5F, -6.25F, -9.5F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		STAP.render(f5);
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