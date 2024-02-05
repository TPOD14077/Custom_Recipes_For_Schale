package tpod.custom_recipes_for_schale.Custom_Recipes.Others;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Netherite_Upgrade_Smithing_Template implements Listener {
    public void NUST()
    {
        ShapedRecipe NUST = new ShapedRecipe(new ItemStack(Material.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .shape("ABA","CDC","AEA")
                .setIngredient('A', Material.NETHERRACK)
                .setIngredient('B', Material.DIAMOND_SWORD)
                .setIngredient('C', Material.DIAMOND)
                .setIngredient('D', Material.DIAMOND_BLOCK)
                .setIngredient('E', Material.NETHERITE_INGOT);
        getServer().addRecipe(NUST);
    }
}
