package com.isjwjwjw.projectttb.item;

import com.isjwjwjw.projectttb.ProjectTTB;
import com.isjwjwjw.projectttb.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ProjectTTB.MOD_ID);


    public static final Supplier<CreativeModeTab> BLOCKS_TAB = CREATIVE_MODE_TAB.register("blocks_tab",
            ()-> CreativeModeTab.builder()
                    .icon(()-> new ItemStack(ModBlocks.TERRIUM_ORE.get()))
                    .title(Component.translatable("creativetab.projectttb.blocks_tab"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.TERRIUM_BLOCK);
                        output.accept(ModBlocks.TERRIUM_ORE);
                        output.accept(ModBlocks.RAW_TERRIUM_BLOCK);
                        output.accept(ModBlocks.DEEPSLATE_TERRIUM_ORE);
                        output.accept(ModBlocks.TINIUM_BLOCK);
                        output.accept(ModBlocks.RAW_TINIUM_BLOCK);
                        output.accept(ModBlocks.TINIUM_ORE);
                        output.accept(ModBlocks.BRONZIUM_BLOCK);
                        output.accept(ModBlocks.INFUSER);
                    }))
                    .build());
    public static final Supplier<CreativeModeTab> ITEMS_TAB = CREATIVE_MODE_TAB.register("items_tab",
            ()-> CreativeModeTab.builder()
                    .icon(()-> new ItemStack(ModItems.TERRIUM_INGOT.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ProjectTTB.MOD_ID, "blocks_tab"))
                    .title(Component.translatable("creativetab.projectttb.items_tab"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(ModItems.TERRIUM_INGOT);
                        output.accept(ModItems.RAW_TERRIUM);
                        output.accept(ModItems.TINIUM_INGOT);
                        output.accept(ModItems.RAW_TINIUM);
                        output.accept(ModItems.BRONZIUM_INGOT);
                        output.accept(ModItems.UPGRADE_PICKAXE);
                        output.accept(ModItems.UPGRADE_AXE);
                        output.accept(ModItems.UPGRADE_SHOVEL);
                        output.accept(ModItems.UPGRADE_HOE);
                    }))
                    .build());

    public static final Supplier<CreativeModeTab> TOOLS_TAB = CREATIVE_MODE_TAB.register("tools_tab",
            ()-> CreativeModeTab.builder()
                    .icon(()-> new ItemStack(ModTools.TINIUM_IRON_PICKAXE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ProjectTTB.MOD_ID, "items_tab"))
                    .title(Component.translatable("creativetab.projectttb.tools_tab"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(ModTools.TINIUM_STONE_PICKAXE);
                        output.accept(ModTools.TINIUM_IRON_PICKAXE);
                        output.accept(ModTools.TINIUM_GOLDEN_PICKAXE);
                        output.accept(ModTools.TINIUM_DIAMOND_PICKAXE);
                        output.accept(ModTools.TINIUM_NETHERITE_PICKAXE);
                        output.accept(ModTools.TINIUM_STONE_SHOVEL);
                        output.accept(ModTools.TINIUM_IRON_SHOVEL);
                        output.accept(ModTools.TINIUM_GOLDEN_SHOVEL);
                        output.accept(ModTools.TINIUM_DIAMOND_SHOVEL);
                        output.accept(ModTools.TINIUM_NETHERITE_SHOVEL);
                        output.accept(ModTools.TINIUM_STONE_AXE);
                        output.accept(ModTools.TINIUM_IRON_AXE);
                        output.accept(ModTools.TINIUM_GOLDEN_AXE);
                        output.accept(ModTools.TINIUM_DIAMOND_AXE);
                        output.accept(ModTools.TINIUM_NETHERITE_AXE);
                        output.accept(ModTools.TINIUM_STONE_HOE);
                        output.accept(ModTools.TINIUM_IRON_HOE);
                        output.accept(ModTools.TINIUM_GOLDEN_HOE);
                        output.accept(ModTools.TINIUM_DIAMOND_HOE);
                        output.accept(ModTools.TINIUM_NETHERITE_HOE);
                        output.accept(ModTools.TERRIUM_IRON_PICKAXE);
                        output.accept(ModTools.TERRIUM_IRON_AXE);
                        output.accept(ModTools.TERRIUM_IRON_SHOVEL);
                        output.accept(ModTools.TERRIUM_IRON_HOE);
                        output.accept(ModTools.TERRIUM_DIAMOND_PICKAXE);
                        output.accept(ModTools.TERRIUM_DIAMOND_AXE);
                        output.accept(ModTools.TERRIUM_DIAMOND_SHOVEL);
                        output.accept(ModTools.TERRIUM_DIAMOND_HOE);
                        output.accept(ModTools.TERRIUM_NETHERITE_PICKAXE);
                        output.accept(ModTools.TERRIUM_NETHERITE_AXE);
                        output.accept(ModTools.TERRIUM_NETHERITE_SHOVEL);
                        output.accept(ModTools.TERRIUM_NETHERITE_HOE);
                    }))
                    .build());

    public static final Supplier<CreativeModeTab> COMBAT = CREATIVE_MODE_TAB.register("combat",
            ()-> CreativeModeTab.builder()
                    .icon(()-> new ItemStack(ModArmorItems.TERRIUM_HELMET.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ProjectTTB.MOD_ID, "tools_tab"))
                    .title(Component.translatable("creativetab.projectttb.combat"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(ModArmorItems.TERRIUM_HELMET);
                        output.accept(ModArmorItems.TERRIUM_CHESTPLATE);
                        output.accept(ModArmorItems.TERRIUM_LEGGINGS);
                        output.accept(ModArmorItems.TERRIUM_BOOTS);
                        output.accept(ModItems.TERRIUM_SHIELD);
                        output.accept(ModArmorItems.TINIUM_HELMET);
                        output.accept(ModArmorItems.TINIUM_CHESTPLATE);
                        output.accept(ModArmorItems.TINIUM_LEGGINGS);
                        output.accept(ModArmorItems.TINIUM_BOOTS);
                    }))
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
