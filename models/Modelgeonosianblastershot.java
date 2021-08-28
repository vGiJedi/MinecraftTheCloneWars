// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class Modelgeonosianblastershot extends EntityModel {
	private final ModelRenderer geonosianblastershot;

	public Modelgeonosianblastershot() {
		textureWidth = 64;
		textureHeight = 64;

		geonosianblastershot = new ModelRenderer(this);
		geonosianblastershot.setRotationPoint(0.0F, 24.0F, 0.0F);
		geonosianblastershot.cubeList
				.add(new ModelBox(geonosianblastershot, 10, 10, -4.0F, -4.0F, -3.0F, 1, 1, 6, 0.0F, false));
		geonosianblastershot.cubeList
				.add(new ModelBox(geonosianblastershot, 0, 9, -1.0F, -10.0F, 1.0F, 2, 1, 1, 0.0F, false));
		geonosianblastershot.cubeList
				.add(new ModelBox(geonosianblastershot, 0, 6, -1.0F, -10.0F, -2.0F, 2, 1, 1, 0.0F, false));
		geonosianblastershot.cubeList
				.add(new ModelBox(geonosianblastershot, 0, 3, -2.0F, -10.0F, -1.0F, 1, 1, 2, 0.0F, false));
		geonosianblastershot.cubeList
				.add(new ModelBox(geonosianblastershot, 0, 0, 1.0F, -10.0F, -1.0F, 1, 1, 2, 0.0F, false));
		geonosianblastershot.cubeList
				.add(new ModelBox(geonosianblastershot, 18, 10, 2.0F, -7.0F, -2.0F, 1, 1, 4, 0.0F, false));
		geonosianblastershot.cubeList
				.add(new ModelBox(geonosianblastershot, 10, 18, -3.0F, -7.0F, -2.0F, 1, 1, 4, 0.0F, false));
		geonosianblastershot.cubeList
				.add(new ModelBox(geonosianblastershot, 18, 4, -2.0F, -7.0F, -3.0F, 4, 1, 1, 0.0F, false));
		geonosianblastershot.cubeList
				.add(new ModelBox(geonosianblastershot, 18, 2, -2.0F, -7.0F, 2.0F, 4, 1, 1, 0.0F, false));
		geonosianblastershot.cubeList
				.add(new ModelBox(geonosianblastershot, 18, 0, -3.0F, -4.0F, 3.0F, 6, 1, 1, 0.0F, false));
		geonosianblastershot.cubeList
				.add(new ModelBox(geonosianblastershot, 0, 18, -3.0F, -4.0F, -4.0F, 6, 1, 1, 0.0F, false));
		geonosianblastershot.cubeList
				.add(new ModelBox(geonosianblastershot, 10, 0, 3.0F, -4.0F, -3.0F, 1, 1, 6, 0.0F, false));
		geonosianblastershot.cubeList
				.add(new ModelBox(geonosianblastershot, 0, 9, 4.0F, -1.0F, -4.0F, 1, 1, 8, 0.0F, false));
		geonosianblastershot.cubeList
				.add(new ModelBox(geonosianblastershot, 17, 8, -4.0F, -1.0F, 4.0F, 8, 1, 1, 0.0F, false));
		geonosianblastershot.cubeList
				.add(new ModelBox(geonosianblastershot, 17, 17, -4.0F, -1.0F, -5.0F, 8, 1, 1, 0.0F, false));
		geonosianblastershot.cubeList
				.add(new ModelBox(geonosianblastershot, 0, 0, -5.0F, -1.0F, -4.0F, 1, 1, 8, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		geonosianblastershot.render(f5);
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