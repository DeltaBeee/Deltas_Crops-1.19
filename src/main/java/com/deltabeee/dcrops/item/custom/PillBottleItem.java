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

public class PillBottleItem extends Item {
   private static final int DRINK_DURATION = 40;

   public PillBottleItem(Item.Properties properties) {
      super(properties);
   }

   public ItemStack finishUsingItem(ItemStack itemStack, Level level, LivingEntity livingEntity) {
      super.finishUsingItem(itemStack, level, livingEntity);
      if (livingEntity instanceof ServerPlayer serverplayer) {
         CriteriaTriggers.CONSUME_ITEM.trigger(serverplayer, itemStack);
         serverplayer.awardStat(Stats.ITEM_USED.get(this));
      }

      if (itemStack.isEmpty()) {
         return new ItemStack(ModItems.PILL_BOTTLE.get());
      } else {
         if (livingEntity instanceof Player && !((Player)livingEntity).getAbilities().instabuild) {
            ItemStack itemstack = new ItemStack(ModItems.PILL_BOTTLE.get());
            Player player = (Player)livingEntity;
            if (!player.getInventory().add(itemstack)) {
               player.drop(itemstack, false);
            }
         }

         return itemStack;
      }
   }

   public int getUseDuration(ItemStack itemStack) {
      return 40;
   }

   public UseAnim getUseAnimation(ItemStack itemStack) {
      return UseAnim.DRINK;
   }

   public SoundEvent getDrinkingSound() {
      return null;
   }

   public SoundEvent getEatingSound() {
      return null;
   }

   public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
      return ItemUtils.startUsingInstantly(level, player, interactionHand);
   }
}