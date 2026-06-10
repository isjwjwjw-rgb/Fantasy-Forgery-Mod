package com.isjwjwjw.projectttb.block;

import com.isjwjwjw.projectttb.block.infuser.InfuserBlockEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Set;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, "projectttb");

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<InfuserBlockEntity>> INFUSER_BE =
            BLOCK_ENTITIES.register("infuser_be", ()->
                    new BlockEntityType<>(InfuserBlockEntity::new,
                            java.util.Set.of(ModBlocks.INFUSER.get()), null));
}
