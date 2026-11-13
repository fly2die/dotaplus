/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.f2d.dota.init;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;

import java.util.function.Predicate;

import com.mojang.serialization.MapCodec;

import com.f2d.dota.block.DeepslateCrystalPowerBlock;
import com.f2d.dota.block.DeepslateCrystalIntelligenceBlock;
import com.f2d.dota.block.DeepslateCrystalGloryBlock;
import com.f2d.dota.block.DeepslateCrystalAlmightyBlock;
import com.f2d.dota.block.DeepslateCrystalAgilityaBlock;
import com.f2d.dota.DotaMod;

public class DotaModFeatures {
	public static void load() {
		addToBiomes("deepslate_crystal_agilitya", DeepslateCrystalAgilityaBlock.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		addToBiomes("deepslate_crystal_almighty", DeepslateCrystalAlmightyBlock.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		addToBiomes("deepslate_crystal_glory", DeepslateCrystalGloryBlock.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		addToBiomes("deepslate_crystal_intelligence", DeepslateCrystalIntelligenceBlock.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		addToBiomes("deepslate_crystal_power", DeepslateCrystalPowerBlock.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
	}

	private static void addToBiomes(String registryname, Predicate<BiomeSelectionContext> biomes, GenerationStep.Decoration stage) {
		BiomeModifications.addFeature(biomes, stage, ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(DotaMod.MODID, registryname)));
	}

	private static void registerType(String registryname, MapCodec<? extends Feature> codec) {
		Registry.register(BuiltInRegistries.FEATURE_TYPE, Identifier.fromNamespaceAndPath(DotaMod.MODID, registryname), codec);
	}
}