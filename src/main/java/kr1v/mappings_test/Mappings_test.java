package kr1v.mappings_test;

import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.Identifier;

public class Mappings_test implements ModInitializer {

	@Override
	public void onInitialize() {
		Identifier.of("wawa", "meow!");
	}
}
