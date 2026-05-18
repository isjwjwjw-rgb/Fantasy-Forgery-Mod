package com.isjwjwjw.fantasyforgery.data;


import com.isjwjwjw.fantasyforgery.FantasyForgery;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.models.ModelProvider;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.model.generators.BlockModelProvider;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;


public class DataGenerators {
    //register classico
    public static void register(IEventBus modBus){
        modBus.addListener(DataGenerators::gatherData);
    }


    //raccoglie il data da generare
    private static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();

        //diversi provider per generare models o json files
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        var existingFileHelper = event.getExistingFileHelper();

        //modelli items
        generator.addProvider(event.includeClient(),
                new ModItemModelProvider(output, existingFileHelper));

        //modelli blockstates e blocks
        generator.addProvider(event.includeClient(),
                new ModBlockstatesProvider(output, existingFileHelper));

        //ricette
        generator.addProvider(event.includeServer(),
                new ModRecipeProvider(output, lookupProvider));

        //loot tables
        generator.addProvider(event.includeServer(),
                ModLootTableProvider.create(output, lookupProvider));

        //tags
        generator.addProvider(event.includeServer(),
                new ModBlockTagProvider(output, lookupProvider, existingFileHelper));
    }
}
