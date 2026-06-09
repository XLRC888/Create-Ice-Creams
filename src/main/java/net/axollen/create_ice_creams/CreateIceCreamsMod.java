package net.axollen.create_ice_creams;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.axollen.create_ice_creams.init.CreateIceCreamsModItems;
import net.axollen.create_ice_creams.init.CreateIceCreamsModTabs;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateIceCreamsMod implements ModInitializer {
   public static final Logger LOGGER = LoggerFactory.getLogger(CreateIceCreamsMod.class);
   public static final String MODID = "create_ice_creams";
   private static final ConcurrentLinkedQueue<SimpleEntry<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();

   @Override
   public void onInitialize() {
      CreateIceCreamsModItems.register();
      CreateIceCreamsModTabs.register();
      ServerTickEvents.END_SERVER_TICK.register(server -> {
         List<SimpleEntry<Runnable, Integer>> actions = new ArrayList<>();
         workQueue.forEach(work -> {
            work.setValue(work.getValue() - 1);
            if (work.getValue() <= 0) {
               actions.add(work);
            }
         });
         actions.forEach(e -> e.getKey().run());
         workQueue.removeAll(actions);
      });
   }

   public static void queueServerWork(int tick, Runnable action) {
      workQueue.add(new SimpleEntry<>(action, tick));
   }
}
