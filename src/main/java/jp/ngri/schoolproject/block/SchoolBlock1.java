package jp.ngri.schoolproject.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class SchoolBlock1 extends Block {
    private final IIcon[] icons = new IIcon[16];

    protected SchoolBlock1() {
        super(Material.cloth);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister reg) {
        for(int i = 0; i < 16; i++) this.icons[i] = reg.registerIcon(this.getTextureName() + "." + i);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        return icons[meta & 15];
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tab, List list) {
        for(int i = 0; i < 16; i++) list.add(new ItemStack(item, 1, i));
    }

    @Override
    public int damageDropped(int meta) {
        return meta & 15;
    }
}
