package net.mcreator.zhengelssaditions;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.util.thread.SidedThreadGroups;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;

import net.mcreator.zhengelssaditions.init.ZhengelssAditionsModVillagerProfessions;
import net.mcreator.zhengelssaditions.init.ZhengelssAditionsModTabs;
import net.mcreator.zhengelssaditions.init.ZhengelssAditionsModSounds;
import net.mcreator.zhengelssaditions.init.ZhengelssAditionsModMenus;
import net.mcreator.zhengelssaditions.init.ZhengelssAditionsModItems;
import net.mcreator.zhengelssaditions.init.ZhengelssAditionsModFluids;
import net.mcreator.zhengelssaditions.init.ZhengelssAditionsModFluidTypes;
import net.mcreator.zhengelssaditions.init.ZhengelssAditionsModEntities;
import net.mcreator.zhengelssaditions.init.ZhengelssAditionsModEnchantments;
import net.mcreator.zhengelssaditions.init.ZhengelssAditionsModBlocks;
import net.mcreator.zhengelssaditions.init.ZhengelssAditionsModBlockEntities;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.AbstractMap;

@Mod("zhengelss_aditions")
public class ZhengelssAditionsMod {
	public static final Logger LOGGER = LogManager.getLogger(ZhengelssAditionsMod.class);
	public static final String MODID = "zhengelss_aditions";

	public ZhengelssAditionsMod() {
		// Start of user code block mod constructor
		// End of user code block mod constructor
		MinecraftForge.EVENT_BUS.register(this);
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		ZhengelssAditionsModSounds.REGISTRY.register(bus);
		ZhengelssAditionsModBlocks.REGISTRY.register(bus);
		ZhengelssAditionsModBlockEntities.REGISTRY.register(bus);
		ZhengelssAditionsModItems.REGISTRY.register(bus);
		ZhengelssAditionsModEntities.REGISTRY.register(bus);
		ZhengelssAditionsModEnchantments.REGISTRY.register(bus);
		ZhengelssAditionsModTabs.REGISTRY.register(bus);

		ZhengelssAditionsModVillagerProfessions.PROFESSIONS.register(bus);
		ZhengelssAditionsModMenus.REGISTRY.register(bus);
		ZhengelssAditionsModFluids.REGISTRY.register(bus);
		ZhengelssAditionsModFluidTypes.REGISTRY.register(bus);

		// Start of user code block mod init
		// End of user code block mod init
	}

	// Start of user code block mod methods
	// End of user code block mod methods
	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, clientVersion -> true);
	private static int messageID = 0;

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}

	private static final Collection<AbstractMap.SimpleEntry<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();

	public static void queueServerWork(int tick, Runnable action) {
		if (Thread.currentThread().getThreadGroup() == SidedThreadGroups.SERVER)
			workQueue.add(new AbstractMap.SimpleEntry<>(action, tick));
	}

	@SubscribeEvent
	public void tick(TickEvent.ServerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			List<AbstractMap.SimpleEntry<Runnable, Integer>> actions = new ArrayList<>();
			workQueue.forEach(work -> {
				work.setValue(work.getValue() - 1);
				if (work.getValue() == 0)
					actions.add(work);
			});
			actions.forEach(e -> e.getKey().run());
			workQueue.removeAll(actions);
		}
	}
}
