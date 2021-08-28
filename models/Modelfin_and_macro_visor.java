// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class Modelfin_and_macro_visor extends EntityModel {
	private final ModelRenderer Head;

	public Modelfin_and_macro_visor() {
		textureWidth = 32;
		textureHeight = 32;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -5.75F, -6.0F, 8, 2, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 7, -3.5F, -5.25F, -6.5F, 7, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 11, -1.0F, -8.5F, -3.5F, 2, 1, 7, 0.0F, false));
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