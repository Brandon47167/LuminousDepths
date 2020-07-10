// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class custom_model extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer head;
	private final ModelRenderer left_wing;
	private final ModelRenderer bone5;
	private final ModelRenderer left_wing_tip;
	private final ModelRenderer right_wing;
	private final ModelRenderer bone6;
	private final ModelRenderer right_wing_tip;
	private final ModelRenderer tail;
	private final ModelRenderer tail2;

	public custom_model() {
		textureWidth = 256;
		textureHeight = 256;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.addChild(bone);
		bone.setTextureOffset(135, 145).addBox(-9.0F, -4.0F, 7.0F, 18.0F, 7.0F, 17.0F, 0.0F, false);
		bone.setTextureOffset(0, 106).addBox(-18.0F, -5.0F, -29.0F, 36.0F, 11.0F, 40.0F, 0.0F, false);
		bone.setTextureOffset(133, 53).addBox(-1.0F, -1.0F, 24.0F, 2.0F, 2.0F, 35.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(13.0F, 24.0F, -34.0F);
		body.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.6981F, -0.8727F);
		bone2.setTextureOffset(0, 19).addBox(-7.1352F, 1.234F, -10.6471F, 6.0F, 2.0F, 17.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-13.0F, 24.0F, -34.0F);
		body.addChild(bone3);
		setRotationAngle(bone3, 0.0F, -0.6981F, 0.8727F);
		bone3.setTextureOffset(0, 0).addBox(1.1352F, 1.234F, -10.6471F, 6.0F, 2.0F, 17.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 21.0F, 10.0F);
		body.addChild(bone4);
		setRotationAngle(bone4, -0.6109F, 0.0F, 0.0F);
		bone4.setTextureOffset(29, 0).addBox(-1.0F, -11.343F, 4.9459F, 2.0F, 7.0F, 7.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 1.0F, -7.0F);
		setRotationAngle(head, -0.0262F, 0.0F, 0.0F);
		

		left_wing = new ModelRenderer(this);
		left_wing.setRotationPoint(-2.0F, -2.0F, -8.0F);
		

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(3.0F, 26.0F, 8.0F);
		left_wing.addChild(bone5);
		bone5.setTextureOffset(133, 0).addBox(41.0F, -1.0F, -23.0F, 22.0F, 2.0F, 31.0F, 0.0F, false);
		bone5.setTextureOffset(0, 53).addBox(0.0F, -1.0F, -23.0F, 41.0F, 2.0F, 51.0F, 0.0F, false);

		left_wing_tip = new ModelRenderer(this);
		left_wing_tip.setRotationPoint(-8.0F, -2.0F, -8.0F);
		

		right_wing = new ModelRenderer(this);
		right_wing.setRotationPoint(3.0F, -2.0F, -8.0F);
		

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-57.0F, 26.0F, 3.0F);
		right_wing.addChild(bone6);
		bone6.setTextureOffset(0, 0).addBox(12.0F, -1.0F, -18.0F, 41.0F, 2.0F, 51.0F, 0.0F, false);
		bone6.setTextureOffset(112, 112).addBox(-10.0F, -1.0F, -18.0F, 22.0F, 2.0F, 31.0F, 0.0F, false);

		right_wing_tip = new ModelRenderer(this);
		right_wing_tip.setRotationPoint(9.0F, -2.0F, -8.0F);
		

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, -2.0F, 1.0F);
		

		tail2 = new ModelRenderer(this);
		tail2.setRotationPoint(0.0F, -1.5F, 7.0F);
		
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		left_wing.render(matrixStack, buffer, packedLight, packedOverlay);
		left_wing_tip.render(matrixStack, buffer, packedLight, packedOverlay);
		right_wing.render(matrixStack, buffer, packedLight, packedOverlay);
		right_wing_tip.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
		tail2.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}