package net.koala.kgems.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.koala.kgems.block.ModBlocks;
import net.koala.kgems.item.ModItems;
import net.koala.kgems.villager.ModVillagers;
import net.minecraft.enchantment.EnchantmentLevelEntry;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.EnchantedBookItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class ModCustomTrades {
    public static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1,
            factories -> {
                factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(ModItems.TOMATO, 7),
                        6, 5, 0.05f));
                factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 3),
                        new ItemStack(ModItems.TOMATO_SEEDS, 2),
                        6, 7, 0.075f));
            });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GOLD_INGOT, 16),
                            new ItemStack(ModItems.CORN, 8),
                            4, 10, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GOLD_INGOT, 2),
                            new ItemStack(Items.DIAMOND, 1),
                            new ItemStack(ModItems.CORN_SEEDS, 3),
                            12, 4, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.RUBY, 24),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.MENDING, 1)),
                            2, 15, 0.5f));
                });

        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.RAW_RUBY, 16),
                            new ItemStack(ModItems.METAL_DETECTOR, 1),
                            6, 5, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.SOUND_MASTER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.RUBY, 5),
                            new ItemStack(ModBlocks.SOUND_BLOCK, 1),
                            6, 7, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.SOUND_MASTER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.RUBY_SHOVEL, 1),
                            new ItemStack(ModItems.RUBY_STAFF, 1),
                            2, 10, 0.075f));
                });
    }
}
