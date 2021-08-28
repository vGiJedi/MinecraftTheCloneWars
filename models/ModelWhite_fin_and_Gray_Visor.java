// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class ModelWhite_fin_and_Gray_Visor extends EntityModel {
	private final ModelRenderer Head;

	public ModelWhite_fin_and_Gray_Visor() {
		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 83, -5.0F, -7.0F, -6.0F, 10, 1, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 89, -3.5F, -7.5F, -5.0F, 7, 1, 1, 0.0F, true));
		Head.cubeList.add(new ModelBox(Head, 0, 96, 4.0F, -7.0F, -4.0F, 1, 1, 5, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 15, 96, -5.0F, -7.0F, -4.0F, 1, 1, 5, 0.0F, true));
		Head.cubeList.add(new ModelBox(Head, 0, 106, -5.0F, -6.0F, -6.0F, 1, 1, 6, 0.0F, true));
		Head.cubeList.add(new ModelBox(Head, 18, 106, -5.0F, -5.0F, -6.0F, 1, 1, 5, 0.0F, true));
		Head.cubeList.add(new ModelBox(Head, 0, 116, -5.0F, -4.0F, -5.0F, 1, 1, 4, 0.0F, true));
		Head.cubeList.add(new ModelBox(Head, 14, 116, -5.0F, -3.0F, -4.0F, 1, 1, 3, 0.0F, true));
		Head.cubeList.add(new ModelBox(Head, 0, 123, 4.0F, -3.0F, -4.0F, 1, 1, 3, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 10, 123, 4.0F, -4.0F, -5.0F, 1, 1, 4, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 29, 92, 4.0F, -5.0F, -6.0F, 1, 1, 5, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 33, 110, 4.0F, -6.0F, -6.0F, 1, 1, 6, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 28, 120, -1.0F, -8.5F, -3.5F, 2, 1, 7, 0.0F, false));
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