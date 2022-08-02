package jp.ngri.schoolproject;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import jp.ngri.schoolproject.register.SchoolBlockRegister;
import jp.ngri.schoolproject.register.SchoolItemRegister;

@Mod(modid = SchoolProject.MOD_ID, name = SchoolProject.MOD_NAME, version = SchoolProjectVersion.MOD_VERSION, acceptedMinecraftVersions = "1.7.10", dependencies = "required-after:Forge[10.13.4.1614,)")
public class SchoolProject {
    public static final String MOD_ID = "schoolproject";
    public static final String MOD_NAME = "School Project";

    @Instance(SchoolProject.MOD_ID)
    public static SchoolProject instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        new SchoolItemRegister().register();
        new SchoolBlockRegister().register();
    }
}
