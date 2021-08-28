// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class ModelProbeDroid extends EntityModel {
	private final ModelRenderer ProbeDroid;
	private final ModelRenderer Head;
	private final ModelRenderer Torso;
	private final ModelRenderer Legs;

	public ModelProbeDroid() {
		textureWidth = 128;
		textureHeight = 128;

		ProbeDroid = new ModelRenderer(this);
		ProbeDroid.setRotationPoint(0.0F, 24.0F, 0.0F);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -26.0F, 0.0F);
		ProbeDroid.addChild(Head);
		Head.cubeList.add(new ModelBox(Head, 0, 84, -8.0F, -1.0F, -6.0F, 16, 2, 12, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 60, 42, -8.0F, -7.0F, -6.0F, 16, 2, 12, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 48, 94, -4.0F, -7.6F, -4.0F, 8, 2, 8, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 8, -3.0F, -7.8F, -2.0F, 4, 2, 4, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 66, -10.0F, -6.0F, -6.0F, 20, 6, 12, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 56, 56, -8.0F, -6.0F, -8.0F, 16, 6, 16, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 0, -2.0F, -5.0F, -8.5F, 4, 4, 4, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 92, 6.5F, -5.0F, -0.5F, 4, 2, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 90, 20, -11.5F, -6.4F, -0.5F, 4, 2, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 80, 18, -10.4F, -3.5F, -4.0F, 4, 2, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 8, 14, 6.5F, -3.0F, -4.5F, 4, 2, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 52, 64, -2.0F, -5.0F, 5.5F, 2, 2, 4, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 64, 2.0F, -5.0F, 5.5F, 2, 2, 4, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 60, 0, -9.0F, -5.0F, -7.0F, 18, 4, 14, 0.0F, false));

		Torso = new ModelRenderer(this);
		Torso.setRotationPoint(0.0F, 0.0F, 0.0F);
		ProbeDroid.addChild(Torso);
		Torso.cubeList.add(new ModelBox(Torso, 62, 32, -5.0F, -15.0F, -1.0F, 2, 2, 2, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 0, 0, -10.0F, -23.0F, -10.0F, 20, 4, 20, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 10, 58, -10.4F, -22.0F, -4.0F, 2, 2, 2, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 8, 54, 8.4F, -22.0F, -4.0F, 2, 2, 2, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 60, 6, 0.4F, -24.0F, -10.5F, 4, 4, 2, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 60, 0, -4.4F, -24.0F, -10.5F, 4, 4, 2, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 54, 56, -4.4F, -24.0F, 8.5F, 4, 4, 2, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 10, 38, -10.4F, -22.0F, 2.0F, 2, 2, 2, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 8, 34, 8.4F, -22.0F, 2.0F, 2, 2, 2, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 12, 8, 2.4F, -22.0F, 8.5F, 2, 2, 2, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 0, 44, -9.0F, -24.5F, -9.0F, 18, 2, 18, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 72, 94, -3.0F, -26.5F, -3.0F, 6, 2, 6, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 0, 24, -9.0F, -19.5F, -9.0F, 18, 2, 18, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 54, 24, -8.0F, -18.0F, -8.0F, 16, 2, 16, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 50, 78, -7.0F, -16.5F, -7.0F, 14, 2, 14, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 92, 78, -4.0F, -14.5F, -4.0F, 8, 2, 8, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 54, 34, -3.5F, -15.0F, 1.0F, 2, 2, 4, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 0, 54, -3.5F, -15.0F, -5.0F, 2, 2, 4, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 0, 34, 1.5F, -15.0F, 1.0F, 2, 2, 4, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 0, 14, 1.5F, -15.0F, -5.0F, 2, 2, 4, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 12, 0, 3.0F, -15.0F, -1.0F, 2, 2, 2, 0.0F, false));

		Legs = new ModelRenderer(this);
		Legs.setRotationPoint(4.0F, -7.0F, 4.0F);
		ProbeDroid.addChild(Legs);
		Legs.cubeList.add(new ModelBox(Legs, 16, 98, -2.5F, -6.0F, -9.5F, 2, 6, 2, 0.0F, false));
		Legs.cubeList.add(new ModelBox(Legs, 8, 98, -0.5F, -6.0F, -5.0F, 2, 6, 2, 0.0F, false));
		Legs.cubeList.add(new ModelBox(Legs, 0, 98, -9.5F, -6.0F, -5.0F, 2, 6, 2, 0.0F, false));
		Legs.cubeList.add(new ModelBox(Legs, 96, 96, 0.0F, 0.0F, -5.0F, 2, 6, 2, 0.0F, false));
		Legs.cubeList.add(new ModelBox(Legs, 92, 78, -10.0F, 0.0F, -5.0F, 2, 6, 2, 0.0F, false));
		Legs.cubeList.add(new ModelBox(Legs, 54, 44, 1.0F, 6.0F, -5.0F, 2, 8, 2, 0.0F, false));
		Legs.cubeList.add(new ModelBox(Legs, 54, 24, -11.0F, 6.0F, -5.0F, 2, 8, 2, 0.0F, false));
		Legs.cubeList.add(new ModelBox(Legs, 52, 84, -2.5F, -6.0F, -0.5F, 2, 6, 2, 0.0F, false));
		Legs.cubeList.add(new ModelBox(Legs, 44, 84, -2.5F, 0.0F, -10.0F, 2, 6, 2, 0.0F, false));
		Legs.cubeList.add(new ModelBox(Legs, 0, 84, -2.5F, 0.0F, 0.0F, 2, 6, 2, 0.0F, false));
		Legs.cubeList.add(new ModelBox(Legs, 8, 44, -2.5F, 6.0F, -11.0F, 2, 8, 2, 0.0F, false));
		Legs.cubeList.add(new ModelBox(Legs, 0, 44, -2.5F, 6.0F, 1.0F, 2, 8, 2, 0.0F, false));
		Legs.cubeList.add(new ModelBox(Legs, 0, 70, -7.5F, -6.0F, -9.5F, 2, 6, 2, 0.0F, false));
		Legs.cubeList.add(new ModelBox(Legs, 64, 64, -7.5F, -6.0F, -0.5F, 2, 6, 2, 0.0F, false));
		Legs.cubeList.add(new ModelBox(Legs, 62, 44, -7.5F, 0.0F, -10.0F, 2, 6, 2, 0.0F, false));
		Legs.cubeList.add(new ModelBox(Legs, 62, 24, -7.5F, 0.0F, 0.0F, 2, 6, 2, 0.0F, false));
		Legs.cubeList.add(new ModelBox(Legs, 8, 24, -7.5F, 6.0F, -11.0F, 2, 8, 2, 0.0F, false));
		Legs.cubeList.add(new ModelBox(Legs, 0, 24, -7.5F, 6.0F, 1.0F, 2, 8, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ProbeDroid.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}