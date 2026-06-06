package net.axollen.create_ice_creams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.AbstractMap.SimpleEntry;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.axollen.create_ice_creams.init.CreateIceCreamsModItems;
import net.axollen.create_ice_creams.init.CreateIceCreamsModTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.util.thread.SidedThreadGroups;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.tick.ServerTickEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(CreateIceCreamsMod.MODID)
public class CreateIceCreamsMod {
    public static final Logger LOGGER = LoggerFactory.getLogger(CreateIceCreamsMod.class);
    public static final String MODID = "create_ice_creams";
    private static final Collection<SimpleEntry<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();

    public CreateIceCreamsMod(IEventBus modEventBus) {
        NeoForge.EVENT_BUS.register(this);
        CreateIceCreamsModItems.REGISTRY.register(modEventBus);
        CreateIceCreamsModTabs.REGISTRY.register(modEventBus);
    }

    public static void queueServerWork(int tick, Runnable action) {
        if (Thread.currentThread().getThreadGroup() == SidedThreadGroups.SERVER) {
            workQueue.add(new SimpleEntry<>(action, tick));
        }
    }

    @SubscribeEvent
    public void tick(ServerTickEvent.Post event) {
        List<SimpleEntry<Runnable, Integer>> actions = new ArrayList<>();
        workQueue.forEach(work -> {
            work.setValue(work.getValue() - 1);
            if (work.getValue() == 0) {
                actions.add(work);
            }
        });
        actions.forEach(e -> e.getKey().run());
        workQueue.removeAll(actions);
    }
}
