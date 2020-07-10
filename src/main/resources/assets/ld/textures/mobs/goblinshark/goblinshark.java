// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class unknown extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer head2;
	private final ModelRenderer bone7;
	private final ModelRenderer body;
	private final ModelRenderer body2;
	private final ModelRenderer bone;
	private final ModelRenderer bone4;
	private final ModelRenderer bone3;
	private final ModelRenderer bone6;
	private final ModelRenderer bone2;
	private final ModelRenderer bone5;
	private final ModelRenderer tail;
	private final ModelRenderer unknown_bone;
	private final ModelRenderer right_fin;
	private final ModelRenderer left_fin;
	private final ModelRenderer back_fin;

	public unknown() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 20.0F, -6.0F);
		

		head2 = new ModelRenderer(this);
		head2.setRotationPoint(0.0F, 1.0F, 1.0F);
		head.addChild(head2);
		head2.setTextureOffset(35, 0).addBox(-4.0F, -7.0F, -6.0F, 8.0F, 5.0F, 7.0F, 0.0F, false);
		head2.setTextureOffset(0, 27).addBox(-2.0F, -7.0F, -19.0F, 4.0F, 2.0F, 6.0F, 0.0F, false);
		head2.setTextureOffset(49, 20).addBox(-3.0F, -7.0F, -13.0F, 6.0F, 3.0F, 7.0F, 0.0F, false);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, -2.0F, 1.0F);
		head2.addChild(bone7);
		setRotationAngle(bone7, 0.2618F, 0.0F, 0.0F);
		bone7.setTextureOffset(44, 45).addBox(-4.0F, 0.0F, -6.0F, 8.0F, 1.0F, 6.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, -3.0F);
		

		body2 = new ModelRenderer(this);
		body2.setRotationPoint(0.0F, 0.0F, -2.0F);
		body.addChild(body2);
		body2.setTextureOffset(0, 0).addBox(-4.0F, -11.0F, 1.0F, 8.0F, 8.0F, 19.0F, 0.0F, false);
		body2.setTextureOffset(24, 27).addBox(-3.0F, -10.0F, 19.0F, 6.0F, 5.0F, 13.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, -12.0F, 3.0F);
		body.addChild(bone);
		setRotationAngle(bone, -0.7854F, 0.0F, 0.0F);
		bone.setTextureOffset(0, 0).addBox(-1.0F, -7.0F, 1.4142F, 2.0F, 7.0F, 5.0F, 0.0F, false);
		bone.setTextureOffset(0, 12).addBox(-1.0F, -14.6066F, 13.435F, 2.0F, 4.0F, 3.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(4.0F, -5.0F, 17.0F);
		body.addChild(bone4);
		setRotationAngle(bone4, 0.0873F, -0.5236F, 0.8727F);
		bone4.setTextureOffset(0, 40).addBox(-3.4218F, -0.4846F, -3.6177F, 6.0F, 1.0F, 4.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-4.0F, -5.0F, 7.0F);
		body.addChild(bone3);
		setRotationAngle(bone3, 0.0873F, 0.5236F, -0.8727F);
		bone3.setTextureOffset(35, 12).addBox(-5.0782F, -0.4092F, -4.7549F, 8.0F, 1.0F, 6.0F, 0.0F, false);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, -6.0F, 24.0F);
		body.addChild(bone6);
		setRotationAngle(bone6, 0.6981F, 0.0F, 0.0F);
		bone6.setTextureOffset(24, 27).addBox(-1.0F, -2.6442F, -3.5635F, 2.0F, 5.0F, 3.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(4.0F, -5.0F, 7.0F);
		body.addChild(bone2);
		setRotationAngle(bone2, 0.0873F, -0.5236F, 0.8727F);
		bone2.setTextureOffset(49, 30).addBox(-2.9218F, -0.4092F, -4.7549F, 8.0F, 1.0F, 6.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-4.0F, -5.0F, 17.0F);
		body.addChild(bone5);
		setRotationAngle(bone5, 0.0873F, 0.5236F, -0.8727F);
		bone5.setTextureOffset(0, 35).addBox(-2.5782F, -0.4846F, -3.6177F, 6.0F, 1.0F, 4.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 21.5F, 11.0F);
		

		unknown_bone = new ModelRenderer(this);
		unknown_bone.setRotationPoint(0.0F, -4.5F, 12.0F);
		tail.addChild(unknown_bone);
		setRotationAngle(unknown_bone, 0.4363F, 0.0F, 0.0F);
		unknown_bone.setTextureOffset(0, 27).addBox(-1.0F, -1.4837F, -0.6711F, 2.0F, 7.0F, 20.0F, 0.0F, false);

		right_fin = new ModelRenderer(this);
		right_fin.setRotationPoint(4.5F, 24.0F, -2.0F);
		

		left_fin = new ModelRenderer(this);
		left_fin.setRotationPoint(-4.5F, 24.0F, -2.0F);
		

		back_fin = new ModelRenderer(this);
		back_fin.setRotationPoint(0.0F, 13.0F, -5.0F);
		
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
		right_fin.render(matrixStack, buffer, packedLight, packedOverlay);
		left_fin.render(matrixStack, buffer, packedLight, packedOverlay);
		back_fin.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}