package com.lthoerner.mendfinity.mixin;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.InfinityEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(InfinityEnchantment.class)
public class InfinityEnchantmentMixin extends Enchantment {
	public InfinityEnchantmentMixin(Properties properties) {
		super(properties);
	}

	/**
	 * @author lthoerner
	 * @reason This mixin makes infinity and mending into compatible enchantments.
	 */
	@Overwrite
	public boolean canAccept(Enchantment other) {
		return super.canAccept(other);
	}
}