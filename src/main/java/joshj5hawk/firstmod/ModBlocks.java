package joshj5hawk.firstmod;

        import joshj5hawk.firstmod.poweredAnvil.PoweredAnvil;
        import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
        import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks
{
    @GameRegistry.ObjectHolder("firstmod:poweredanvil")
    public static PoweredAnvil poweredanvil;

    @SubscribeEvent
    public static void initModels()
    {
        poweredanvil.initModel();
    }
}
