// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class ModelBattleDroidCommander extends EntityModel {
	private final ModelRenderer BattleDroidV2;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer RightLeg;
	private final ModelRenderer MainBody;
	private final ModelRenderer Head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightArm;
	private final ModelRenderer RightArm_r1;

	public ModelBattleDroidCommander() {
		textureWidth = 64;
		textureHeight = 64;

		BattleDroidV2 = new ModelRenderer(this);
		BattleDroidV2.setRotationPoint(0.0F, 24.0F, 0.0F);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(2.0F, -19.0F, 2.0F);
		BattleDroidV2.addChild(LeftLeg);
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 47, 24, 0.5F, 9.0F, -1.0F, 2, 2, 2, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 30, 30, 0.0F, 18.0F, -3.5F, 3, 1, 5, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 43, 33, 0.5F, 17.5F, -1.75F, 2, 1, 3, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 34, 45, 1.0F, 11.0F, -0.8F, 1, 7, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 28, 45, 1.0F, 0.5F, -1.0F, 1, 7, 2, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 53, 50, 1.0F, 7.5F, -0.8F, 1, 2, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 15, 46, 1.75F, -1.5F, -1.5F, 1, 3, 3, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 7, 46, 0.25F, -1.5F, -1.5F, 1, 3, 3, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 53, 47, 1.0F, -1.0F, -1.25F, 1, 2, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 53, 22, 1.0F, -1.02F, -0.5F, 1, 2, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 53, 10, 1.0F, -1.0F, 0.25F, 1, 2, 1, 0.0F, false));

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-2.0F, -19.0F, 2.0F);
		BattleDroidV2.addChild(RightLeg);
		RightLeg.cubeList.add(new ModelBox(RightLeg, 46, 37, -2.5F, 9.0F, -1.0F, 2, 2, 2, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 29, 0, -3.0F, 18.0F, -3.5F, 3, 1, 5, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 42, 4, -2.5F, 17.5F, -1.75F, 2, 1, 3, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 12, 22, -2.0F, 11.0F, -0.8F, 1, 7, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 39, 44, -2.0F, 0.5F, -1.0F, 1, 7, 2, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 53, 53, -2.0F, 7.5F, -0.8F, 1, 2, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 45, 45, -2.75F, -1.5F, -1.5F, 1, 3, 3, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 12, -1.25F, -1.5F, -1.5F, 1, 3, 3, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 41, 53, -2.0F, -1.0F, -1.25F, 1, 2, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 37, 53, -2.0F, -1.02F, -0.5F, 1, 2, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 33, 53, -2.0F, -1.0F, 0.25F, 1, 2, 1, 0.0F, false));

		MainBody = new ModelRenderer(this);
		MainBody.setRotationPoint(0.0F, -22.0F, 2.0F);
		BattleDroidV2.addChild(MainBody);
		MainBody.cubeList.add(new ModelBox(MainBody, 35, 28, -0.25F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 18, 52, 1.75F, -5.5F, -0.5F, 1, 5, 1, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 29, 6, -2.75F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 14, 52, -2.75F, -5.5F, -0.5F, 1, 5, 1, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 47, 8, -0.5F, -5.5F, -0.5F, 1, 4, 2, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 0, 42, -2.5F, -5.5F, -2.75F, 1, 2, 4, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 0, 18, -1.5F, -5.5F, -2.75F, 3, 1, 1, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 20, 41, 1.5F, -5.5F, -2.75F, 1, 2, 4, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 12, 31, -3.0F, -10.75F, 0.75F, 6, 8, 1, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 45, 51, 1.0F, -10.25F, 1.0F, 1, 6, 1, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 4, 51, -2.0F, -10.25F, 1.0F, 1, 6, 1, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 17, 19, -3.0F, -11.75F, 2.0F, 6, 9, 3, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 13, 0, -3.5F, -11.25F, 3.0F, 7, 9, 1, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 41, 28, -1.5F, -6.25F, -1.75F, 3, 1, 3, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 8, 52, -1.0F, -8.5F, -3.1F, 2, 3, 1, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 35, 21, 1.0F, -8.5F, -3.25F, 2, 3, 4, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 0, 34, -3.0F, -8.5F, -3.25F, 2, 3, 4, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 53, 30, 1.2F, -8.4F, -3.45F, 1, 1, 1, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 12, 12, -3.0F, -9.5F, -3.25F, 6, 1, 4, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 8, 40, 1.0F, -11.5F, -3.25F, 2, 2, 4, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 38, 38, -3.0F, -11.5F, -3.25F, 2, 2, 4, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 29, 40, -1.0F, -10.5F, -2.75F, 2, 1, 4, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 27, 8, -4.0F, -11.0F, -2.25F, 8, 2, 2, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 12, 17, -5.0F, -10.5F, -1.75F, 10, 1, 1, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 52, 36, -1.0F, -10.0F, -3.0F, 2, 1, 1, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 28, 12, -3.5F, -12.25F, 2.5F, 7, 1, 2, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 0, 22, -1.5F, -12.5F, 2.2F, 3, 9, 3, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 0, 0, -0.5F, -1.5F, -1.5F, 1, 6, 3, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 51, 18, -0.25F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 51, 6, -0.75F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 28, 36, -2.75F, 2.0F, -1.0F, 5, 2, 2, 0.0F, false));

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -11.0F, -1.25F);
		MainBody.addChild(Head);
		Head.cubeList.add(new ModelBox(Head, 50, 41, -0.5F, -5.0F, -0.5F, 1, 6, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 26, 31, -1.0F, -7.0F, -1.0F, 2, 2, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 9, -1.5F, -6.5F, -0.5F, 3, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 12, 46, -0.5F, -6.5F, -2.5F, 1, 1, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 45, 8, -0.5F, -7.25F, -0.5F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 41, 15, -1.5F, -8.2F, -1.5F, 3, 1, 3, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 50, 28, -1.0F, -8.0F, 1.25F, 2, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.0F, -4.0F, 3.25F);
		Head.addChild(cube_r1);
		setRotationAngle(cube_r1, -1.2654F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 40, 0, -0.5F, -0.6F, -4.0F, 3, 1, 3, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 43, 44, -0.5F, -0.6F, -1.0F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 44, 1.5F, -0.6F, -1.0F, 1, 1, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -8.0F, -0.75F);
		Head.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.829F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 32, 15, -1.0F, -0.5F, -5.5F, 2, 1, 5, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 26, 41, -0.5F, -0.25F, -6.0F, 1, 1, 2, 0.0F, false));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, -10.0F, -1.25F);
		MainBody.addChild(LeftArm);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 50, 32, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 50, 14, -0.25F, 6.0F, -1.0F, 1, 2, 2, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 48, -0.25F, 0.0F, -0.5F, 1, 6, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 49, 51, 0.0F, 8.0F, -0.5F, 1, 5, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 41, 32, 0.0F, 12.5F, -1.5F, 1, 2, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 41, 0.0F, 12.5F, 0.5F, 1, 2, 1, 0.0F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, -10.0F, -1.25F);
		MainBody.addChild(RightArm);
		setRotationAngle(RightArm, 0.3054F, 0.0F, 0.0F);
		RightArm.cubeList.add(new ModelBox(RightArm, 50, 2, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 16, 40, -0.75F, 6.0F, -1.0F, 1, 2, 2, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 23, 47, -0.75F, 0.0F, -0.5F, 1, 6, 1, 0.0F, false));

		RightArm_r1 = new ModelRenderer(this);
		RightArm_r1.setRotationPoint(5.0F, 32.0F, -0.75F);
		RightArm.addChild(RightArm_r1);
		setRotationAngle(RightArm_r1, -0.3054F, 0.0F, 0.0F);
		RightArm_r1.cubeList.add(new ModelBox(RightArm_r1, 0, 12, -6.5F, -26.5F, -17.75F, 2, 1, 8, 0.0F, false));
		RightArm_r1.cubeList.add(new ModelBox(RightArm_r1, 0, 60, -6.5F, -27.5F, -14.75F, 2, 1, 3, 0.0F, false));
		RightArm_r1.cubeList.add(new ModelBox(RightArm_r1, 29, 0, -6.0F, -25.5F, -12.75F, 1, 4, 1, 0.0F, false));
		RightArm_r1.cubeList.add(new ModelBox(RightArm_r1, 37, 40, -6.5F, -23.5F, -12.7F, 1, 1, 1, 0.0F, false));
		RightArm_r1.cubeList.add(new ModelBox(RightArm_r1, 37, 6, -6.25F, -23.57F, -13.7F, 1, 1, 1, 0.0F, false));
		RightArm_r1.cubeList.add(new ModelBox(RightArm_r1, 33, 18, -6.25F, -25.0F, -13.7F, 1, 1, 1, 0.0F, false));
		RightArm_r1.cubeList.add(new ModelBox(RightArm_r1, 7, 8, -6.5F, -25.0F, -12.7F, 1, 1, 1, 0.0F, false));
		RightArm_r1.cubeList.add(new ModelBox(RightArm_r1, 21, 35, -6.0F, -24.25F, -11.75F, 1, 1, 5, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		BattleDroidV2.render(f5);
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
		this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}