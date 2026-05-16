package com.isjwjwjw.fantasyforgery.item.tool;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.block.state.BlockState;

import java.util.List;

public class TiniumShovelItem extends ShovelItem {

    public static final float TINIUM_EFFICIENCY_BONUS = 3.0F;
    public TiniumShovelItem(Tier p_43114_, Properties p_43117_) {
        super(p_43114_, p_43117_);
    }

    @Override
    public float getDestroySpeed(ItemStack stack, BlockState state){
        float baseSpeed = super.getDestroySpeed(stack, state);
        if (baseSpeed > 1.0F){
            return baseSpeed + TINIUM_EFFICIENCY_BONUS;
        }
        return baseSpeed;
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        tooltipComponents.add(Component.literal("Infused with: ")
                .withStyle(ChatFormatting.GRAY).append(Component.literal("Tinium")
                        .withStyle(ChatFormatting.DARK_AQUA)));
        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);

    }
}
