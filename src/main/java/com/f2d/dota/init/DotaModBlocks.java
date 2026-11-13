/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.f2d.dota.init;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import java.util.function.Function;

import com.f2d.dota.block.DeepslateCrystalPowerBlock;
import com.f2d.dota.block.DeepslateCrystalIntelligenceBlock;
import com.f2d.dota.block.DeepslateCrystalGloryBlock;
import com.f2d.dota.block.DeepslateCrystalAlmightyBlock;
import com.f2d.dota.block.DeepslateCrystalAgilityaBlock;
import com.f2d.dota.DotaMod;

public class DotaModBlocks {
	public static Block DEEPSLATE_CRYSTAL_AGILITYA;
	public static Block DEEPSLATE_CRYSTAL_ALMIGHTY;
	public static Block DEEPSLATE_CRYSTAL_GLORY;
	public static Block DEEPSLATE_CRYSTAL_INTELLIGENCE;
	public static Block DEEPSLATE_CRYSTAL_POWER;

	public static void load() {
		DEEPSLATE_CRYSTAL_AGILITYA = register("deepslate_crystal_agilitya", DeepslateCrystalAgilityaBlock::new);
		DEEPSLATE_CRYSTAL_ALMIGHTY = register("deepslate_crystal_almighty", DeepslateCrystalAlmightyBlock::new);
		DEEPSLATE_CRYSTAL_GLORY = register("deepslate_crystal_glory", DeepslateCrystalGloryBlock::new);
		DEEPSLATE_CRYSTAL_INTELLIGENCE = register("deepslate_crystal_intelligence", DeepslateCrystalIntelligenceBlock::new);
		DEEPSLATE_CRYSTAL_POWER = register("deepslate_crystal_power", DeepslateCrystalPowerBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> B register(String name, Function<BlockBehaviour.Properties, B> supplier) {
		return (B) Blocks.register(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(DotaMod.MODID, name)), (Function<BlockBehaviour.Properties, Block>) supplier, BlockBehaviour.Properties.of());
	}
}