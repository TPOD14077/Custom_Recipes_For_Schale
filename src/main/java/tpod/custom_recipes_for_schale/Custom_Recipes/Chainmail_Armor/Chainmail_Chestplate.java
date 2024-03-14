package tpod.custom_recipes_for_schale.Custom_Recipes.Chainmail_Armor;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.invebtory.NamespacedKey;

import static org.bukkit.Bukkit.getServer;

public class Chainmail_Chestplate implements Listener {
    NamespacedKey key = new NamespacedKey("crfs","Chainmail_Chestplate");
    public void CC(){
        ShapedRecipe CC = new ShapedRecipe(key,new ItemStack(Material.CHAINMAIL_CHESTPLATE))
                .shape("A A","AAA","AAA")
                .setIngredient('A', Material.CHAIN);
        getServer().addRecipe(CC);
    }
}
