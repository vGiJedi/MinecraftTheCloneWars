// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class ModelCommando_Droid extends EntityModel {
	private final ModelRenderer CommandoDroid;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer RightLeg;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer Chest;
	private final ModelRenderer cube_r14;
	private final ModelRenderer LeftArm;
	private final ModelRenderer cube_r15;
	private final ModelRenderer RightArm;
	private final ModelRenderer cube_r16;
	private final ModelRenderer Head;
	private final ModelRenderer cube_r12_r1;
	private final ModelRenderer cube_r11_r1;
	private final ModelRenderer cube_r13_r1;

	public ModelCommando_Droid() {
		textureWidth = 64;
		textureHeight = 64;

		CommandoDroid = new ModelRenderer(this);
		CommandoDroid.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(CommandoDroid, 0.0436F, 0.0F, 0.0F);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(3.0F, -18.0F, 3.0F);
		CommandoDroid.addChild(LeftLeg);
		setRotationAngle(LeftLeg, 0.0873F, 0.0F, 0.0F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 9.0F, -1.0F);
		LeftLeg.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 4, 38, -1.0F, -10.5F, 0.55F, 1, 4, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 25, -1.0F, -10.5F, -0.45F, 1, 8, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 20, -1.0F, -10.5F, -1.45F, 1, 11, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 10.0F, -1.0F);
		LeftLeg.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 37, 35, -1.5F, -1.0F, -1.55F, 2, 1, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 17.0F, -1.0F);
		LeftLeg.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.0873F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 4, -1.0F, -7.0F, -2.0F, 1, 7, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 26, 22, -1.5F, -0.5F, -2.8F, 2, 1, 2, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 17.0F, -2.0F);
		LeftLeg.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 9, 19, -1.0F, -0.25F, -2.8F, 1, 1, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 18.0F, -2.0F);
		LeftLeg.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 14, 15, -2.0F, -1.0F, -3.65F, 3, 1, 4, 0.0F, false));

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-3.0F, -18.0F, 3.0F);
		CommandoDroid.addChild(RightLeg);
		setRotationAngle(RightLeg, 0.0873F, 0.0F, 0.0F);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 9.0F, -1.0F);
		RightLeg.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.0873F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 18, 39, 0.0F, -10.5F, 0.55F, 1, 4, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 28, 28, 0.0F, -10.5F, -0.45F, 1, 8, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 16, 24, 0.0F, -10.5F, -1.45F, 1, 11, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 10.0F, -1.0F);
		RightLeg.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.0873F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 40, 2, -0.5F, -1.0F, -1.55F, 2, 1, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 17.0F, -1.0F);
		RightLeg.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 4, 30, 0.0F, -7.0F, -1.9F, 1, 7, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 29, 13, -0.5F, -0.5F, -2.8F, 2, 1, 2, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 18.0F, -2.0F);
		RightLeg.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.0873F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 18, 8, -1.0F, -1.0F, -3.65F, 3, 1, 4, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 17.0F, -2.0F);
		RightLeg.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.0873F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 29, 42, 0.0F, -0.25F, -2.8F, 1, 1, 1, 0.0F, false));

		Chest = new ModelRenderer(this);
		Chest.setRotationPoint(0.0F, 0.0F, 0.0F);
		CommandoDroid.addChild(Chest);
		Chest.cubeList.add(new ModelBox(Chest, 16, 20, -1.5F, -20.25F, 1.55F, 3, 1, 3, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 31, 40, -1.0F, -21.25F, 3.0F, 2, 1, 1, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 41, 30, -0.5F, -21.25F, 2.0F, 1, 1, 1, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 38, 26, -0.5F, -25.25F, 2.5F, 1, 4, 1, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 37, 0, -1.5F, -22.45F, 3.0F, 3, 1, 1, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 39, 22, -1.0F, -22.45F, 2.0F, 2, 1, 1, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 36, 32, -1.5F, -23.65F, 3.0F, 3, 1, 1, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 26, 39, -1.0F, -23.65F, 2.0F, 2, 1, 1, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 25, 20, -2.0F, -24.85F, 3.0F, 4, 1, 1, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 36, 15, -1.5F, -24.85F, 2.0F, 3, 1, 1, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 35, 13, -1.5F, -26.05F, 2.0F, 3, 1, 1, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 25, 25, -2.0F, -26.05F, 3.0F, 4, 1, 1, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 0, 12, -3.0F, -29.995F, 1.5F, 6, 4, 3, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 37, 37, 1.0F, -29.995F, 4.5F, 2, 3, 1, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 31, 36, -3.0F, -29.995F, 4.5F, 2, 3, 1, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 38, 17, -1.0F, -27.995F, 4.5F, 2, 1, 1, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 0, 19, -1.5F, -30.75F, 2.25F, 3, 3, 3, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 0, 6, -1.0F, -31.0F, 3.0F, 2, 2, 2, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 24, 35, 2.5F, -30.75F, 2.5F, 1, 2, 2, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 40, 7, 3.5F, -30.25F, 3.0F, 1, 1, 1, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 22, 35, -4.5F, -30.25F, 3.0F, 1, 1, 1, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 18, 35, -3.5F, -30.75F, 2.5F, 1, 2, 2, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 12, 41, 0.5F, -30.5F, 1.45F, 1, 1, 1, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 12, 8, -2.0F, -30.995F, 1.65F, 4, 1, 1, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 36, 41, 1.25F, -30.6F, 2.0F, 1, 1, 1, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 36, 7, 1.5F, -31.25F, 2.5F, 1, 2, 2, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 41, 25, 1.5F, -30.995F, 4.5F, 1, 1, 1, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 40, 41, -2.5F, -30.995F, 4.5F, 1, 1, 1, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 36, 3, -2.5F, -31.25F, 2.5F, 1, 2, 2, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 26, 41, -2.25F, -30.6F, 2.0F, 1, 1, 1, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 12, 0, -3.5F, -18.75F, 1.85F, 7, 2, 2, 0.0F, false));
		Chest.cubeList.add(new ModelBox(Chest, 0, 0, -1.0F, -19.25F, 1.55F, 2, 3, 3, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(2.0F, -22.0F, 1.0F);
		Chest.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.2618F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 15, 13, -4.5F, -6.0F, 1.5F, 5, 1, 1, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 12, 4, -4.5F, -5.0F, -0.5F, 5, 1, 3, 0.0F, false));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(4.0F, -29.5F, 3.5F);
		CommandoDroid.addChild(LeftArm);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 12, 38, -0.5F, 4.0F, -0.5F, 2, 2, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 20, 30, 0.0F, 1.5F, -1.0F, 1, 3, 2, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 8, 41, 0.15F, 1.0F, -0.5F, 1, 2, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 24, 13, 0.0F, -1.5F, -1.5F, 1, 3, 3, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 33, 20, 0.3F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 12, 34, -0.25F, -1.25F, -1.0F, 1, 2, 2, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(2.5F, 9.5F, 0.5F);
		LeftArm.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.1309F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 34, 26, -2.5F, -4.25F, -1.6F, 1, 5, 1, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 32, 16, -2.5F, 0.75F, -2.1F, 1, 2, 2, 0.0F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-4.0F, -29.5F, 3.5F);
		CommandoDroid.addChild(RightArm);
		RightArm.cubeList.add(new ModelBox(RightArm, 8, 30, -1.0F, 1.5F, -1.0F, 1, 3, 2, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 40, -1.15F, 1.0F, -0.5F, 1, 2, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 20, 24, -1.0F, -1.5F, -1.5F, 1, 3, 3, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 32, 5, -1.3F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 32, 32, -0.75F, -1.25F, -1.0F, 1, 2, 2, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 37, 19, -1.5F, 4.0F, -0.5F, 2, 2, 1, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-2.5F, 9.5F, -1.5F);
		RightArm.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.5236F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 32, 9, 1.5F, 0.75F, -1.75F, 1, 2, 2, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 48, 0, 1.0F, -2.25F, -3.75F, 2, 7, 2, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 60, 0, 1.5F, 1.75F, -3.25F, 1, 5, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 34, 1.5F, -4.25F, -1.25F, 1, 5, 1, 0.0F, false));

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -31.0F, 4.0F);
		CommandoDroid.addChild(Head);

		cube_r12_r1 = new ModelRenderer(this);
		cube_r12_r1.setRotationPoint(0.0F, 25.3468F, -19.0981F);
		Head.addChild(cube_r12_r1);
		setRotationAngle(cube_r12_r1, -0.5236F, 0.0F, 0.0F);
		cube_r12_r1.cubeList.add(new ModelBox(cube_r12_r1, 6, 6, -0.5F, -31.75F, 0.3F, 1, 1, 1, 0.0F, false));
		cube_r12_r1.cubeList.add(new ModelBox(cube_r12_r1, 31, 0, -1.0F, -35.0F, 0.25F, 2, 4, 1, 0.0F, false));
		cube_r12_r1.cubeList.add(new ModelBox(cube_r12_r1, 34, 24, -1.5F, -34.8F, 0.5F, 3, 1, 1, 0.0F, false));

		cube_r11_r1 = new ModelRenderer(this);
		cube_r11_r1.setRotationPoint(0.0F, -28.3469F, -12.1697F);
		Head.addChild(cube_r11_r1);
		setRotationAngle(cube_r11_r1, -2.6616F, 0.0F, 0.0F);
		cube_r11_r1.cubeList.add(new ModelBox(cube_r11_r1, 38, 11, -1.0F, -27.9031F, 0.5F, 2, 1, 1, 0.0F, false));

		cube_r13_r1 = new ModelRenderer(this);
		cube_r13_r1.setRotationPoint(0.0F, 31.4966F, 4.2279F);
		Head.addChild(cube_r13_r1);
		setRotationAngle(cube_r13_r1, 0.2618F, 0.0F, 0.0F);
		cube_r13_r1.cubeList.add(new ModelBox(cube_r13_r1, 8, 35, -0.5F, -36.0F, 3.5F, 1, 5, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		CommandoDroid.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}