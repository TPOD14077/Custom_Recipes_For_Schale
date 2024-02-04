package tpod.custom_recipes_for_schale.Custom_Recipes;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Enchanted_gold_apple implements Listener {
    public void Ega(){
        ShapedRecipe Ega = new ShapedRecipe(new ItemStack(Material.ENCHANTED_GOLDEN_APPLE))
                .shape("ABA", "CDC", "ABA")
                .setIngredient('A', Material.GOLD_BLOCK)
                .setIngredient('B', Material.DIAMOND_BLOCK)
                .setIngredient('C', Material.ENCHANTED_BOOK)
                .setIngredient('D', Material.GOLDEN_APPLE);
        getServer().addRecipe(Ega);
    }
}
