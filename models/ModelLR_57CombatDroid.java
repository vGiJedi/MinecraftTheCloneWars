// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class ModelLR_57CombatDroid extends EntityModel {
	private final ModelRenderer LR_57;
	private final ModelRenderer Head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer Body;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer RightLeg;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;

	public ModelLR_57CombatDroid() {
		textureWidth = 256;
		textureHeight = 256;

		LR_57 = new ModelRenderer(this);
		LR_57.setRotationPoint(0.0F, 24.0F, 0.0F);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -34.0F, 0.0F);
		LR_57.addChild(Head);
		Head.cubeList.add(new ModelBox(Head, 64, 118, -6.0F, -26.0F, -10.0F, 12, 14, 20, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 128, -13.0F, -50.0F, -14.0F, 26, 26, 4, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 38, -12.0F, -45.0F, -10.0F, 24, 20, 26, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 176, 0, -11.0F, -48.0F, -15.0F, 22, 22, 4, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 168, 122, -11.0F, -48.0F, 23.0F, 22, 22, 4, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 178, 164, -10.0F, -47.0F, -16.0F, 20, 20, 4, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 24, 190, 0.0F, -44.0F, -17.0F, 6, 6, 4, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 106, 220, -5.0F, -35.0F, -17.0F, 4, 4, 4, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 176, 94, -10.0F, -47.0F, 24.0F, 20, 20, 4, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 158, 34, -13.0F, -40.0F, -6.0F, 26, 16, 4, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 56, 156, -13.0F, -40.0F, 2.0F, 26, 16, 4, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 86, -13.0F, -50.0F, 10.0F, 26, 26, 16, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 74, 38, -16.0F, -47.0F, 12.0F, 32, 10, 10, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 84, 102, -17.0F, -46.0F, 13.0F, 34, 8, 8, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 162, 210, -23.0F, -26.0F, 0.0F, 4, 6, 10, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 102, 182, 19.0F, -26.0F, 0.0F, 4, 6, 10, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 90, 220, -23.0F, -25.0F, -4.0F, 4, 4, 4, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 218, 46, 19.0F, -25.0F, -4.0F, 4, 4, 4, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 144, 6, -23.0F, -29.5F, -24.5F, 4, 4, 24, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 136, 136, 19.0F, -29.5F, -24.5F, 4, 4, 24, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 128, 66, -23.0F, -20.5F, -24.5F, 4, 4, 24, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 104, 128, 19.0F, -20.5F, -24.5F, 4, 4, 24, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 150, 166, -22.0F, -19.5F, -32.5F, 2, 2, 24, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 122, 164, 20.0F, -19.5F, -32.5F, 2, 2, 24, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 24, 164, -22.0F, -28.5F, -32.5F, 2, 2, 24, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 160, 54, 20.0F, -28.5F, -32.5F, 2, 2, 24, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 160, 94, -22.0F, -28.0F, -3.55F, 2, 10, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 148, 34, 20.0F, -28.0F, -3.55F, 2, 10, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 150, 164, -24.0F, -27.0F, 1.0F, 6, 8, 6, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 136, 136, 18.0F, -27.0F, 1.0F, 6, 8, 6, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 30, 208, -26.0F, -26.0F, 12.0F, 10, 6, 6, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 136, 122, 16.0F, -26.0F, 12.0F, 10, 6, 6, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 74, 220, -22.0F, -25.0F, 10.0F, 2, 4, 6, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 218, 112, 20.0F, -25.0F, 10.0F, 2, 4, 6, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 54, 212, -25.5F, -27.0F, 11.0F, 2, 8, 8, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 124, 156, 23.5F, -27.0F, 11.0F, 2, 8, 8, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 148, 0, -18.5F, -27.0F, 11.0F, 2, 8, 8, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 76, 0, 16.5F, -27.0F, 11.0F, 2, 8, 8, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 100, 58, -19.0F, -44.0F, 15.0F, 38, 4, 4, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 76, 0, -13.0F, -50.0F, -10.0F, 26, 10, 20, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 0, -10.0F, -51.0F, -12.0F, 20, 2, 36, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 68, 68, -7.0F, -52.0F, -10.0F, 14, 2, 32, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 108, 126, -4.0F, -20.5F, -10.5F, 8, 8, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 36, 158, -2.0F, -22.5F, -11.0F, 4, 6, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 130, 208, -7.0F, -25.5F, -9.0F, 14, 14, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 188, 204, -7.0F, -25.5F, -5.0F, 14, 14, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 98, 204, -7.0F, -25.5F, -1.0F, 14, 14, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 66, 204, -7.0F, -25.5F, 3.0F, 14, 14, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 156, 192, -7.0F, -25.5F, 7.0F, 14, 14, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(33.0F, -34.0F, 32.0F);
		Head.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 158, -13.0F, 8.0F, -18.0F, 2, 4, 4, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 24, 26, -55.0F, 8.0F, -18.0F, 2, 4, 4, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 128, 66, -14.0F, -10.0F, -19.0F, 4, 18, 6, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 32, 220, -13.0F, -8.0F, -18.0F, 4, 6, 4, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 92, 30, -13.0F, 4.0F, -18.0F, 4, 2, 4, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 76, 30, -57.0F, 4.0F, -18.0F, 4, 2, 4, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 216, 144, -57.0F, -8.0F, -18.0F, 4, 6, 4, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 38, -56.0F, -10.0F, -19.0F, 4, 18, 6, 0.0F, false));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		LR_57.addChild(Body);
		Body.cubeList.add(new ModelBox(Body, 0, 26, -4.0F, -36.0F, -4.0F, 8, 2, 8, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 84, -2.0F, -46.0F, -2.0F, 4, 10, 4, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 206, 154, -3.0F, -39.0F, -3.0F, 6, 2, 6, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 200, 26, -3.0F, -41.5F, -3.0F, 6, 2, 6, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 188, 70, -3.0F, -44.0F, -3.0F, 6, 2, 6, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 158, -6.0F, -34.0F, -6.0F, 12, 18, 12, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 188, -3.0F, -32.0F, -6.5F, 6, 14, 12, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 0, -3.0F, -32.0F, -5.5F, 6, 14, 12, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 188, 54, -7.0F, -28.0F, -4.0F, 14, 8, 8, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 168, 148, -8.0F, -27.0F, -3.0F, 16, 6, 6, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 184, 80, -5.0F, -17.0F, -5.0F, 10, 2, 10, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 150, 178, -3.0F, -16.0F, -3.0F, 6, 2, 6, 0.0F, false));

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(8.0F, -24.0F, 0.0F);
		LR_57.addChild(LeftLeg);
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 52, 176, 0.0F, -2.0F, -2.0F, 8, 4, 4, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 218, 34, 11.0F, 10.5F, -6.0F, 4, 8, 4, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 190, 190, 10.0F, 22.0F, -12.0F, 6, 2, 12, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 160, 66, 11.0F, 21.5F, -9.0F, 4, 2, 8, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 24, 0, 12.0F, 18.5F, -6.0F, 2, 4, 4, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 214, 188, 10.0F, 6.5F, -6.0F, 6, 4, 4, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 76, 16, 9.0F, 7.5F, -5.0F, 8, 2, 2, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(6.0F, -2.0F, 13.0F);
		LeftLeg.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.48F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 214, 214, 9.0F, -7.5F, 0.0F, 2, 6, 6, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 214, 3.0F, -7.5F, 0.0F, 2, 6, 6, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 108, 118, 1.0F, -6.5F, 1.0F, 12, 4, 4, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 80, 182, -1.0F, -6.5F, -13.0F, 2, 4, 18, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(6.0F, -2.0F, 14.0F);
		LeftLeg.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.7418F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 36, 190, 4.0F, -7.5F, -12.0F, 6, 6, 10, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 94, 156, 5.0F, -6.5F, -20.0F, 4, 4, 22, 0.0F, false));

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-8.0F, -24.0F, 0.0F);
		LR_57.addChild(RightLeg);
		RightLeg.cubeList.add(new ModelBox(RightLeg, 160, 80, -8.0F, -2.0F, -2.0F, 8, 4, 4, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 214, 78, -15.0F, 10.5F, -6.0F, 4, 8, 4, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 120, 190, -16.0F, 22.0F, -12.0F, 6, 2, 12, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 60, 128, -15.0F, 21.5F, -9.0F, 4, 2, 8, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 0, -14.0F, 18.5F, -6.0F, 2, 4, 4, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 212, 70, -16.0F, 6.5F, -6.0F, 6, 4, 4, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 74, 58, -17.0F, 7.5F, -5.0F, 8, 2, 2, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -2.0F, 13.0F);
		RightLeg.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.48F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 214, -11.0F, -7.5F, 0.0F, 2, 6, 6, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 112, 30, -19.0F, -6.5F, 1.0F, 12, 4, 4, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 58, 176, -7.0F, -6.5F, -13.0F, 2, 4, 18, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 80, 176, -17.0F, -7.5F, 0.0F, 2, 6, 6, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-6.0F, -2.0F, 14.0F);
		RightLeg.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.7418F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 68, 84, -10.0F, -7.5F, -12.0F, 6, 6, 10, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 146, 96, -9.0F, -6.5F, -20.0F, 4, 4, 22, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		LR_57.render(f5);
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