// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class ModelGonkDroid extends EntityModel {
	private final ModelRenderer Gonk;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer RightLeg;
	private final ModelRenderer Body;

	public ModelGonkDroid() {
		textureWidth = 128;
		textureHeight = 128;

		Gonk = new ModelRenderer(this);
		Gonk.setRotationPoint(0.0F, 24.0F, 0.0F);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(0.0F, 0.0F, 0.0F);
		Gonk.addChild(LeftLeg);
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 40, 1, 0.5F, -1.0F, -3.0F, 3, 1, 5, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 37, 1.0F, -4.0F, -1.2F, 2, 3, 2, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 35, 9, 1.0F, -1.2F, -2.0F, 2, 1, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 29, 9, 1.0F, -1.1F, -2.9F, 2, 1, 1, 0.0F, false));

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(0.0F, 0.0F, 0.0F);
		Gonk.addChild(RightLeg);
		RightLeg.cubeList.add(new ModelBox(RightLeg, 29, 0, -3.5F, -1.0F, -3.0F, 3, 1, 5, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 45, 34, -3.0F, -4.0F, -1.2F, 2, 3, 2, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 6, 28, -3.0F, -1.2F, -2.0F, 2, 1, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 28, -3.0F, -1.1F, -2.9F, 2, 1, 1, 0.0F, false));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Gonk.addChild(Body);
		Body.cubeList.add(new ModelBox(Body, 32, 39, -3.5F, -5.0F, -4.0F, 7, 1, 8, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 32, 8, -4.0F, -8.5F, -5.0F, 8, 4, 10, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 34, 22, -4.0F, -21.5F, -5.0F, 8, 2, 10, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 31, -4.5F, -12.5F, -5.5F, 9, 5, 11, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 0, -4.5F, -19.5F, -5.5F, 9, 7, 11, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 18, -5.0F, -13.0F, -6.0F, 10, 1, 12, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 29, 36, -3.5F, -19.0F, -5.8F, 7, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 29, 34, -3.5F, -15.0F, -5.8F, 7, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 6, 0, -3.5F, -18.0F, -5.8F, 1, 3, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 0, 2.5F, -18.0F, -5.8F, 1, 3, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 38, 22, 0.0F, -17.7F, -5.7F, 2, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 39, 28, -1.0F, -15.7F, -5.7F, 1, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 37, 6, -2.0F, -17.0F, -5.7F, 1, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 6, -3.0F, -22.0F, -4.4F, 2, 1, 3, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 29, 38, -2.0F, -21.6F, -1.4F, 1, 1, 3, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 29, 6, -2.0F, -22.0F, 1.6F, 3, 1, 2, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 34, 38, -4.0F, -11.6F, -5.7F, 2, 2, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 18, 47, 0.0F, -10.6F, -5.6F, 3, 2, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 26, 47, 0.0F, -8.6F, -5.1F, 2, 3, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 6, 37, -3.5F, -11.0F, -6.2F, 1, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 6, 33, -4.6F, -11.5F, 3.0F, 1, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 6, 22, -5.0F, -18.5F, 3.0F, 1, 2, 2, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 31, -5.0F, -15.5F, 3.0F, 1, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 33, -4.6F, -11.5F, 1.5F, 1, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 29, 31, -4.6F, -11.5F, 0.0F, 1, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 6, 31, -4.6F, -11.5F, -1.5F, 1, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 31, -4.6F, -15.5F, -3.5F, 1, 2, 4, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 22, -4.6F, -18.5F, -3.5F, 1, 2, 4, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 12, 47, 3.6F, -18.5F, -4.5F, 1, 3, 2, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 0, 3.6F, -16.5F, -0.5F, 1, 2, 4, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 24, 3.6F, -9.5F, -4.5F, 1, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 22, 3.6F, -9.5F, -2.5F, 1, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 7, 7, 3.6F, -9.5F, -0.5F, 1, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 4, 47, -4.6F, -16.5F, -2.5F, 1, 1, 3, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 32, 22, -1.0F, -19.0F, 5.5F, 2, 5, 2, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 18, -1.5F, -17.0F, 5.0F, 3, 1, 3, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 29, 2, -0.5F, -19.2F, 6.0F, 1, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 29, 0, -0.5F, -14.7F, 6.0F, 1, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 47, 2.8F, -29.0F, 3.0F, 0, 8, 0, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Gonk.render(f5);
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