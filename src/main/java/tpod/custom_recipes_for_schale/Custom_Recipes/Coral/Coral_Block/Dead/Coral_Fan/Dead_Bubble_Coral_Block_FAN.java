package tpod.custom_recipes_for_schale.Custom_Recipes.Coral.Coral_Block.Dead.Coral_Fan;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Dead_Bubble_Coral_Block_FAN implements Listener {
    public void DBuCB2(){
        ShapedRecipe DBuCB2 = new ShapedRecipe(new ItemStack(Material.DEAD_BUBBLE_CORAL_BLOCK))
                .shape("AA","AA")
                .setIngredient('A', Material.DEAD_BUBBLE_CORAL);
        getServer().addRecipe(DBuCB2);
    }
}
