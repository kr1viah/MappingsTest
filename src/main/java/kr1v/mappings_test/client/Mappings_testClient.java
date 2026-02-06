package kr1v.mappings_test.client;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.Camera;
import net.minecraft.world.phys.Vec3;

public class Mappings_testClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		try {
			Camera camera = null;
			Vec3 pos = camera.getCameraPosition();
		} catch (NullPointerException ignored) {
			System.out.println("Works!");
		}
	}
}
