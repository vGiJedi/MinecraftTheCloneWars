// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class ModelSBD extends EntityModel {
	private final ModelRenderer SuperBattleDroid;
	private final ModelRenderer Torso;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer RightArmWeapon;
	private final ModelRenderer LeftArm;

	public ModelSBD() {
		textureWidth = 128;
		textureHeight = 128;

		SuperBattleDroid = new ModelRenderer(this);
		SuperBattleDroid.setRotationPoint(0.0F, 24.0F, 0.0F);

		Torso = new ModelRenderer(this);
		Torso.setRotationPoint(6.0F, -20.0F, -1.0F);
		SuperBattleDroid.addChild(Torso);
		Torso.cubeList.add(new ModelBox(Torso, 60, 19, -3.0F, -3.5F, -1.0F, 3, 3, 3, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 0, 59, -12.0F, -3.5F, -1.0F, 3, 3, 3, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 7, 68, -8.5F, -3.5F, -1.0F, 1, 3, 3, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 30, 20, -4.5F, -3.5F, -1.0F, 1, 3, 3, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 45, 73, -9.0F, -3.0F, -0.5F, 1, 2, 2, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 0, 19, -8.0F, -3.0F, -0.5F, 4, 2, 2, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 6, 51, -7.0F, -4.0F, -1.5F, 2, 4, 4, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 12, 12, -6.5F, -0.5F, -1.0F, 1, 1, 3, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 41, 54, -6.5F, -3.0F, -2.0F, 1, 2, 5, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 65, 55, -6.5F, -5.0F, -1.5F, 1, 2, 4, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 50, 0, -8.5F, -5.5F, 0.5F, 5, 1, 3, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 40, 61, -7.0F, -5.5F, 3.0F, 2, 1, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 30, 5, -8.5F, -5.5F, -1.5F, 5, 1, 2, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 49, 30, -7.5F, -5.2F, -2.5F, 3, 1, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 68, 0, -7.0F, -7.2F, -2.0F, 2, 2, 2, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 22, 56, -7.0F, -7.2F, 2.5F, 2, 2, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 72, 4, -7.5F, -7.2F, 2.0F, 1, 2, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 0, 65, -5.5F, -7.2F, 2.0F, 1, 2, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 65, 25, -7.5F, -7.2F, -1.0F, 1, 2, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 61, 62, -5.5F, -7.2F, -1.0F, 1, 2, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 20, 70, -8.0F, -7.2F, 1.5F, 1, 2, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 64, 39, -5.0F, -7.2F, 1.5F, 1, 2, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 36, 69, -8.0F, -7.2F, -0.5F, 1, 2, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 63, 55, -5.0F, -7.2F, -0.5F, 1, 2, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 71, 53, -8.25F, -7.2F, 0.0F, 1, 2, 2, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 71, 23, -4.75F, -7.2F, 0.0F, 1, 2, 2, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 28, 49, -4.25F, -11.1F, 0.0F, 1, 4, 2, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 0, 23, -8.75F, -11.1F, 0.0F, 1, 4, 2, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 20, 64, -7.0F, -9.2F, -2.25F, 2, 2, 2, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 34, 75, -5.0F, -11.2F, 2.5F, 1, 4, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 40, 8, -5.0F, -11.2F, -1.5F, 1, 4, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 30, 75, -8.0F, -11.2F, 2.5F, 1, 4, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 51, 74, -8.0F, -11.2F, -1.5F, 1, 4, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 0, 75, -8.5F, -11.2F, 1.5F, 1, 4, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 64, 74, -8.5F, -11.2F, -0.5F, 1, 4, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 74, 42, -4.5F, -11.2F, 1.5F, 1, 4, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 55, 74, -4.5F, -11.2F, -0.5F, 1, 4, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 34, 27, -7.0F, -11.2F, 3.0F, 2, 4, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 46, 50, -7.0F, -11.2F, -2.5F, 2, 2, 2, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 74, 29, -6.5F, -5.0F, -2.25F, 1, 2, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 72, 70, -6.5F, -5.0F, 2.5F, 1, 2, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 0, 23, -7.5F, -11.0F, -3.0F, 3, 1, 7, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 72, 17, -4.0F, -3.0F, -0.5F, 1, 2, 2, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 17, 1, -7.5F, -12.0F, -3.0F, 3, 1, 7, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 0, 31, -8.5F, -16.5F, 2.5F, 5, 9, 2, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 42, 5, -6.5F, -11.5F, 4.0F, 1, 1, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 53, 67, -7.5F, -18.5F, 4.0F, 3, 6, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 53, 56, -8.0F, -20.5F, 3.5F, 4, 4, 2, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 57, 53, -7.0F, -12.5F, 4.0F, 2, 1, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 14, 39, -9.5F, -12.5F, 0.0F, 7, 4, 2, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 30, 0, -10.0F, -15.5F, 0.0F, 8, 3, 2, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 0, 0, -10.5F, -18.5F, -0.5F, 9, 5, 3, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 62, 66, -1.5F, -18.5F, -0.5F, 1, 4, 3, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 0, 8, -11.5F, -18.5F, -0.5F, 1, 4, 3, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 24, 16, -10.0F, -19.5F, -0.5F, 8, 1, 3, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 24, 9, -9.0F, -20.5F, -1.0F, 6, 3, 4, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 12, 9, -9.0F, -19.5F, 3.0F, 6, 2, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 42, 33, -8.5F, -21.0F, -0.5F, 5, 3, 3, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 36, 27, -8.0F, -21.5F, -0.5F, 4, 1, 5, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 57, 45, -7.0F, -20.5F, -2.5F, 2, 5, 3, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 66, 7, -8.0F, -21.0F, -1.5F, 4, 3, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 26, 56, -7.0F, -19.5F, -3.5F, 2, 5, 3, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 36, 40, -6.5F, -20.25F, -3.25F, 1, 3, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 34, 50, -7.5F, -19.5F, -2.5F, 3, 6, 3, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 0, 71, -12.5F, -17.5F, 0.0F, 1, 2, 2, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 69, 61, -10.0F, -17.5F, 2.0F, 1, 2, 2, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 47, 69, -3.0F, -17.5F, 2.0F, 1, 2, 2, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 70, 66, -0.5F, -17.5F, 0.0F, 1, 2, 2, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 13, 23, -9.5F, -18.0F, 1.25F, 7, 4, 3, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 49, 25, -9.0F, -12.0F, -2.0F, 6, 3, 2, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 18, 30, -9.5F, -19.0F, -2.0F, 7, 7, 2, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 54, 12, -8.5F, -20.0F, -2.0F, 5, 1, 2, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 55, 30, -8.5F, -13.0F, -2.7F, 5, 3, 2, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 58, 35, -8.5F, -15.0F, -3.0F, 5, 2, 2, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 14, 37, -3.75F, -16.75F, -2.3F, 1, 1, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 10, 45, -9.0F, -12.0F, 2.0F, 6, 4, 2, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 45, 18, -9.5F, -14.0F, 2.0F, 7, 2, 2, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 50, 39, -8.5F, -20.5F, 3.0F, 5, 4, 2, 0.0F, false));

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-5.0F, -22.0F, -0.5F);
		SuperBattleDroid.addChild(RightLeg);
		RightLeg.cubeList.add(new ModelBox(RightLeg, 30, 33, -1.0F, 21.0F, -4.5F, 3, 1, 6, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 45, 22, -0.5F, 20.5F, -3.5F, 2, 1, 2, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 42, -0.5F, 11.0F, -1.5F, 2, 10, 3, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 68, 75, 0.0F, 14.0F, -2.0F, 1, 4, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 42, 40, 0.0F, 10.0F, -2.0F, 1, 3, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 73, 59, -1.2F, 9.5F, -3.0F, 1, 2, 2, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 39, 69, -1.0F, 9.0F, -3.5F, 1, 3, 3, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 31, 69, 1.0F, 9.0F, -3.5F, 1, 3, 3, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 4, 74, 1.2F, 9.5F, -3.0F, 1, 2, 2, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 33, 61, -0.5F, 6.0F, -2.5F, 2, 5, 3, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 14, 56, -0.5F, 2.0F, -2.5F, 2, 4, 4, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 70, 37, -0.25F, 2.0F, -1.5F, 2, 3, 2, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 41, 41, -0.5F, -2.0F, -2.5F, 2, 4, 5, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 14, 31, 0.0F, 6.0F, 0.0F, 1, 5, 1, 0.0F, false));

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(4.5F, -22.0F, -1.0F);
		SuperBattleDroid.addChild(LeftLeg);
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 33, 20, -1.5F, 21.0F, -4.0F, 3, 1, 6, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 64, 45, -1.0F, 20.5F, -3.0F, 2, 1, 2, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 44, 5, -1.0F, 11.0F, -1.0F, 2, 10, 3, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 38, 75, -0.5F, 14.0F, -1.5F, 1, 4, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 53, 62, -0.5F, 10.0F, -1.5F, 1, 3, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 60, 73, -0.5F, 6.0F, 0.5F, 1, 5, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 69, 45, 0.5F, 9.0F, -3.0F, 1, 3, 3, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 15, 70, -1.5F, 9.0F, -3.0F, 1, 3, 3, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 10, 74, 0.7F, 9.5F, -2.5F, 1, 2, 2, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 73, 73, -1.7F, 9.5F, -2.5F, 1, 2, 2, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 43, 61, -1.0F, 6.0F, -2.0F, 2, 5, 3, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 54, 4, -1.0F, 2.0F, -2.0F, 2, 4, 4, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 23, 71, -1.25F, 2.0F, -1.0F, 2, 3, 2, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 27, 40, -1.0F, -2.0F, -2.0F, 2, 4, 5, 0.0F, false));

		RightArmWeapon = new ModelRenderer(this);
		RightArmWeapon.setRotationPoint(6.5F, -35.5F, -5.0F);
		SuperBattleDroid.addChild(RightArmWeapon);
		RightArmWeapon.cubeList.add(new ModelBox(RightArmWeapon, 12, 12, -15.0F, -2.5F, -1.0F, 2, 3, 8, 0.0F, false));
		RightArmWeapon.cubeList.add(new ModelBox(RightArmWeapon, 24, 65, -13.5F, -2.0F, -5.0F, 1, 2, 4, 0.0F, false));
		RightArmWeapon.cubeList.add(new ModelBox(RightArmWeapon, 53, 62, -15.0F, -1.5F, -9.0F, 2, 1, 4, 0.0F, false));
		RightArmWeapon.cubeList.add(new ModelBox(RightArmWeapon, 62, 0, -14.5F, -2.5F, -5.0F, 1, 3, 4, 0.0F, false));
		RightArmWeapon.cubeList.add(new ModelBox(RightArmWeapon, 64, 39, -14.5F, -2.0F, -8.0F, 1, 2, 3, 0.0F, false));
		RightArmWeapon.cubeList.add(new ModelBox(RightArmWeapon, 53, 22, -14.5F, -1.6F, -11.0F, 1, 1, 2, 0.0F, false));
		RightArmWeapon.cubeList.add(new ModelBox(RightArmWeapon, 65, 25, -14.5F, -2.6F, 0.0F, 1, 1, 4, 0.0F, false));
		RightArmWeapon.cubeList.add(new ModelBox(RightArmWeapon, 49, 49, -14.5F, -0.4F, 0.0F, 1, 1, 6, 0.0F, false));
		RightArmWeapon.cubeList.add(new ModelBox(RightArmWeapon, 14, 51, -15.0F, -1.5F, -12.0F, 2, 1, 3, 0.0F, false));
		RightArmWeapon.cubeList.add(new ModelBox(RightArmWeapon, 48, 56, -15.0F, -0.5F, -12.0F, 2, 1, 1, 0.0F, false));
		RightArmWeapon.cubeList.add(new ModelBox(RightArmWeapon, 0, 65, -15.5F, -2.0F, -5.0F, 1, 2, 4, 0.0F, false));
		RightArmWeapon.cubeList.add(new ModelBox(RightArmWeapon, 70, 11, -15.5F, -2.0F, 0.0F, 1, 2, 3, 0.0F, false));
		RightArmWeapon.cubeList.add(new ModelBox(RightArmWeapon, 0, 55, -15.3F, -2.0F, 4.0F, 1, 2, 2, 0.0F, false));
		RightArmWeapon.cubeList.add(new ModelBox(RightArmWeapon, 55, 45, -14.5F, -2.0F, 6.5F, 1, 2, 1, 0.0F, false));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.5F, -31.5F, 1.0F);
		SuperBattleDroid.addChild(LeftArm);
		setRotationAngle(LeftArm, 1.5708F, 0.0F, 0.0F);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 8, 1.0F, -2.5F, -1.0F, 2, 3, 8, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 64, 13, 0.5F, -2.0F, -5.0F, 1, 2, 4, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 61, 61, 1.0F, -1.5F, -9.0F, 2, 1, 4, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 8, 61, 1.5F, -2.5F, -5.0F, 1, 3, 4, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 14, 64, 1.5F, -2.0F, -8.0F, 1, 2, 3, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 7, 42, 2.1F, -1.5F, -11.0F, 1, 1, 2, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 36, 40, 1.5F, -2.6F, 0.0F, 1, 1, 4, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 20, 49, 1.5F, -0.4F, 0.0F, 1, 1, 6, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 67, 70, 2.0F, -2.0F, -12.0F, 1, 2, 3, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 21, 51, 1.0F, -2.0F, -12.0F, 1, 2, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 63, 49, 2.5F, -2.0F, -5.0F, 1, 2, 4, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 69, 30, 2.5F, -2.0F, 0.0F, 1, 2, 3, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 51, 4, 2.3F, -2.0F, 4.0F, 1, 2, 2, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 35, 20, 1.5F, -2.0F, 6.5F, 1, 2, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		SuperBattleDroid.render(f5);
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