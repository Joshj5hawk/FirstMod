package joshj5hawk.firstmod;

import joshj5hawk.firstmod.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = FirstMod.MODID, name = FirstMod.MODNAME, version = FirstMod.MODVERSION, dependencies = "required-after:forge@[14.23.5.2768];required:pixelmon@[2.7.0]", useMetadata = true)
public class FirstMod
{
    public static final String MODID = "firstmod";
    public static final String MODNAME = "First Mod";
    public static final String MODVERSION = "0.0.1";


    @SidedProxy(clientSide = "joshj5hawk.firstmod.proxy.ClientProxy", serverSide = "joshj5hawk.firstmod.proxy.ServerProxy")
    public static CommonProxy proxy;

    public static CreativeTabs tabFirstMod = new CreativeTabs("FirstMod")
    {
        @Override
        public ItemStack getTabIconItem()
        {
            return new ItemStack(new ItemBlock(ModBlocks.poweredanvil));
        }
    };

    @Mod.Instance
    public static FirstMod instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }

}
