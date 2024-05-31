
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.projectskynet.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.projectskynet.block.ZirconiumOreBlock;
import net.mcreator.projectskynet.block.ZirconiumBlockBlock;
import net.mcreator.projectskynet.block.TopazOreBlock;
import net.mcreator.projectskynet.block.TopazBlockBlock;
import net.mcreator.projectskynet.block.SkyworldPortalBlock;
import net.mcreator.projectskynet.block.SapphireoreBlock;
import net.mcreator.projectskynet.block.SapphireblockBlock;
import net.mcreator.projectskynet.block.RubyoreBlock;
import net.mcreator.projectskynet.block.RubyblockBlock;
import net.mcreator.projectskynet.block.DeepslatesapphireoreBlock;
import net.mcreator.projectskynet.block.DeepslaterubyoreBlock;
import net.mcreator.projectskynet.block.DeepslateTopazOreBlock;
import net.mcreator.projectskynet.block.DeepslateAluminiumOreBlock;
import net.mcreator.projectskynet.block.AluminiumOreBlock;
import net.mcreator.projectskynet.block.AluminiumBlockBlock;
import net.mcreator.projectskynet.ProjectSkynetMod;

public class ProjectSkynetModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK, ProjectSkynetMod.MODID);
	public static final DeferredHolder<Block, Block> SKYWORLD_PORTAL = REGISTRY.register("skyworld_portal", () -> new SkyworldPortalBlock());
	public static final DeferredHolder<Block, Block> RUBYORE = REGISTRY.register("rubyore", () -> new RubyoreBlock());
	public static final DeferredHolder<Block, Block> DEEPSLATERUBYORE = REGISTRY.register("deepslaterubyore", () -> new DeepslaterubyoreBlock());
	public static final DeferredHolder<Block, Block> RUBYBLOCK = REGISTRY.register("rubyblock", () -> new RubyblockBlock());
	public static final DeferredHolder<Block, Block> SAPPHIREORE = REGISTRY.register("sapphireore", () -> new SapphireoreBlock());
	public static final DeferredHolder<Block, Block> DEEPSLATESAPPHIREORE = REGISTRY.register("deepslatesapphireore", () -> new DeepslatesapphireoreBlock());
	public static final DeferredHolder<Block, Block> SAPPHIREBLOCK = REGISTRY.register("sapphireblock", () -> new SapphireblockBlock());
	public static final DeferredHolder<Block, Block> ZIRCONIUM_ORE = REGISTRY.register("zirconium_ore", () -> new ZirconiumOreBlock());
	public static final DeferredHolder<Block, Block> ZIRCONIUM_BLOCK = REGISTRY.register("zirconium_block", () -> new ZirconiumBlockBlock());
	public static final DeferredHolder<Block, Block> ALUMINIUM_ORE = REGISTRY.register("aluminium_ore", () -> new AluminiumOreBlock());
	public static final DeferredHolder<Block, Block> DEEPSLATE_ALUMINIUM_ORE = REGISTRY.register("deepslate_aluminium_ore", () -> new DeepslateAluminiumOreBlock());
	public static final DeferredHolder<Block, Block> ALUMINIUM_BLOCK = REGISTRY.register("aluminium_block", () -> new AluminiumBlockBlock());
	public static final DeferredHolder<Block, Block> DEEPSLATE_TOPAZ_ORE = REGISTRY.register("deepslate_topaz_ore", () -> new DeepslateTopazOreBlock());
	public static final DeferredHolder<Block, Block> TOPAZ_ORE = REGISTRY.register("topaz_ore", () -> new TopazOreBlock());
	public static final DeferredHolder<Block, Block> TOPAZ_BLOCK = REGISTRY.register("topaz_block", () -> new TopazBlockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
