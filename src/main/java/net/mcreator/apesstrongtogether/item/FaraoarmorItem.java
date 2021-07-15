
package net.mcreator.apesstrongtogether.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.BipedModel;

import net.mcreator.apesstrongtogether.ApesStrongTogetherModElements;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@ApesStrongTogetherModElements.ModElement.Tag
public class FaraoarmorItem extends ApesStrongTogetherModElements.ModElement {
	@ObjectHolder("apes_strong_together:faraoarmor_helmet")
	public static final Item helmet = null;
	@ObjectHolder("apes_strong_together:faraoarmor_chestplate")
	public static final Item body = null;
	@ObjectHolder("apes_strong_together:faraoarmor_leggings")
	public static final Item legs = null;
	@ObjectHolder("apes_strong_together:faraoarmor_boots")
	public static final Item boots = null;
	public FaraoarmorItem(ApesStrongTogetherModElements instance) {
		super(instance, 121);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{2, 5, 6, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 9;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "faraoarmor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedHead = new Modelfarao_armor().Head;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "apes_strong_together:textures/farao_armor.png";
			}
		}.setRegistryName("faraoarmor_helmet"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedBody = new Modelfarao_armor().Body;
				armorModel.bipedLeftArm = new Modelfarao_armor().LeftArm;
				armorModel.bipedRightArm = new Modelfarao_armor().RightArm;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "apes_strong_together:textures/farao_armor.png";
			}
		}.setRegistryName("faraoarmor_chestplate"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedLeftLeg = new Modelfarao_armor().LeftLeg;
				armorModel.bipedRightLeg = new Modelfarao_armor().RightLeg;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "apes_strong_together:textures/farao_armor.png";
			}
		}.setRegistryName("faraoarmor_leggings"));
	}
	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelfarao_armor extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer Body;
		private final ModelRenderer RightArm;
		private final ModelRenderer LeftArm;
		private final ModelRenderer RightLeg;
		private final ModelRenderer LeftLeg;
		public Modelfarao_armor() {
			textureWidth = 128;
			textureHeight = 128;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);
			Head.setTextureOffset(0, 62).addBox(-7.5F, -3.0F, -2.0F, 15.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(0, 62).addBox(-7.5F, -3.0F, -2.5F, 15.0F, 1.0F, 1.0F, -0.001F, false);
			Head.setTextureOffset(0, 62).addBox(-7.0F, -4.0F, -2.0F, 14.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(0, 62).addBox(-7.0F, -4.0F, -2.25F, 14.0F, 1.0F, 1.0F, 0.1F, false);
			Head.setTextureOffset(0, 62).addBox(-6.5F, -5.0F, -2.0F, 13.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(0, 62).addBox(-6.0F, -6.0F, -2.0F, 12.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(0, 62).addBox(-5.5F, -7.0F, -2.0F, 11.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(0, 62).addBox(-4.05F, -9.0F, -2.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(0, 62).addBox(-3.55F, -10.0F, -2.0F, 7.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(0, 58).addBox(-3.55F, -8.0F, -5.0F, 7.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(2, 60).addBox(-8.0F, -2.0F, -2.0F, 16.0F, 3.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(2, 60).addBox(-8.0F, -2.0F, -3.0F, 16.0F, 3.0F, 1.0F, 0.0F, false);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.setTextureOffset(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.25F, false);
			Body.setTextureOffset(16, 43).addBox(-4.0F, 11.0F, -2.0F, 8.0F, 1.0F, 4.0F, 0.35F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			RightArm.setTextureOffset(0, 18).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);
			RightArm.setTextureOffset(0, 53).addBox(-3.0F, 2.775F, -2.0F, 4.0F, 1.0F, 4.0F, 0.35F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			LeftArm.setTextureOffset(0, 64).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
			RightLeg.setTextureOffset(0, 35).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
			LeftLeg.setTextureOffset(0, 35).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);
		}

		@Override
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Head.render(matrixStack, buffer, packedLight, packedOverlay);
			Body.render(matrixStack, buffer, packedLight, packedOverlay);
			RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
			RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}
}
