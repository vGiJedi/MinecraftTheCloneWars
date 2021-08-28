// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class ModelDestroyerDroidLaser extends EntityModel {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;

	public ModelDestroyerDroidLaser() {
		textureWidth = 32;
		textureHeight = 32;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 15.0F, 0.0F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(3.0F, 1.5F, 5.0F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, -1.5708F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -8.0F, 7.0F, -8.0F, 1, 1, 6, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 8, 8, 1.0F, 7.0F, -8.0F, 1, 1, 6, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 7, -11.0F, 7.0F, -8.0F, 1, 1, 6, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 8, 1, 4.0F, 7.0F, -8.0F, 1, 1, 6, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
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