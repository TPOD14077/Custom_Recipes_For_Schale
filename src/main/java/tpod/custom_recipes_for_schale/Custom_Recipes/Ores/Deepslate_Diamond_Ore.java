package tpod.custom_recipes_for_schale.Custom_Recipes.Ores;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Deepslate_Diamond_Ore implements Listener {
    NamespacedKey key = new NamespacedKey("Deepslate_Diamond_Ore","Custom_Recipes_For_Schale");
    public void DDO() {
        ShapedRecipe DDO = new ShapedRecipe(key,new ItemStack(Material.DEEPSLATE_DIAMOND_ORE,3))
                .shape("AAA","ABA","AAA")
                .setIngredient('A', Material.DEEPSLATE)
                .setIngredient('B', Material.DIAMOND_BLOCK);
        getServer().addRecipe(DDO);
    }
}
