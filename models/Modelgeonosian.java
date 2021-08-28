// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class Modelgeonosian extends EntityModel {
	private final ModelRenderer Geonosian;
	private final ModelRenderer RightArm;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer LeftArm;
	private final ModelRenderer cube_r3;
	private final ModelRenderer RightLeg;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer Head;
	private final ModelRenderer cube_r8;
	private final ModelRenderer Body;
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
	private final ModelRenderer LeftWing1;
	private final ModelRenderer cube_r19;
	private final ModelRenderer RightWing1;
	private final ModelRenderer cube_r20;
	private final ModelRenderer LeftWing2;
	private final ModelRenderer cube_r21;
	private final ModelRenderer RightWing2;
	private final ModelRenderer cube_r22;

	public Modelgeonosian() {
		textureWidth = 128;
		textureHeight = 128;

		Geonosian = new ModelRenderer(this);
		Geonosian.setRotationPoint(0.0F, 24.0F, 0.0F);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, -32.5F, 2.0F);
		Geonosian.addChild(RightArm);
		setRotationAngle(RightArm, 0.2182F, 0.0F, 0.0F);
		RightArm.cubeList.add(new ModelBox(RightArm, 61, 11, -2.0F, 2.0F, -1.0F, 2, 5, 2, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 12, 47, -2.0F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 10, 69, -2.25F, -4.0F, -0.5F, 1, 5, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(6.0F, 8.5F, 5.75F);
		RightArm.addChild(cube_r1);
		setRotationAngle(cube_r1, -1.789F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 55, -9.0F, 15.5F, -3.84F, 1, 6, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 18, 66, -6.0F, 15.5F, -3.84F, 1, 6, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.75F, 8.5F, -1.0F);
		RightArm.addChild(cube_r2);
		setRotationAngle(cube_r2, -1.789F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 41, 65, 1.25F, 9.5F, -3.8F, 1, 7, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 14, 66, 1.25F, 9.5F, -6.8F, 1, 7, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 39, 26, 0.25F, 4.5F, -6.3F, 3, 2, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 46, 0, 0.25F, 7.5F, -6.3F, 3, 6, 3, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 58, 25, 0.75F, 2.5F, -5.8F, 2, 5, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 32, 19, 1.25F, 5.5F, -1.8F, 1, 2, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 20, 19, 1.25F, 6.5F, -3.8F, 1, 1, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 7, 44, 1.25F, 4.5F, -3.8F, 1, 1, 3, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 59, 69, 1.25F, -0.5F, -2.8F, 1, 5, 1, 0.0F, false));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, -32.5F, 2.0F);
		Geonosian.addChild(LeftArm);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 61, 41, 0.0F, 2.0F, -1.0F, 2, 5, 2, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 40, 49, 0.0F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 69, 11, 1.25F, -4.0F, -0.5F, 1, 5, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(2.75F, 8.5F, -1.0F);
		LeftArm.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.7854F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 67, -2.25F, -2.5F, -1.5F, 1, 6, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 24, -2.25F, 3.75F, -3.0F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 66, 57, -2.25F, 3.5F, -2.0F, 1, 3, 2, 0.0F, false));

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.0F, -20.5F, 2.0F);
		Geonosian.addChild(RightLeg);
		RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 35, -0.75F, 20.0F, -2.0F, 1, 1, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 32, 22, -2.75F, 20.0F, -2.0F, 1, 1, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 46, 9, -2.75F, 19.0F, -1.5F, 1, 1, 2, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 45, 27, -0.75F, 19.0F, -1.5F, 1, 1, 2, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 47, 16, -2.25F, 19.25F, 0.0F, 2, 1, 3, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 22, 24, -1.75F, 19.5F, 3.0F, 1, 1, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 66, 7, -2.25F, 11.25F, 2.0F, 2, 2, 2, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 21, 52, -2.25F, -1.25F, -1.5F, 2, 7, 3, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 68, 0, -1.75F, -0.75F, -1.7F, 1, 6, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.5F, 8.5F, 2.0F);
		RightLeg.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.3491F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 29, 61, -1.25F, -3.75F, -1.5F, 1, 8, 2, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-0.5F, 16.5F, 3.0F);
		RightLeg.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.1745F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 62, -1.25F, -4.25F, -1.0F, 1, 8, 1, 0.0F, false));

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.0F, -20.5F, 2.0F);
		Geonosian.addChild(LeftLeg);
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 31, 35, -0.25F, 20.0F, -2.0F, 1, 1, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 37, 1.75F, 20.0F, -2.0F, 1, 1, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 52, 9, 1.75F, 19.0F, -1.5F, 1, 1, 2, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 38, 49, -0.25F, 19.0F, -1.5F, 1, 1, 2, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 59, 49, 0.25F, 19.25F, 0.0F, 2, 1, 3, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 31, 37, 0.75F, 19.5F, 3.0F, 1, 1, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 66, 25, 0.25F, 11.25F, 2.0F, 2, 2, 2, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 52, 52, 0.25F, -1.25F, -1.5F, 2, 7, 3, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 68, 17, 0.75F, -0.75F, -1.7F, 1, 6, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.5F, 8.5F, 2.0F);
		LeftLeg.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.3491F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 53, 62, 0.25F, -3.75F, -1.5F, 1, 8, 2, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.5F, 16.5F, 3.0F);
		LeftLeg.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.1745F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 64, 0, 0.25F, -4.25F, -1.0F, 1, 8, 1, 0.0F, false));

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -35.0F, 1.5F);
		Geonosian.addChild(Head);
		Head.cubeList.add(new ModelBox(Head, 60, 60, -1.0F, -7.0F, -0.75F, 2, 7, 2, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.5F, -3.0F, -1.5F);
		Head.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.9599F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 24, 41, 0.5F, -3.95F, 3.5F, 1, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 24, 43, -2.5F, -3.95F, 3.5F, 1, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 66, 29, -3.0F, -3.75F, 3.0F, 2, 2, 2, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 43, 57, -1.5F, -3.2F, 0.5F, 2, 3, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 49, 37, -1.0F, -3.125F, 1.5F, 1, 3, 5, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 40, 37, -2.5F, -3.25F, 3.5F, 4, 2, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 66, 48, 0.0F, -3.75F, 3.0F, 2, 2, 2, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 30, 46, -2.1F, -2.0F, -2.0F, 1, 1, 6, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 46, 20, 0.1F, -2.0F, -2.0F, 1, 1, 6, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 19, 19, -2.0F, -3.0F, -1.0F, 3, 3, 7, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 13, 35, -1.5F, -2.5F, -1.2F, 2, 2, 3, 0.0F, false));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, -6.0F, 0.0F);
		Geonosian.addChild(Body);
		Body.cubeList.add(new ModelBox(Body, 0, 0, -3.0F, -29.0F, -0.5F, 6, 11, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 18, 35, -2.0F, -28.0F, -1.0F, 4, 1, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 17, 0, 6.0F, -39.75F, 1.25F, 1, 3, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 0, -7.0F, -39.75F, 1.25F, 1, 3, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 40, 30, -1.5F, -27.0F, -1.0F, 3, 2, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 35, -2.0F, -26.0F, -0.7F, 4, 4, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 13, 41, -1.5F, -22.0F, -0.7F, 3, 1, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 51, 27, -0.5F, -26.5F, -1.25F, 1, 1, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 32, 19, -2.5F, -18.0F, -0.5F, 5, 2, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 50, 45, -1.0F, -16.0F, 0.0F, 2, 3, 4, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 62, 53, -1.5F, -15.5F, 1.0F, 3, 2, 2, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 44, 3.0F, -29.0F, -0.5F, 1, 5, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 14, 58, 3.25F, -28.5F, 0.0F, 1, 4, 4, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 20, 13, -5.0F, -28.0F, 0.5F, 10, 3, 3, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 37, 57, -4.25F, -28.5F, 0.0F, 1, 4, 4, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 24, 42, -4.0F, -29.0F, -0.5F, 1, 5, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 16, -3.5F, -18.25F, -1.0F, 7, 2, 6, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 54, 16, 3.25F, -17.25F, 0.0F, 1, 4, 4, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 31, 53, -4.25F, -17.25F, 0.0F, 1, 4, 4, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, -13.0F, 5.0F);
		Body.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 16, -1.0F, -4.0F, -1.0F, 2, 5, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-1.0F, -13.0F, -1.0F);
		Body.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.0873F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 35, 65, 0.0F, -4.0F, 0.0F, 2, 5, 1, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-2.0F, -25.0F, 4.0F);
		Body.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.2182F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 70, 62, -2.0F, 0.0F, -2.5F, 1, 5, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 69, 40, -2.0F, 0.0F, -1.0F, 1, 5, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 70, 33, -2.0F, 0.0F, -4.0F, 1, 5, 1, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(2.0F, -25.0F, 4.0F);
		Body.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 0.2182F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 22, 71, 1.0F, 0.0F, -2.5F, 1, 5, 1, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 26, 71, 1.0F, 0.0F, -1.0F, 1, 5, 1, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 30, 71, 1.0F, 0.0F, -4.0F, 1, 5, 1, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(2.0F, -26.0F, 2.0F);
		Body.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.48F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 31, 36, -3.5F, -4.75F, -2.75F, 2, 4, 5, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 61, 21, -3.5F, -5.75F, -1.75F, 2, 1, 3, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 58, 0, -3.0F, -13.75F, -1.25F, 1, 9, 2, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-2.0F, -26.0F, 2.0F);
		Body.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, 0.48F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 47, 60, 2.0F, -13.75F, -1.25F, 1, 9, 2, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 63, 1.5F, -5.75F, -1.75F, 2, 1, 3, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 40, 40, 1.5F, -4.75F, -2.75F, 2, 4, 5, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.5F, -25.0F, 3.0F);
		Body.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.3054F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 10, 55, -1.0F, -10.0F, 0.0F, 1, 13, 1, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(1.5F, -25.0F, 2.0F);
		Body.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.6981F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 54, -3.0F, -4.0F, -0.5F, 3, 7, 2, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(4.0F, -33.0F, 7.0F);
		Body.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, -0.2182F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 4, 67, -2.75F, 4.0F, -2.5F, 1, 3, 2, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-4.0F, -33.0F, 7.0F);
		Body.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, 0.2182F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 66, 67, 1.75F, 4.0F, -2.5F, 1, 3, 2, 0.0F, false));

		LeftWing1 = new ModelRenderer(this);
		LeftWing1.setRotationPoint(-3.0F, -27.0F, 6.0F);
		Body.addChild(LeftWing1);

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-1.0F, -6.0F, 1.0F);
		LeftWing1.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, 0.2182F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 22, 6, -9.25F, 3.0F, -2.0F, 11, 5, 1, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 43, 12, -17.25F, 3.0F, -2.0F, 8, 3, 1, 0.0F, false));

		RightWing1 = new ModelRenderer(this);
		RightWing1.setRotationPoint(3.0F, -27.0F, 6.0F);
		Body.addChild(RightWing1);

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(1.0F, -6.0F, 1.0F);
		RightWing1.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, -0.2182F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 22, 0, -1.75F, 3.0F, -2.0F, 11, 5, 1, 0.0F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 24, 9.25F, 3.0F, -2.0F, 8, 3, 1, 0.0F, false));

		LeftWing2 = new ModelRenderer(this);
		LeftWing2.setRotationPoint(-3.0F, -27.0F, 6.0F);
		Body.addChild(LeftWing2);

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-2.0F, -5.0F, 2.0F);
		LeftWing2.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.5236F, -0.2182F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 22, 29, -8.25F, 3.0F, -2.0F, 10, 5, 1, 0.0F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 56, 37, -14.25F, 3.0F, -2.0F, 6, 3, 1, 0.0F, false));

		RightWing2 = new ModelRenderer(this);
		RightWing2.setRotationPoint(3.0F, -27.0F, 6.0F);
		Body.addChild(RightWing2);

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(2.0F, -5.0F, 2.0F);
		RightWing2.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, -0.5236F, 0.2182F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 29, -1.75F, 3.0F, -2.0F, 10, 5, 1, 0.0F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 56, 33, 8.25F, 3.0F, -2.0F, 6, 3, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Geonosian.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.RightWing1.rotateAngleZ = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.RightWing2.rotateAngleY = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.LeftWing1.rotateAngleZ = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.LeftWing2.rotateAngleY = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}