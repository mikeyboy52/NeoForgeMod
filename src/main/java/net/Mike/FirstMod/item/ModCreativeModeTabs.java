package net.Mike.FirstMod.item;

import net.Mike.FirstMod.FirstMod;
import net.Mike.FirstMod.block.ModBlocks;
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
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FirstMod.MOD_ID);

    public static final Supplier<CreativeModeTab> FIRST_MOD_ITEMS_TAB = CREATIVE_MODE_TAB.register("first_mod_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BISMUTH.get()))
                    .title(Component.translatable("creativetab.firstmod.firstmod_items"))
                    .displayItems((ItemDisplayParameters, output) -> {
                        output.accept(ModItems.BISMUTH);
                        output.accept(ModItems.BORION);

                        output.accept(ModItems.CHISEL);

                        output.accept(ModItems.RADISH);

                        output.accept(ModItems.FROSTFIRE_ICE);
                        output.accept(ModItems.STARLIGHT_ASHES);

                    }).build());

    public static final Supplier<CreativeModeTab> FIRST_MOD_BLOCK_TAB = CREATIVE_MODE_TAB.register("first_mod_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.BISMUTH_BLOCK))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(FirstMod.MOD_ID, "first_mod_items_tab"))
                    .title(Component.translatable("creativetab.firstmod.firstmod_blocks"))
                    .displayItems((ItemDisplayParameters, output) -> {
                      output.accept(ModBlocks.BISMUTH_BLOCK);
                      output.accept(ModBlocks.BISMUTH_ORE);
                      output.accept(ModBlocks.BISMUTH_DEEPSLATE_ORE);

                      output.accept(ModBlocks.MAGIC_BLOCK);

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
