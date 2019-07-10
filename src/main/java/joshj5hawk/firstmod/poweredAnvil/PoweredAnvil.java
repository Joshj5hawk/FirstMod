package joshj5hawk.firstmod.poweredAnvil;

import joshj5hawk.firstmod.FirstMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

public class PoweredAnvil extends Block
{
    public static final ResourceLocation POWEREDANVIL = new ResourceLocation(FirstMod.MODID, "poweredanvil");

    public PoweredAnvil()
    {
        super(Material.IRON);
        setRegistryName(new ResourceLocation(FirstMod.MODID, "poweredanvil"));
        setUnlocalizedName(FirstMod.MODID + ".poweredanvil");
        setHarvestLevel("pickaxe", 1);
        setCreativeTab(FirstMod.tabFirstMod);
    }
    @SideOnly(Side.CLIENT)
    public void initModel()
    {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
