package jp.ngri.schoolproject.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class SchoolItem1 extends Item {
    private IIcon[] icons = new IIcon[16];

    public SchoolItem1() {
        super();
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister reg) {
        for(int i = 0; i < 16; i++) this.icons[i] = reg.registerIcon(this.getIconString() + "." + i);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int meta) {
        return icons[meta & 15];
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubItems(Item item, CreativeTabs tab, List list) {
        for(int i = 0; i < 16; i++) list.add(new ItemStack(this, 1, i));
    }

    @Override
    public int getMetadata(int meta) {
        return meta & 15;
    }

    @Override
    public String getUnlocalizedName(ItemStack item) {
        return super.getUnlocalizedName() + "." + item.getItemDamage();
    }
}
