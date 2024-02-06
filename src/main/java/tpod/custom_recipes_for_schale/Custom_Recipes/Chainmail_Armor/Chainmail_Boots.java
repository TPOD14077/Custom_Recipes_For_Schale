package tpod.custom_recipes_for_schale.Custom_Recipes.Chainmail_Armor;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Chainmail_Boots implements Listener {
    public void CB(){
        ShapedRecipe CB = new ShapedRecipe(new ItemStack(Material.CHAINMAIL_BOOTS))
                .shape("A A","A,A")
                .setIngredient('A', Material.CHAIN);
        getServer().addRecipe(CB);
    }
}
