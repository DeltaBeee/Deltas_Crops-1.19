package com.deltabeee.dcrops.item.custom;

import com.deltabeee.dcrops.item.ModItems;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

public class SmokeItem extends Item {
    private static final int SMOKE_DURATION = 40;

    public SmokeItem(Item.Properties properties) {
        super(properties);
    }

    public int getUseDuration(ItemStack itemStack) {
        return 40;
    }

    public UseAnim getUseAnimation(ItemStack itemStack) {
        return UseAnim.BOW;
    }

    public SoundEvent getDrinkingSound() {
        return null;
    }

    public SoundEvent getEatingSound() {
        return SoundEvents.FIRE_EXTINGUISH;
    }

    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
        return ItemUtils.startUsingInstantly(level, player, interactionHand);
    }
}