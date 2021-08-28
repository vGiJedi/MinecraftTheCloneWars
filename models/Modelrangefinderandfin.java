// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class Modelrangefinderandfin extends EntityModel {
	private final ModelRenderer Head;

	public Modelrangefinderandfin() {
		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 92, -1.0F, -9.0F, -3.5F, 2, 1, 7, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 78, -0.5F, -9.5F, -3.25F, 1, 1, 7, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 12, 114, -1.0F, -10.0F, -1.9F, 2, 1, 7, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 124, -6.0F, -5.5F, -0.5F, 2, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 111, -6.0F, -10.5F, -0.5F, 1, 5, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 8, 106, -6.5F, -11.5F, -0.5F, 3, 1, 1, 0.0F, false));
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