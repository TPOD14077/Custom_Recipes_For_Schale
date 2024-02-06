package tpod.custom_recipes_for_schale.Custom_Recipes.Others;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;

import static org.bukkit.Bukkit.getServer;

public class Magma_Cream implements Listener {
    NamespacedKey key = new NamespacedKey("Custom_Recipes_For_Schale","Magma_Cream");
    public void MC() {
        ShapelessRecipe MC = new ShapelessRecipe(key,new ItemStack(Material.MAGMA_CREAM,3))
                .addIngredient(Material.MAGMA_BLOCK);
        getServer().addRecipe(MC);
    }
}
