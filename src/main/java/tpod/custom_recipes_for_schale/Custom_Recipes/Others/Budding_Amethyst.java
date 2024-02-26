package tpod.custom_recipes_for_schale.Custom_Recipes.Others;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Budding_Amethyst implements Listener {
    NamespacedKey key = new NamespacedKey("crfs","budding_amethyst");
    public void BA() {
        ShapedRecipe BA = new ShapedRecipe(key,new ItemStack(Material.BUDDING_AMETHYST))
                .shape("ABA", "BCB", "ABA")
                .setIngredient('A', Material.AMETHYST_BLOCK)
                .setIngredient('B', Material.AMETHYST_CLUSTER)
                .setIngredient('C', Material.LAVA_BUCKET);
        getServer().addRecipe(BA);
    }
}
