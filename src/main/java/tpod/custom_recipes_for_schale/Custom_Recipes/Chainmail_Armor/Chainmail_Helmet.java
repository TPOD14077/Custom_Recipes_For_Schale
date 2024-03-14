package tpod.custom_recipes_for_schale.Custom_Recipes.Chainmail_Armor;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.invebtory.NamespacedKey;

import static org.bukkit.Bukkit.getServer;

public class Chainmail_Helmet implements Listener {
    NamespacedKey key = new NamespacedKey("crfs","Chainmail_Helmet");
    public void CH(){
        ShapedRecipe CH = new ShapedRecipe(key,new ItemStack(Material.CHAINMAIL_HELMET))
                .shape("AAA","A A")
                .setIngredient('C', Material.CHAIN);
        getServer().addRecipe(CH);
    }
}
