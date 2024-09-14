package link.boomerang;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BoomerangBonanzaClient implements ClientModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("BoomerangBonanza");
	public static final String MOD_ID = "boomerang-bonanza";

	@Override
	public void onInitializeClient() {

		LOGGER.info("Im Cooking with this mod FR trust me");
	}
}