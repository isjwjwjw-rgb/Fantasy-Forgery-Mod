package com.isjwjwjw.projectttb.item;

import com.isjwjwjw.projectttb.ProjectTTB;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.EnumMap;
import java.util.List;

public class ModArmorMaterials {
    public static final DeferredRegister<ArmorMaterial> ARMOR_MATERIALS =
            DeferredRegister.create(Registries.ARMOR_MATERIAL, ProjectTTB.MOD_ID);

    public static final Holder<ArmorMaterial> TERRIUM = ARMOR_MATERIALS.register("terrium",
            ()-> {
                EnumMap<ArmorItem.Type, Integer> defense = new EnumMap<>(ArmorItem.Type.class);
                defense.put(ArmorItem.Type.HELMET, 4);
                defense.put(ArmorItem.Type.CHESTPLATE, 9);
                defense.put(ArmorItem.Type.LEGGINGS, 7);
                defense.put(ArmorItem.Type.BOOTS, 4);

                return new ArmorMaterial(
                        defense, 15, SoundEvents.ARMOR_EQUIP_DIAMOND,
                        () -> Ingredient.of(ModItems.TERRIUM_INGOT),
                        List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(ProjectTTB.MOD_ID, "terrium")
                        )),
                        1.5f,
                        0.3f
                );
            });

    public static final Holder<ArmorMaterial> TINIUM = ARMOR_MATERIALS.register("tinium",
            ()-> {
                EnumMap<ArmorItem.Type, Integer> defense = new EnumMap<>(ArmorItem.Type.class);
                defense.put(ArmorItem.Type.HELMET, 2);
                defense.put(ArmorItem.Type.CHESTPLATE, 7);
                defense.put(ArmorItem.Type.LEGGINGS, 5);
                defense.put(ArmorItem.Type.BOOTS, 2);

                return new ArmorMaterial(
                        defense, 15, SoundEvents.ARMOR_EQUIP_DIAMOND,
                        () -> Ingredient.of(ModItems.TINIUM_INGOT),
                        List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(ProjectTTB.MOD_ID, "tinium")
                        )),
                        0.5f,
                        0.1f
                );
            });
}
