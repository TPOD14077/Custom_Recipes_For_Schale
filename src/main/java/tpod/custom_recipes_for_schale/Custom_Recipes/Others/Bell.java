package tpod.custom_recipes_for_schale.Custom_Recipes.Others;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.NamespacedKey

import static org.bukkit.Bukkit.getServer;

public class Bell implements Listener {
    NamespacedKey key = new NamespacedKey("crfs","bell");
    public void bell() {
        ShapedRecipe bell = new ShapedRecipe(key,new ItemStack(Material.BELL))
                .shape("AAA","BBB","BCB")
                .setIngredient('A', Material.STICK)
                .setIngredient('B', Material.GOLD_INGOT)
                .setIngredient('C', Material.GOLD_BLOCK);
        getServer().addRecipe(bell);
    }
}
