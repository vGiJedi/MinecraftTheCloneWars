// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class Modelundeadgeonosian extends EntityModel {
	private final ModelRenderer UndeadGeonosian;
	private final ModelRenderer LeftArm;
	private final ModelRenderer cube_r3_r1;
	private final ModelRenderer RightArm;
	private final ModelRenderer cube_r23;
	private final ModelRenderer RightLeg;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer Head;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r10_r1;
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

	public Modelundeadgeonosian() {
		textureWidth = 128;
		textureHeight = 128;

		UndeadGeonosian = new ModelRenderer(this);
		UndeadGeonosian.setRotationPoint(0.0F, 24.0F, 0.0F);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, -32.5F, 2.0F);
		UndeadGeonosian.addChild(LeftArm);
		setRotationAngle(LeftArm, -0.7418F, 0.0F, -0.1309F);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 57, 34, 0.0F, 2.0F, -1.0F, 2, 5, 2, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 49, 37, 0.0F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 65, 44, 1.25F, -4.0F, -0.5F, 1, 5, 1, 0.0F, false));

		cube_r3_r1 = new ModelRenderer(this);
		cube_r3_r1.setRotationPoint(-5.0F, 24.7634F, -18.6777F);
		LeftArm.addChild(cube_r3_r1);
		setRotationAngle(cube_r3_r1, -0.7854F, 0.0F, 0.0F);
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 0, 65, 5.5F, -26.5F, -0.5F, 1, 6, 1, 0.0F, false));
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 25, 45, 5.5F, -20.25F, -2.0F, 1, 1, 1, 0.0F, false));
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 64, 58, 5.5F, -20.5F, -1.0F, 1, 3, 2, 0.0F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, -32.5F, 2.0F);
		UndeadGeonosian.addChild(RightArm);
		setRotationAngle(RightArm, -1.0472F, 0.0F, 0.2618F);
		RightArm.cubeList.add(new ModelBox(RightArm, 57, 34, -2.0F, 2.0F, -1.0F, 2, 5, 2, 0.0F, true));
		RightArm.cubeList.add(new ModelBox(RightArm, 49, 37, -2.0F, -2.0F, -2.0F, 2, 4, 4, 0.0F, true));
		RightArm.cubeList.add(new ModelBox(RightArm, 65, 44, -2.25F, -4.0F, -0.5F, 1, 5, 1, 0.0F, true));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-2.75F, 8.5F, -1.0F);
		RightArm.addChild(cube_r23);
		setRotationAngle(cube_r23, -0.7854F, 0.0F, 0.0F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 65, 1.25F, -2.5F, -1.5F, 1, 6, 1, 0.0F, true));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 25, 45, 1.25F, 3.75F, -3.0F, 1, 1, 1, 0.0F, true));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 64, 58, 1.25F, 3.5F, -2.0F, 1, 3, 2, 0.0F, true));

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.0F, -20.5F, 2.0F);
		UndeadGeonosian.addChild(RightLeg);
		RightLeg.cubeList.add(new ModelBox(RightLeg, 11, 44, -0.75F, 20.0F, -2.0F, 1, 1, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 44, -2.75F, 20.0F, -2.0F, 1, 1, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 43, 49, -2.75F, 19.0F, -1.5F, 1, 1, 2, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 43, 27, -0.75F, 19.0F, -1.5F, 1, 1, 2, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 60, 54, -2.25F, 19.25F, 0.0F, 2, 1, 3, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 27, 41, -1.75F, 19.5F, 3.0F, 1, 1, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 63, 29, -2.25F, 11.25F, 2.0F, 2, 2, 2, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 9, 51, -2.25F, -1.25F, -1.5F, 2, 7, 3, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 55, 45, -1.75F, -0.75F, -1.7F, 1, 6, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.5F, 8.5F, 2.0F);
		RightLeg.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.3491F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 49, 61, -1.25F, -3.75F, -1.5F, 1, 8, 2, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-0.5F, 16.5F, 3.0F);
		RightLeg.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.1745F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 55, 63, -1.25F, -4.25F, -1.0F, 1, 8, 1, 0.0F, false));

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.0F, -20.5F, 2.0F);
		UndeadGeonosian.addChild(LeftLeg);
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 31, 37, -0.25F, 20.0F, -2.0F, 1, 1, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 37, 1.75F, 20.0F, -2.0F, 1, 1, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 39, 26, 1.75F, 19.0F, -1.5F, 1, 1, 2, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 20, 19, -0.25F, 19.0F, -1.5F, 1, 1, 2, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 60, 0, 0.25F, 19.25F, 0.0F, 2, 1, 3, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 31, 35, 0.75F, 19.5F, 3.0F, 1, 1, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 63, 16, 0.25F, 11.25F, 2.0F, 2, 2, 2, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 48, 49, 0.25F, -1.25F, -1.5F, 2, 7, 3, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 54, 0.75F, -0.75F, -1.7F, 1, 6, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.5F, 8.5F, 2.0F);
		LeftLeg.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.3491F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 10, 61, 0.25F, -3.75F, -1.5F, 1, 8, 2, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.5F, 16.5F, 3.0F);
		LeftLeg.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.1745F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 25, 60, 0.25F, -4.25F, -1.0F, 1, 8, 1, 0.0F, false));

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -35.0F, 1.5F);
		UndeadGeonosian.addChild(Head);
		Head.cubeList.add(new ModelBox(Head, 17, 60, -1.0F, -7.0F, -0.75F, 2, 7, 2, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.5F, -3.0F, -1.5F);
		Head.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.9599F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 35, 0.5F, -3.95F, 3.5F, 1, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 22, 24, -2.5F, -3.95F, 3.5F, 1, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 63, 4, -3.0F, -3.75F, 3.0F, 2, 2, 2, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 65, 33, -1.5F, -3.2F, 0.5F, 2, 3, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 36, 49, -1.0F, -3.125F, 1.5F, 1, 3, 5, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 40, 37, -2.5F, -3.25F, 3.5F, 4, 2, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 61, 12, 0.0F, -3.75F, 3.0F, 2, 2, 2, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 46, 20, -2.1F, -2.0F, -2.0F, 1, 1, 6, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 45, 0, 0.1F, -2.0F, -2.0F, 1, 1, 6, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 19, 19, -2.0F, -3.0F, -1.0F, 3, 3, 7, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 13, 35, -1.5F, -2.5F, -1.2F, 2, 2, 3, 0.0F, false));

		cube_r10_r1 = new ModelRenderer(this);
		cube_r10_r1.setRotationPoint(-0.5F, 38.0F, 0.0F);
		cube_r8.addChild(cube_r10_r1);
		setRotationAngle(cube_r10_r1, 0.1745F, 0.0F, 0.1309F);
		cube_r10_r1.cubeList.add(new ModelBox(cube_r10_r1, 18, 24, -6.5F, -42.2F, 7.0F, 1, 1, 1, 0.0F, false));
		cube_r10_r1.cubeList.add(new ModelBox(cube_r10_r1, 0, 0, -5.5F, -41.7032F, 6.576F, 1, 3, 1, 0.0F, false));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, -6.0F, 0.0F);
		UndeadGeonosian.addChild(Body);
		Body.cubeList.add(new ModelBox(Body, 0, 0, -3.0F, -29.0F, -0.5F, 6, 11, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 18, 35, -2.0F, -28.0F, -1.0F, 4, 1, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 32, 19, 6.0F, -39.75F, 1.25F, 1, 3, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 17, 0, -7.0F, -39.75F, 1.25F, 1, 3, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 40, 30, -1.5F, -27.0F, -1.0F, 3, 2, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 35, -2.0F, -26.0F, -0.7F, 4, 4, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 25, 45, -1.5F, -22.0F, -0.7F, 3, 1, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 53, 0, -0.5F, -26.5F, -1.25F, 1, 1, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 32, 19, -2.5F, -18.0F, -0.5F, 5, 2, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 51, 27, -1.0F, -16.0F, 0.0F, 2, 3, 4, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 59, 25, -1.5F, -15.5F, 1.0F, 3, 2, 2, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 44, 3.0F, -29.0F, -0.5F, 1, 5, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 57, 16, 3.25F, -28.5F, 0.0F, 1, 4, 4, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 20, 13, -5.0F, -28.0F, 0.5F, 10, 3, 3, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 33, 57, -4.25F, -28.5F, 0.0F, 1, 4, 4, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 13, 41, -4.0F, -29.0F, -0.5F, 1, 5, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 16, -3.5F, -18.25F, -1.0F, 7, 2, 6, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 57, 3.25F, -17.25F, 0.0F, 1, 4, 4, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 54, 55, -4.25F, -17.25F, 0.0F, 1, 4, 4, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, -13.0F, 5.0F);
		Body.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 59, 63, -1.0F, -4.0F, -1.0F, 2, 5, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-1.0F, -13.0F, -1.0F);
		Body.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.0873F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 16, 0.0F, -4.0F, 0.0F, 2, 5, 1, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-2.0F, -25.0F, 4.0F);
		Body.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.2182F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 65, 65, -2.0F, 0.0F, -2.5F, 1, 5, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 37, 65, -2.0F, 0.0F, -1.0F, 1, 5, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 33, 65, -2.0F, 0.0F, -4.0F, 1, 5, 1, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(2.0F, -25.0F, 4.0F);
		Body.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 0.2182F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 29, 65, 1.0F, 0.0F, -2.5F, 1, 5, 1, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 4, 65, 1.0F, 0.0F, -1.0F, 1, 5, 1, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 46, 0, 1.0F, 0.0F, -4.0F, 1, 5, 1, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(2.0F, -26.0F, 2.0F);
		Body.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.48F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 40, 40, -3.5F, -4.75F, -2.75F, 2, 4, 5, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 57, 8, -3.5F, -5.75F, -1.75F, 2, 1, 3, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 59, 43, -3.0F, -13.75F, -1.25F, 1, 9, 2, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-2.0F, -26.0F, 2.0F);
		Body.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, 0.48F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 43, 57, 2.0F, -13.75F, -1.25F, 1, 9, 2, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 20, 41, 1.5F, -5.75F, -1.75F, 2, 1, 3, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 31, 36, 1.5F, -4.75F, -2.75F, 2, 4, 5, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.5F, -25.0F, 3.0F);
		Body.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.3054F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 29, 51, -1.0F, -10.0F, 0.0F, 1, 13, 1, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(1.5F, -25.0F, 2.0F);
		Body.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.6981F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 19, 51, -3.0F, -4.0F, -0.5F, 3, 7, 2, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(4.0F, -33.0F, 7.0F);
		Body.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, -0.2182F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 63, 39, -2.75F, 4.0F, -2.5F, 1, 3, 2, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-4.0F, -33.0F, 7.0F);
		Body.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, 0.2182F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 7, 44, 1.75F, 4.0F, -2.5F, 1, 3, 2, 0.0F, false));

		LeftWing1 = new ModelRenderer(this);
		LeftWing1.setRotationPoint(-3.0F, -27.0F, 6.0F);
		Body.addChild(LeftWing1);
		setRotationAngle(LeftWing1, 0.0F, 0.0873F, -1.789F);

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-1.0F, -6.0F, 1.0F);
		LeftWing1.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, 0.2182F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 22, 6, -9.25F, 3.0F, -2.0F, 11, 5, 1, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 43, 12, -17.25F, 3.0F, -2.0F, 8, 3, 1, 0.0F, false));

		RightWing1 = new ModelRenderer(this);
		RightWing1.setRotationPoint(3.0F, -27.0F, 6.0F);
		Body.addChild(RightWing1);
		setRotationAngle(RightWing1, 0.0F, -0.0873F, 1.789F);

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(1.0F, -6.0F, 1.0F);
		RightWing1.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, -0.2182F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 22, 0, -1.75F, 3.0F, -2.0F, 11, 5, 1, 0.0F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 24, 9.25F, 3.0F, -2.0F, 8, 3, 1, 0.0F, false));

		LeftWing2 = new ModelRenderer(this);
		LeftWing2.setRotationPoint(-3.0F, -27.0F, 6.0F);
		Body.addChild(LeftWing2);
		setRotationAngle(LeftWing2, 0.0F, -0.3491F, -1.2217F);

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-2.0F, -5.0F, 2.0F);
		LeftWing2.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.5236F, -0.2182F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 22, 29, -8.25F, 3.0F, -2.0F, 10, 5, 1, 0.0F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 47, 16, -14.25F, 3.0F, -2.0F, 6, 3, 1, 0.0F, false));

		RightWing2 = new ModelRenderer(this);
		RightWing2.setRotationPoint(3.0F, -27.0F, 6.0F);
		Body.addChild(RightWing2);
		setRotationAngle(RightWing2, 0.0F, 0.3491F, 1.2217F);

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(2.0F, -5.0F, 2.0F);
		RightWing2.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, -0.5236F, 0.2182F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 29, -1.75F, 3.0F, -2.0F, 10, 5, 1, 0.0F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 46, 7, 8.25F, 3.0F, -2.0F, 6, 3, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		UndeadGeonosian.render(f5);
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