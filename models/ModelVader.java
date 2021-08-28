// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelVader extends EntityModel<Entity> {
	private final ModelRenderer DarthVader;
	private final ModelRenderer Legs;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer RightLeg;
	private final ModelRenderer KneeCaps;
	private final ModelRenderer Torso;
	private final ModelRenderer LegCape;
	private final ModelRenderer Belt;
	private final ModelRenderer Chest;
	private final ModelRenderer Head;

	public ModelVader() {
		textureWidth = 64;
		textureHeight = 64;

		DarthVader = new ModelRenderer(this);
		DarthVader.setRotationPoint(0.0F, 24.0F, 0.0F);

		Legs = new ModelRenderer(this);
		Legs.setRotationPoint(0.0F, 0.0F, 0.0F);
		DarthVader.addChild(Legs);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(0.0F, 0.0F, 0.0F);
		Legs.addChild(LeftLeg);
		LeftLeg.setTextureOffset(0, 0).addBox(1.0F, -10.0F, -1.5F, 3.0F, 9.0F, 3.0F, 0.0F, false);
		LeftLeg.setTextureOffset(0, 0).addBox(1.0F, -17.0F, -1.5F, 3.0F, 7.0F, 3.0F, 0.0F, false);
		LeftLeg.setTextureOffset(0, 0).addBox(1.0F, -1.0F, -4.5F, 3.0F, 1.0F, 6.0F, 0.0F, false);
		LeftLeg.setTextureOffset(0, 0).addBox(1.5F, -1.5F, -4.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-5.0F, 0.0F, 0.0F);
		Legs.addChild(RightLeg);
		RightLeg.setTextureOffset(0, 0).addBox(1.0F, -10.0F, -1.5F, 3.0F, 9.0F, 3.0F, 0.0F, false);
		RightLeg.setTextureOffset(0, 0).addBox(1.0F, -17.0F, -1.5F, 3.0F, 7.0F, 3.0F, 0.0F, false);
		RightLeg.setTextureOffset(0, 0).addBox(1.0F, -1.0F, -4.5F, 3.0F, 1.0F, 6.0F, 0.0F, false);
		RightLeg.setTextureOffset(0, 0).addBox(1.5F, -1.5F, -4.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);

		KneeCaps = new ModelRenderer(this);
		KneeCaps.setRotationPoint(0.0F, 0.0F, 3.0F);
		Legs.addChild(KneeCaps);
		setRotationAngle(KneeCaps, 0.3491F, 0.0F, 0.0F);
		KneeCaps.setTextureOffset(0, 0).addBox(1.5F, -11.0F, -1.8F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		KneeCaps.setTextureOffset(0, 0).addBox(-3.5F, -11.0F, -1.8F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		Torso = new ModelRenderer(this);
		Torso.setRotationPoint(0.0F, 0.0F, 3.0F);
		DarthVader.addChild(Torso);
		Torso.setTextureOffset(0, 0).addBox(-4.0F, -21.0F, -5.0F, 8.0F, 4.0F, 4.0F, 0.0F, false);
		Torso.setTextureOffset(0, 0).addBox(-2.0F, -21.0F, -5.5F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		Torso.setTextureOffset(0, 0).addBox(-4.0F, -21.0F, -5.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Torso.setTextureOffset(0, 0).addBox(2.0F, -21.0F, -5.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Torso.setTextureOffset(0, 0).addBox(-1.5F, -19.0F, -5.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Torso.setTextureOffset(0, 0).addBox(-0.5F, -18.0F, -5.5F, 1.0F, 0.0F, 1.0F, 0.0F, false);

		LegCape = new ModelRenderer(this);
		LegCape.setRotationPoint(0.0F, 0.0F, 0.0F);
		Torso.addChild(LegCape);
		LegCape.setTextureOffset(0, 0).addBox(-6.0F, -18.0F, 0.0F, 12.0F, 16.0F, 1.0F, 0.0F, false);
		LegCape.setTextureOffset(0, 0).addBox(-5.0F, -21.0F, -1.0F, 10.0F, 3.0F, 2.0F, 0.0F, false);
		LegCape.setTextureOffset(0, 0).addBox(5.0F, -18.0F, -5.0F, 1.0F, 16.0F, 5.0F, 0.0F, false);
		LegCape.setTextureOffset(0, 0).addBox(4.0F, -21.0F, -5.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
		LegCape.setTextureOffset(0, 0).addBox(-5.0F, -21.0F, -5.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
		LegCape.setTextureOffset(0, 0).addBox(-6.0F, -18.0F, -5.0F, 1.0F, 16.0F, 5.0F, 0.0F, false);

		Belt = new ModelRenderer(this);
		Belt.setRotationPoint(0.0F, 0.0F, 0.0F);
		Torso.addChild(Belt);
		Belt.setTextureOffset(0, 0).addBox(-5.5F, -23.0F, -6.0F, 11.0F, 2.0F, 7.0F, 0.0F, false);
		Belt.setTextureOffset(0, 0).addBox(-1.0F, -22.5F, -6.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Belt.setTextureOffset(0, 0).addBox(0.05F, -22.4F, -6.6F, 0.0F, 0.0F, 1.0F, 0.0F, false);
		Belt.setTextureOffset(0, 0).addBox(3.0F, -22.75F, -6.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Belt.setTextureOffset(0, 0).addBox(-5.0F, -22.75F, -6.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		Chest = new ModelRenderer(this);
		Chest.setRotationPoint(0.0F, 0.0F, 0.0F);
		Torso.addChild(Chest);
		Chest.setTextureOffset(0, 0).addBox(-4.5F, -26.0F, -5.0F, 9.0F, 3.0F, 5.0F, 0.0F, false);
		Chest.setTextureOffset(0, 0).addBox(-4.75F, -29.0F, -5.25F, 9.0F, 3.0F, 5.0F, 0.0F, false);
		Chest.setTextureOffset(0, 0).addBox(-5.25F, -32.5F, -5.25F, 10.0F, 3.0F, 5.0F, 0.0F, false);
		Chest.setTextureOffset(0, 0).addBox(-5.25F, -33.7F, -5.25F, 10.0F, 1.0F, 5.0F, 0.0F, false);
		Chest.setTextureOffset(0, 0).addBox(-1.25F, -32.0F, -5.5F, 2.0F, 3.0F, 0.0F, 0.0F, false);
		Chest.setTextureOffset(0, 0).addBox(-3.0F, -33.54F, -5.5F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		Chest.setTextureOffset(0, 0).addBox(-8.0F, -34.54F, -5.5F, 16.0F, 1.0F, 6.0F, 0.0F, false);
		Chest.setTextureOffset(0, 0).addBox(-7.0F, -34.94F, -5.0F, 14.0F, 0.0F, 5.0F, 0.0F, false);
		Chest.setTextureOffset(0, 0).addBox(-6.0F, -35.3F, -4.5F, 12.0F, 0.0F, 4.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		DarthVader.addChild(Head);
		Head.setTextureOffset(0, 0).addBox(-2.5F, -40.25F, -3.0F, 5.0F, 5.0F, 7.0F, 0.0F, false);
		Head.setTextureOffset(0, 0).addBox(-3.0F, -40.2F, -3.25F, 6.0F, 0.0F, 7.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		DarthVader.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}