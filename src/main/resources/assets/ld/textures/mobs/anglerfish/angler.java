// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class unknown extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer bone3;
	private final ModelRenderer bone2;
	private final ModelRenderer bone;
	private final ModelRenderer eye;
	private final ModelRenderer tail1;
	private final ModelRenderer tail2;
	private final ModelRenderer tail3;
	private final ModelRenderer spine1;
	private final ModelRenderer spine2;
	private final ModelRenderer spine3;
	private final ModelRenderer spine4;
	private final ModelRenderer spine5;
	private final ModelRenderer spine6;
	private final ModelRenderer spine7;
	private final ModelRenderer spine8;
	private final ModelRenderer spine9;
	private final ModelRenderer spine10;
	private final ModelRenderer spine11;
	private final ModelRenderer spine12;

	public unknown() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(body, 0.0F, 3.1416F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-4.0F, 15.0F, -1.0F, 8.0F, 9.0F, 9.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-4.0F, 15.0F, 8.0F, 0.0F, 6.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(4, 0).addBox(4.0F, 15.0F, 8.0F, 0.0F, 6.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(23, 0).addBox(-4.0F, 15.0F, 8.0F, 8.0F, 0.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(22, 22).addBox(0.0F, 13.0F, -3.0F, 0.0F, 4.0F, 7.0F, 0.0F, false);
		body.setTextureOffset(0, 10).addBox(0.0F, 7.0F, 7.0F, 0.0F, 8.0F, 8.0F, 0.0F, false);
		body.setTextureOffset(0, 42).addBox(-0.5F, 9.0F, 12.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-4.0F, 17.0F, 4.0F);
		body.addChild(bone3);
		setRotationAngle(bone3, -0.2618F, 0.6109F, 0.0F);
		bone3.setTextureOffset(25, 0).addBox(0.7057F, -1.712F, -5.5629F, 0.0F, 4.0F, 5.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(4.0F, 17.0F, 4.0F);
		body.addChild(bone2);
		setRotationAngle(bone2, -0.2618F, -0.6109F, 0.0F);
		bone2.setTextureOffset(25, 0).addBox(-0.7207F, -1.5F, -6.3542F, 0.0F, 4.0F, 5.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 8.0F);
		body.addChild(bone);
		setRotationAngle(bone, -1.0472F, 0.0F, 0.0F);
		bone.setTextureOffset(16, 18).addBox(-4.0F, -8.0F, 0.0F, 8.0F, 8.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 31).addBox(4.0F, -8.0F, -2.0F, 0.0F, 6.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(23, 2).addBox(-4.0F, -8.0F, -2.0F, 8.0F, 0.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(4, 31).addBox(-4.0F, -8.0F, -2.0F, 0.0F, 6.0F, 2.0F, 0.0F, false);

		eye = new ModelRenderer(this);
		eye.setRotationPoint(0.0F, 0.5F, -8.25F);
		

		tail1 = new ModelRenderer(this);
		tail1.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(tail1, 0.0F, 3.1416F, 0.0F);
		tail1.setTextureOffset(9, 28).addBox(-2.0F, 16.0F, -6.0F, 4.0F, 5.0F, 5.0F, 0.0F, false);
		tail1.setTextureOffset(0, 19).addBox(0.0F, 15.0F, -12.0F, 0.0F, 7.0F, 7.0F, 0.0F, false);

		tail2 = new ModelRenderer(this);
		tail2.setRotationPoint(1.0F, 0.0F, 15.0F);
		

		tail3 = new ModelRenderer(this);
		tail3.setRotationPoint(0.0F, 0.0F, 22.0F);
		

		spine1 = new ModelRenderer(this);
		spine1.setRotationPoint(0.0F, 5.5F, 7.0F);
		

		spine2 = new ModelRenderer(this);
		spine2.setRotationPoint(0.0F, 5.5F, -7.0F);
		

		spine3 = new ModelRenderer(this);
		spine3.setRotationPoint(-7.0F, 5.5F, 0.0F);
		

		spine4 = new ModelRenderer(this);
		spine4.setRotationPoint(7.0F, 5.5F, 0.0F);
		

		spine5 = new ModelRenderer(this);
		spine5.setRotationPoint(7.0F, 16.0F, -7.0F);
		

		spine6 = new ModelRenderer(this);
		spine6.setRotationPoint(-7.0F, 16.0F, -7.0F);
		

		spine7 = new ModelRenderer(this);
		spine7.setRotationPoint(-7.0F, 16.0F, 7.0F);
		

		spine8 = new ModelRenderer(this);
		spine8.setRotationPoint(7.0F, 16.0F, 7.0F);
		

		spine9 = new ModelRenderer(this);
		spine9.setRotationPoint(0.0F, 26.5F, 7.0F);
		

		spine10 = new ModelRenderer(this);
		spine10.setRotationPoint(0.0F, 26.5F, -7.0F);
		

		spine11 = new ModelRenderer(this);
		spine11.setRotationPoint(-7.0F, 26.5F, 0.0F);
		

		spine12 = new ModelRenderer(this);
		spine12.setRotationPoint(7.0F, 26.5F, 0.0F);
		
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		eye.render(matrixStack, buffer, packedLight, packedOverlay);
		tail1.render(matrixStack, buffer, packedLight, packedOverlay);
		tail2.render(matrixStack, buffer, packedLight, packedOverlay);
		tail3.render(matrixStack, buffer, packedLight, packedOverlay);
		spine1.render(matrixStack, buffer, packedLight, packedOverlay);
		spine2.render(matrixStack, buffer, packedLight, packedOverlay);
		spine3.render(matrixStack, buffer, packedLight, packedOverlay);
		spine4.render(matrixStack, buffer, packedLight, packedOverlay);
		spine5.render(matrixStack, buffer, packedLight, packedOverlay);
		spine6.render(matrixStack, buffer, packedLight, packedOverlay);
		spine7.render(matrixStack, buffer, packedLight, packedOverlay);
		spine8.render(matrixStack, buffer, packedLight, packedOverlay);
		spine9.render(matrixStack, buffer, packedLight, packedOverlay);
		spine10.render(matrixStack, buffer, packedLight, packedOverlay);
		spine11.render(matrixStack, buffer, packedLight, packedOverlay);
		spine12.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}