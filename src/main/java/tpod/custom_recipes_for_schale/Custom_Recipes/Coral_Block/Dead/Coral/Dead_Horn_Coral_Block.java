package tpod.custom_recipes_for_schale.Custom_Recipes.Coral_Block.Dead.Coral;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Dead_Horn_Coral_Block implements Listener {
    public void DHCB(){
        ShapedRecipe DHCB = new ShapedRecipe(new ItemStack(Material.DEAD_HORN_CORAL_BLOCK))
                .shape("AA","AA")
                .setIngredient('A', Material.DEAD_HORN_CORAL);
        getServer().addRecipe(DHCB);
    }
}
