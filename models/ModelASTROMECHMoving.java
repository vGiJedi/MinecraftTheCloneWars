// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class ModelASTROMECHMoving extends EntityModel {
	private final ModelRenderer Head;
	private final ModelRenderer Legs;
	private final ModelRenderer Body;

	public ModelASTROMECHMoving() {
		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 6.5F, 1.5F);
		setRotationAngle(Head, -0.3491F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 20, 20, -2.5F, -1.6F, -4.5F, 5, 3, 10, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 48, -0.75F, -0.6F, -4.9F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 18, 38, 1.0F, -0.6F, -5.2F, 1, 1, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 30, 0, -2.0F, -3.6F, -4.0F, 4, 3, 9, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 36, 33, -1.0F, -3.3F, -4.3F, 2, 3, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 47, 7, -0.5F, -2.8F, -4.5F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 50, 5, -3.0F, -3.6F, -3.0F, 1, 3, 7, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 43, 48, 2.0F, -3.6F, -3.0F, 1, 3, 7, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 61, 37, -4.0F, -3.6F, -2.0F, 1, 3, 5, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 61, 28, 3.0F, -3.6F, -2.0F, 1, 3, 5, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 44, 36, -3.5F, -4.1F, -1.5F, 7, 2, 4, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 61, 22, -1.5F, -4.6F, -1.5F, 3, 2, 4, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 40, 25, -1.0F, -4.8F, -0.5F, 2, 2, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 18, 33, -2.5F, -4.6F, -1.0F, 1, 2, 3, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 22, 23, 1.5F, -4.6F, -1.0F, 1, 2, 3, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 4, -1.5F, -4.1F, -3.5F, 3, 2, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 0, -1.5F, -4.1F, 2.5F, 3, 2, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 44, -0.5F, -4.7F, 3.0F, 1, 3, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 8, 47, 1.5F, -4.1F, 2.5F, 1, 2, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 44, 36, -2.5F, -4.1F, 2.5F, 1, 2, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 8, 44, -2.5F, -4.1F, -2.5F, 1, 2, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 42, 15, 1.5F, -4.1F, -2.5F, 1, 2, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 42, 25, -3.5F, -1.6F, -3.5F, 1, 3, 8, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 40, 12, 2.5F, -1.6F, -3.5F, 1, 3, 8, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 14, 54, -4.5F, -1.6F, -2.5F, 1, 3, 6, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 53, 53, 3.5F, -1.6F, -2.5F, 1, 3, 6, 0.0F, false));

		Legs = new ModelRenderer(this);
		Legs.setRotationPoint(0.0F, 24.0F, 0.0F);
		Legs.cubeList.add(new ModelBox(Legs, 30, 12, 5.0F, -1.0F, -3.0F, 3, 1, 6, 0.0F, false));
		Legs.cubeList.add(new ModelBox(Legs, 61, 51, 5.0F, -2.0F, -2.0F, 2, 1, 4, 0.0F, false));
		Legs.cubeList.add(new ModelBox(Legs, 38, 58, 5.0F, -11.0F, -1.5F, 2, 9, 3, 0.0F, false));
		Legs.cubeList.add(new ModelBox(Legs, 16, 63, 6.2F, -12.0F, -0.5F, 1, 11, 1, 0.0F, false));
		Legs.cubeList.add(new ModelBox(Legs, 52, 42, 5.0F, -15.0F, -2.5F, 2, 4, 5, 0.0F, false));
		Legs.cubeList.add(new ModelBox(Legs, 47, 5, 6.2F, -12.5F, -2.4F, 1, 1, 1, 0.0F, false));
		Legs.cubeList.add(new ModelBox(Legs, 47, 2, 6.2F, -14.5F, -2.4F, 1, 1, 1, 0.0F, false));
		Legs.cubeList.add(new ModelBox(Legs, 28, 33, 6.2F, -14.0F, -1.0F, 1, 2, 2, 0.0F, false));
		Legs.cubeList.add(new ModelBox(Legs, 10, 23, -8.0F, -1.0F, -3.0F, 3, 1, 6, 0.0F, false));
		Legs.cubeList.add(new ModelBox(Legs, 20, 0, -1.5F, -1.0F, -7.0F, 3, 1, 6, 0.0F, false));
		Legs.cubeList.add(new ModelBox(Legs, 50, 15, -7.0F, -2.0F, -2.0F, 2, 1, 4, 0.0F, false));
		Legs.cubeList.add(new ModelBox(Legs, 12, 63, -7.2F, -12.0F, -0.5F, 1, 11, 1, 0.0F, false));
		Legs.cubeList.add(new ModelBox(Legs, 28, 54, -7.0F, -11.0F, -1.5F, 2, 9, 3, 0.0F, false));
		Legs.cubeList.add(new ModelBox(Legs, 52, 23, -7.0F, -15.0F, -2.5F, 2, 4, 5, 0.0F, false));
		Legs.cubeList.add(new ModelBox(Legs, 47, 0, -7.2F, -12.5F, -2.4F, 1, 1, 1, 0.0F, false));
		Legs.cubeList.add(new ModelBox(Legs, 32, 0, -7.2F, -14.0F, -1.0F, 1, 2, 2, 0.0F, false));
		Legs.cubeList.add(new ModelBox(Legs, 46, 25, -7.2F, -14.5F, -2.4F, 1, 1, 1, 0.0F, false));
		Legs.cubeList.add(new ModelBox(Legs, 0, 23, -0.5F, -5.4F, -5.0F, 1, 5, 2, 0.0F, false));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 23.0F, -4.0F);
		setRotationAngle(Body, -0.3491F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 30, 12, 4.0F, -14.0F, -1.0F, 1, 2, 2, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 10, 23, -5.0F, -14.0F, -1.0F, 1, 2, 2, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 44, -4.5F, -16.0F, -3.0F, 1, 13, 6, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 36, 36, 3.5F, -16.0F, -3.0F, 1, 13, 6, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 18, 33, 2.5F, -16.0F, -4.0F, 1, 13, 8, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 23, -3.5F, -16.0F, -4.0F, 1, 13, 8, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 0, -2.5F, -16.0F, -5.0F, 5, 13, 10, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 40, 23, -2.0F, -15.9F, -5.2F, 4, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 20, 0, -1.0F, -11.6F, -5.2F, 2, 4, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 36, 40, -0.5F, -11.1F, -5.4F, 1, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 22, 38, -0.5F, -9.1F, -5.4F, 1, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 36, 37, -0.5F, -5.1F, -5.2F, 1, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 8, 63, 2.0F, -15.5F, -4.5F, 1, 12, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 4, 63, -3.0F, -15.5F, -4.5F, 1, 12, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 63, -3.0F, -15.5F, 3.5F, 1, 12, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 60, 62, -4.0F, -15.5F, 2.5F, 1, 12, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 56, 62, -4.0F, -15.5F, -3.5F, 1, 12, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 52, 62, 3.0F, -15.5F, -3.5F, 1, 12, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 48, 58, 3.0F, -15.5F, 2.5F, 1, 12, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 14, 44, 2.0F, -15.5F, 3.5F, 1, 12, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 64, 64, -2.0F, -3.5F, -4.5F, 4, 1, 2, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 61, 56, -2.0F, -3.5F, 2.5F, 4, 1, 2, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 58, 15, -2.0F, -3.0F, -3.0F, 1, 1, 6, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 28, 33, 1.0F, -3.0F, -3.0F, 1, 1, 6, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 30, 7, -1.0F, -3.0F, -3.0F, 2, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 10, 27, -1.0F, -3.0F, 2.0F, 2, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 59, 6, 2.0F, -3.5F, -2.5F, 2, 1, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 59, 0, -4.0F, -3.5F, -2.5F, 2, 1, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 28, 37, -3.0F, -3.5F, -3.5F, 1, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 32, 4, 2.0F, -3.5F, -3.5F, 1, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 30, 16, 2.0F, -3.5F, 2.5F, 1, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 4, 23, -3.0F, -3.5F, 2.5F, 1, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 47, 0, -2.0F, -16.1F, -2.0F, 4, 1, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Head.render(f5);
		Legs.render(f5);
		Body.render(f5);
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