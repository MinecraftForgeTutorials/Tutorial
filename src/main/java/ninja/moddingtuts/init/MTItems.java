package ninja.moddingtuts.init;

import cpw.mods.fml.common.registry.GameRegistry;
import ninja.moddingtuts.item.ItemAdvancedStick;
import ninja.moddingtuts.item.ItemMT;
import ninja.moddingtuts.reference.Names;

public class MTItems
{
    public static final ItemMT advancedStick = new ItemAdvancedStick();

    public static void initializeItems()
    {
        GameRegistry.registerItem(advancedStick, Names.Items.ADVANCED_STICK);
    }
}
