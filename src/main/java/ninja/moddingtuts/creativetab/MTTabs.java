package ninja.moddingtuts.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import ninja.moddingtuts.ModdingTuts;
import ninja.moddingtuts.init.MTItems;

public class MTTabs
{
    public static final CreativeTabs tabGeneral = new CreativeTabs(ModdingTuts.MOD_ID + "general")
    {
        @Override
        public Item getTabIconItem()
        {
            return MTItems.advancedStick;
        }
    };
}
