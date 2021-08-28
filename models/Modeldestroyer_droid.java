// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class Modeldestroyer_droid extends EntityModel {
	private final ModelRenderer Droideka;
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
	private final ModelRenderer MiddleLeg;
	private final ModelRenderer cube_r13;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer cube_r14;
	private final ModelRenderer RightLeg;
	private final ModelRenderer cube_r15;

	public Modeldestroyer_droid() {
		textureWidth = 128;
		textureHeight = 128;

		Droideka = new ModelRenderer(this);
		Droideka.setRotationPoint(0.0F, 24.0F, 0.0F);
		Droideka.cubeList.add(new ModelBox(Droideka, 0, 28, -4.0F, -9.0F, -4.0F, 8, 2, 8, 0.0F, false));
		Droideka.cubeList.add(new ModelBox(Droideka, 0, 0, -6.0F, -13.0F, -6.0F, 12, 4, 12, 0.0F, false));
		Droideka.cubeList.add(new ModelBox(Droideka, 62, 14, -4.0F, -19.0F, 4.0F, 8, 6, 2, 0.0F, false));
		Droideka.cubeList.add(new ModelBox(Droideka, 64, 4, -2.0F, -16.0F, 0.0F, 4, 4, 4, 0.0F, false));
		Droideka.cubeList.add(new ModelBox(Droideka, 74, 44, -2.0F, -14.0F, -2.0F, 4, 2, 2, 0.0F, false));
		Droideka.cubeList.add(new ModelBox(Droideka, 20, 54, -4.0F, -33.0F, 7.0F, 8, 8, 2, 0.0F, false));
		Droideka.cubeList.add(new ModelBox(Droideka, 36, 0, -2.0F, -31.0F, -1.0F, 4, 4, 8, 0.0F, false));
		Droideka.cubeList.add(new ModelBox(Droideka, 12, 58, -1.5F, -30.5F, -1.5F, 3, 3, 1, 0.0F, false));
		Droideka.cubeList.add(new ModelBox(Droideka, 62, 52, -10.0F, -30.0F, 0.0F, 8, 2, 2, 0.0F, false));
		Droideka.cubeList.add(new ModelBox(Droideka, 62, 22, 2.0F, -30.0F, 0.0F, 8, 2, 2, 0.0F, false));
		Droideka.cubeList.add(new ModelBox(Droideka, 56, 38, 9.0F, -24.0F, -12.0F, 4, 2, 6, 0.0F, false));
		Droideka.cubeList.add(new ModelBox(Droideka, 76, 76, 11.75F, -23.5F, -16.0F, 1, 1, 4, 0.0F, false));
		Droideka.cubeList.add(new ModelBox(Droideka, 30, 21, -12.75F, -23.5F, -16.0F, 1, 1, 4, 0.0F, false));
		Droideka.cubeList.add(new ModelBox(Droideka, 30, 16, 9.25F, -23.5F, -16.0F, 1, 1, 4, 0.0F, false));
		Droideka.cubeList.add(new ModelBox(Droideka, 24, 28, -10.25F, -23.5F, -16.0F, 1, 1, 4, 0.0F, false));
		Droideka.cubeList.add(new ModelBox(Droideka, 56, 56, -13.0F, -24.0F, -12.0F, 4, 2, 6, 0.0F, false));
		Droideka.cubeList.add(new ModelBox(Droideka, 36, 44, -3.0F, -32.0F, 7.5F, 6, 6, 2, 0.0F, false));
		Droideka.cubeList.add(new ModelBox(Droideka, 60, 32, -9.0F, -18.0F, 5.0F, 8, 4, 2, 0.0F, false));
		Droideka.cubeList.add(new ModelBox(Droideka, 18, 74, -10.0F, -18.0F, 1.0F, 2, 4, 4, 0.0F, false));
		Droideka.cubeList.add(new ModelBox(Droideka, 6, 74, 8.0F, -18.0F, 1.0F, 2, 4, 4, 0.0F, false));
		Droideka.cubeList.add(new ModelBox(Droideka, 56, 46, 1.0F, -18.0F, 5.0F, 8, 4, 2, 0.0F, false));
		Droideka.cubeList.add(new ModelBox(Droideka, 0, 54, 4.0F, -15.0F, -4.0F, 2, 2, 8, 0.0F, false));
		Droideka.cubeList.add(new ModelBox(Droideka, 52, 4, -6.0F, -15.0F, -4.0F, 2, 2, 8, 0.0F, false));
		Droideka.cubeList.add(new ModelBox(Droideka, 0, 16, -5.0F, -10.0F, -5.0F, 10, 2, 10, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(5.0F, -35.0F, 14.0F);
		Droideka.addChild(cube_r1);
		setRotationAngle(cube_r1, 2.7489F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 32, 64, -6.0F, -11.0F, 9.5F, 2, 16, 2, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-5.1F, -23.0F, 0.0F);
		Droideka.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 40, 66, 4.1F, -9.0F, 12.8F, 2, 14, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 62, 64, 0.2F, -9.0F, 12.8F, 2, 14, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 54, 64, 8.0F, -9.0F, 12.8F, 2, 14, 2, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(8.6F, -21.0F, 0.0F);
		Droideka.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 74, -5.1F, -10.0F, 13.25F, 1, 15, 2, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 70, 70, -13.1F, -10.0F, 13.25F, 1, 15, 2, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 48, 66, -9.1F, -10.0F, 13.25F, 1, 15, 2, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(7.0F, -29.0F, 0.0F);
		Droideka.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.3927F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 46, 14, -10.0F, -9.0F, 13.5F, 6, 12, 2, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 38, -12.0F, -10.0F, 13.0F, 10, 14, 2, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(5.0F, -31.0F, 8.0F);
		Droideka.addChild(cube_r5);
		setRotationAngle(cube_r5, 1.9635F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 38, -6.0F, -13.5F, 13.5F, 2, 12, 2, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-6.5F, -26.0F, 0.0F);
		Droideka.addChild(cube_r6);
		setRotationAngle(cube_r6, 1.7017F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 76, 68, 3.75F, -12.6F, 13.0F, 1, 7, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 76, 0, 8.25F, -12.6F, 13.0F, 1, 7, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(4.5F, -26.0F, -2.0F);
		Droideka.addChild(cube_r7);
		setRotationAngle(cube_r7, 1.7017F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 56, 54, -5.0F, -12.9916F, 9.7757F, 1, 7, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 52, 4, -5.0F, -6.9916F, 10.7757F, 1, 1, 3, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(5.0F, -27.0F, -4.0F);
		Droideka.addChild(cube_r8);
		setRotationAngle(cube_r8, 1.7017F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 12, 54, -6.0F, -7.0F, 12.5F, 2, 2, 2, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 70, 38, -8.0F, -5.0F, 12.5F, 6, 4, 2, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(5.0F, -29.0F, 10.0F);
		Droideka.addChild(cube_r9);
		setRotationAngle(cube_r9, 1.4835F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 16, -6.0F, -10.0F, 12.4F, 2, 8, 2, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 64, -8.0F, -10.0F, 13.5F, 6, 8, 2, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 32, 32, -11.0F, -11.0F, 13.0F, 12, 10, 2, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(7.0F, -25.0F, 0.0F);
		Droideka.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.5672F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 40, 54, -10.0F, -12.0F, 9.5F, 6, 10, 2, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(6.0F, -21.0F, -6.0F);
		Droideka.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.3927F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 74, 26, -8.0F, -9.5F, 9.6F, 4, 2, 2, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 70, 56, -8.0F, -7.0F, 9.6F, 4, 2, 2, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 8, -8.0F, -4.5F, 9.6F, 4, 2, 2, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 64, -9.0F, -10.0F, 10.0F, 6, 8, 2, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-16.0F, -19.0F, -4.0F);
		Droideka.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.6109F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 72, 60, 4.0F, -7.0F, 8.0F, 2, 4, 4, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 44, 44, 4.0F, -6.0F, 0.0F, 2, 2, 8, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 24, 44, 26.0F, -6.0F, 0.0F, 2, 2, 8, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, 26.0F, -7.0F, 8.0F, 2, 4, 4, 0.0F, false));

		MiddleLeg = new ModelRenderer(this);
		MiddleLeg.setRotationPoint(1.0F, -11.0F, 6.0F);
		Droideka.addChild(MiddleLeg);
		MiddleLeg.cubeList.add(new ModelBox(MiddleLeg, 0, 54, -2.0F, 1.0F, 7.0F, 2, 5, 2, 0.0F, false));
		MiddleLeg.cubeList.add(new ModelBox(MiddleLeg, 30, 18, -2.0F, -1.0F, -3.0F, 2, 2, 11, 0.0F, false));
		MiddleLeg.cubeList.add(new ModelBox(MiddleLeg, 62, 80, -1.5F, 6.0F, 7.5F, 1, 5, 1, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.0F, 3.0F, -1.0F);
		MiddleLeg.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.7854F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 24, 28, -1.75F, 2.7071F, 6.2071F, 1, 3, 1, 0.0F, false));

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(6.0F, -11.0F, -1.0F);
		Droideka.addChild(LeftLeg);
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 36, 0, 7.0F, 1.0F, 0.0F, 2, 5, 2, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 58, 80, 7.5F, 6.0F, 0.5F, 1, 5, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 52, 28, -3.0F, -1.0F, 0.0F, 11, 2, 2, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-2.0F, 4.0F, 0.0F);
		LeftLeg.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.7854F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 8, 0, 7.7071F, 2.7071F, 0.5F, 1, 3, 1, 0.0F, false));

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-6.0F, -11.0F, -1.0F);
		Droideka.addChild(RightLeg);
		RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 28, -9.0F, 1.0F, 0.0F, 2, 5, 2, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 52, 0, -8.0F, -1.0F, 0.0F, 11, 2, 2, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 54, 80, -8.5F, 6.0F, 0.5F, 1, 5, 1, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(2.0F, 4.0F, 0.0F);
		RightLeg.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, 0.7854F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 0, -8.7071F, 2.7071F, 0.5F, 1, 3, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Droideka.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.LeftLeg.rotateAngleY = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.RightLeg.rotateAngleY = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.MiddleLeg.rotateAngleY = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}