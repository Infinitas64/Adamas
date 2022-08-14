package com.infinitas64.adamas;

import com.infinitas64.adamas.setup.ModSetup;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("adamas")
public class Adamas {
    public static final String MOD_ID = "adamas";
    private static final Logger LOGGER = LogManager.getLogger();
    public Adamas() {
        ModSetup.setup();
        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
        modbus.addListener(ModSetup::init);
        AdamasItems.ITEMS.register(modbus);
    }
}

