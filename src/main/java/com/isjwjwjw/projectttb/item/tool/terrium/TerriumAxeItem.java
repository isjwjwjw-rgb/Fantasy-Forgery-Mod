package com.isjwjwjw.projectttb.item.tool.terrium;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;

import java.util.List;

public class TerriumAxeItem extends AxeItem {
    public TerriumAxeItem(Tier p_40521_, Properties p_40524_) {
        super(p_40521_, p_40524_);
    }

    @Override
    public int getMaxDamage(ItemStack stack){
        int base = getTier().getUses();
        return Math.round(base * 1.5f);
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        tooltipComponents.add(Component.literal("Infused with: ")
                .withStyle(ChatFormatting.GRAY).append(Component.literal("Terrium")
                        .withStyle(ChatFormatting.GOLD)));
        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);

    }
}
