
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.projectskynet.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.bus.api.IEventBus;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.projectskynet.item.ZirconiumingotItem;
import net.mcreator.projectskynet.item.TopazItem;
import net.mcreator.projectskynet.item.SlimeSwordItem;
import net.mcreator.projectskynet.item.SlimeShovelItem;
import net.mcreator.projectskynet.item.SlimePickaxeItem;
import net.mcreator.projectskynet.item.SlimeHoeItem;
import net.mcreator.projectskynet.item.SlimeAxeItem;
import net.mcreator.projectskynet.item.SkyworldItem;
import net.mcreator.projectskynet.item.SapphireItem;
import net.mcreator.projectskynet.item.RubySwordItem;
import net.mcreator.projectskynet.item.RubyShovelItem;
import net.mcreator.projectskynet.item.RubyPickaxeItem;
import net.mcreator.projectskynet.item.RubyItem;
import net.mcreator.projectskynet.item.RubyHoeItem;
import net.mcreator.projectskynet.item.RubyAxeItem;
import net.mcreator.projectskynet.item.Ruby1Item;
import net.mcreator.projectskynet.item.RedstoneSwordItem;
import net.mcreator.projectskynet.item.RedstoneShovelItem;
import net.mcreator.projectskynet.item.RedstonePickaxeItem;
import net.mcreator.projectskynet.item.RedstoneHoeItem;
import net.mcreator.projectskynet.item.RedstoneAxeItem;
import net.mcreator.projectskynet.item.EmeraldswordItem;
import net.mcreator.projectskynet.item.EmeraldpickaxeItem;
import net.mcreator.projectskynet.item.EmeraldhoeItem;
import net.mcreator.projectskynet.item.EmeraldaxeItem;
import net.mcreator.projectskynet.item.EmeraldShovelItem;
import net.mcreator.projectskynet.item.EmeraldItem;
import net.mcreator.projectskynet.item.CopperSwordItem;
import net.mcreator.projectskynet.item.CopperShovelItem;
import net.mcreator.projectskynet.item.CopperPickaxeItem;
import net.mcreator.projectskynet.item.CopperHoeItem;
import net.mcreator.projectskynet.item.CopperAxeItem;
import net.mcreator.projectskynet.item.CoalSwordItem;
import net.mcreator.projectskynet.item.CoalShovelItem;
import net.mcreator.projectskynet.item.CoalPickaxeItem;
import net.mcreator.projectskynet.item.CoalHoeItem;
import net.mcreator.projectskynet.item.CoalAxeItem;
import net.mcreator.projectskynet.item.BrickSwordItem;
import net.mcreator.projectskynet.item.BrickShovelItem;
import net.mcreator.projectskynet.item.BrickPickaxeItem;
import net.mcreator.projectskynet.item.BrickHoeItem;
import net.mcreator.projectskynet.item.BrickAxeItem;
import net.mcreator.projectskynet.item.AluminiumSwordItem;
import net.mcreator.projectskynet.item.AluminiumShovelItem;
import net.mcreator.projectskynet.item.AluminiumPickaxeItem;
import net.mcreator.projectskynet.item.AluminiumIngotItem;
import net.mcreator.projectskynet.item.AluminiumHoeItem;
import net.mcreator.projectskynet.item.AluminiumAxeItem;
import net.mcreator.projectskynet.ProjectSkynetMod;

public class ProjectSkynetModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(BuiltInRegistries.ITEM, ProjectSkynetMod.MODID);
	public static final DeferredHolder<Item, Item> COPPER_PICKAXE = REGISTRY.register("copper_pickaxe", () -> new CopperPickaxeItem());
	public static final DeferredHolder<Item, Item> COPPER_AXE = REGISTRY.register("copper_axe", () -> new CopperAxeItem());
	public static final DeferredHolder<Item, Item> COPPER_SWORD = REGISTRY.register("copper_sword", () -> new CopperSwordItem());
	public static final DeferredHolder<Item, Item> COPPER_SHOVEL = REGISTRY.register("copper_shovel", () -> new CopperShovelItem());
	public static final DeferredHolder<Item, Item> COPPER_HOE = REGISTRY.register("copper_hoe", () -> new CopperHoeItem());
	public static final DeferredHolder<Item, Item> SKYWORLD = REGISTRY.register("skyworld", () -> new SkyworldItem());
	public static final DeferredHolder<Item, Item> EMERALDSWORD = REGISTRY.register("emeraldsword", () -> new EmeraldswordItem());
	public static final DeferredHolder<Item, Item> EMERALDAXE = REGISTRY.register("emeraldaxe", () -> new EmeraldaxeItem());
	public static final DeferredHolder<Item, Item> EMERALD_SHOVEL = REGISTRY.register("emerald_shovel", () -> new EmeraldShovelItem());
	public static final DeferredHolder<Item, Item> EMERALDHOE = REGISTRY.register("emeraldhoe", () -> new EmeraldhoeItem());
	public static final DeferredHolder<Item, Item> EMERALDPICKAXE = REGISTRY.register("emeraldpickaxe", () -> new EmeraldpickaxeItem());
	public static final DeferredHolder<Item, Item> EMERALD_HELMET = REGISTRY.register("emerald_helmet", () -> new EmeraldItem.Helmet());
	public static final DeferredHolder<Item, Item> EMERALD_CHESTPLATE = REGISTRY.register("emerald_chestplate", () -> new EmeraldItem.Chestplate());
	public static final DeferredHolder<Item, Item> EMERALD_LEGGINGS = REGISTRY.register("emerald_leggings", () -> new EmeraldItem.Leggings());
	public static final DeferredHolder<Item, Item> EMERALD_BOOTS = REGISTRY.register("emerald_boots", () -> new EmeraldItem.Boots());
	public static final DeferredHolder<Item, Item> RUBY = REGISTRY.register("ruby", () -> new RubyItem());
	public static final DeferredHolder<Item, Item> RUBYORE = block(ProjectSkynetModBlocks.RUBYORE);
	public static final DeferredHolder<Item, Item> DEEPSLATERUBYORE = block(ProjectSkynetModBlocks.DEEPSLATERUBYORE);
	public static final DeferredHolder<Item, Item> RUBY_SWORD = REGISTRY.register("ruby_sword", () -> new RubySwordItem());
	public static final DeferredHolder<Item, Item> RUBY_PICKAXE = REGISTRY.register("ruby_pickaxe", () -> new RubyPickaxeItem());
	public static final DeferredHolder<Item, Item> RUBY_AXE = REGISTRY.register("ruby_axe", () -> new RubyAxeItem());
	public static final DeferredHolder<Item, Item> RUBY_HOE = REGISTRY.register("ruby_hoe", () -> new RubyHoeItem());
	public static final DeferredHolder<Item, Item> RUBY_SHOVEL = REGISTRY.register("ruby_shovel", () -> new RubyShovelItem());
	public static final DeferredHolder<Item, Item> RUBY_1_HELMET = REGISTRY.register("ruby_1_helmet", () -> new Ruby1Item.Helmet());
	public static final DeferredHolder<Item, Item> RUBY_1_CHESTPLATE = REGISTRY.register("ruby_1_chestplate", () -> new Ruby1Item.Chestplate());
	public static final DeferredHolder<Item, Item> RUBY_1_LEGGINGS = REGISTRY.register("ruby_1_leggings", () -> new Ruby1Item.Leggings());
	public static final DeferredHolder<Item, Item> RUBY_1_BOOTS = REGISTRY.register("ruby_1_boots", () -> new Ruby1Item.Boots());
	public static final DeferredHolder<Item, Item> RUBYBLOCK = block(ProjectSkynetModBlocks.RUBYBLOCK);
	public static final DeferredHolder<Item, Item> SAPPHIRE = REGISTRY.register("sapphire", () -> new SapphireItem());
	public static final DeferredHolder<Item, Item> SAPPHIREORE = block(ProjectSkynetModBlocks.SAPPHIREORE);
	public static final DeferredHolder<Item, Item> DEEPSLATESAPPHIREORE = block(ProjectSkynetModBlocks.DEEPSLATESAPPHIREORE);
	public static final DeferredHolder<Item, Item> SAPPHIREBLOCK = block(ProjectSkynetModBlocks.SAPPHIREBLOCK);
	public static final DeferredHolder<Item, Item> ZIRCONIUMINGOT = REGISTRY.register("zirconiumingot", () -> new ZirconiumingotItem());
	public static final DeferredHolder<Item, Item> ZIRCONIUM_ORE = block(ProjectSkynetModBlocks.ZIRCONIUM_ORE);
	public static final DeferredHolder<Item, Item> ZIRCONIUM_BLOCK = block(ProjectSkynetModBlocks.ZIRCONIUM_BLOCK);
	public static final DeferredHolder<Item, Item> COAL_PICKAXE = REGISTRY.register("coal_pickaxe", () -> new CoalPickaxeItem());
	public static final DeferredHolder<Item, Item> COAL_AXE = REGISTRY.register("coal_axe", () -> new CoalAxeItem());
	public static final DeferredHolder<Item, Item> COAL_SWORD = REGISTRY.register("coal_sword", () -> new CoalSwordItem());
	public static final DeferredHolder<Item, Item> COAL_SHOVEL = REGISTRY.register("coal_shovel", () -> new CoalShovelItem());
	public static final DeferredHolder<Item, Item> COAL_HOE = REGISTRY.register("coal_hoe", () -> new CoalHoeItem());
	public static final DeferredHolder<Item, Item> SLIME_PICKAXE = REGISTRY.register("slime_pickaxe", () -> new SlimePickaxeItem());
	public static final DeferredHolder<Item, Item> SLIME_AXE = REGISTRY.register("slime_axe", () -> new SlimeAxeItem());
	public static final DeferredHolder<Item, Item> SLIME_SWORD = REGISTRY.register("slime_sword", () -> new SlimeSwordItem());
	public static final DeferredHolder<Item, Item> SLIME_SHOVEL = REGISTRY.register("slime_shovel", () -> new SlimeShovelItem());
	public static final DeferredHolder<Item, Item> SLIME_HOE = REGISTRY.register("slime_hoe", () -> new SlimeHoeItem());
	public static final DeferredHolder<Item, Item> ALUMINIUM_INGOT = REGISTRY.register("aluminium_ingot", () -> new AluminiumIngotItem());
	public static final DeferredHolder<Item, Item> TOPAZ = REGISTRY.register("topaz", () -> new TopazItem());
	public static final DeferredHolder<Item, Item> ALUMINIUM_ORE = block(ProjectSkynetModBlocks.ALUMINIUM_ORE);
	public static final DeferredHolder<Item, Item> DEEPSLATE_ALUMINIUM_ORE = block(ProjectSkynetModBlocks.DEEPSLATE_ALUMINIUM_ORE);
	public static final DeferredHolder<Item, Item> ALUMINIUM_BLOCK = block(ProjectSkynetModBlocks.ALUMINIUM_BLOCK);
	public static final DeferredHolder<Item, Item> DEEPSLATE_TOPAZ_ORE = block(ProjectSkynetModBlocks.DEEPSLATE_TOPAZ_ORE);
	public static final DeferredHolder<Item, Item> TOPAZ_ORE = block(ProjectSkynetModBlocks.TOPAZ_ORE);
	public static final DeferredHolder<Item, Item> TOPAZ_BLOCK = block(ProjectSkynetModBlocks.TOPAZ_BLOCK);
	public static final DeferredHolder<Item, Item> ALUMINIUM_PICKAXE = REGISTRY.register("aluminium_pickaxe", () -> new AluminiumPickaxeItem());
	public static final DeferredHolder<Item, Item> ALUMINIUM_AXE = REGISTRY.register("aluminium_axe", () -> new AluminiumAxeItem());
	public static final DeferredHolder<Item, Item> ALUMINIUM_SWORD = REGISTRY.register("aluminium_sword", () -> new AluminiumSwordItem());
	public static final DeferredHolder<Item, Item> ALUMINIUM_SHOVEL = REGISTRY.register("aluminium_shovel", () -> new AluminiumShovelItem());
	public static final DeferredHolder<Item, Item> ALUMINIUM_HOE = REGISTRY.register("aluminium_hoe", () -> new AluminiumHoeItem());
	public static final DeferredHolder<Item, Item> REDSTONE_PICKAXE = REGISTRY.register("redstone_pickaxe", () -> new RedstonePickaxeItem());
	public static final DeferredHolder<Item, Item> REDSTONE_AXE = REGISTRY.register("redstone_axe", () -> new RedstoneAxeItem());
	public static final DeferredHolder<Item, Item> REDSTONE_SWORD = REGISTRY.register("redstone_sword", () -> new RedstoneSwordItem());
	public static final DeferredHolder<Item, Item> REDSTONE_SHOVEL = REGISTRY.register("redstone_shovel", () -> new RedstoneShovelItem());
	public static final DeferredHolder<Item, Item> REDSTONE_HOE = REGISTRY.register("redstone_hoe", () -> new RedstoneHoeItem());
	public static final DeferredHolder<Item, Item> BRICK_PICKAXE = REGISTRY.register("brick_pickaxe", () -> new BrickPickaxeItem());
	public static final DeferredHolder<Item, Item> BRICK_AXE = REGISTRY.register("brick_axe", () -> new BrickAxeItem());
	public static final DeferredHolder<Item, Item> BRICK_SWORD = REGISTRY.register("brick_sword", () -> new BrickSwordItem());
	public static final DeferredHolder<Item, Item> BRICK_SHOVEL = REGISTRY.register("brick_shovel", () -> new BrickShovelItem());
	public static final DeferredHolder<Item, Item> BRICK_HOE = REGISTRY.register("brick_hoe", () -> new BrickHoeItem());

	// Start of user code block custom items
	// End of user code block custom items
	public static void register(IEventBus bus) {
		REGISTRY.register(bus);
	}

	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
