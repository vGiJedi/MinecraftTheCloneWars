// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class ModelLR1K_Sonic_Cannon extends EntityModel {
	private final ModelRenderer LR1KSonicCannon;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5_r1;
	private final ModelRenderer cube_r5;

	public ModelLR1K_Sonic_Cannon() {
		textureWidth = 512;
		textureHeight = 512;

		LR1KSonicCannon = new ModelRenderer(this);
		LR1KSonicCannon.setRotationPoint(0.0F, 2.0F, 20.0F);
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 172, 212, -7.0F, -26.0F, -90.5F, 14, 14, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 172, 192, -8.0F, -27.0F, -68.0F, 16, 16, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 98, 164, -10.0F, -29.0F, -66.0F, 20, 20, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 152, 24, -11.0F, -30.0F, -62.0F, 22, 22, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 136, 136, -13.0F, -32.0F, -60.0F, 26, 26, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 164, 48, -13.0F, -34.0F, -62.0F, 26, 2, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 122, 76, -17.0F, -36.0F, -60.0F, 34, 2, 6, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 102, 68, -17.0F, -38.0F, -54.0F, 34, 2, 6, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 68, 112, -14.0F, -32.0F, -48.0F, 28, 22, 6, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 46, 74, -10.0F, -29.0F, -46.0F, 20, 20, 8, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 0, 110, -7.0F, -26.0F, -40.0F, 14, 14, 20, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 0, 144, -5.0F, -12.0F, -38.0F, 10, 10, 16, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 98, 152, -6.0F, -6.0F, -36.0F, 12, 6, 6, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 212, 92, -24.0F, -5.0F, -36.0F, 10, 6, 6, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 208, 54, 14.0F, -5.0F, -36.0F, 10, 6, 6, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 182, 120, -8.0F, -4.0F, -26.0F, 16, 6, 6, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 0, 66, -25.0F, -4.0F, -35.0F, 50, 4, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 194, 84, -9.0F, -3.0F, -25.0F, 18, 4, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 80, 36, -15.0F, -2.0F, -38.0F, 30, 6, 12, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 54, 140, -23.0F, -6.0F, -40.0F, 8, 24, 14, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 76, 76, -25.0F, 16.0F, -42.0F, 8, 6, 30, 0.0F, false));
		LR1KSonicCannon.cubeList.add(new ModelBox(LR1KSonicCannon, 0, 74, 17.0F, 16.0F, -42.0F, 8, 6, 30, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 236, 196, -23.0F, 16.0F, -12.0F, 10, 6, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 236, 186, 13.0F, 16.0F, -12.0F, 10, 6, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 234, 66, -23.0F, 16.0F, -46.0F, 10, 6, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 192, 234, 13.0F, 16.0F, -46.0F, 10, 6, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 232, 138, -21.0F, 16.0F, -50.0F, 10, 6, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 232, 128, 11.0F, 16.0F, -50.0F, 10, 6, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 230, 172, -21.0F, 16.0F, -8.0F, 10, 6, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 228, 210, 11.0F, 16.0F, -8.0F, 10, 6, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 226, 118, -19.0F, 16.0F, -4.0F, 10, 6, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 90, 188, -9.0F, 16.0F, -2.0F, 18, 6, 4, 0.0F, false));
		LR1KSonicCannon.cubeList.add(new ModelBox(LR1KSonicCannon, 36, 144, 9.0F, 16.0F, -4.0F, 10, 6, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 138, 98, 15.0F, -6.0F, -40.0F, 8, 24, 14, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 0, 210, -21.0F, -2.0F, -44.0F, 8, 20, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 208, 132, 13.0F, -2.0F, -44.0F, 8, 20, 4, 0.0F, false));
		LR1KSonicCannon.cubeList.add(new ModelBox(LR1KSonicCannon, 82, 0, -19.0F, 4.0F, -48.0F, 6, 14, 4, 0.0F, false));
		LR1KSonicCannon.cubeList.add(new ModelBox(LR1KSonicCannon, 0, 0, 13.0F, 4.0F, -48.0F, 6, 14, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 48, 110, -17.0F, 10.0F, -52.0F, 4, 12, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 0, 110, 13.0F, 10.0F, -52.0F, 4, 12, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 104, 198, -23.0F, -4.0F, -26.0F, 8, 22, 4, 0.0F, false));
		LR1KSonicCannon.cubeList.add(new ModelBox(LR1KSonicCannon, 0, 74, 15.0F, -4.0F, -26.0F, 8, 22, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 212, 188, -23.0F, 0.0F, -22.0F, 8, 18, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 204, 212, 15.0F, 0.0F, -22.0F, 8, 18, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 220, 36, -23.0F, 6.0F, -18.0F, 10, 12, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 218, 16, 13.0F, 6.0F, -18.0F, 10, 12, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 228, 228, -17.0F, 6.0F, -10.0F, 8, 12, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 168, 228, 9.0F, 6.0F, -10.0F, 8, 12, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 108, 228, -13.0F, 6.0F, -6.0F, 8, 12, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 182, 104, -5.0F, 6.0F, -6.0F, 18, 12, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 216, 156, -21.0F, 6.0F, -14.0F, 10, 12, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 216, 0, 11.0F, 6.0F, -14.0F, 10, 12, 4, 0.0F, false));
		LR1KSonicCannon.cubeList.add(new ModelBox(LR1KSonicCannon, 0, 0, -15.0F, 2.0F, -26.0F, 30, 2, 22, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 154, 54, -13.0F, 2.0F, -4.0F, 26, 2, 4, 0.0F, false));
		LR1KSonicCannon.cubeList.add(new ModelBox(LR1KSonicCannon, 122, 94, -11.0F, 2.0F, 0.0F, 22, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList.add(new ModelBox(LR1KSonicCannon, 122, 98, -6.0F, 0.0F, 2.0F, 12, 4, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 80, 62, -15.0F, 0.0F, -20.0F, 30, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 200, 20, -15.0F, 0.0F, -18.0F, 2, 2, 14, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 68, 180, -11.0F, 0.0F, -18.0F, 2, 2, 18, 0.0F, false));
		LR1KSonicCannon.cubeList.add(new ModelBox(LR1KSonicCannon, 46, 178, 9.0F, 0.0F, -18.0F, 2, 2, 18, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 172, 84, -7.0F, 0.0F, -18.0F, 2, 2, 18, 0.0F, false));
		LR1KSonicCannon.cubeList.add(new ModelBox(LR1KSonicCannon, 24, 170, 5.0F, 0.0F, -18.0F, 2, 2, 18, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 170, 170, 1.0F, 0.0F, -18.0F, 2, 2, 20, 0.0F, false));
		LR1KSonicCannon.cubeList.add(new ModelBox(LR1KSonicCannon, 0, 170, -3.0F, 0.0F, -18.0F, 2, 2, 20, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 194, 196, 13.0F, 0.0F, -18.0F, 2, 2, 14, 0.0F, false));
		LR1KSonicCannon.cubeList.add(new ModelBox(LR1KSonicCannon, 80, 42, 11.0F, 0.0F, -4.0F, 2, 2, 4, 0.0F, false));
		LR1KSonicCannon.cubeList.add(new ModelBox(LR1KSonicCannon, 80, 36, -13.0F, 0.0F, -4.0F, 2, 2, 4, 0.0F, false));
		LR1KSonicCannon.cubeList.add(new ModelBox(LR1KSonicCannon, 82, 18, 5.0F, 0.0F, 0.0F, 6, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList.add(new ModelBox(LR1KSonicCannon, 0, 18, -11.0F, 0.0F, 0.0F, 6, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 84, 140, -9.0F, -20.0F, -28.0F, 18, 6, 6, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 182, 68, -10.0F, -19.0F, -27.0F, 20, 4, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 226, 104, -6.0F, -25.0F, -20.0F, 12, 12, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 128, 240, -4.0F, -23.0F, -18.0F, 8, 8, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 0, 100, -6.0F, -21.0F, -17.0F, 12, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 168, 94, -2.0F, -21.0F, -16.0F, 4, 4, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 122, 84, -14.0F, -10.0F, -48.0F, 28, 4, 6, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 0, 24, -17.0F, -36.0F, -54.0F, 34, 36, 6, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 80, 54, -17.0F, -4.0F, -60.0F, 34, 2, 6, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 192, 132, -17.0F, -34.0F, -60.0F, 2, 30, 6, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 36, 192, 15.0F, -34.0F, -60.0F, 2, 30, 6, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 156, 186, 17.0F, -36.0F, -54.0F, 2, 34, 6, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 140, 186, -19.0F, -36.0F, -54.0F, 2, 34, 6, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 140, 62, -13.0F, -6.0F, -62.0F, 26, 2, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 24, 210, 13.0F, -34.0F, -62.0F, 2, 30, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 84, 200, -15.0F, -34.0F, -62.0F, 2, 30, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 80, 0, -6.0F, -25.0F, -92.0F, 12, 12, 24, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 52, 200, -5.0F, -24.0F, -98.0F, 10, 10, 6, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 140, 226, -5.0F, -24.0F, -103.0F, 10, 10, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 238, 80, -4.0F, -23.0F, -103.5F, 8, 8, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 0, 180, -4.0F, -23.0F, -110.5F, 8, 8, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 0, 170, -4.0F, -23.0F, -114.0F, 8, 8, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 232, 148, -3.0F, -17.0F, -120.0F, 6, 1, 6, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 228, 220, -3.0F, -22.0F, -120.0F, 6, 1, 6, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 68, 178, -0.5F, -22.5F, -118.0F, 1, 1, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 6, 155, 1.5F, -22.5F, -118.0F, 1, 1, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 36, 154, -2.5F, -22.5F, -118.0F, 1, 1, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 52, 178, -0.5F, -16.5F, -118.0F, 1, 1, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 168, 104, 1.5F, -16.5F, -118.0F, 1, 1, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 42, 155, -2.5F, -16.5F, -118.0F, 1, 1, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 46, 174, 2.5F, -19.5F, -118.0F, 1, 1, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 0, 154, 2.5F, -21.5F, -118.0F, 1, 1, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 126, 140, 2.5F, -17.5F, -118.0F, 1, 1, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 32, 170, -3.5F, -19.5F, -118.0F, 1, 1, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 64, 110, -3.5F, -21.5F, -118.0F, 1, 1, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 94, 74, -3.5F, -17.5F, -118.0F, 1, 1, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 24, 170, 2.0F, -21.0F, -120.0F, 1, 4, 6, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 0, 144, -3.0F, -21.0F, -120.0F, 1, 4, 6, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 194, 168, -3.0F, -22.0F, -113.5F, 6, 6, 10, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 0, 234, -4.0F, -23.0F, -101.0F, 8, 8, 4, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 128, 0, -11.0F, -30.0F, -84.0F, 22, 22, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 192, 20, -1.0F, -29.5F, -85.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 68, 192, -1.0F, -37.0F, -57.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 190, 132, -1.0F, -3.0F, -57.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 74, 190, 3.0F, -37.0F, -57.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList.add(new ModelBox(LR1KSonicCannon, 54, 190, 3.0F, -3.0F, -57.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 46, 190, 7.0F, -37.0F, -57.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 138, 188, 7.0F, -3.0F, -57.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 130, 188, 11.0F, -37.0F, -57.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 68, 188, 16.0F, -32.0F, -57.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 182, 186, -18.0F, -32.0F, -57.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 174, 186, 16.0F, -28.0F, -57.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 166, 186, -18.0F, -28.0F, -57.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 150, 186, 16.0F, -24.0F, -57.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 74, 186, -18.0F, -24.0F, -57.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 184, 20, 16.0F, -20.0F, -57.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 32, 184, -18.0F, -20.0F, -57.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 24, 184, 16.0F, -16.0F, -57.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 68, 183, -18.0F, -16.0F, -57.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 52, 183, 16.0F, -12.0F, -57.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 182, 132, -18.0F, -12.0F, -57.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 90, 182, 16.0F, -8.0F, -57.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 76, 182, -18.0F, -8.0F, -57.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 46, 181, 11.0F, -3.0F, -57.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 180, 94, -5.0F, -37.0F, -57.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 32, 180, -5.0F, -3.0F, -57.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 24, 180, -9.0F, -37.0F, -57.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 90, 178, -9.0F, -3.0F, -57.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 74, 178, -13.0F, -37.0F, -57.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 176, 68, -13.0F, -3.0F, -57.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 176, 20, 3.0F, -29.5F, -85.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 174, 104, -5.0F, -29.5F, -85.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 46, 170, 7.0F, -29.5F, -85.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 128, 152, -9.0F, -29.5F, -85.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 60, 144, -1.0F, -10.5F, -85.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList.add(new ModelBox(LR1KSonicCannon, 8, 144, 8.5F, -19.5F, -85.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 130, 112, -10.5F, -19.5F, -85.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 56, 126, 3.0F, -10.5F, -85.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 48, 126, 8.5F, -15.5F, -85.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 8, 126, -10.5F, -15.5F, -85.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList.add(new ModelBox(LR1KSonicCannon, 0, 126, 7.0F, -10.5F, -85.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 60, 110, 8.5F, -11.5F, -85.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 12, 110, -10.5F, -11.5F, -85.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 92, 102, -5.0F, -10.5F, -85.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 84, 102, 8.5F, -23.5F, -85.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 76, 102, -10.5F, -23.5F, -85.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 46, 78, -9.0F, -10.5F, -85.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList.add(new ModelBox(LR1KSonicCannon, 46, 74, 8.5F, -27.5F, -85.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 20, 74, -10.5F, -27.5F, -85.0F, 2, 2, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 146, 164, -10.0F, -29.0F, -86.0F, 20, 20, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 176, 0, -9.0F, -28.0F, -88.0F, 18, 18, 2, 0.0F, false));
		LR1KSonicCannon.cubeList
				.add(new ModelBox(LR1KSonicCannon, 0, 192, -8.0F, -27.0F, -90.0F, 16, 16, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-3.0F, -8.0F, -70.0F);
		LR1KSonicCannon.addChild(cube_r1);
		setRotationAngle(cube_r1, 1.3526F, 0.0F, 0.0F);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-15.0F, -16.0F, -51.0F);
		LR1KSonicCannon.addChild(cube_r2);
		setRotationAngle(cube_r2, -1.5708F, -0.2182F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 64, 216, 0.0F, 4.0F, -5.0F, 2, 28, 4, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(15.0F, -16.0F, -51.0F);
		LR1KSonicCannon.addChild(cube_r3);
		setRotationAngle(cube_r3, -1.5708F, 0.2182F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 52, 216, -2.0F, 4.0F, -5.0F, 2, 28, 4, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-3.0F, -30.0F, -70.0F);
		LR1KSonicCannon.addChild(cube_r4);
		setRotationAngle(cube_r4, -1.3526F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 96, 224, 1.0F, -15.2682F, -1.1897F, 4, 28, 2, 0.0F, false));

		cube_r5_r1 = new ModelRenderer(this);
		cube_r5_r1.setRotationPoint(3.0F, 52.0F, 40.0F);
		cube_r4.addChild(cube_r5_r1);
		setRotationAngle(cube_r5_r1, -0.48F, 0.0F, 0.0F);
		cube_r5_r1.cubeList.add(new ModelBox(cube_r5_r1, 128, 198, -2.0F, -45.9054F, -38.7223F, 4, 32, 2, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-4.0F, -24.0F, -20.0F);
		LR1KSonicCannon.addChild(cube_r5);
		setRotationAngle(cube_r5, 1.309F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 218, 66, 10.0F, 4.6504F, -3.1524F, 2, 2, 12, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 214, 172, -4.0F, 4.6504F, -3.1524F, 2, 2, 12, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		LR1KSonicCannon.render(f5);
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