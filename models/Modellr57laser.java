// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class Modellr57laser extends EntityModel {
	private final ModelRenderer Laser;
	private final ModelRenderer cube_r2_r2_r1;
	private final ModelRenderer cube_r1_r1_r1;

	public Modellr57laser() {
		textureWidth = 32;
		textureHeight = 32;

		Laser = new ModelRenderer(this);
		Laser.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(Laser, 0.0F, -1.5708F, 0.0F);

		cube_r2_r2_r1 = new ModelRenderer(this);
		cube_r2_r2_r1.setRotationPoint(1.0F, -10.0F, 2.0F);
		Laser.addChild(cube_r2_r2_r1);
		setRotationAngle(cube_r2_r2_r1, 1.5708F, 0.0F, 0.0F);
		cube_r2_r2_r1.cubeList.add(new ModelBox(cube_r2_r2_r1, 0, 0, -4.0F, -13.0F, -16.5F, 1, 1, 8, 0.0F, false));
		cube_r2_r2_r1.cubeList.add(new ModelBox(cube_r2_r2_r1, 0, 0, 1.0F, -13.0F, -16.5F, 1, 1, 8, 0.0F, false));

		cube_r1_r1_r1 = new ModelRenderer(this);
		cube_r1_r1_r1.setRotationPoint(1.0F, -10.0F, 23.0F);
		Laser.addChild(cube_r1_r1_r1);
		setRotationAngle(cube_r1_r1_r1, 1.5708F, 0.0F, 0.0F);
		cube_r1_r1_r1.cubeList.add(new ModelBox(cube_r1_r1_r1, 0, 0, -4.0F, -13.0F, -16.5F, 1, 1, 8, 0.0F, false));
		cube_r1_r1_r1.cubeList.add(new ModelBox(cube_r1_r1_r1, 0, 0, 1.0F, -13.0F, -16.5F, 1, 1, 8, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Laser.render(f5);
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