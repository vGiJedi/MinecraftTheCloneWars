// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class ModelFixerAntenna extends EntityModel {
	private final ModelRenderer Head;

	public ModelFixerAntenna() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 50, 4.0F, -6.5F, -2.5F, 1, 3, 3, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 60, 4.0F, -9.5F, -2.5F, 1, 3, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 6, 61, 4.0F, -8.5F, -0.5F, 1, 2, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 12, 54, 3.5F, -3.5F, -2.5F, 1, 2, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Head.render(f5);
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