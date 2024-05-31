
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.projectskynet.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.projectskynet.ProjectSkynetMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ProjectSkynetModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ProjectSkynetMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> PROJECTSKYNET = REGISTRY.register("projectskynet",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.project_skynet.projectskynet")).icon(() -> new ItemStack(ProjectSkynetModItems.SKYWORLD.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ProjectSkynetModItems.COPPER_PICKAXE.get());
				tabData.accept(ProjectSkynetModItems.COPPER_AXE.get());
				tabData.accept(ProjectSkynetModItems.COPPER_SWORD.get());
				tabData.accept(ProjectSkynetModItems.COPPER_SHOVEL.get());
				tabData.accept(ProjectSkynetModItems.COPPER_HOE.get());
				tabData.accept(ProjectSkynetModItems.SKYWORLD.get());
				tabData.accept(ProjectSkynetModItems.EMERALDSWORD.get());
				tabData.accept(ProjectSkynetModItems.EMERALDAXE.get());
				tabData.accept(ProjectSkynetModItems.EMERALD_SHOVEL.get());
				tabData.accept(ProjectSkynetModItems.EMERALDHOE.get());
				tabData.accept(ProjectSkynetModItems.EMERALDPICKAXE.get());
				tabData.accept(ProjectSkynetModItems.EMERALD_HELMET.get());
				tabData.accept(ProjectSkynetModItems.EMERALD_CHESTPLATE.get());
				tabData.accept(ProjectSkynetModItems.EMERALD_LEGGINGS.get());
				tabData.accept(ProjectSkynetModItems.EMERALD_BOOTS.get());
				tabData.accept(ProjectSkynetModItems.RUBY.get());
				tabData.accept(ProjectSkynetModBlocks.RUBYORE.get().asItem());
				tabData.accept(ProjectSkynetModBlocks.DEEPSLATERUBYORE.get().asItem());
				tabData.accept(ProjectSkynetModItems.RUBY_SWORD.get());
				tabData.accept(ProjectSkynetModItems.RUBY_PICKAXE.get());
				tabData.accept(ProjectSkynetModItems.RUBY_AXE.get());
				tabData.accept(ProjectSkynetModItems.RUBY_HOE.get());
				tabData.accept(ProjectSkynetModItems.RUBY_SHOVEL.get());
				tabData.accept(ProjectSkynetModItems.RUBY_1_HELMET.get());
				tabData.accept(ProjectSkynetModItems.RUBY_1_CHESTPLATE.get());
				tabData.accept(ProjectSkynetModItems.RUBY_1_LEGGINGS.get());
				tabData.accept(ProjectSkynetModItems.RUBY_1_BOOTS.get());
				tabData.accept(ProjectSkynetModBlocks.RUBYBLOCK.get().asItem());
				tabData.accept(ProjectSkynetModItems.SAPPHIRE.get());
				tabData.accept(ProjectSkynetModBlocks.SAPPHIREORE.get().asItem());
				tabData.accept(ProjectSkynetModBlocks.DEEPSLATESAPPHIREORE.get().asItem());
				tabData.accept(ProjectSkynetModBlocks.SAPPHIREBLOCK.get().asItem());
				tabData.accept(ProjectSkynetModItems.ZIRCONIUMINGOT.get());
				tabData.accept(ProjectSkynetModBlocks.ZIRCONIUM_ORE.get().asItem());
				tabData.accept(ProjectSkynetModBlocks.ZIRCONIUM_BLOCK.get().asItem());
				tabData.accept(ProjectSkynetModItems.COAL_PICKAXE.get());
				tabData.accept(ProjectSkynetModItems.COAL_AXE.get());
				tabData.accept(ProjectSkynetModItems.COAL_SWORD.get());
				tabData.accept(ProjectSkynetModItems.COAL_SHOVEL.get());
				tabData.accept(ProjectSkynetModItems.COAL_HOE.get());
				tabData.accept(ProjectSkynetModItems.SLIME_PICKAXE.get());
				tabData.accept(ProjectSkynetModItems.SLIME_AXE.get());
				tabData.accept(ProjectSkynetModItems.SLIME_SWORD.get());
				tabData.accept(ProjectSkynetModItems.SLIME_SHOVEL.get());
				tabData.accept(ProjectSkynetModItems.SLIME_HOE.get());
				tabData.accept(ProjectSkynetModItems.ALUMINIUM_INGOT.get());
				tabData.accept(ProjectSkynetModItems.TOPAZ.get());
				tabData.accept(ProjectSkynetModBlocks.ALUMINIUM_ORE.get().asItem());
				tabData.accept(ProjectSkynetModBlocks.DEEPSLATE_ALUMINIUM_ORE.get().asItem());
				tabData.accept(ProjectSkynetModBlocks.ALUMINIUM_BLOCK.get().asItem());
				tabData.accept(ProjectSkynetModBlocks.DEEPSLATE_TOPAZ_ORE.get().asItem());
				tabData.accept(ProjectSkynetModBlocks.TOPAZ_ORE.get().asItem());
				tabData.accept(ProjectSkynetModBlocks.TOPAZ_BLOCK.get().asItem());
				tabData.accept(ProjectSkynetModItems.ALUMINIUM_PICKAXE.get());
				tabData.accept(ProjectSkynetModItems.ALUMINIUM_AXE.get());
				tabData.accept(ProjectSkynetModItems.ALUMINIUM_SWORD.get());
				tabData.accept(ProjectSkynetModItems.ALUMINIUM_SHOVEL.get());
				tabData.accept(ProjectSkynetModItems.ALUMINIUM_HOE.get());
				tabData.accept(ProjectSkynetModItems.REDSTONE_PICKAXE.get());
				tabData.accept(ProjectSkynetModItems.REDSTONE_AXE.get());
				tabData.accept(ProjectSkynetModItems.REDSTONE_SWORD.get());
				tabData.accept(ProjectSkynetModItems.REDSTONE_SHOVEL.get());
				tabData.accept(ProjectSkynetModItems.REDSTONE_HOE.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(ProjectSkynetModItems.BRICK_SWORD.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(ProjectSkynetModItems.BRICK_PICKAXE.get());
			tabData.accept(ProjectSkynetModItems.BRICK_AXE.get());
			tabData.accept(ProjectSkynetModItems.BRICK_SHOVEL.get());
			tabData.accept(ProjectSkynetModItems.BRICK_HOE.get());
		}
	}
}
