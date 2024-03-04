package tpod.custom_recipes_for_schale.Custom_Recipes.Music_Disks;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.SmithingRecipe;

import static org.bukkit.Bukkit.getServer;

public class Music_Disk_11 implements Listener {
public void MD11(){
        Material[] Music_Disk = {Material.MUSIC_DISC_13, Material.MUSIC_DISC_BLOCKS, Material.MUSIC_DISC_CAT, Material.MUSIC_DISC_CHIRP, Material.MUSIC_DISC_FAR, Material.MUSIC_DISC_MALL, Material.MUSIC_DISC_MELLOHI, Material.MUSIC_DISC_STAL, Material.MUSIC_DISC_STRAD, Material.MUSIC_DISC_WAIT, Material.MUSIC_DISC_WARD, Material.MUSIC_DISC_OTHERSIDE};
        SmithingRecipe MD11 = new SmithingRecipe(new NamespacedKey("MD11", "Custom_Recipes_For_Schale"),new ItemStack(Material.MUSIC_DISC_11),new RecipeChoice.MaterialChoice(Music_Disk),new RecipeChoice.ExactChoice(new ItemStack(Material.DIAMOND)));
        getServer().addRecipe(MD11);
    }
}
