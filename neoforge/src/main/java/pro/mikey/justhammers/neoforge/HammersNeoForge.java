package pro.mikey.justhammers.neoforge;

import net.neoforged.fml.common.Mod;
import pro.mikey.justhammers.Hammers;

@Mod(Hammers.MOD_ID)
public class HammersNeoForge {
    public HammersNeoForge() {
//        EventBuses.registerModEventBus(Hammers.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        Hammers.init();
    }
}
