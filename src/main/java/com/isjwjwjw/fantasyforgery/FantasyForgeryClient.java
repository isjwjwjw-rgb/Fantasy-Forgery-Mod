package com.isjwjwjw.fantasyforgery;

import com.isjwjwjw.fantasyforgery.item.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

// This class will not load on dedicated servers. Accessing client side code from here is safe.
@Mod(value = FantasyForgery.MOD_ID, dist = Dist.CLIENT)
// You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
@EventBusSubscriber(modid = FantasyForgery.MOD_ID, value = Dist.CLIENT)
public class

FantasyForgeryClient {
    public FantasyForgeryClient(ModContainer container) {
        // Allows NeoForge to create a config screen for this mod's configs.
        // The config screen is accessed by going to the Mods screen > clicking on your mod > clicking on config.
        // Do not forget to add translations for your config options to the en_us.json file.
        container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
        // Some client setup code
        FantasyForgery.LOGGER.info("HELLO FROM CLIENT SETUP");
        FantasyForgery.LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        event.enqueueWork(()-> {
            ItemProperties.register(ModItems.TERRIUM_SHIELD.get(),
                    ResourceLocation.withDefaultNamespace("blocking"),
                    (itemStack, clientLevel, livingEntity, i) ->
                            livingEntity != null && livingEntity.isUsingItem() && livingEntity.getUseItem()
                                    == itemStack ? 1.0F:0.0F);
        });
    }
}
