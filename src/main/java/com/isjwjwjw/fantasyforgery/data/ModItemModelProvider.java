package com.isjwjwjw.fantasyforgery.data;

import com.isjwjwjw.fantasyforgery.FantasyForgery;
import com.isjwjwjw.fantasyforgery.item.ModItems;
import com.isjwjwjw.fantasyforgery.item.ModTools;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;

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
        basicItem(ModItems.MAGNESIS_INGOT.get());
        basicItem(ModItems.OBSIDIUM_INGOT.get());

        handheldItem(ModTools.TINIUM_STONE_PICKAXE);
        handheldItem(ModTools.TINIUM_IRON_PICKAXE);
        handheldItem(ModTools.TINIUM_GOLDEN_PICKAXE);
        handheldItem(ModTools.TINIUM_DIAMOND_PICKAXE);
        handheldItem(ModTools.TINIUM_NETHERITE_PICKAXE);
        handheldItem(ModTools.TINIUM_STONE_SHOVEL);
        handheldItem(ModTools.TINIUM_IRON_SHOVEL);
        handheldItem(ModTools.TINIUM_GOLDEN_SHOVEL);
        handheldItem(ModTools.TINIUM_DIAMOND_SHOVEL);
        handheldItem(ModTools.TINIUM_NETHERITE_SHOVEL);
        handheldItem(ModTools.TINIUM_STONE_AXE);
        handheldItem(ModTools.TINIUM_IRON_AXE);
        handheldItem(ModTools.TINIUM_GOLDEN_AXE);
        handheldItem(ModTools.TINIUM_DIAMOND_AXE);
        handheldItem(ModTools.TINIUM_NETHERITE_AXE);
    }



    private void handheldItem(DeferredItem<Item> Item){
        withExistingParent(Item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(FantasyForgery.MOD_ID,
                        "item/"+ Item.getId().getPath()));
    }
}
