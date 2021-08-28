// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class ModelVisor extends EntityModel {
	private final ModelRenderer Head;

	public ModelVisor() {
		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 110, -5.0F, -6.75F, -6.0F, 10, 1, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 20, 104, 4.0F, -6.75F, -4.0F, 1, 1, 5, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 20, 98, -5.0F, -6.75F, -4.0F, 1, 1, 5, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 18, 118, -5.0F, -5.75F, -6.0F, 1, 1, 5, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 11, 117, 4.0F, -5.75F, -6.0F, 1, 1, 5, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 27, 98, 4.0F, -4.75F, -6.0F, 1, 2, 3, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 26, 122, -5.0F, -4.75F, -6.0F, 1, 2, 3, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 24, 110, -5.0F, -2.75F, -5.0F, 1, 1, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 16, 98, 4.0F, -2.75F, -5.0F, 1, 1, 2, 0.0F, false));
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