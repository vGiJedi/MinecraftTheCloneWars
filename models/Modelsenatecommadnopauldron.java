// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class Modelsenatecommadnopauldron extends EntityModel {
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;
	private final ModelRenderer Body;

	public Modelsenatecommadnopauldron() {
		textureWidth = 128;
		textureHeight = 128;

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 0, -0.5F, -2.5F, -2.5F, 4, 4, 5, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 13, 0.5F, 1.5F, -2.5F, 3, 2, 5, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 24, 1.5F, 3.5F, -2.5F, 2, 1, 5, 0.0F, false));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);

	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		RightArm.render(f5);
		LeftArm.render(f5);
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