// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class ModelBattleDroid extends EntityModel {
	private final ModelRenderer BattleDroid;
	private final ModelRenderer LeftArm;
	private final ModelRenderer Torso;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer RightLeg;
	private final ModelRenderer Gun;
	private final ModelRenderer Head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;

	public ModelBattleDroid() {
		textureWidth = 64;
		textureHeight = 64;

		BattleDroid = new ModelRenderer(this);
		BattleDroid.setRotationPoint(-7.0F, -3.0F, -13.0F);
		setRotationAngle(BattleDroid, 0.0F, 3.1416F, 0.0F);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(-12.5F, 0.5F, -16.0F);
		BattleDroid.addChild(LeftArm);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 13, 21, -0.5F, 11.25F, 0.5F, 1, 1, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 49, 8, -0.5F, 10.25F, -1.5F, 1, 1, 3, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 57, 18, -0.5F, 11.25F, -1.5F, 1, 1, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 4, 38, -0.5F, 7.25F, -0.5F, 1, 3, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 49, 12, -1.0F, 5.25F, -1.0F, 2, 2, 2, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 36, 6, -1.25F, 5.75F, -0.5F, 1, 1, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 33, 10, -0.5F, 1.25F, -1.0F, 1, 4, 2, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 15, 41, 0.25F, 5.75F, -0.5F, 1, 1, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 53, 23, -1.25F, -1.15F, -1.0F, 1, 2, 2, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 19, 14, -1.0F, -1.75F, -1.5F, 2, 3, 3, 0.0F, false));

		Torso = new ModelRenderer(this);
		Torso.setRotationPoint(-7.0F, 27.0F, -17.0F);
		BattleDroid.addChild(Torso);
		Torso.cubeList.add(new ModelBox(Torso, 4, 14, -1.0F, -18.5F, -1.0F, 2, 3, 4, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 25, 5, -0.5F, -17.0F, 0.5F, 4, 1, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 48, 58, 2.5F, -20.0F, 0.5F, 1, 3, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 44, 58, -3.5F, -20.0F, 0.5F, 1, 3, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 49, 21, -3.5F, -17.0F, 0.5F, 4, 1, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 26, 26, -2.0F, -20.0F, -2.0001F, 4, 2, 6, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 0, 0, -3.5F, -27.0F, -2.5F, 7, 7, 7, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 52, 32, 0.5F, -27.75F, 0.0F, 4, 2, 2, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 16, 28, 4.5F, -28.25F, -0.5F, 2, 3, 3, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 33, 0, 5.75F, -27.65F, 0.0F, 1, 2, 2, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 33, 17, 5.0F, -25.25F, 0.0F, 1, 4, 2, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 10, 46, 5.0F, -20.75F, 1.75F, 1, 1, 4, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 57, 44, 5.0F, -21.25F, 5.75F, 1, 2, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 38, 57, 5.2F, -21.5F, 6.75F, 1, 1, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 51, 0, 4.0F, -19.75F, 7.75F, 2, 1, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 51, 0, 4.0F, -21.5F, 7.75F, 2, 1, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 54, 51, 5.2F, -19.75F, 6.75F, 1, 1, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 49, 17, 4.5F, -21.25F, 0.0F, 2, 2, 2, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 40, 53, 5.75F, -20.75F, 0.5F, 1, 1, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 43, 24, 4.25F, -20.75F, 0.5F, 1, 1, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 18, 49, 2.0F, -25.75F, 0.0F, 2, 4, 2, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 4, 28, -4.0F, -25.75F, 0.0F, 2, 4, 2, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 10, 51, -4.5F, -27.75F, 0.0F, 4, 2, 2, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 4, 38, -1.0F, -28.5F, -1.5F, 2, 2, 5, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 32, 0, 1.75F, -28.0F, -3.0F, 1, 2, 8, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 4, 50, 1.75F, -26.0F, -3.0F, 1, 4, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 4, 28, -2.75F, -28.0F, -3.0F, 1, 2, 8, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 30, 35, -2.75F, -26.0F, -3.0F, 1, 4, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 44, 30, -2.5F, -13.5F, 0.5F, 5, 1, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 33, 10, -2.5F, -15.5F, -2.0F, 5, 1, 6, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 33, 10, -0.5F, -15.25F, -1.5F, 1, 4, 5, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 40, 35, -2.0F, -14.5F, -1.0F, 4, 3, 4, 0.0F, false));

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(-11.0F, 14.0F, -16.0F);
		BattleDroid.addChild(LeftLeg);
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 36, 49, -1.0F, 12.0F, 0.0F, 2, 1, 3, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 26, 53, -1.0F, 11.0F, -2.0F, 2, 2, 2, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 57, 23, -0.5F, 11.0F, 0.0F, 1, 1, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 26, 57, -0.5F, 9.0F, -1.0F, 1, 2, 2, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 54, 54, -0.5F, 8.0F, -1.0F, 1, 1, 2, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 44, 0, -1.0F, 5.5F, -1.5F, 2, 3, 3, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 55, 14, -1.25F, 6.0F, -1.0F, 1, 2, 2, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 20, 56, 0.25F, 6.0F, -1.0F, 1, 2, 2, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 42, 53, -0.5F, 1.0F, -1.0F, 1, 3, 2, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 32, 43, -1.0F, -1.5F, -1.5F, 2, 3, 3, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 26, 49, -1.5F, -1.0F, -1.0F, 3, 2, 2, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 53, 46, -0.5F, 4.0F, -1.0F, 1, 3, 2, 0.0F, false));

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-3.0F, 14.0F, -16.0F);
		BattleDroid.addChild(RightLeg);
		RightLeg.cubeList.add(new ModelBox(RightLeg, 19, 20, -1.5F, -1.0F, -1.0F, 3, 2, 2, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 42, 43, -1.0F, -1.5F, -1.5F, 2, 3, 3, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 48, 53, -0.5F, 1.0F, -1.0F, 1, 3, 2, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 54, 0, -0.5F, 4.0F, -1.0F, 1, 3, 2, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 44, 24, -1.0F, 5.5F, -1.5F, 2, 3, 3, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 56, 36, -1.25F, 6.0F, -1.0F, 1, 2, 2, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 4, 57, 0.25F, 6.0F, -1.0F, 1, 2, 2, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 54, -0.5F, 8.0F, -1.0F, 1, 1, 2, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 32, 57, -0.5F, 9.0F, -1.0F, 1, 2, 2, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 34, 53, -1.0F, 11.0F, -2.0F, 2, 2, 2, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 58, 0, -0.5F, 11.0F, 0.0F, 1, 1, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 46, 49, -1.0F, 12.0F, 0.0F, 2, 1, 3, 0.0F, false));

		Gun = new ModelRenderer(this);
		Gun.setRotationPoint(-8.0F, 28.0F, -17.0F);
		BattleDroid.addChild(Gun);
		Gun.cubeList.add(new ModelBox(Gun, 0, 0, 5.2F, -24.0F, 6.75F, 1, 5, 1, 0.0F, false));
		Gun.cubeList.add(new ModelBox(Gun, 43, 49, 5.2F, -20.0F, 7.75F, 1, 1, 2, 0.0F, false));
		Gun.cubeList.add(new ModelBox(Gun, 4, 14, 5.2F, -23.0F, 8.75F, 1, 3, 1, 0.0F, false));
		Gun.cubeList.add(new ModelBox(Gun, 39, 43, 5.2F, -23.0F, 9.75F, 1, 1, 2, 0.0F, false));
		Gun.cubeList.add(new ModelBox(Gun, 19, 14, 4.7F, -24.5F, 2.75F, 2, 2, 10, 0.0F, false));
		Gun.cubeList.add(new ModelBox(Gun, 18, 35, 4.2F, -24.0F, 5.75F, 3, 1, 6, 0.0F, false));
		Gun.cubeList.add(new ModelBox(Gun, 16, 34, 4.2F, -24.0F, 14.75F, 3, 1, 1, 0.0F, false));
		Gun.cubeList.add(new ModelBox(Gun, 4, 45, 4.7F, -24.5F, 13.75F, 2, 2, 3, 0.0F, false));
		Gun.cubeList.add(new ModelBox(Gun, 54, 6, 5.2F, -24.25F, 14.25F, 1, 2, 2, 0.0F, false));
		Gun.cubeList.add(new ModelBox(Gun, 28, 43, 5.2F, -24.0F, 16.75F, 1, 1, 2, 0.0F, false));
		Gun.cubeList.add(new ModelBox(Gun, 52, 36, 4.7F, -24.0F, 12.75F, 2, 1, 1, 0.0F, false));
		Gun.cubeList.add(new ModelBox(Gun, 36, 4, 5.2F, -25.0F, 12.75F, 1, 1, 1, 0.0F, false));
		Gun.cubeList.add(new ModelBox(Gun, 50, 32, 5.2F, -25.0F, 7.75F, 1, 1, 1, 0.0F, false));
		Gun.cubeList.add(new ModelBox(Gun, 24, 49, 5.2F, -25.0F, 4.75F, 1, 1, 1, 0.0F, false));
		Gun.cubeList.add(new ModelBox(Gun, 4, 14, 5.2F, -26.0F, 3.75F, 1, 1, 13, 0.0F, false));
		Gun.cubeList.add(new ModelBox(Gun, 34, 49, 5.2F, -25.0F, 15.5F, 1, 1, 1, 0.0F, false));

		Head = new ModelRenderer(this);
		Head.setRotationPoint(-7.0F, -1.5F, -16.0F);
		BattleDroid.addChild(Head);
		Head.cubeList.add(new ModelBox(Head, 40, 35, -0.5F, -2.0F, -0.5F, 1, 3, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 23, 28, -1.0F, -3.0F, -1.0F, 2, 1, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 4, 21, -1.5F, -6.0F, -1.5F, 3, 3, 3, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 55, 10, 0.75F, -5.5F, -1.0F, 1, 2, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 14, 55, -1.75F, -5.5F, -1.0F, 1, 2, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 54, 40, -1.25F, -6.49F, -0.6F, 1, 2, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 36, 57, -1.25F, -6.4F, -1.6F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 46, 53, -1.2F, -6.3F, -2.5F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 8, 55, 0.25F, -6.49F, -0.6F, 1, 2, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 30, 57, 0.25F, -6.4F, -1.6F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 12, 55, 0.2F, -6.3F, -2.5F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 25, 0, -1.0F, -6.5F, -2.6F, 2, 1, 4, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 49, 42, -0.5F, -6.64F, -1.66F, 1, 1, 3, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 15, 38, -1.5F, -6.0F, -2.5F, 3, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.5F, -6.5F, -4.0F);
		Head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.6981F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 55, 27, -2.5F, 1.0321F, 0.1145F, 2, 3, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.5F, -8.5F, -4.0F);
		Head.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.4363F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 25, 0, -3.1F, 1.3126F, 2.2452F, 1, 3, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 14, -0.9F, 1.3126F, 2.2452F, 1, 3, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(1.5F, -9.5F, 2.0F);
		Head.addChild(cube_r3);
		setRotationAngle(cube_r3, -1.0472F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 30, 36, -2.5F, 2.0F, 2.1321F, 2, 1, 6, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		BattleDroid.render(f5);
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
		this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}