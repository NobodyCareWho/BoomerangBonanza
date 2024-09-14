package link.boomerang.init;

import link.boomerang.BoomerangBonanza;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModItems {

    public static final Item BOOMERANG_TEST_ITEM = register("boomerang_test_item", new Item(new Item.Settings()));

    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, BoomerangBonanza.id(name), item);
    }

    public static void load() {}
}
