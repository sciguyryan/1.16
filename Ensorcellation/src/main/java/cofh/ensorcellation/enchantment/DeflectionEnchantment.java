package cofh.ensorcellation.enchantment;

import cofh.lib.enchantment.EnchantmentCoFH;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.item.HorseArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import static cofh.lib.util.constants.Constants.ARMOR_SLOTS;
import static cofh.lib.util.references.EnsorcReferences.*;
import static net.minecraft.enchantment.Enchantments.PROJECTILE_PROTECTION;
import static net.minecraft.enchantment.Enchantments.THORNS;

public class DeflectionEnchantment extends EnchantmentCoFH {

    public static int chancePerLevel = 20;
    public static boolean affectsPlayerArrows = false;

    public DeflectionEnchantment() {

        super(Rarity.RARE, EnchantmentType.ARMOR_CHEST, ARMOR_SLOTS);
        maxLevel = 5;
    }

    @Override
    public int getMinEnchantability(int level) {

        return 5 + 5 * (level - 1);
    }

    @Override
    protected int maxDelegate(int level) {

        return super.getMinEnchantability(level) + 50;
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack) {

        Item item = stack.getItem();
        return enable && (super.canApplyAtEnchantingTable(stack) || item instanceof HorseArmorItem || item.isShield(stack, null));
    }

    @Override
    public boolean canApplyTogether(Enchantment ench) {

        return super.canApplyTogether(ench) && ench != THORNS && ench != FIRE_REBUKE && ench != FROST_REBUKE && ench != PROJECTILE_PROTECTION;
    }
}
