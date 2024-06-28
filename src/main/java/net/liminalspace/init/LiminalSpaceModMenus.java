/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.liminalspace.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.liminalspace.world.inventory.ChemicalExtratorMachineMenu;
import net.liminalspace.LiminalSpaceMod;

public class LiminalSpaceModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, LiminalSpaceMod.MODID);
	public static final RegistryObject<MenuType<ChemicalExtratorMachineMenu>> CHEMICAL_EXTRATOR_MACHINE = REGISTRY.register("chemical_extrator_machine", () -> IForgeMenuType.create(ChemicalExtratorMachineMenu::new));
}
