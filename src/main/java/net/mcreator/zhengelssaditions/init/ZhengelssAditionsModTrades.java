
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.zhengelssaditions.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ZhengelssAditionsModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == ZhengelssAditionsModVillagerProfessions.METALLURGIST.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.COPPER_INGOT, 16),

					new ItemStack(Items.EMERALD), 10, 1, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.IRON_BARS, 7),

					new ItemStack(Items.EMERALD), 10, 1, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(Items.BUCKET), 8, 2, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE), 16, 1, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE), 16, 1, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 4),

					new ItemStack(Items.SPYGLASS), 2, 3, 0.05f));
		}
		if (event.getType() == ZhengelssAditionsModVillagerProfessions.METALLURGIST.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2),

					new ItemStack(Blocks.IRON_TRAPDOOR), 12, 4, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2),

					new ItemStack(Blocks.IRON_DOOR), 12, 4, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3),

					new ItemStack(Items.CLOCK), 10, 8, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(Blocks.RAIL, 16), 10, 3, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3),

					new ItemStack(Blocks.POWERED_RAIL, 16), 10, 8, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(Blocks.DETECTOR_RAIL, 16), 10, 3, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(Blocks.ACTIVATOR_RAIL, 16), 10, 3, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(ZhengelssAditionsModBlocks.COPPERLANTERN.get()), 8, 2, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.COMPASS, 2),

					new ItemStack(Items.COMPASS), 6, 5, 0.05f));
		}
		if (event.getType() == ZhengelssAditionsModVillagerProfessions.METALLURGIST.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(Blocks.HOPPER), 16, 6, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(Blocks.SMITHING_TABLE), 6, 4, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(Items.CAULDRON), 8, 6, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(Blocks.CHAIN, 2), 16, 4, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(Blocks.BLAST_FURNACE), 6, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(Items.MINECART), 4, 6, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(Blocks.LIGHTNING_ROD, 4), 8, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2),

					new ItemStack(Blocks.PISTON), 16, 6, 0.05f));
		}
		if (event.getType() == ZhengelssAditionsModVillagerProfessions.METALLURGIST.get()) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(Blocks.EXPOSED_COPPER), 32, 3, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2),

					new ItemStack(Blocks.WEATHERED_COPPER), 32, 4, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3),

					new ItemStack(Blocks.OXIDIZED_COPPER), 32, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(Blocks.LANTERN), 16, 3, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(Blocks.SOUL_LANTERN), 16, 3, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Blocks.DAMAGED_ANVIL), new ItemStack(Items.EMERALD, 16), new ItemStack(Blocks.CHIPPED_ANVIL), 10, 16, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Blocks.CHIPPED_ANVIL), new ItemStack(Items.EMERALD, 16), new ItemStack(Blocks.ANVIL), 10, 16, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2),

					new ItemStack(Items.HONEYCOMB), 12, 7, 0.05f));
		}
		if (event.getType() == ZhengelssAditionsModVillagerProfessions.METALLURGIST.get()) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 64), new ItemStack(Items.EMERALD, 64), new ItemStack(Blocks.LODESTONE), 2, 100, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 16),

					new ItemStack(Items.GOLDEN_APPLE), 4, 30, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 64),

					new ItemStack(Blocks.ANVIL), 2, 60, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.NETHERITE_SCRAP),

					new ItemStack(Items.EMERALD, 12), 8, 50, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 32),

					new ItemStack(ZhengelssAditionsModItems.DIAMONDHAMMER.get()), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(ZhengelssAditionsModItems.CHOCOLATE.get(), 2), 8, 3, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(ZhengelssAditionsModItems.VERYSWEETBERRIES.get()), 8, 4, 0.05f));
		}
		if (event.getType() == VillagerProfession.LIBRARIAN) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 32),

					new ItemStack(ZhengelssAditionsModItems.AMETHYSTTOTEM.get()), 1, 10, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 25),

					new ItemStack(ZhengelssAditionsModItems.RUNESTONE.get()), 1, 8, 0.05f));
		}
	}
}
