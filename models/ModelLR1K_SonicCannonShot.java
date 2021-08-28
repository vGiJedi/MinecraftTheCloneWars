// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class ModelLR1K_SonicCannonShot extends EntityModel {
	private final ModelRenderer LR1KSonicCannonShot;

	public ModelLR1K_SonicCannonShot() {
		textureWidth = 128;
		textureHeight = 128;

		LR1KSonicCannonShot = new ModelRenderer(this);
		LR1KSonicCannonShot.setRotationPoint(0.0F, 24.0F, 0.0F);
		LR1KSonicCannonShot.cubeList
				.add(new ModelBox(LR1KSonicCannonShot, 30, 0, -12.0F, -12.0F, -9.0F, 3, 3, 18, 0.0F, false));
		LR1KSonicCannonShot.cubeList
				.add(new ModelBox(LR1KSonicCannonShot, 0, 27, -3.0F, -30.0F, 3.0F, 6, 3, 3, 0.0F, false));
		LR1KSonicCannonShot.cubeList
				.add(new ModelBox(LR1KSonicCannonShot, 0, 18, -3.0F, -30.0F, -6.0F, 6, 3, 3, 0.0F, false));
		LR1KSonicCannonShot.cubeList
				.add(new ModelBox(LR1KSonicCannonShot, 0, 9, -6.0F, -30.0F, -3.0F, 3, 3, 6, 0.0F, false));
		LR1KSonicCannonShot.cubeList
				.add(new ModelBox(LR1KSonicCannonShot, 0, 0, 3.0F, -30.0F, -3.0F, 3, 3, 6, 0.0F, false));
		LR1KSonicCannonShot.cubeList
				.add(new ModelBox(LR1KSonicCannonShot, 54, 30, 6.0F, -21.0F, -6.0F, 3, 3, 12, 0.0F, false));
		LR1KSonicCannonShot.cubeList
				.add(new ModelBox(LR1KSonicCannonShot, 30, 54, -9.0F, -21.0F, -6.0F, 3, 3, 12, 0.0F, false));
		LR1KSonicCannonShot.cubeList
				.add(new ModelBox(LR1KSonicCannonShot, 54, 12, -6.0F, -21.0F, -9.0F, 12, 3, 3, 0.0F, false));
		LR1KSonicCannonShot.cubeList
				.add(new ModelBox(LR1KSonicCannonShot, 54, 6, -6.0F, -21.0F, 6.0F, 12, 3, 3, 0.0F, false));
		LR1KSonicCannonShot.cubeList
				.add(new ModelBox(LR1KSonicCannonShot, 54, 0, -9.0F, -12.0F, 9.0F, 18, 3, 3, 0.0F, false));
		LR1KSonicCannonShot.cubeList
				.add(new ModelBox(LR1KSonicCannonShot, 0, 54, -9.0F, -12.0F, -12.0F, 18, 3, 3, 0.0F, false));
		LR1KSonicCannonShot.cubeList
				.add(new ModelBox(LR1KSonicCannonShot, 30, 30, 9.0F, -12.0F, -9.0F, 3, 3, 18, 0.0F, false));
		LR1KSonicCannonShot.cubeList
				.add(new ModelBox(LR1KSonicCannonShot, 0, 27, 12.0F, -3.0F, -12.0F, 3, 3, 24, 0.0F, false));
		LR1KSonicCannonShot.cubeList
				.add(new ModelBox(LR1KSonicCannonShot, 51, 24, -12.0F, -3.0F, 12.0F, 24, 3, 3, 0.0F, false));
		LR1KSonicCannonShot.cubeList
				.add(new ModelBox(LR1KSonicCannonShot, 51, 51, -12.0F, -3.0F, -15.0F, 24, 3, 3, 0.0F, false));
		LR1KSonicCannonShot.cubeList
				.add(new ModelBox(LR1KSonicCannonShot, 0, 0, -15.0F, -3.0F, -12.0F, 3, 3, 24, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		LR1KSonicCannonShot.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}