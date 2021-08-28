// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class Modelatrt extends EntityModel {
	private final ModelRenderer AT_RT;
	private final ModelRenderer RightLeg;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer MainChasis;
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
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;

	public Modelatrt() {
		textureWidth = 256;
		textureHeight = 256;

		AT_RT = new ModelRenderer(this);
		AT_RT.setRotationPoint(0.0F, 24.0F, 0.0F);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-15.0F, -49.5F, -4.5F);
		AT_RT.addChild(RightLeg);
		RightLeg.cubeList.add(new ModelBox(RightLeg, 120, 106, -3.0F, 1.0F, 17.0F, 5, 4, 4, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 107, 76, -2.0F, -3.5F, -3.5F, 3, 7, 7, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 107, 17, -2.0F, -0.5F, 15.5F, 3, 7, 7, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 16, 120, -2.0F, 23.5F, 24.5F, 3, 6, 6, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 125, 27, -2.0F, 46.5F, 16.5F, 3, 3, 4, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 73, 41, -2.0F, 47.5F, 12.5F, 3, 2, 4, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 125, 0, -3.0F, 48.5F, 12.5F, 1, 1, 6, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 124, 39, 1.0F, 48.5F, 12.5F, 1, 1, 6, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 115, 119, -4.0F, 48.5F, 12.5F, 1, 1, 4, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 112, 49, 2.0F, 48.5F, 12.5F, 1, 1, 4, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 44, 13, -5.0F, 48.5F, 12.5F, 1, 1, 2, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 30, 35, 3.0F, 48.5F, 12.5F, 1, 1, 2, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 50, 48, -4.5F, 48.5F, 11.5F, 2, 1, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 50, 46, 1.5F, 48.5F, 11.5F, 2, 1, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 74, 87, -5.0F, 48.5F, 10.5F, 3, 1, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 26, 75, 1.0F, 48.5F, 10.5F, 3, 1, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 74, 83, -4.0F, 48.5F, 8.5F, 2, 1, 2, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 44, 82, 1.0F, 48.5F, 8.5F, 2, 1, 2, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 75, 55, -2.0F, 46.5F, 12.5F, 3, 1, 2, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 6, 42, -1.0F, 48.5F, 7.0F, 1, 1, 3, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 38, 75, -2.5F, 47.0F, 17.0F, 4, 1, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 56, 73, -2.5F, 46.75F, 13.0F, 4, 1, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 120, 10, -1.25F, -2.5F, -2.5F, 3, 5, 5, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 56, 78, -2.75F, -2.5F, -2.5F, 3, 5, 5, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 110, 10, -0.5F, 0.5F, 10.0F, 2, 3, 3, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.0F, 49.5F, 2.5F);
		RightLeg.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.5672F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 15, 82, 0.5F, 3.2127F, 6.6566F, 2, 1, 4, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.0F, 47.5F, 16.5F);
		RightLeg.addChild(cube_r2);
		setRotationAngle(cube_r2, 1.1781F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 83, 119, -0.25F, 1.5F, 12.0F, 2, 2, 8, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 118, 118, -0.75F, 1.5761F, 11.6173F, 2, 2, 8, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 75, 33, -0.5F, 1.0761F, 0.6173F, 2, 3, 14, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 69, 99, -0.5F, 0.5761F, 14.6173F, 2, 4, 9, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.0F, 2.5F, 16.5F);
		RightLeg.addChild(cube_r3);
		setRotationAngle(cube_r3, -1.1781F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 60, 0, 0.0F, -2.0F, 6.0F, 2, 1, 16, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 59, 59, -1.0F, -2.0F, 6.0F, 2, 1, 16, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 26, -0.5F, -3.5F, 9.0F, 2, 4, 16, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 56, 94, -0.5F, -4.0F, 0.0F, 2, 5, 9, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.0F, 2.5F, 2.5F);
		RightLeg.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 97, 97, 0.0F, -2.0F, 2.0F, 2, 1, 10, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 96, 6, -1.0F, -2.0F, 2.0F, 2, 1, 10, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 42, -0.5F, -4.0F, 0.0F, 2, 5, 15, 0.0F, false));

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(15.0F, -49.5F, -4.5F);
		AT_RT.addChild(LeftLeg);
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 95, 119, -2.0F, 1.0F, 17.0F, 5, 4, 4, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 84, 105, -1.0F, -3.5F, -3.5F, 3, 7, 7, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 39, 105, -1.0F, -0.5F, 15.5F, 3, 7, 7, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 38, 119, -1.0F, 23.5F, 24.5F, 3, 6, 6, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 63, 112, -1.0F, 46.5F, 16.5F, 3, 3, 4, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 72, -1.0F, 47.5F, 12.5F, 3, 2, 4, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 99, 17, 2.0F, 48.5F, 12.5F, 1, 1, 6, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 73, 33, -2.0F, 48.5F, 12.5F, 1, 1, 6, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 17, 110, 3.0F, 48.5F, 12.5F, 1, 1, 4, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 41, 100, -3.0F, 48.5F, 12.5F, 1, 1, 4, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 10, 35, 4.0F, 48.5F, 12.5F, 1, 1, 2, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 12, 3, -4.0F, 48.5F, 12.5F, 1, 1, 2, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 50, 50, 2.5F, 48.5F, 11.5F, 2, 1, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 38, 50, -3.5F, 48.5F, 11.5F, 2, 1, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 73, 23, 2.0F, 48.5F, 10.5F, 3, 1, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 66, 73, -4.0F, 48.5F, 10.5F, 3, 1, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 23, 82, 2.0F, 48.5F, 8.5F, 2, 1, 2, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 81, 36, -3.0F, 48.5F, 8.5F, 2, 1, 2, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 18, 75, -1.0F, 46.5F, 12.5F, 3, 1, 2, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 32, 22, 0.0F, 48.5F, 7.0F, 1, 1, 3, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 44, 63, -1.5F, 47.0F, 17.0F, 4, 1, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 40, 40, -1.5F, 46.75F, 13.0F, 4, 1, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 38, 65, -1.75F, -2.5F, -2.5F, 3, 5, 5, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 18, 65, -0.25F, -2.5F, -2.5F, 3, 5, 5, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 84, -1.5F, 0.5F, 9.0F, 2, 3, 3, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(2.0F, 49.5F, 2.5F);
		LeftLeg.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.5672F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 79, -2.5F, 3.2127F, 6.6566F, 2, 1, 4, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(1.0F, 47.5F, 16.5F);
		LeftLeg.addChild(cube_r6);
		setRotationAngle(cube_r6, 1.1781F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 112, 39, -1.75F, 1.5F, 12.0F, 2, 2, 8, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 71, 112, -1.25F, 1.5761F, 11.6173F, 2, 2, 8, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 20, 65, -1.5F, 1.0761F, 0.6173F, 2, 3, 14, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 97, -1.5F, 0.5761F, 14.6173F, 2, 4, 9, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(1.0F, 2.5F, 16.5F);
		LeftLeg.addChild(cube_r7);
		setRotationAngle(cube_r7, -1.1781F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 53, 24, -2.0F, -2.0F, 6.0F, 2, 1, 16, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 18, 46, -1.0F, -2.0F, 6.0F, 2, 1, 16, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 22, -1.5F, -3.5F, 9.0F, 2, 4, 16, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 60, 41, -1.5F, -4.0F, 0.0F, 2, 5, 9, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(1.0F, 2.5F, 2.5F);
		LeftLeg.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.1309F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 74, 76, -2.0F, -2.0F, 2.0F, 2, 1, 10, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 45, 0, -1.0F, -2.0F, 2.0F, 2, 1, 10, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 41, 41, -1.5F, -4.0F, 0.0F, 2, 5, 15, 0.0F, false));

		MainChasis = new ModelRenderer(this);
		MainChasis.setRotationPoint(0.0F, 0.0F, 0.0F);
		AT_RT.addChild(MainChasis);
		MainChasis.cubeList.add(new ModelBox(MainChasis, 13, 97, 11.25F, -51.5F, -6.5F, 3, 4, 4, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 19, 46, -14.25F, -51.5F, -6.5F, 3, 4, 4, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 0, 62, 9.25F, -52.0F, -7.0F, 3, 5, 5, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 59, 0, -12.25F, -52.0F, -7.0F, 3, 5, 5, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 56, 61, 7.25F, -52.5F, -7.5F, 3, 6, 6, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 0, 0, -10.25F, -52.5F, -7.5F, 3, 6, 6, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 93, 33, 4.25F, -53.0F, -8.0F, 4, 7, 7, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 88, 69, -8.25F, -53.0F, -8.0F, 4, 7, 7, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 73, 17, -4.5F, -53.5F, -8.5F, 9, 8, 8, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 22, 100, -3.5F, -62.0F, -0.5F, 7, 5, 5, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 0, 0, -3.0F, -65.0F, -2.5F, 6, 3, 19, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 103, 69, -4.0F, -65.25F, 10.5F, 8, 3, 4, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 79, 50, -3.0F, -64.0F, -14.5F, 6, 8, 8, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 18, 63, -6.0F, -58.0F, -12.5F, 12, 1, 1, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 69, 94, 4.0F, -57.5F, -11.5F, 3, 1, 4, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 80, 0, 7.0F, -59.5F, -11.5F, 1, 5, 3, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 60, 41, -8.0F, -59.5F, -11.5F, 1, 5, 3, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 60, 17, -7.0F, -57.5F, -11.5F, 3, 1, 4, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 0, 110, -3.0F, -70.0F, -14.5F, 6, 6, 5, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 95, 0, -3.5F, -66.0F, -13.5F, 7, 3, 3, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 28, 82, -3.0F, -70.0F, -18.5F, 6, 14, 4, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 45, 0, -1.0F, -65.0F, -21.5F, 2, 8, 2, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 31, 6, -1.5F, -55.0F, -22.0F, 3, 3, 3, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 31, 0, -1.0F, -54.5F, -24.0F, 2, 2, 4, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 122, 96, -1.0F, -54.5F, -40.0F, 2, 2, 6, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 0, 0, -0.5F, -57.0F, -21.5F, 1, 2, 2, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 111, 96, -0.5F, -54.0F, -19.5F, 1, 1, 9, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 12, 0, -0.5F, -53.0F, -15.5F, 1, 1, 2, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 10, 12, -1.0F, -53.5F, -11.5F, 2, 2, 2, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 0, 62, -0.5F, -52.0F, -26.5F, 1, 1, 16, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 38, 61, -0.5F, -54.0F, -38.5F, 1, 1, 16, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 19, 54, -3.0F, -68.0F, -19.5F, 6, 2, 1, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 31, 0, 3.0F, -64.0F, -2.5F, 1, 1, 12, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 31, 0, -4.0F, -64.0F, -2.5F, 1, 1, 12, 0.0F, true));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 31, 13, -2.5F, -70.25F, 16.55F, 5, 1, 3, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 81, 33, -1.0F, -70.5F, 17.05F, 2, 1, 2, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 52, 78, -0.5F, -103.0F, 17.55F, 1, 33, 1, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 15, 87, 1.7F, -70.0F, 16.55F, 1, 1, 4, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 70, 18, -2.7F, -70.0F, 16.55F, 1, 1, 4, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 108, 31, -2.5F, -66.0F, 4.5F, 5, 1, 7, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 60, 11, -2.5F, -68.0F, 11.5F, 5, 3, 2, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 107, 90, -4.5F, -61.0F, 0.5F, 9, 3, 3, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 121, 49, -1.5F, -61.0F, 2.5F, 3, 3, 5, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 0, 12, -1.5F, -61.0F, 9.5F, 3, 3, 4, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 31, 17, -2.5F, -60.75F, 6.0F, 5, 1, 1, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 0, 79, 2.5F, -60.75F, 5.0F, 1, 5, 13, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 59, 76, -3.5F, -60.75F, 5.0F, 1, 5, 13, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 0, 14, 2.5F, -56.75F, 4.0F, 1, 1, 1, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 0, 12, -3.5F, -56.75F, 4.0F, 1, 1, 1, 0.0F, false));
		MainChasis.cubeList.add(new ModelBox(MainChasis, 51, 111, -1.0F, -60.5F, 6.5F, 2, 2, 8, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(1.75F, -60.0F, 28.0F);
		MainChasis.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.6545F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 110, 0, -3.75F, 2.6F, -16.5F, 4, 3, 7, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(1.75F, -65.0F, -5.0F);
		MainChasis.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.3491F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 111, 57, -3.75F, 3.0F, 9.5F, 4, 2, 7, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-2.75F, -53.0F, 2.0F);
		MainChasis.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.9599F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 120, 69, 0.0F, 2.0F, 15.5F, 1, 2, 7, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 79, 66, 4.5F, 2.0F, 15.5F, 1, 2, 7, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(1.25F, -80.0F, -27.0F);
		MainChasis.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.1745F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 74, 76, -2.75F, 1.0F, 16.25F, 3, 5, 2, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(3.25F, -83.0F, -30.0F);
		MainChasis.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.1745F, 0.0F, 0.0F);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-3.25F, -54.0F, -36.0F);
		MainChasis.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.1745F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 72, 122, -0.25F, -9.0F, 16.25F, 1, 10, 4, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 42, 5.75F, -9.0F, 16.25F, 1, 10, 4, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(3.75F, -78.0F, -33.0F);
		MainChasis.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.5672F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 87, 87, -7.75F, -9.0F, 16.25F, 8, 14, 2, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(12.25F, -62.0F, -31.0F);
		MainChasis.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, -0.6109F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 108, 31, 3.75F, -3.0F, 16.5F, 2, 6, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 97, 3.75F, -9.0F, 16.5F, 3, 6, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 20, 22, -1.25F, -9.0F, 16.5F, 5, 14, 1, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-12.25F, -62.0F, -31.0F);
		MainChasis.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.6109F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 93, 33, -5.75F, -3.0F, 16.5F, 2, 6, 1, 0.0F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 56, 94, -6.75F, -9.0F, 16.5F, 3, 6, 1, 0.0F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 22, -3.75F, -9.0F, 16.5F, 5, 14, 1, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.75F, -51.0F, -19.0F);
		MainChasis.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.7854F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 22, 110, -1.75F, -0.5F, 13.25F, 2, 1, 9, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 99, 47, -1.75F, -1.75F, 13.25F, 2, 1, 9, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 98, 57, -1.75F, -5.0F, 13.25F, 2, 3, 9, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 80, 0, -2.25F, -6.0F, 13.0F, 3, 7, 9, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 41, 13, -3.25F, -13.0F, 12.5F, 5, 18, 9, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 88, 66, -3.75F, -4.0F, 18.5F, 1, 5, 2, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 79, 66, 1.25F, -4.0F, 18.5F, 1, 5, 2, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(2.75F, -70.0F, -25.0F);
		MainChasis.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.1745F, 0.0F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 38, 48, 0.25F, 0.0F, 21.0F, 2, 1, 1, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 38, 46, -7.75F, 0.0F, 21.0F, 2, 1, 1, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 106, 121, 0.75F, 0.0F, 14.0F, 1, 1, 7, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 56, 121, -7.25F, 0.0F, 14.0F, 1, 1, 7, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 43, 17, -0.25F, 0.0F, 13.0F, 2, 1, 1, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 4, -7.25F, 0.0F, 13.0F, 2, 1, 1, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(1.75F, -53.0F, -5.0F);
		MainChasis.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.9599F, 0.0F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 121, -3.75F, 0.0F, 4.5F, 4, 4, 4, 0.0F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 38, 46, -3.25F, 0.5F, -1.5F, 3, 3, 6, 0.0F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 104, 108, -4.25F, -0.5F, -2.5F, 5, 5, 6, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		AT_RT.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}