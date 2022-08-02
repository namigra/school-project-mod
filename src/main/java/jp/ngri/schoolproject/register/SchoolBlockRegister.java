package jp.ngri.schoolproject.register;

import cpw.mods.fml.common.registry.GameRegistry;
import jp.ngri.schoolproject.block.SchoolBlocks;
import jp.ngri.schoolproject.item.block.SchoolItemBlock1;

public class SchoolBlockRegister implements IRegister {
    @Override
    public void register() {
        GameRegistry.registerBlock(SchoolBlocks.block1, SchoolItemBlock1.class, "block1");
    }
}
