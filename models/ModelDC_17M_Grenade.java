// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class ModelDC_17M_Grenade extends EntityModel {
	private final ModelRenderer Grenade;

	public ModelDC_17M_Grenade() {
		textureWidth = 4;
		textureHeight = 4;

		Grenade = new ModelRenderer(this);
		Grenade.setRotationPoint(-13.75F, 9.0F, 20.0F);
		Grenade.cubeList.add(new ModelBox(Grenade, 2, 3, 13.25F, 11.0F, -20.5F, 1, 1, 1, 0.0F, false));
		Grenade.cubeList.add(new ModelBox(Grenade, 1, 1, 13.125F, 11.5F, -20.625F, 1, 2, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Grenade.render(f5);
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