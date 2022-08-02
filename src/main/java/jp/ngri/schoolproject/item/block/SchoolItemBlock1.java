package jp.ngri.schoolproject.item.block;

import jp.ngri.schoolproject.block.SchoolBlocks;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class SchoolItemBlock1 extends ItemBlockWithMetadata {
    public SchoolItemBlock1() {
        super(SchoolBlocks.block1, SchoolBlocks.block1);
    }

    @Override
    public String getUnlocalizedName(ItemStack item) {
        return this.getUnlocalizedName() + "." + item.getItemDamage();
    }
}