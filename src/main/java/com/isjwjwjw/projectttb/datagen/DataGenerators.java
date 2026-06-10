package com.isjwjwjw.projectttb.datagen;


import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;


public class DataGenerators {
    //register classico
    public static void register(IEventBus modBus){
        modBus.addListener(DataGenerators::gatherData);
    }


    //raccoglie il datagen da generare
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
