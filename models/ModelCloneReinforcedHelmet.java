// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class ModelCloneReinforcedHelmet extends EntityModel {
	private final ModelRenderer Head;

	public ModelCloneReinforcedHelmet() {
		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 116, -4.5F, -6.0F, -0.25F, 9, 5, 5, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 108, 3.75F, -6.5F, 0.0F, 1, 2, 3, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 10, 108, -4.75F, -6.5F, 0.0F, 1, 2, 3, 0.0F, true));
		Head.cubeList.add(new ModelBox(Head, 21, 107, 3.5F, -11.0F, 0.75F, 1, 4, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 94, -4.5F, -7.0F, -4.5F, 9, 1, 9, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 32, 117, 1.5F, -3.9F, -4.25F, 3, 4, 4, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 40, 106, -4.5F, -3.9F, -4.25F, 3, 4, 4, 0.0F, true));
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