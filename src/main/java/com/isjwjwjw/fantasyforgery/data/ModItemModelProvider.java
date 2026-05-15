package com.isjwjwjw.fantasyforgery.data;

import com.isjwjwjw.fantasyforgery.FantasyForgery;
import com.isjwjwjw.fantasyforgery.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {

    //da l'accesso alla classe DataGenerators
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, FantasyForgery.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.TERRIUM_INGOT.get());
        basicItem(ModItems.RAW_TERRIUM.get());
        basicItem(ModItems.TINIUM_INGOT.get());
        basicItem(ModItems.RAW_TINIUM.get());
        basicItem(ModItems.BRONZIUM_INGOT.get());
    }
}
