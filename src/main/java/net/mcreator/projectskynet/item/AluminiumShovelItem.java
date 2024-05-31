
package net.mcreator.projectskynet.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.projectskynet.init.ProjectSkynetModItems;

public class AluminiumShovelItem extends ShovelItem {
	public AluminiumShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 69;
			}

			public float getSpeed() {
				return 3f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 6;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ProjectSkynetModItems.ALUMINIUM_INGOT.get()));
			}
		}, 1, -4f, new Item.Properties());
	}
}
