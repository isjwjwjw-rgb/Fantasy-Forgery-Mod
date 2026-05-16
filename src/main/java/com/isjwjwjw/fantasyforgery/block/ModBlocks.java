package com.isjwjwjw.fantasyforgery.block;

import com.isjwjwjw.fantasyforgery.FantasyForgery;
import com.isjwjwjw.fantasyforgery.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(FantasyForgery.MOD_ID);


    public static final DeferredBlock<Block> TERRIUM_BLOCK = registerBlock("terrium_block",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(6.0F, 30.0F)
                    .sound(SoundType.METAL)
                    .requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> TERRIUM_ORE = registerBlock("terrium_ore",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4.0F, 5.0F)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> DEEPSLATE_TERRIUM_ORE = registerBlock("deepslate_terrium_ore",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4.5F, 8.0F)
                    .sound(SoundType.DEEPSLATE)
                    .requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> RAW_TERRIUM_BLOCK = registerBlock("raw_terrium_block",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(5.0F, 15.0F)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> TINIUM_BLOCK = registerBlock("tinium_block",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(5F, 10.0F)
                    .sound(SoundType.COPPER)
                    .requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> TINIUM_ORE = registerBlock("tinium_ore",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(3.5F, 5.0F)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> RAW_TINIUM_BLOCK = registerBlock("raw_tinium_block",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4.5F, 7.0F)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> BRONZIUM_BLOCK = registerBlock("bronzium_block",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(5.5F, 25.0F)
                    .sound(SoundType.METAL)
                    .requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> MAGNESIS_BLOCK = registerBlock("magnesis_block",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(7.0F, 70.0F)
                    .sound(SoundType.NETHERITE_BLOCK)
                    .requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> OBSIDIUM_BLOCK = registerBlock("obsidium_block",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(9.0F, 1200F)
                    .sound(SoundType.METAL)
                    .requiresCorrectToolForDrops()));



    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block){
        DeferredBlock<T> toReurn = BLOCKS.register(name, block);
        registerBlockItem(name, toReurn);
        return toReurn;
    }
    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
