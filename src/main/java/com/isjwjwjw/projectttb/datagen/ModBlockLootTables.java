package com.isjwjwjw.projectttb.datagen;

import com.isjwjwjw.projectttb.block.ModBlocks;
import com.isjwjwjw.projectttb.item.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {

    public ModBlockLootTables(HolderLookup.Provider lookupProvider) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), lookupProvider);
    }

    //sovrascriviamo metodo per le loottables di Minecraft
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }

    //genera json files
    @Override
    protected void generate() {

        //droppa se stesso
        dropSelf(ModBlocks.TERRIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_TERRIUM_BLOCK.get());
        dropSelf(ModBlocks.TINIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_TINIUM_BLOCK.get());
        dropSelf(ModBlocks.BRONZIUM_BLOCK.get());
        dropSelf(ModBlocks.INFUSER.get());


        //crea drop minerali
        add(ModBlocks.TERRIUM_ORE.get(),
                block -> createOreDrop(ModBlocks.TERRIUM_ORE.get(), ModItems.RAW_TERRIUM.get()));

        add(ModBlocks.DEEPSLATE_TERRIUM_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_TERRIUM_ORE.get(), ModItems.RAW_TERRIUM.get()));

        add(ModBlocks.TINIUM_ORE.get(),
                block -> createOreDrop(ModBlocks.TERRIUM_ORE.get(), ModItems.RAW_TINIUM.get()));
    }
}
