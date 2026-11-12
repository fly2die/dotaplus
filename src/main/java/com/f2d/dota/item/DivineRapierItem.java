package com.f2d.dota.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.component.DataComponents;

import com.f2d.dota.procedures.DivineRapierPrProcedure;

public class DivineRapierItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 0, 4f, 0, 2, TagKey.create(Registries.ITEM, Identifier.parse("dota:divine_rapier_repair_items")));

	public DivineRapierItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 21f, -2.8f).rarity(Rarity.EPIC).component(DataComponents.MAX_DAMAGE, null));
	}

	@Override
	public void hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		super.hurtEnemy(itemstack, entity, sourceentity);
		DivineRapierPrProcedure.execute(entity.level(), itemstack);
	}
}