package com.isjwjwjw.projectttb.datagen;

import com.isjwjwjw.projectttb.ProjectTTB;
import com.isjwjwjw.projectttb.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModBlockstatesProvider extends BlockStateProvider {
    private static final String modid = ProjectTTB.MOD_ID;

    public ModBlockstatesProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, modid, exFileHelper);
    }


    //sovrascriviamo il metodo per registrare simple blockstates e models dei blocchi e blockItems
    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.TERRIUM_BLOCK.get());
        blockWithItem(ModBlocks.RAW_TERRIUM_BLOCK.get());
        blockWithItem(ModBlocks.TERRIUM_ORE.get());
        blockWithItem(ModBlocks.DEEPSLATE_TERRIUM_ORE.get());
        blockWithItem(ModBlocks.TINIUM_ORE.get());
        blockWithItem(ModBlocks.TINIUM_BLOCK.get());
        blockWithItem(ModBlocks.RAW_TINIUM_BLOCK.get());
        blockWithItem(ModBlocks.BRONZIUM_BLOCK.get());
    }

    //genera model cubeall
    private void blockWithItem(Block block){
        simpleBlockWithItem(block, cubeAll(block));
    }
}
