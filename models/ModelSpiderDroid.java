// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class ModelSpiderDroid extends EntityModel {
	private final ModelRenderer spiderdroid;
	private final ModelRenderer body;
	private final ModelRenderer octagon_r2;
	private final ModelRenderer head;
	private final ModelRenderer legs;
	private final ModelRenderer frontleft;
	private final ModelRenderer cube_r11_r1;
	private final ModelRenderer cube_r10_r1;
	private final ModelRenderer cube_r9_r1;
	private final ModelRenderer cube_r8_r1;
	private final ModelRenderer cube_r7_r1;
	private final ModelRenderer cube_r6_r1;
	private final ModelRenderer cube_r5_r1;
	private final ModelRenderer cube_r1_r1;
	private final ModelRenderer frontright;
	private final ModelRenderer cube_r12_r1;
	private final ModelRenderer cube_r11_r2;
	private final ModelRenderer cube_r10_r2;
	private final ModelRenderer cube_r9_r2;
	private final ModelRenderer cube_r8_r2;
	private final ModelRenderer cube_r7_r2;
	private final ModelRenderer cube_r6_r2;
	private final ModelRenderer cube_r2_r1;
	private final ModelRenderer Backright;
	private final ModelRenderer cube_r13_r1;
	private final ModelRenderer cube_r12_r2;
	private final ModelRenderer cube_r11_r3;
	private final ModelRenderer cube_r10_r3;
	private final ModelRenderer cube_r9_r3;
	private final ModelRenderer cube_r8_r3;
	private final ModelRenderer cube_r7_r3;
	private final ModelRenderer cube_r3_r1;
	private final ModelRenderer Backleft;
	private final ModelRenderer cube_r14_r1;
	private final ModelRenderer cube_r13_r2;
	private final ModelRenderer cube_r12_r3;
	private final ModelRenderer cube_r11_r4;
	private final ModelRenderer cube_r10_r4;
	private final ModelRenderer cube_r9_r4;
	private final ModelRenderer cube_r8_r4;
	private final ModelRenderer cube_r4_r1;

	public ModelSpiderDroid() {
		textureWidth = 256;
		textureHeight = 256;

		spiderdroid = new ModelRenderer(this);
		spiderdroid.setRotationPoint(0.0F, 24.0F, 0.0F);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -30.0F, 0.0F);
		spiderdroid.addChild(body);
		body.cubeList.add(new ModelBox(body, 168, 148, -5.0F, 4.0F, -5.0F, 10, 2, 10, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 72, 0, -10.0F, -11.0F, -10.0F, 20, 4, 20, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 96, -8.0F, -7.0F, -8.0F, 16, 2, 16, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 68, 34, -10.0F, -5.0F, -10.0F, 20, 6, 20, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 122, 90, -2.5F, -4.5F, -10.4F, 4, 2, 20, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 120, 120, -2.5F, -4.5F, -9.6F, 4, 2, 20, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 66, 60, -9.6F, -4.5F, -2.5F, 20, 2, 4, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 66, 26, -10.4F, -4.5F, -2.5F, 20, 2, 4, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 66, 66, -11.0F, -1.0F, -11.0F, 22, 2, 22, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -12.0F, 1.0F, -12.0F, 24, 2, 24, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 54, -11.0F, 3.0F, -11.0F, 22, 2, 22, 0.0F, false));

		octagon_r2 = new ModelRenderer(this);
		octagon_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(octagon_r2);
		setRotationAngle(octagon_r2, 0.0F, -0.7854F, 0.0F);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -49.0F, 0.0F);
		spiderdroid.addChild(head);
		head.cubeList.add(new ModelBox(head, 0, 26, -11.0F, 2.0F, -11.0F, 22, 6, 22, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 54, 78, -4.0F, -14.0F, -4.0F, 8, 2, 8, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 16, 16, 1.0F, -15.0F, -3.0F, 2, 2, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 66, 42, -3.5F, -15.5F, -2.5F, 4, 2, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 168, 16, -5.0F, -12.0F, -5.0F, 10, 2, 10, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 164, -9.0F, -13.0F, -7.0F, 4, 2, 14, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 160, 66, 5.0F, -13.0F, -7.0F, 4, 2, 14, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 106, 148, -7.0F, -13.0F, 7.0F, 14, 2, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 132, 16, -7.0F, -13.0F, -9.0F, 14, 2, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 152, 20, -5.0F, -13.0F, 5.0F, 10, 2, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 116, 152, -5.0F, -13.0F, -7.0F, 10, 2, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 30, 158, -13.0F, -11.0F, -7.0F, 4, 2, 14, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 154, 132, 9.0F, -11.0F, -7.0F, 4, 2, 14, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 122, 112, -7.0F, -11.0F, 9.0F, 14, 2, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 68, 108, -7.0F, -11.0F, -13.0F, 14, 2, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 174, 82, -15.0F, -9.0F, -7.0F, 2, 2, 14, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 22, 174, 13.0F, -9.0F, -7.0F, 2, 2, 14, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 198, 54, 11.0F, -9.0F, -11.0F, 2, 2, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 198, 20, 11.0F, -9.0F, 7.0F, 2, 2, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 22, 172, -13.0F, -9.0F, 7.0F, 2, 2, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 52, 166, -13.0F, -9.0F, -11.0F, 2, 2, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 196, 0, 7.0F, -9.0F, -13.0F, 4, 2, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 190, 118, 7.0F, -9.0F, 11.0F, 4, 2, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 82, 184, -11.0F, -9.0F, 11.0F, 4, 2, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 24, 180, -11.0F, -9.0F, -13.0F, 4, 2, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 176, 142, 7.0F, -11.0F, -11.0F, 4, 2, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 172, 8, 7.0F, -11.0F, 9.0F, 4, 2, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 164, 16, -11.0F, -11.0F, 9.0F, 4, 2, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 96, 164, -11.0F, -11.0F, -11.0F, 4, 2, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 30, 164, 7.0F, -11.0F, -9.0F, 4, 2, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 160, 56, 7.0F, -11.0F, 7.0F, 4, 2, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 150, 152, -11.0F, -11.0F, 7.0F, 4, 2, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 54, 88, -11.0F, -11.0F, -9.0F, 4, 2, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 128, 40, -7.0F, -9.0F, 13.0F, 14, 2, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 104, 90, -7.0F, -9.0F, -15.0F, 14, 2, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 172, 108, -17.0F, -7.0F, -7.0F, 2, 4, 14, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 166, 170, 15.0F, -7.0F, -7.0F, 2, 4, 14, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 168, 160, -7.0F, -7.0F, 15.0F, 14, 4, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 168, 28, -7.0F, -7.0F, -17.0F, 14, 4, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 54, 90, -19.0F, -3.0F, -7.0F, 18, 4, 14, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 78, -1.0F, -3.0F, -7.0F, 20, 4, 14, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 132, 0, -7.0F, -3.0F, 7.0F, 14, 4, 12, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 160, 40, -7.0F, 1.0F, -21.0F, 14, 12, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 184, 166, -4.0F, 5.0F, -23.0F, 8, 8, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 142, -2.0F, 7.3F, -40.0F, 4, 4, 18, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 30, 136, -2.0F, 7.3F, -76.0F, 4, 4, 18, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 78, 170, -3.0F, 6.5F, -32.0F, 6, 6, 6, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 94, 94, -1.0F, 8.4F, -61.0F, 2, 2, 24, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 150, 148, -5.0F, 13.0F, -19.0F, 10, 2, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 26, 114, -7.0F, 1.0F, 17.0F, 14, 12, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 60, 144, 17.0F, 1.0F, -7.0F, 4, 12, 14, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 94, 120, 17.5F, 7.0F, -1.0F, 4, 4, 6, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 198, 14, 17.5F, 7.0F, -5.0F, 4, 4, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 196, 178, -21.5F, 7.0F, -5.0F, 4, 4, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 194, 194, -5.0F, 7.0F, 17.5F, 2, 4, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 192, 88, 3.0F, 7.0F, 17.5F, 2, 4, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 122, 102, -3.0F, 2.0F, 17.5F, 6, 4, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 114, 24, -21.5F, 7.0F, -1.0F, 4, 4, 6, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 182, 188, 17.0F, 1.0F, -11.0F, 2, 8, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 174, 84, -19.0F, 1.0F, 7.0F, 2, 8, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 40, 174, -19.0F, 1.0F, -11.0F, 2, 8, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 172, 108, 17.0F, 1.0F, 7.0F, 2, 8, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 168, 170, 15.0F, 1.0F, -15.0F, 2, 8, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 164, -17.0F, 1.0F, 11.0F, 2, 8, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 160, 66, -17.0F, 1.0F, -15.0F, 2, 8, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 116, 156, 15.0F, 1.0F, 11.0F, 2, 8, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 138, 192, 7.0F, 1.0F, -19.0F, 4, 8, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 190, 108, -11.0F, 1.0F, 17.0F, 4, 8, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 190, 98, -11.0F, 1.0F, -19.0F, 4, 8, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 36, 190, 7.0F, 1.0F, 17.0F, 4, 8, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 24, 190, 11.0F, 1.0F, -17.0F, 4, 8, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 144, 170, -15.0F, 1.0F, 15.0F, 4, 8, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 114, 170, -15.0F, 1.0F, -17.0F, 4, 8, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 104, 94, 11.0F, 1.0F, 15.0F, 4, 8, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 128, 142, -21.0F, 1.0F, -7.0F, 4, 12, 14, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 128, 24, -7.0F, -3.0F, -19.0F, 14, 4, 12, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 132, 66, 3.0F, -4.0F, -22.0F, 6, 6, 16, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 148, 152, 0.5F, -1.5F, -20.0F, 2, 2, 16, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 96, 152, -2.5F, -1.5F, -20.0F, 2, 2, 16, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 150, 88, 4.0F, -3.0F, -23.0F, 4, 4, 16, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 148, 112, -8.0F, -3.0F, -23.0F, 4, 4, 16, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 132, 44, -9.0F, -4.0F, -22.0F, 6, 6, 16, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 68, 114, 7.0F, -3.0F, -17.0F, 4, 4, 6, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 98, 108, 7.0F, -3.0F, 11.0F, 4, 4, 6, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 66, 32, -11.0F, -3.0F, 11.0F, 4, 4, 6, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 66, 66, -11.0F, -3.0F, -17.0F, 4, 4, 6, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 196, 126, 11.0F, -3.0F, -15.0F, 4, 4, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 196, 48, 11.0F, -3.0F, 13.0F, 4, 4, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 196, 42, -15.0F, -3.0F, 13.0F, 4, 4, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 138, 184, 7.0F, -3.0F, -11.0F, 10, 4, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 182, 72, 7.0F, -3.0F, 7.0F, 10, 4, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 196, 8, -15.0F, -3.0F, -15.0F, 4, 4, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 172, 0, -17.0F, -3.0F, 7.0F, 10, 4, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 82, 148, -17.0F, -3.0F, -11.0F, 10, 4, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 192, 80, 13.0F, -7.0F, -11.0F, 2, 4, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 192, 34, 13.0F, -7.0F, 7.0F, 2, 4, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 150, 192, -15.0F, -7.0F, 7.0F, 2, 4, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 184, 8, -15.0F, -7.0F, -11.0F, 2, 4, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 82, 114, 11.0F, -7.0F, -13.0F, 2, 4, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 110, 24, 11.0F, -7.0F, 11.0F, 2, 4, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 80, 66, -13.0F, -7.0F, 11.0F, 2, 4, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 80, 32, -13.0F, -7.0F, -13.0F, 2, 4, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 194, 188, 7.0F, -7.0F, -15.0F, 4, 4, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 190, 142, 7.0F, -7.0F, 13.0F, 4, 4, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 184, 178, -11.0F, -7.0F, 13.0F, 4, 4, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 180, 34, -11.0F, -7.0F, -15.0F, 4, 4, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 174, 98, 11.0F, -3.0F, -13.0F, 4, 4, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 154, 11.0F, -3.0F, 11.0F, 4, 4, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 82, 142, -15.0F, -3.0F, 11.0F, 4, 4, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 128, 24, -15.0F, -3.0F, -13.0F, 4, 4, 2, 0.0F, false));

		legs = new ModelRenderer(this);
		legs.setRotationPoint(0.0F, -30.0F, 0.0F);
		spiderdroid.addChild(legs);

		frontleft = new ModelRenderer(this);
		frontleft.setRotationPoint(0.0F, 0.0F, 0.0F);
		legs.addChild(frontleft);

		cube_r11_r1 = new ModelRenderer(this);
		cube_r11_r1.setRotationPoint(-2.7678F, 37.8796F, -25.5166F);
		frontleft.addChild(cube_r11_r1);
		setRotationAngle(cube_r11_r1, -0.48F, -0.7854F, 0.0F);
		cube_r11_r1.cubeList.add(new ModelBox(cube_r11_r1, 70, 184, 18.0F, -54.0F, -22.0F, 4, 26, 4, 0.0F, false));

		cube_r10_r1 = new ModelRenderer(this);
		cube_r10_r1.setRotationPoint(2.6678F, 56.0104F, -56.408F);
		frontleft.addChild(cube_r10_r1);
		setRotationAngle(cube_r10_r1, -0.9599F, -0.7854F, 0.0F);
		cube_r10_r1.cubeList.add(new ModelBox(cube_r10_r1, 174, 188, 37.0F, -62.0F, -40.0F, 2, 22, 2, 0.0F, false));

		cube_r9_r1 = new ModelRenderer(this);
		cube_r9_r1.setRotationPoint(-17.9358F, 56.8526F, -35.8044F);
		frontleft.addChild(cube_r9_r1);
		setRotationAngle(cube_r9_r1, -0.6545F, -0.7854F, 0.0F);
		cube_r9_r1.cubeList.add(new ModelBox(cube_r9_r1, 12, 114, 37.0F, -26.0F, -49.0F, 2, 18, 2, 0.0F, false));

		cube_r8_r1 = new ModelRenderer(this);
		cube_r8_r1.setRotationPoint(-9.9412F, 30.0F, -24.0F);
		frontleft.addChild(cube_r8_r1);
		setRotationAngle(cube_r8_r1, 0.0F, -0.7854F, 0.0F);
		cube_r8_r1.cubeList.add(new ModelBox(cube_r8_r1, 96, 156, 22.0F, -25.2F, -27.0F, 4, 4, 4, 0.0F, false));
		cube_r8_r1.cubeList.add(new ModelBox(cube_r8_r1, 148, 132, 22.0F, -30.4F, -23.0F, 4, 4, 4, 0.0F, false));
		cube_r8_r1.cubeList.add(new ModelBox(cube_r8_r1, 86, 184, 22.0F, -31.0F, -37.0F, 4, 8, 8, 0.0F, false));

		cube_r7_r1 = new ModelRenderer(this);
		cube_r7_r1.setRotationPoint(-13.2548F, 30.0F, -32.0F);
		frontleft.addChild(cube_r7_r1);
		setRotationAngle(cube_r7_r1, 0.0F, -0.7854F, 0.0F);
		cube_r7_r1.cubeList.add(new ModelBox(cube_r7_r1, 0, 0, 31.0F, -5.0F, -33.0F, 2, 0, 0, 0.0F, false));
		cube_r7_r1.cubeList.add(new ModelBox(cube_r7_r1, 150, 142, 29.0048F, -9.0F, -35.0F, 6, 2, 2, 0.0F, false));
		cube_r7_r1.cubeList.add(new ModelBox(cube_r7_r1, 26, 150, 29.0F, -28.5F, -31.5F, 6, 2, 2, 0.0F, false));

		cube_r6_r1 = new ModelRenderer(this);
		cube_r6_r1.setRotationPoint(-10.6988F, 36.3044F, -31.7276F);
		frontleft.addChild(cube_r6_r1);
		setRotationAngle(cube_r6_r1, -0.2182F, -0.7854F, 0.0F);
		cube_r6_r1.cubeList.add(new ModelBox(cube_r6_r1, 78, 78, 29.0F, -36.5F, -37.0F, 2, 4, 2, 0.0F, false));
		cube_r6_r1.cubeList.add(new ModelBox(cube_r6_r1, 0, 114, 29.0F, -32.5F, -38.0F, 2, 16, 4, 0.0F, false));

		cube_r5_r1 = new ModelRenderer(this);
		cube_r5_r1.setRotationPoint(-12.4264F, 30.0F, -30.0F);
		frontleft.addChild(cube_r5_r1);
		setRotationAngle(cube_r5_r1, 0.0F, -0.7854F, 0.0F);
		cube_r5_r1.cubeList.add(new ModelBox(cube_r5_r1, 0, 0, 29.6F, -1.9F, -37.0F, 0, 0, 2, 0.0F, false));
		cube_r5_r1.cubeList.add(new ModelBox(cube_r5_r1, 0, 0, 29.6F, -6.0F, -36.0F, 0, 0, 2, 0.0F, false));
		cube_r5_r1.cubeList.add(new ModelBox(cube_r5_r1, 150, 90, 28.0F, -19.5F, -36.0F, 4, 10, 2, 0.0F, false));
		cube_r5_r1.cubeList.add(new ModelBox(cube_r5_r1, 16, 180, 29.0F, -5.5F, -37.0F, 2, 4, 4, 0.0F, false));
		cube_r5_r1.cubeList.add(new ModelBox(cube_r5_r1, 144, 170, 27.0F, -1.5F, -43.0F, 6, 2, 12, 0.0F, false));
		cube_r5_r1.cubeList.add(new ModelBox(cube_r5_r1, 148, 118, 28.0F, -9.5F, -37.0F, 4, 4, 4, 0.0F, false));

		cube_r1_r1 = new ModelRenderer(this);
		cube_r1_r1.setRotationPoint(-5.799F, 30.0F, -14.0F);
		frontleft.addChild(cube_r1_r1);
		setRotationAngle(cube_r1_r1, 0.0F, -0.7854F, 0.0F);
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 122, 94, 11.0F, -29.5F, -17.5F, 6, 4, 4, 0.0F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 94, 120, 13.0F, -30.0F, -34.0F, 2, 6, 22, 0.0F, false));

		frontright = new ModelRenderer(this);
		frontright.setRotationPoint(0.0F, 0.0F, 0.0F);
		legs.addChild(frontright);

		cube_r12_r1 = new ModelRenderer(this);
		cube_r12_r1.setRotationPoint(2.7678F, 37.8796F, -25.5166F);
		frontright.addChild(cube_r12_r1);
		setRotationAngle(cube_r12_r1, -0.48F, 0.7854F, 0.0F);
		cube_r12_r1.cubeList.add(new ModelBox(cube_r12_r1, 54, 184, -22.0F, -54.0F, -22.0F, 4, 26, 4, 0.0F, false));

		cube_r11_r2 = new ModelRenderer(this);
		cube_r11_r2.setRotationPoint(-2.6678F, 56.0104F, -56.408F);
		frontright.addChild(cube_r11_r2);
		setRotationAngle(cube_r11_r2, -0.9599F, 0.7854F, 0.0F);
		cube_r11_r2.cubeList.add(new ModelBox(cube_r11_r2, 166, 188, -39.0F, -62.0F, -40.0F, 2, 22, 2, 0.0F, false));

		cube_r10_r2 = new ModelRenderer(this);
		cube_r10_r2.setRotationPoint(17.9358F, 56.8526F, -35.8044F);
		frontright.addChild(cube_r10_r2);
		setRotationAngle(cube_r10_r2, -0.6545F, 0.7854F, 0.0F);
		cube_r10_r2.cubeList.add(new ModelBox(cube_r10_r2, 84, 0, -39.0F, -26.0F, -49.0F, 2, 18, 2, 0.0F, false));

		cube_r9_r2 = new ModelRenderer(this);
		cube_r9_r2.setRotationPoint(9.9412F, 30.0F, -24.0F);
		frontright.addChild(cube_r9_r2);
		setRotationAngle(cube_r9_r2, 0.0F, 0.7854F, 0.0F);
		cube_r9_r2.cubeList.add(new ModelBox(cube_r9_r2, 56, 146, -26.0F, -25.2F, -27.0F, 4, 4, 4, 0.0F, false));
		cube_r9_r2.cubeList.add(new ModelBox(cube_r9_r2, 26, 142, -26.0F, -30.4F, -23.0F, 4, 4, 4, 0.0F, false));
		cube_r9_r2.cubeList.add(new ModelBox(cube_r9_r2, 182, 56, -26.0F, -31.0F, -37.0F, 4, 8, 8, 0.0F, false));

		cube_r8_r2 = new ModelRenderer(this);
		cube_r8_r2.setRotationPoint(13.2548F, 30.0F, -32.0F);
		frontright.addChild(cube_r8_r2);
		setRotationAngle(cube_r8_r2, 0.0F, 0.7854F, 0.0F);
		cube_r8_r2.cubeList.add(new ModelBox(cube_r8_r2, 0, 0, -33.0F, -5.0F, -33.0F, 2, 0, 0, 0.0F, false));
		cube_r8_r2.cubeList.add(new ModelBox(cube_r8_r2, 120, 136, -35.0048F, -9.0F, -35.0F, 6, 2, 2, 0.0F, false));
		cube_r8_r2.cubeList.add(new ModelBox(cube_r8_r2, 94, 130, -35.0F, -28.5F, -31.5F, 6, 2, 2, 0.0F, false));

		cube_r7_r2 = new ModelRenderer(this);
		cube_r7_r2.setRotationPoint(10.6988F, 36.3044F, -31.7276F);
		frontright.addChild(cube_r7_r2);
		setRotationAngle(cube_r7_r2, -0.2182F, 0.7854F, 0.0F);
		cube_r7_r2.cubeList.add(new ModelBox(cube_r7_r2, 54, 78, -31.0F, -36.5F, -37.0F, 2, 4, 2, 0.0F, false));
		cube_r7_r2.cubeList.add(new ModelBox(cube_r7_r2, 72, 0, -31.0F, -32.5F, -38.0F, 2, 16, 4, 0.0F, false));

		cube_r6_r2 = new ModelRenderer(this);
		cube_r6_r2.setRotationPoint(12.4264F, 30.0F, -30.0F);
		frontright.addChild(cube_r6_r2);
		setRotationAngle(cube_r6_r2, 0.0F, 0.7854F, 0.0F);
		cube_r6_r2.cubeList.add(new ModelBox(cube_r6_r2, 0, 0, -29.6F, -1.9F, -37.0F, 0, 0, 2, 0.0F, false));
		cube_r6_r2.cubeList.add(new ModelBox(cube_r6_r2, 0, 0, -29.6F, -6.0F, -36.0F, 0, 0, 2, 0.0F, false));
		cube_r6_r2.cubeList.add(new ModelBox(cube_r6_r2, 0, 142, -32.0F, -19.5F, -36.0F, 4, 10, 2, 0.0F, false));
		cube_r6_r2.cubeList.add(new ModelBox(cube_r6_r2, 176, 56, -31.0F, -5.5F, -37.0F, 2, 4, 4, 0.0F, false));
		cube_r6_r2.cubeList.add(new ModelBox(cube_r6_r2, 90, 170, -33.0F, -1.5F, -43.0F, 6, 2, 12, 0.0F, false));
		cube_r6_r2.cubeList.add(new ModelBox(cube_r6_r2, 56, 138, -32.0F, -9.5F, -37.0F, 4, 4, 4, 0.0F, false));

		cube_r2_r1 = new ModelRenderer(this);
		cube_r2_r1.setRotationPoint(5.799F, 30.0F, -14.0F);
		frontright.addChild(cube_r2_r1);
		setRotationAngle(cube_r2_r1, 0.0F, 0.7854F, 0.0F);
		cube_r2_r1.cubeList.add(new ModelBox(cube_r2_r1, 120, 120, -17.0F, -29.5F, -17.5F, 6, 4, 4, 0.0F, false));
		cube_r2_r1.cubeList.add(new ModelBox(cube_r2_r1, 68, 114, -15.0F, -30.0F, -34.0F, 2, 6, 22, 0.0F, false));

		Backright = new ModelRenderer(this);
		Backright.setRotationPoint(0.0F, 0.0F, 0.0F);
		legs.addChild(Backright);

		cube_r13_r1 = new ModelRenderer(this);
		cube_r13_r1.setRotationPoint(2.7678F, 37.8796F, 25.5166F);
		Backright.addChild(cube_r13_r1);
		setRotationAngle(cube_r13_r1, 0.48F, -0.7854F, 0.0F);
		cube_r13_r1.cubeList.add(new ModelBox(cube_r13_r1, 122, 182, -22.0F, -54.0F, 18.0F, 4, 26, 4, 0.0F, false));

		cube_r12_r2 = new ModelRenderer(this);
		cube_r12_r2.setRotationPoint(-2.6678F, 56.0104F, 56.408F);
		Backright.addChild(cube_r12_r2);
		setRotationAngle(cube_r12_r2, 0.9599F, -0.7854F, 0.0F);
		cube_r12_r2.cubeList.add(new ModelBox(cube_r12_r2, 16, 188, -39.0F, -62.0F, 38.0F, 2, 22, 2, 0.0F, false));

		cube_r11_r3 = new ModelRenderer(this);
		cube_r11_r3.setRotationPoint(17.9358F, 56.8526F, 35.8044F);
		Backright.addChild(cube_r11_r3);
		setRotationAngle(cube_r11_r3, 0.6545F, -0.7854F, 0.0F);
		cube_r11_r3.cubeList.add(new ModelBox(cube_r11_r3, 12, 54, -39.0F, -26.0F, 47.0F, 2, 18, 2, 0.0F, false));

		cube_r10_r3 = new ModelRenderer(this);
		cube_r10_r3.setRotationPoint(9.9412F, 30.0F, 24.0F);
		Backright.addChild(cube_r10_r3);
		setRotationAngle(cube_r10_r3, 0.0F, -0.7854F, 0.0F);
		cube_r10_r3.cubeList.add(new ModelBox(cube_r10_r3, 132, 74, -26.0F, -25.2F, 23.0F, 4, 4, 4, 0.0F, false));
		cube_r10_r3.cubeList.add(new ModelBox(cube_r10_r3, 132, 66, -26.0F, -30.4F, 19.0F, 4, 4, 4, 0.0F, false));
		cube_r10_r3.cubeList.add(new ModelBox(cube_r10_r3, 180, 126, -26.0F, -31.0F, 29.0F, 4, 8, 8, 0.0F, false));

		cube_r9_r3 = new ModelRenderer(this);
		cube_r9_r3.setRotationPoint(13.2548F, 30.0F, 32.0F);
		Backright.addChild(cube_r9_r3);
		setRotationAngle(cube_r9_r3, 0.0F, -0.7854F, 0.0F);
		cube_r9_r3.cubeList.add(new ModelBox(cube_r9_r3, 0, 0, -33.0F, -5.0F, 33.0F, 2, 0, 0, 0.0F, false));
		cube_r9_r3.cubeList.add(new ModelBox(cube_r9_r3, 26, 130, -35.0048F, -9.0F, 33.0F, 6, 2, 2, 0.0F, false));
		cube_r9_r3.cubeList.add(new ModelBox(cube_r9_r3, 68, 124, -35.0F, -28.5F, 29.5F, 6, 2, 2, 0.0F, false));

		cube_r8_r3 = new ModelRenderer(this);
		cube_r8_r3.setRotationPoint(10.6988F, 36.3044F, 31.7276F);
		Backright.addChild(cube_r8_r3);
		setRotationAngle(cube_r8_r3, 0.2182F, -0.7854F, 0.0F);
		cube_r8_r3.cubeList.add(new ModelBox(cube_r8_r3, 16, 0, -31.0F, -36.5F, 35.0F, 2, 4, 2, 0.0F, false));
		cube_r8_r3.cubeList.add(new ModelBox(cube_r8_r3, 0, 54, -31.0F, -32.5F, 34.0F, 2, 16, 4, 0.0F, false));

		cube_r7_r3 = new ModelRenderer(this);
		cube_r7_r3.setRotationPoint(12.4264F, 30.0F, 30.0F);
		Backright.addChild(cube_r7_r3);
		setRotationAngle(cube_r7_r3, 0.0F, -0.7854F, 0.0F);
		cube_r7_r3.cubeList.add(new ModelBox(cube_r7_r3, 0, 0, -29.6F, -1.9F, 35.0F, 0, 0, 2, 0.0F, false));
		cube_r7_r3.cubeList.add(new ModelBox(cube_r7_r3, 0, 0, -29.6F, -6.0F, 34.0F, 0, 0, 2, 0.0F, false));
		cube_r7_r3.cubeList.add(new ModelBox(cube_r7_r3, 132, 0, -32.0F, -19.5F, 34.0F, 4, 10, 2, 0.0F, false));
		cube_r7_r3.cubeList.add(new ModelBox(cube_r7_r3, 52, 174, -31.0F, -5.5F, 33.0F, 2, 4, 4, 0.0F, false));
		cube_r7_r3.cubeList.add(new ModelBox(cube_r7_r3, 54, 170, -33.0F, -1.5F, 31.0F, 6, 2, 12, 0.0F, false));
		cube_r7_r3.cubeList.add(new ModelBox(cube_r7_r3, 128, 44, -32.0F, -9.5F, 33.0F, 4, 4, 4, 0.0F, false));

		cube_r3_r1 = new ModelRenderer(this);
		cube_r3_r1.setRotationPoint(5.799F, 30.0F, 14.0F);
		Backright.addChild(cube_r3_r1);
		setRotationAngle(cube_r3_r1, 0.0F, -0.7854F, 0.0F);
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 48, 96, -17.0F, -29.5F, 13.5F, 6, 4, 4, 0.0F, false));
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 0, 114, -15.0F, -30.0F, 12.0F, 2, 6, 22, 0.0F, false));

		Backleft = new ModelRenderer(this);
		Backleft.setRotationPoint(0.0F, 0.0F, 0.0F);
		legs.addChild(Backleft);

		cube_r14_r1 = new ModelRenderer(this);
		cube_r14_r1.setRotationPoint(-2.7678F, 37.8796F, 25.5166F);
		Backleft.addChild(cube_r14_r1);
		setRotationAngle(cube_r14_r1, 0.48F, 0.7854F, 0.0F);
		cube_r14_r1.cubeList.add(new ModelBox(cube_r14_r1, 0, 180, 18.0F, -54.0F, 18.0F, 4, 26, 4, 0.0F, false));

		cube_r13_r2 = new ModelRenderer(this);
		cube_r13_r2.setRotationPoint(2.6678F, 56.0104F, 56.408F);
		Backleft.addChild(cube_r13_r2);
		setRotationAngle(cube_r13_r2, 0.9599F, 0.7854F, 0.0F);
		cube_r13_r2.cubeList.add(new ModelBox(cube_r13_r2, 110, 184, 37.0F, -62.0F, 38.0F, 2, 22, 2, 0.0F, false));

		cube_r12_r3 = new ModelRenderer(this);
		cube_r12_r3.setRotationPoint(-17.9358F, 56.8526F, 35.8044F);
		Backleft.addChild(cube_r12_r3);
		setRotationAngle(cube_r12_r3, 0.6545F, 0.7854F, 0.0F);
		cube_r12_r3.cubeList.add(new ModelBox(cube_r12_r3, 12, 26, 37.0F, -26.0F, 47.0F, 2, 18, 2, 0.0F, false));

		cube_r11_r4 = new ModelRenderer(this);
		cube_r11_r4.setRotationPoint(-9.9412F, 30.0F, 24.0F);
		Backleft.addChild(cube_r11_r4);
		setRotationAngle(cube_r11_r4, 0.0F, 0.7854F, 0.0F);
		cube_r11_r4.cubeList.add(new ModelBox(cube_r11_r4, 120, 128, 22.0F, -25.2F, 23.0F, 4, 4, 4, 0.0F, false));
		cube_r11_r4.cubeList.add(new ModelBox(cube_r11_r4, 0, 104, 22.0F, -30.4F, 19.0F, 4, 4, 4, 0.0F, false));
		cube_r11_r4.cubeList.add(new ModelBox(cube_r11_r4, 0, 0, 22.0F, -31.0F, 29.0F, 4, 8, 8, 0.0F, false));

		cube_r10_r4 = new ModelRenderer(this);
		cube_r10_r4.setRotationPoint(-13.2548F, 30.0F, 32.0F);
		Backleft.addChild(cube_r10_r4);
		setRotationAngle(cube_r10_r4, 0.0F, 0.7854F, 0.0F);
		cube_r10_r4.cubeList.add(new ModelBox(cube_r10_r4, 0, 0, 31.0F, -5.0F, 33.0F, 2, 0, 0, 0.0F, false));
		cube_r10_r4.cubeList.add(new ModelBox(cube_r10_r4, 110, 60, 29.0048F, -9.0F, 33.0F, 6, 2, 2, 0.0F, false));
		cube_r10_r4.cubeList.add(new ModelBox(cube_r10_r4, 48, 108, 29.0F, -28.5F, 29.5F, 6, 2, 2, 0.0F, false));

		cube_r9_r4 = new ModelRenderer(this);
		cube_r9_r4.setRotationPoint(-10.6988F, 36.3044F, 31.7276F);
		Backleft.addChild(cube_r9_r4);
		setRotationAngle(cube_r9_r4, 0.2182F, 0.7854F, 0.0F);
		cube_r9_r4.cubeList.add(new ModelBox(cube_r9_r4, 0, 0, 29.0F, -36.5F, 35.0F, 2, 4, 2, 0.0F, false));
		cube_r9_r4.cubeList.add(new ModelBox(cube_r9_r4, 0, 26, 29.0F, -32.5F, 34.0F, 2, 16, 4, 0.0F, false));

		cube_r8_r4 = new ModelRenderer(this);
		cube_r8_r4.setRotationPoint(-12.4264F, 30.0F, 30.0F);
		Backleft.addChild(cube_r8_r4);
		setRotationAngle(cube_r8_r4, 0.0F, 0.7854F, 0.0F);
		cube_r8_r4.cubeList.add(new ModelBox(cube_r8_r4, 0, 0, 29.6F, -1.9F, 35.0F, 0, 0, 2, 0.0F, false));
		cube_r8_r4.cubeList.add(new ModelBox(cube_r8_r4, 0, 0, 29.6F, -6.0F, 34.0F, 0, 0, 2, 0.0F, false));
		cube_r8_r4.cubeList.add(new ModelBox(cube_r8_r4, 0, 78, 28.0F, -19.5F, 34.0F, 4, 10, 2, 0.0F, false));
		cube_r8_r4.cubeList.add(new ModelBox(cube_r8_r4, 22, 164, 29.0F, -5.5F, 33.0F, 2, 4, 4, 0.0F, false));
		cube_r8_r4.cubeList.add(new ModelBox(cube_r8_r4, 120, 168, 27.0F, -1.5F, 31.0F, 6, 2, 12, 0.0F, false));
		cube_r8_r4.cubeList.add(new ModelBox(cube_r8_r4, 0, 96, 28.0F, -9.5F, 33.0F, 4, 4, 4, 0.0F, false));

		cube_r4_r1 = new ModelRenderer(this);
		cube_r4_r1.setRotationPoint(-5.799F, 30.0F, 14.0F);
		Backleft.addChild(cube_r4_r1);
		setRotationAngle(cube_r4_r1, 0.0F, 0.7854F, 0.0F);
		cube_r4_r1.cubeList.add(new ModelBox(cube_r4_r1, 0, 16, 11.0F, -29.5F, 13.5F, 6, 4, 4, 0.0F, false));
		cube_r4_r1.cubeList.add(new ModelBox(cube_r4_r1, 42, 108, 13.0F, -30.0F, 12.0F, 2, 6, 22, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		spiderdroid.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}