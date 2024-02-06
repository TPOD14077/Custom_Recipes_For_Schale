package tpod.custom_recipes_for_schale.Custom_Recipes.Others;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Enchanted_Gold_Apple implements Listener {
    NamespacedKey key = new NamespacedKey("Enchanted_Gold_Apple","Custom_Recipes_For_Schale");
    public void Ega(){
        ShapedRecipe Ega = new ShapedRecipe(key,new ItemStack(Material.ENCHANTED_GOLDEN_APPLE))
                .shape("ABA", "CDC", "ABA")
                .setIngredient('A', Material.GOLD_BLOCK)
                .setIngredient('B', Material.DIAMOND_BLOCK)
                .setIngredient('C', Material.ENCHANTED_BOOK)
                .setIngredient('D', Material.GOLDEN_APPLE);
        getServer().addRecipe(Ega);
    }
}
