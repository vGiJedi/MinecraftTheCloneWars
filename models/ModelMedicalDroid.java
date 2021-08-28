// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class ModelMedicalDroid extends EntityModel {
	private final ModelRenderer MedicalDroid;
	private final ModelRenderer RotatingArm;

	public ModelMedicalDroid() {
		textureWidth = 256;
		textureHeight = 256;

		MedicalDroid = new ModelRenderer(this);
		MedicalDroid.setRotationPoint(0.0F, 24.0F, 0.0F);
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 51, 20, -8.0F, -1.0F, -8.0F, 16, 1, 16, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 48, 48, -8.0F, -3.5F, -8.0F, 16, 1, 16, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 93, 70, -7.5F, -4.0F, -7.5F, 15, 1, 15, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 56, 103, -7.0F, -7.0F, -7.0F, 14, 3, 14, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 78, 87, -7.5F, -7.5F, -7.5F, 15, 1, 15, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 0, 57, -6.0F, -27.5F, -6.0F, 12, 20, 12, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 98, 54, -7.0F, -27.5F, -7.0F, 14, 1, 14, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 0, 102, -7.0F, -35.5F, -7.0F, 14, 3, 14, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 36, 63, -2.0F, -35.0F, -7.25F, 4, 2, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 36, 57, -7.25F, -35.0F, -2.0F, 1, 2, 4, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 54, 57, -2.0F, -35.0F, 6.25F, 4, 2, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 82, 87, -6.0F, -35.0F, 6.25F, 1, 2, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 48, 57, -6.0F, -35.0F, -7.25F, 1, 2, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 36, 57, -7.25F, -35.0F, 5.0F, 1, 2, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 14, 11, 6.25F, -35.0F, -6.0F, 1, 2, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 78, 87, 5.0F, -35.0F, 6.25F, 1, 2, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 60, 60, 5.0F, -35.0F, -7.25F, 1, 2, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 42, 57, -7.25F, -35.0F, -6.0F, 1, 2, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 14, 15, 6.25F, -35.0F, 5.0F, 1, 2, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 48, 57, 6.25F, -35.0F, -2.0F, 1, 2, 4, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 99, 107, -6.5F, -37.5F, -6.5F, 13, 3, 13, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 8, 89, 2.5F, -38.0F, -4.0F, 1, 3, 8, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 0, 0, -3.5F, -38.0F, -4.0F, 1, 3, 8, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 0, 57, -2.5F, -38.0F, 3.0F, 5, 3, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 54, 11, -2.5F, -38.0F, -4.0F, 5, 3, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 0, 119, -6.5F, -43.5F, -6.5F, 13, 1, 13, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 99, 0, -6.5F, -52.5F, -6.5F, 13, 1, 13, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 78, 37, -3.5F, -53.0F, -3.5F, 7, 1, 7, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 54, 6, -0.5F, -54.0F, -1.5F, 3, 2, 3, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 0, 11, -2.5F, -53.5F, -1.5F, 1, 2, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 99, 17, -7.0F, -45.75F, -7.0F, 14, 3, 14, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 48, 44, -5.0F, -45.0F, -1.0F, 14, 2, 2, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 70, 120, -1.0F, -45.0F, -9.0F, 2, 2, 14, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 48, 40, -9.0F, -45.0F, -1.0F, 14, 2, 2, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 38, 119, -1.0F, -45.0F, -5.0F, 2, 2, 14, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 96, 37, -7.0F, -51.75F, -7.0F, 14, 3, 14, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 33, 85, -7.5F, -47.25F, -7.5F, 15, 2, 15, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 54, 0, -7.5F, -51.25F, -7.5F, 15, 2, 15, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 0, 20, -8.5F, -50.25F, -8.5F, 17, 3, 17, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 48, 48, -1.5F, -42.5F, -1.5F, 3, 5, 3, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 6, 61, 5.0F, -42.5F, 3.5F, 1, 6, 2, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 10, 0, 5.0F, -42.5F, -5.5F, 1, 6, 2, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 0, 61, -6.0F, -42.5F, 3.5F, 1, 6, 2, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 0, 0, -6.0F, -42.5F, -5.5F, 1, 6, 2, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 56, 69, 4.0F, -42.5F, 4.5F, 1, 6, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 48, 68, 4.0F, -42.5F, -5.5F, 1, 6, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 52, 68, -5.0F, -42.5F, 4.5F, 1, 6, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 60, 48, -5.0F, -42.5F, -5.5F, 1, 6, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 134, 134, 6.0F, -26.5F, -7.0F, 1, 19, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 8, 133, 6.0F, -26.5F, 6.0F, 1, 19, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 4, 133, 6.0F, -26.5F, 3.5F, 1, 19, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 126, 126, -7.0F, -26.5F, 3.5F, 1, 19, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 0, 133, 6.0F, -26.5F, -4.5F, 1, 19, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 130, 130, -7.0F, -26.5F, -4.5F, 1, 19, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 102, 123, 6.0F, -26.5F, -1.5F, 1, 19, 3, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 0, 89, -7.0F, -26.5F, -1.5F, 1, 19, 3, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 32, 133, -7.0F, -26.5F, -7.0F, 1, 19, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 20, 133, -7.0F, -26.5F, 6.0F, 1, 19, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 28, 133, -4.5F, -26.5F, -7.0F, 1, 19, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 16, 133, -4.5F, -26.5F, 6.0F, 1, 19, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 24, 133, 3.5F, -26.5F, -7.0F, 1, 19, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 56, 77, 4.75F, -25.5F, -7.5F, 1, 1, 2, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 72, 17, 4.75F, -25.5F, 5.5F, 1, 1, 2, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 85, 46, 5.5F, -25.5F, -5.75F, 2, 1, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 80, 45, -7.5F, -25.5F, 4.75F, 2, 1, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 131, 86, 4.75F, -24.5F, -8.0F, 1, 15, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 51, 20, 4.75F, -24.5F, 7.0F, 1, 15, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 0, 40, 7.0F, -24.5F, -5.75F, 1, 15, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 0, 20, -8.0F, -24.5F, 4.75F, 1, 15, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 127, 86, -5.75F, -24.5F, -8.0F, 1, 15, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 63, 20, -5.75F, -24.5F, 7.0F, 1, 15, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 12, 40, 7.0F, -24.5F, 4.75F, 1, 15, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 12, 20, -8.0F, -24.5F, -5.75F, 1, 15, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 123, 86, -3.0F, -24.5F, -8.0F, 1, 15, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 59, 20, -3.0F, -24.5F, 7.0F, 1, 15, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 8, 40, 7.0F, -24.5F, 2.0F, 1, 15, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 8, 20, -8.0F, -24.5F, -3.0F, 1, 15, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 8, 100, 2.0F, -24.5F, -8.0F, 1, 15, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 55, 20, 2.0F, -24.5F, 7.0F, 1, 15, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 4, 40, 7.0F, -24.5F, -3.0F, 1, 15, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 4, 20, -8.0F, -24.5F, 2.0F, 1, 15, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 52, 76, -5.75F, -25.5F, -7.5F, 1, 1, 2, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 63, 0, -5.75F, -25.5F, 5.5F, 1, 1, 2, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 84, 17, 5.5F, -25.5F, 4.75F, 2, 1, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 48, 65, -7.5F, -25.5F, -5.75F, 2, 1, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 48, 75, -3.0F, -25.5F, -7.5F, 1, 1, 2, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 63, 6, -3.0F, -25.5F, 5.5F, 1, 1, 2, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 78, 85, 5.5F, -25.5F, 2.0F, 2, 1, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 78, 37, -7.5F, -25.5F, -3.0F, 2, 1, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 74, 37, 2.0F, -25.5F, -7.5F, 1, 1, 2, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 68, 37, 2.0F, -25.5F, 5.5F, 1, 1, 2, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 84, 85, 5.5F, -25.5F, -3.0F, 2, 1, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 78, 40, -7.5F, -25.5F, 2.0F, 2, 1, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 12, 133, 3.5F, -26.5F, 6.0F, 1, 19, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 118, 123, -1.5F, -26.5F, -7.0F, 3, 19, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 110, 123, -1.5F, -26.5F, 6.0F, 3, 19, 1, 0.0F, false));
		MedicalDroid.cubeList.add(new ModelBox(MedicalDroid, 0, 0, -9.0F, -3.0F, -9.0F, 18, 2, 18, 0.0F, false));

		RotatingArm = new ModelRenderer(this);
		RotatingArm.setRotationPoint(0.0F, -31.0F, 0.0F);
		MedicalDroid.addChild(RotatingArm);
		RotatingArm.cubeList.add(new ModelBox(RotatingArm, 48, 65, -7.5F, -1.5F, -7.5F, 15, 5, 15, 0.0F, false));
		RotatingArm.cubeList.add(new ModelBox(RotatingArm, 0, 40, -8.0F, 0.5F, -8.0F, 16, 1, 16, 0.0F, false));
		RotatingArm.cubeList.add(new ModelBox(RotatingArm, 54, 0, -1.5F, -0.5F, -8.25F, 3, 3, 3, 0.0F, false));
		RotatingArm.cubeList.add(new ModelBox(RotatingArm, 0, 11, -1.0F, 0.0F, -12.5F, 2, 2, 5, 0.0F, false));
		RotatingArm.cubeList.add(new ModelBox(RotatingArm, 36, 57, -0.5F, 0.5F, -22.5F, 1, 1, 10, 0.0F, false));
		RotatingArm.cubeList.add(new ModelBox(RotatingArm, 55, 60, -1.5F, 1.25F, -26.0F, 1, 1, 3, 0.0F, false));
		RotatingArm.cubeList.add(new ModelBox(RotatingArm, 9, 11, 0.5F, 1.25F, -26.0F, 1, 1, 3, 0.0F, false));
		RotatingArm.cubeList.add(new ModelBox(RotatingArm, 78, 17, -1.0F, 0.0F, -23.5F, 2, 2, 1, 0.0F, false));
		RotatingArm.cubeList.add(new ModelBox(RotatingArm, 55, 65, -0.5F, -0.5F, -26.0F, 1, 1, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		MedicalDroid.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.RotatingArm.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.RotatingArm.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}