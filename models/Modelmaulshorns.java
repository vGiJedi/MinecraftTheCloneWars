// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class Modelmaulshorns extends EntityModel {
	private final ModelRenderer Head;

	public Modelmaulshorns() {
		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 120, 3.5F, -6.5F, -2.0F, 2, 1, 1, 0.0F, true));
		Head.cubeList.add(new ModelBox(Head, 11, 112, 4.5F, -7.5F, -2.0F, 1, 1, 1, 0.0F, true));
		Head.cubeList.add(new ModelBox(Head, 30, 101, -5.5F, -6.5F, -2.0F, 2, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 20, 112, -5.5F, -7.5F, -2.0F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 30, 108, -0.5F, -9.0F, -3.0F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 105, 2.0F, -9.0F, -2.25F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 100, -3.0F, -9.0F, -2.25F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 1, 125, 3.5F, -6.75F, 2.0F, 2, 1, 1, 0.0F, true));
		Head.cubeList.add(new ModelBox(Head, 20, 117, 4.5F, -8.75F, 2.0F, 1, 2, 1, 0.0F, true));
		Head.cubeList.add(new ModelBox(Head, 31, 115, -5.5F, -8.75F, 2.0F, 1, 2, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 9, 117, -5.5F, -6.75F, 2.0F, 2, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 19, 100, -0.5F, -9.0F, 2.5F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 12, 106, -0.5F, -6.0F, 3.5F, 1, 1, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 11, 100, -0.5F, -8.0F, 4.5F, 1, 2, 1, 0.0F, false));
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