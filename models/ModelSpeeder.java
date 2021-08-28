// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class ModelSpeeder extends EntityModel {
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;

	public ModelSpeeder() {
		textureWidth = 256;
		textureHeight = 256;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 74, 52, -4.5F, -8.0F, -6.0F, 9, 2, 9, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 23, 127, -1.5F, -8.5F, -17.0F, 3, 2, 13, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -6.5F, -6.5F, -14.0F, 13, 1, 27, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 125, -4.5F, -6.3F, -2.4F, 9, 4, 9, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 37, 37, 0.0F, -6.5F, -41.0F, 5, 1, 27, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 28, -5.0F, -6.5F, -41.0F, 5, 1, 27, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 84, 0, -0.5F, -8.0F, -39.0F, 1, 1, 22, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 27, 90, 5.0F, -6.5F, -22.0F, 1, 1, 8, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 84, 7, -6.0F, -6.5F, -22.0F, 1, 1, 8, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 104, -3.0F, -9.0F, -49.0F, 2, 4, 17, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 84, 91, 1.0F, -9.0F, -49.0F, 2, 4, 17, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 58, 76, -3.0F, -5.0F, -53.0F, 6, 1, 6, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 51, 37, 1.0F, -8.0F, -50.0F, 2, 3, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 16, 51, -3.0F, -8.0F, -50.0F, 2, 3, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 52, 49, -3.0F, -7.0F, -51.0F, 2, 2, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 51, 44, 1.0F, -7.0F, -51.0F, 2, 2, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 14, 21, 1.0F, -6.0F, -52.0F, 2, 1, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 21, -3.0F, -6.0F, -52.0F, 2, 1, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 85, -3.0F, -10.0F, -47.0F, 6, 4, 15, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 37, 43, -9.0F, -7.5F, -36.0F, 3, 2, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 33, 6.0F, -7.5F, -36.0F, 3, 2, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 56, -10.0F, -8.0F, -38.0F, 1, 3, 10, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 53, 9, 9.0F, -8.0F, -38.0F, 1, 3, 10, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 74, 112, -2.5F, -6.0F, -43.0F, 5, 5, 9, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 42, -0.5F, -11.0F, -30.0F, 1, 3, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 21, 104, -0.5F, -12.0F, -27.0F, 1, 2, 15, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 104, 43, -4.5F, -12.0F, -12.0F, 9, 2, 5, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 37, 37, -4.5F, -10.0F, -12.0F, 2, 4, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 14, 32, 2.5F, -10.0F, -12.0F, 2, 4, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 76, 1.5F, -7.5F, -17.0F, 3, 1, 5, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 52, 31, -4.5F, -7.5F, -17.0F, 3, 1, 5, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 15, 0, -4.5F, -9.5F, -17.0F, 1, 2, 5, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 14, 14, 3.5F, -9.5F, -17.0F, 1, 2, 5, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 52, 0, -4.5F, -9.5F, -45.0F, 2, 3, 28, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 56, 2.5F, -9.5F, -43.0F, 2, 3, 26, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 14, 14, -2.5F, -14.0F, -10.0F, 1, 2, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 18, 46, -2.5F, -15.0F, -10.0F, 1, 1, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 18, 42, 1.5F, -15.0F, -10.0F, 1, 1, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 7, 7, 1.5F, -14.0F, -10.0F, 1, 2, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 51, 41, 1.0F, -15.5F, -7.0F, 2, 2, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 8, -3.0F, -15.5F, -7.0F, 2, 2, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 84, 65, -6.5F, -15.5F, 6.0F, 13, 9, 10, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 42, 91, -5.5F, -14.5F, 16.0F, 11, 8, 10, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 127, 18, -2.5F, -12.5F, 26.0F, 5, 6, 10, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 74, 31, -2.5F, -6.5F, 13.0F, 5, 1, 20, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 74, 31, 6.5F, -10.5F, 9.0F, 5, 3, 5, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 37, 28, -11.5F, -10.5F, 9.0F, 5, 3, 5, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 105, 84, 11.5F, -11.5F, 4.0F, 4, 5, 15, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 104, 23, -15.5F, -11.5F, 4.0F, 4, 5, 15, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 89, 112, 18.5F, -10.5F, 7.0F, 1, 3, 15, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 14, 28, 15.5F, -9.5F, 10.0F, 3, 1, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 57, 112, -19.5F, -10.5F, 7.0F, 1, 3, 15, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 15, 7, -18.5F, -9.5F, 10.0F, 3, 1, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 74, 39, -1.0F, -13.5F, 26.0F, 2, 2, 7, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -1.0F, -15.5F, 16.0F, 2, 2, 11, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 37, 37, -1.0F, -16.5F, 6.0F, 2, 2, 10, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 28, -1.5F, -11.0F, 36.0F, 3, 3, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 58, 65, -5.5F, -9.0F, -41.0F, 1, 1, 10, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 42, 65, -6.5F, -9.0F, -39.0F, 1, 1, 6, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 6, 13, -7.5F, -9.0F, -35.0F, 1, 1, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 6, 0, 6.5F, -9.0F, -35.0F, 1, 1, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 30, 65, 4.5F, -9.0F, -41.0F, 1, 1, 10, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 12, 56, 5.5F, -9.0F, -39.0F, 1, 1, 6, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 58, 66, 3.0F, -10.0F, -36.0F, 1, 1, 24, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 32, 65, -4.0F, -10.0F, -36.0F, 1, 1, 24, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 21, 13, -0.5F, -10.0F, -32.0F, 1, 2, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.5F, -1.0F, -4.0F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.6109F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 1.0F, -4.5F, -12.0F, 2, 6, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 13, -4.0F, -4.5F, -12.0F, 2, 6, 2, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(10.0F, -7.0F, -50.0F);
		bb_main.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.3927F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 51, -12.5F, -1.0F, 5.0F, 5, 1, 3, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(10.0F, -6.0F, -50.0F);
		bb_main.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.3927F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 37, 49, -12.5F, -1.0F, 3.0F, 5, 1, 5, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(10.0F, -5.0F, -50.0F);
		bb_main.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.3927F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 84, 0, -12.5F, -1.0F, 2.0F, 5, 1, 6, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(10.0F, -3.0F, -33.0F);
		bb_main.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.3054F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 42, -12.5F, -1.5F, -1.0F, 5, 1, 8, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(10.0F, -2.0F, -33.0F);
		bb_main.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.3054F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 127, 0, -12.5F, -1.5F, -1.0F, 5, 1, 11, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(10.0F, -1.0F, -33.0F);
		bb_main.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.3054F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 107, 107, -12.5F, -1.5F, -1.0F, 5, 1, 15, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(10.0F, -4.0F, -50.0F);
		bb_main.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.3927F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 53, 0, -12.5F, -1.0F, 0.0F, 5, 1, 8, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(8.5F, -5.0F, -54.0F);
		bb_main.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.3054F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 108, 0, -8.5F, -3.0F, 3.0F, 2, 3, 15, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-8.5F, -5.0F, -54.0F);
		bb_main.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, -0.3054F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 38, 109, 6.5F, -3.0F, 3.0F, 2, 3, 15, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-5.5F, -5.0F, -17.0F);
		bb_main.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.5236F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 13, 6.5F, -3.5F, -17.0F, 2, 4, 10, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(5.5F, -5.0F, -17.0F);
		bb_main.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, -0.5236F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 28, -8.5F, -3.5F, -17.0F, 2, 4, 10, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-1.0F, -10.0F, 13.0F);
		bb_main.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.7854F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 69, -3.0F, -1.3F, -10.0F, 8, 2, 5, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-7.0F, 5.0F, -8.0F);
		bb_main.addChild(cube_r14);
		setRotationAngle(cube_r14, -1.8326F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 85, 4.0F, -3.5F, -12.0F, 1, 9, 3, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 91, 95, 9.0F, -3.5F, -12.0F, 1, 9, 3, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-2.0F, 0.0F, 1.0F);
		bb_main.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.7418F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 30, 56, -2.0F, -1.5F, -10.0F, 8, 2, 6, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-2.0F, -13.0F, 5.0F);
		bb_main.addChild(cube_r16);
		setRotationAngle(cube_r16, 1.2217F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 101, 52, -4.0F, 0.0F, -7.0F, 12, 2, 11, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-1.0F, -23.0F, 5.0F);
		bb_main.addChild(cube_r17);
		setRotationAngle(cube_r17, 1.5708F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 74, 91, -1.0F, 0.0F, -7.0F, 4, 1, 6, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-1.0F, -13.0F, 4.0F);
		bb_main.addChild(cube_r18);
		setRotationAngle(cube_r18, 1.2217F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 110, 123, -3.0F, 0.0F, -6.0F, 8, 1, 11, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bb_main.render(f5);
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