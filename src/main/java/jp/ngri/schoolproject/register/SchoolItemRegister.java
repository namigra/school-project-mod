package jp.ngri.schoolproject.register;

import cpw.mods.fml.common.registry.GameRegistry;
import jp.ngri.schoolproject.SchoolProject;
import jp.ngri.schoolproject.item.SchoolItems;

public class SchoolItemRegister implements IRegister {
    @Override
    public void register() {
        GameRegistry.registerItem(SchoolItems.item1, "item1", SchoolProject.MOD_ID);
    }
}
