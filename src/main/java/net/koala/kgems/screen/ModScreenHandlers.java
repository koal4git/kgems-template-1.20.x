package net.koala.kgems.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.koala.kgems.KGems;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<GemPolishingScreenHandler> GEM_POLISHING_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(KGems.MOD_ID, "gem_polshing"),
                    new ExtendedScreenHandlerType<>(GemPolishingScreenHandler::new));

    public static void registerScreenHandler() {
        KGems.LOGGER.info("Registering Screen Handlers for " + KGems.MOD_ID);
    }
}
