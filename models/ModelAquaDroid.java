// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class ModelAquaDroid extends EntityModel {
	private final ModelRenderer AquaDroid;
	private final ModelRenderer GunArm;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer RightArm;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer RightLeg;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer Head;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer Body;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;

	public ModelAquaDroid() {
		textureWidth = 128;
		textureHeight = 128;

		AquaDroid = new ModelRenderer(this);
		AquaDroid.setRotationPoint(0.0F, 23.5F, 0.0F);

		GunArm = new ModelRenderer(this);
		GunArm.setRotationPoint(-4.0F, -39.5F, 0.0F);
		AquaDroid.addChild(GunArm);
		setRotationAngle(GunArm, 0.0873F, 0.0F, 0.0F);
		GunArm.cubeList.add(new ModelBox(GunArm, 28, 64, -4.5F, 0.0F, -2.0F, 1, 2, 2, 0.0F, false));
		GunArm.cubeList.add(new ModelBox(GunArm, 48, 48, -5.5F, -1.0F, -6.0F, 1, 4, 4, 0.0F, false));
		GunArm.cubeList.add(new ModelBox(GunArm, 28, 58, -5.5F, -0.5F, -2.0F, 1, 3, 3, 0.0F, false));
		GunArm.cubeList.add(new ModelBox(GunArm, 8, 64, -5.5F, 0.0F, 1.0F, 1, 2, 2, 0.0F, false));
		GunArm.cubeList.add(new ModelBox(GunArm, 58, 58, -5.75F, -0.5F, -5.5F, 1, 3, 3, 0.0F, false));
		GunArm.cubeList.add(new ModelBox(GunArm, 14, 64, -5.75F, 0.0F, -2.5F, 1, 2, 2, 0.0F, false));
		GunArm.cubeList.add(new ModelBox(GunArm, 30, 42, -5.75F, 0.5F, -0.5F, 1, 1, 2, 0.0F, false));
		GunArm.cubeList.add(new ModelBox(GunArm, 10, 41, -4.5F, 0.5F, -8.0F, 1, 1, 6, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(2.5F, -4.0F, 1.0F);
		GunArm.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.3491F, -0.3054F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 52, 45, -8.0F, 2.5F, 0.0F, 6, 1, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.5F, -2.0F, -3.0F);
		GunArm.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 40, 16, -5.5F, 3.0F, -13.9772F, 2, 2, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -5.0F, 1.25F, -19.9772F, 1, 1, 15, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 26, 33, -5.0F, 2.25F, -7.9772F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 41, -5.0F, 2.25F, -10.9772F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 26, -5.5F, 2.5F, -11.9772F, 2, 1, 7, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 15, 17, -5.0F, 2.9771F, -12.9772F, 1, 1, 9, 0.0F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(4.0F, -39.5F, 0.0F);
		AquaDroid.addChild(RightArm);
		setRotationAngle(RightArm, 1.8326F, 0.0F, 0.0F);
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 64, 3.5F, 0.0F, -2.0F, 1, 2, 2, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 45, 20, 4.5F, -1.0F, -6.0F, 1, 4, 4, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 10, 58, 4.5F, -0.5F, -2.0F, 1, 3, 3, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 34, 63, 4.5F, 0.0F, 1.0F, 1, 2, 2, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 57, 30, 4.75F, -0.5F, -5.5F, 1, 3, 3, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 44, 36, 4.75F, 0.0F, -2.5F, 1, 2, 2, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 9, 0, 4.75F, 0.5F, -0.5F, 1, 1, 2, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 40, 13, 3.5F, 0.5F, -8.0F, 1, 1, 6, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-2.5F, -4.0F, 1.0F);
		RightArm.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.3491F, 0.3054F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 11, 31, 2.0F, 2.5F, 0.0F, 6, 1, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.5F, -2.0F, -3.0F);
		RightArm.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.6109F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 63, 47, 3.5F, -9.5F, -7.0F, 2, 1, 2, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 38, 57, 3.5F, -7.5F, -5.5F, 2, 7, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 24, 57, 4.0F, -8.5F, -6.0F, 1, 9, 1, 0.0F, false));

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(3.0F, -20.25F, 0.0F);
		AquaDroid.addChild(LeftLeg);
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 46, 1.0F, -3.5F, -1.5F, 2, 6, 3, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 18, 55, 1.5F, 2.5F, -1.5F, 1, 7, 2, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 18, 48, 1.5F, 2.5F, 0.5F, 1, 4, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 59, 36, 0.5F, 9.5F, -2.0F, 3, 2, 2, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 20, 64, 1.5F, 14.5F, -0.75F, 1, 4, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 65, 3, 1.0F, 18.5F, -0.75F, 2, 1, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 62, 64, 1.5F, 19.0F, -1.25F, 1, 1, 2, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 35, 13, 0.5F, 19.25F, 0.75F, 3, 1, 2, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 27, 54, 0.5F, 19.25F, -4.25F, 3, 1, 3, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 37, 0, 1.5F, 19.0F, -4.5F, 1, 1, 3, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 56, 64, 1.5F, 19.0F, 1.0F, 1, 1, 2, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 63, 43, 1.0F, 19.25F, 2.75F, 2, 1, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 36, 54, 1.0F, 19.25F, -5.25F, 2, 1, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 26, 16, 1.5F, 9.75F, -2.5F, 1, 3, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 39, 66, 1.0F, 2.5F, -1.0F, 1, 4, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 60, 8, 0.5F, -2.5F, -1.0F, 3, 2, 2, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-3.0F, -3.25F, 0.0F);
		LeftLeg.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.6109F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 63, 20, 1.0F, -1.5F, -0.5F, 4, 1, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 10.75F, 0.0F);
		LeftLeg.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 65, 32, 1.0F, 2.75F, -0.2F, 2, 1, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 44, 57, 1.0F, -0.25F, -1.2F, 2, 5, 1, 0.0F, false));

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-3.0F, -20.25F, 0.0F);
		AquaDroid.addChild(RightLeg);
		RightLeg.cubeList.add(new ModelBox(RightLeg, 42, 42, -3.0F, -3.5F, -1.5F, 2, 6, 3, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 55, -2.5F, 2.5F, -1.5F, 1, 7, 2, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 19, 16, -2.5F, 2.5F, 0.5F, 1, 4, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 58, 51, -3.5F, 9.5F, -2.0F, 3, 2, 2, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 17, 8, -2.5F, 14.5F, -0.75F, 1, 4, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 49, 7, -3.0F, 18.5F, -0.75F, 2, 1, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 63, 58, -2.5F, 19.0F, -1.25F, 1, 1, 2, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 18, 33, -3.5F, 19.25F, 0.75F, 3, 1, 2, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 39, 53, -3.5F, 19.25F, -4.25F, 3, 1, 3, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 28, 36, -2.5F, 19.0F, -4.5F, 1, 1, 3, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 39, 42, -2.5F, 19.0F, 1.0F, 1, 1, 2, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 25, 31, -3.0F, 19.25F, 2.75F, 2, 1, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 26, 24, -3.0F, 19.25F, -5.25F, 2, 1, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 17, 0, -2.5F, 9.75F, -2.5F, 1, 3, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 16, -2.0F, 2.5F, -1.0F, 1, 4, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 57, 4, -3.5F, -2.5F, -1.0F, 3, 2, 2, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(3.0F, -3.25F, 0.0F);
		RightLeg.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.6109F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 62, 30, -5.0F, -1.5F, -0.5F, 4, 1, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 10.75F, 0.0F);
		RightLeg.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0873F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 42, 51, -3.0F, 2.75F, -0.2F, 2, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 26, -3.0F, -0.25F, -1.2F, 2, 5, 1, 0.0F, false));

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -41.5F, 0.0F);
		AquaDroid.addChild(Head);
		Head.cubeList.add(new ModelBox(Head, 42, 63, -1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 60, 23, -1.5F, -5.0F, -3.0F, 3, 2, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 60, 0, -2.0F, -5.25F, -2.75F, 4, 2, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 66, 16, 2.0F, -4.75F, -2.25F, 2, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 49, 66, -4.0F, -4.75F, -2.25F, 2, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 66, 12, 2.0F, -4.75F, 0.75F, 2, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 65, 34, -4.0F, -4.75F, 0.75F, 2, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 58, 55, -2.0F, -5.25F, 1.25F, 4, 2, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 48, 14, -2.0F, -5.75F, -1.75F, 4, 1, 3, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 40, -0.5F, -4.75F, -3.25F, 1, 2, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-4.5F, -4.0F, -1.0F);
		Head.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.3491F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 30, 46, 4.0F, 0.0F, -1.0F, 1, 5, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, -9.0F, -2.0F);
		Head.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.1309F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 11, -6.45F, 3.25F, 0.25F, 4, 1, 3, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, -9.0F, -2.0F);
		Head.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.1309F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 48, 10, 2.45F, 3.25F, 0.25F, 4, 1, 3, 0.0F, false));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, -5.5F, 0.0F);
		AquaDroid.addChild(Body);
		Body.cubeList.add(new ModelBox(Body, 54, 47, -1.5F, -20.25F, -1.5F, 3, 1, 3, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 22, 46, -1.0F, -27.25F, -1.0F, 2, 9, 2, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 56, 23, -0.5F, -27.25F, -1.25F, 1, 9, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 54, 56, -0.5F, -27.25F, 0.25F, 1, 9, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 50, 56, 0.25F, -27.25F, -0.5F, 1, 9, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 6, 55, -1.25F, -27.25F, -0.5F, 1, 9, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 40, -2.0F, -18.75F, -2.0F, 4, 2, 4, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 18, 41, -2.0F, -20.0F, -2.0F, 4, 1, 4, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 50, 4, -0.5F, -17.25F, -2.5F, 1, 1, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 32, 36, -2.0F, -24.5F, -2.0F, 4, 2, 4, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 17, 8, -2.5F, -28.5F, -2.5F, 5, 2, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 0, -1.5F, -32.5F, -1.5F, 3, 8, 3, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 34, 42, -0.5F, -32.5F, -1.25F, 1, 9, 3, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 48, 28, -1.25F, -32.5F, -0.5F, 3, 9, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 10, 48, -1.75F, -32.5F, -0.5F, 3, 9, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 11, 10, -0.5F, -26.5F, -1.75F, 1, 3, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 16, -3.5F, -36.5F, -2.5F, 7, 5, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 14, 36, 2.5F, -38.0F, -2.0F, 5, 1, 4, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 59, 16, 5.25F, -38.5F, -1.5F, 2, 1, 3, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 59, 12, -7.25F, -38.5F, -1.5F, 2, 1, 3, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 31, 24, -7.5F, -38.0F, -2.0F, 5, 1, 4, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 17, 0, -4.0F, -36.0F, -2.0F, 8, 4, 4, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 11, 27, -4.5F, -35.0F, -1.0F, 9, 2, 2, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(1.5F, -42.0F, 0.0F);
		Body.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.6981F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 60, 27, -6.5F, 2.0F, -8.0F, 3, 1, 2, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 61, 40, 0.5F, 2.0F, -8.0F, 3, 1, 2, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 49, 42, -8.5F, 2.0F, -6.0F, 5, 1, 2, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 51, 20, 0.5F, 2.0F, -6.0F, 5, 1, 2, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-4.0F, -41.0F, -1.5F);
		Body.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.48F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 41, 0, 3.0F, 8.25F, -6.5F, 2, 3, 4, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 26, 16, 1.5F, 4.25F, -6.5F, 5, 4, 4, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(2.0F, -41.0F, 1.5F);
		Body.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.48F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 30, 30, -5.0F, 4.75F, 2.0F, 6, 3, 3, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-1.0F, -41.0F, 2.5F);
		Body.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.5236F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 32, 8, -3.0F, 2.5F, -3.0F, 8, 4, 1, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-1.0F, -41.0F, -1.5F);
		Body.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.7854F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 34, -3.0F, 2.5F, 2.0F, 8, 5, 1, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(3.0F, -21.0F, -2.0F);
		Body.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, -1.0472F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 48, 38, -3.5F, -0.25F, 0.5F, 4, 1, 3, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-3.0F, -21.0F, -2.0F);
		Body.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, 1.0472F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 49, 0, -0.5F, -0.25F, 0.5F, 4, 1, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		AquaDroid.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}