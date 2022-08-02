package jp.ngri.schoolproject;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import jp.ngri.schoolproject.block.SchoolBlocks;
import jp.ngri.schoolproject.item.SchoolItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SchoolProjectTab extends CreativeTabs {
    private final Random rand = new Random();

    public SchoolProjectTab() {
        super("SchoolProject");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ItemStack getIconItemStack() {
        Item item;
        if(rand.nextInt(2) == 0) item = SchoolItems.item1;
        else item = Item.getItemFromBlock(SchoolBlocks.block1);
        return new ItemStack(item, 1, rand.nextInt(16));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem() {
        return null;
    }
}
