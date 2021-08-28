// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class ModelRPS_6_Rocket extends EntityModel {
	private final ModelRenderer bb_main;

	public ModelRPS_6_Rocket() {
		textureWidth = 16;
		textureHeight = 16;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 14.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 11, 0.5F, 0.5F, -0.5F, 1, 2, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 10, 3, -1.5F, 0.5F, -0.5F, 1, 2, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 8, 0, -0.5F, 0.5F, 0.5F, 1, 2, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 7, 5, -0.5F, 0.5F, -1.5F, 1, 2, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 8, 8, -0.5F, 4.0F, -0.5F, 1, 3, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 6, -1.0F, 6.0F, -1.0F, 2, 3, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 4, 11, -0.5F, 9.0F, -0.5F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bb_main.render(f5);
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