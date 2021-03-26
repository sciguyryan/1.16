package cofh.ensorcellation.enchantment;

import cofh.core.init.CoreEnchantments;
import cofh.lib.enchantment.EnchantmentCoFH;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.inventory.EquipmentSlotType;

public class CursePhotophobiaEnchantment extends EnchantmentCoFH {

    public CursePhotophobiaEnchantment() {

        super(Rarity.VERY_RARE, CoreEnchantments.Types.DAMAGEABLE, new EquipmentSlotType[]{EquipmentSlotType.MAINHAND});
        treasureEnchantment = true;
    }

    @Override
    public int getMinEnchantability(int level) {

        return 25;
    }

    @Override
    protected int maxDelegate(int level) {

        return 50;
    }

    @Override
    public boolean isCurse() {

        return true;
    }

    @Override
    public boolean canApplyTogether(Enchantment ench) {

        return super.canApplyTogether(ench) && ench != Enchantments.MENDING;
    }

}
