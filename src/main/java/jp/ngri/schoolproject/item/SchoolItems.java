package jp.ngri.schoolproject.item;

import jp.ngri.schoolproject.SchoolProject;
import jp.ngri.schoolproject.item.block.SchoolItemBlock1;
import net.minecraft.item.Item;

public class SchoolItems {
    public static Item item1 = new SchoolItem1().setCreativeTab(SchoolProject.tabSchoolProject).setUnlocalizedName("item1").setTextureName(SchoolProject.MOD_ID + ":item1");
}
