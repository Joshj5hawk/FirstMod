package joshj5hawk.firstmod.poweredAnvil;

import joshj5hawk.firstmod.FirstMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class PoweredAnvil extends Block
{
    public static final ResourceLocation POWEREDANVIL = new ResourceLocation(FirstMod.MODID, "poweredanvil");

    public PoweredAnvil()
    {
        super(Material.IRON);
        setRegistryName(POWEREDANVIL);
        setUnlocalizedName(FirstMod.MODID + ".poweredanvil");
        setHarvestLevel("pickaxe", 1);
        setCreativeTab(FirstMod.tabFirstMod);
    }
}
