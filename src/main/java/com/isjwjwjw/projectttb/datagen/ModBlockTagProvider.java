package com.isjwjwjw.projectttb.datagen;

import com.isjwjwjw.projectttb.ProjectTTB;
import com.isjwjwjw.projectttb.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {

    //accesso alla classe DataGenerators
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                               @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ProjectTTB.MOD_ID, existingFileHelper);
    }

    //sovrascriviamo il metodo per aggiungere i tags di Minecraft ai blocchi custom
    @Override
    protected void addTags(HolderLookup.Provider lookupProvider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.TERRIUM_BLOCK.get())
                .add(ModBlocks.RAW_TERRIUM_BLOCK.get())
                .add(ModBlocks.TERRIUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_TERRIUM_ORE.get())
                .add(ModBlocks.TINIUM_BLOCK.get())
                .add(ModBlocks.RAW_TINIUM_BLOCK.get())
                .add(ModBlocks.TINIUM_ORE.get())
                .add(ModBlocks.BRONZIUM_BLOCK.get())
                .add(ModBlocks.INFUSER.get());


        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.TERRIUM_BLOCK.get())
                .add(ModBlocks.RAW_TERRIUM_BLOCK.get())
                .add(ModBlocks.TERRIUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_TERRIUM_ORE.get())
                .add(ModBlocks.BRONZIUM_BLOCK.get())
                .add(ModBlocks.INFUSER.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.TINIUM_ORE.get())
                .add(ModBlocks.TINIUM_BLOCK.get())
                .add(ModBlocks.RAW_TINIUM_BLOCK.get());

    }
}
