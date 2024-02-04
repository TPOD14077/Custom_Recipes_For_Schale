package tpod.custom_recipes_for_schale.Custom_Recipes;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Diamond_Ore implements Listener {
    public void DO(){
        ShapedRecipe DO = new ShapedRecipe(new ItemStack(Material.DIAMOND_ORE,3))
                .shape("AAA","ABA","AAA")
                .setIngredient('A', Material.STONE)
                .setIngredient('B', Material.DIAMOND);
        getServer().addRecipe(DO);
    }
}
