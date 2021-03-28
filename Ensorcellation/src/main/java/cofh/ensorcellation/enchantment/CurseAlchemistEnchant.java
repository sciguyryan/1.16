package cofh.ensorcellation.enchantment;

import cofh.core.init.CoreEnchantments;
import cofh.lib.enchantment.EnchantmentCoFH;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.potion.Effect;
import net.minecraft.potion.Effects;

public class CurseAlchemistEnchant extends EnchantmentCoFH {

    public static int effectTrigger = 20;
    public static int effectTriggerOnTarget = 25;
    public static int effectDuration = 15;

    public static PotionEffect[] applicableEffects = new PotionEffect[] {
            new PotionEffect(Effects.POISON, 4),
            new PotionEffect(Effects.REGENERATION, 4),
            new PotionEffect(Effects.WITHER, 2),
            new PotionEffect(Effects.WEAKNESS, 4),
            new PotionEffect(Effects.STRENGTH, 4),
            new PotionEffect(Effects.SLOWNESS, 4),
            new PotionEffect(Effects.SPEED, 4),
            new PotionEffect(Effects.HUNGER, 4),
            new PotionEffect(Effects.FIRE_RESISTANCE, 1),
            new PotionEffect(Effects.HASTE, 4),
            new PotionEffect(Effects.RESISTANCE, 4),
            new PotionEffect(Effects.JUMP_BOOST, 4),
            new PotionEffect(Effects.WATER_BREATHING, 1),
            new PotionEffect(Effects.INVISIBILITY, 1),
            new PotionEffect(Effects.SLOW_FALLING, 1)
    };

    public CurseAlchemistEnchant() {

        super(Rarity.RARE, CoreEnchantments.Types.SWORD_OR_AXE, new EquipmentSlotType[]{EquipmentSlotType.MAINHAND});
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

    public static class PotionEffect {

        public final Effect effect;
        public final int maxAmplifier;

        public PotionEffect(Effect effect, int maxAmplifier) {

            this.effect = effect;
            this.maxAmplifier = maxAmplifier;
        }
    }

}
