package cofh.ensorcellation.enchantment;

import cofh.core.init.CoreEnchantments;
import cofh.lib.enchantment.EnchantmentCoFH;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.inventory.EquipmentSlotType;

public class AeonianEnchantment extends EnchantmentCoFH {

    public AeonianEnchantment() {

        super(Rarity.RARE, CoreEnchantments.Types.ENCHANTABLE, EquipmentSlotType.values());
    }

    @Override
    public int getMinEnchantability(int level) {

        return 20;
    }

    @Override
    protected int maxDelegate(int level) {

        return getMinEnchantability(level) + 50;
    }

    @Override
    public boolean canApplyTogether(Enchantment ench) {

        return super.canApplyTogether(ench) && ench != Enchantments.VANISHING_CURSE;
    }

}
