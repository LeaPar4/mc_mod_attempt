package modtest.modid.item;
import modtest.modid.ModTest;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item POMELO = registerItem("pomelo", new Item(new Item.Settings()));
    public static final Item POMELO_SLICE = registerItem("pomelo_slice", new Item(new Item.Settings()));
    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(POMELO);
        entries.add(POMELO_SLICE);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ModTest.MOD_ID, name), item);
    }
    public static void registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::addItemsToIngredientItemGroup);
    }

}
