// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class Modelpauldronleftside extends EntityModel {
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;

	public Modelpauldronleftside() {
		textureWidth = 128;
		textureHeight = 128;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 13, -5.5F, -0.25F, -2.5F, 2, 2, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 24, -3.5F, 0.25F, -2.5F, 7, 2, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 37, 3.5F, 0.75F, -3.0F, 5, 1, 6, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 29, 0, 3.5F, -0.25F, -3.0F, 6, 1, 6, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 2, 3, 4.5F, -0.75F, -2.0F, 6, 1, 4, 0.0F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);

	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Body.render(f5);
		RightArm.render(f5);
		LeftArm.render(f5);
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