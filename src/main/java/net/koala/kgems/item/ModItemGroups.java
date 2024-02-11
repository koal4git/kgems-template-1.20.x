package net.koala.kgems.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.koala.kgems.KGems;
import net.koala.kgems.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
        new Identifier(KGems.MOD_ID, "ruby"),
        FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                    entries.add(ModItems.RUBY);
                    entries.add(ModItems.RAW_RUBY);
                    entries.add(ModItems.COAL_BRIQUETTE);

                    entries.add(Items.DIAMOND);

                    entries.add(ModBlocks.RAW_RUBY_BLOCK);
                    entries.add(ModBlocks.RUBY_ORE);
                    entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                    entries.add(ModBlocks.NETHER_RUBY_ORE);
                    entries.add(ModBlocks.END_STONE_RUBY_ORE);

                    entries.add(ModItems.METAL_DETECTOR);
                    entries.add(ModItems.RUBY_STAFF);
                    entries.add(ModBlocks.SOUND_BLOCK);

                    entries.add(ModItems.RUBY_PICKAXE);
                    entries.add(ModItems.RUBY_AXE);
                    entries.add(ModItems.RUBY_SWORD);
                    entries.add(ModItems.RUBY_SHOVEL);
                    entries.add(ModItems.RUBY_HOE);

                    entries.add(ModItems.RUBY_HELMET);
                    entries.add(ModItems.RUBY_CHESTPLATE);
                    entries.add(ModItems.RUBY_LEGGINGS);
                    entries.add(ModItems.RUBY_BOOTS);

                    entries.add(ModItems.TOMATO);
                    entries.add(ModItems.TOMATO_SEEDS);
                    entries.add(ModItems.CORN);
                    entries.add(ModItems.CORN_SEEDS);


                    entries.add(ModBlocks.RUBY_BLOCK);
                    entries.add(ModBlocks.RUBY_BUTTON);
                    entries.add(ModBlocks.RUBY_DOOR);
                    entries.add(ModBlocks.RUBY_FENCE);
                    entries.add(ModBlocks.RUBY_FENCE_GATE);
                    entries.add(ModBlocks.RUBY_SLAB);
                    entries.add(ModBlocks.RUBY_STAIRS);
                    entries.add(ModBlocks.RUBY_PRESSURE_PLATE);
                    entries.add(ModBlocks.RUBY_TRAPDOOR);
                    entries.add(ModBlocks.RUBY_WALL);

                    entries.add(ModBlocks.DAHLIA);

                    entries.add(ModItems.BAR_BRAWL_MUSIC_DISC);
                    entries.add(ModItems.PORCUPINE_SPAWN_EGG);

                    entries.add(ModBlocks.GEM_POLISHING_STATION);

                    entries.add(ModBlocks.CHESTNUT_LOG);
                    entries.add(ModBlocks.STRIPPED_CHESTNUT_LOG);
                    entries.add(ModBlocks.CHESTNUT_WOOD);
                    entries.add(ModBlocks.STRIPPED_CHESTNUT_WOOD);

                    entries.add(ModBlocks.CHESTNUT_PLANKS);
                    entries.add(ModBlocks.CHESTNUT_LEAVES);
                    entries.add(ModItems.CHESTNUT_SIGN);
                    entries.add(ModItems.HANGING_CHESTNUT_SIGN);
                    entries.add(ModItems.CHESTNUT_BOAT);
                    entries.add(ModItems.CHESTNUT_CHEST_BOAT);
                }).build());

    public static void registerItemGroups() {
        KGems.LOGGER.info("Registering item groups for " + KGems.MOD_ID);
    }
}
