package proxyPattern;

import java.util.Arrays;
import java.util.List;

public class We implements InternetServiceProvider {

	int linkSpeed = 10;

	List<String> blockedSites = Arrays.asList("x1bet", "Twitter");

	@Override
	public String checksite(String url) {
		return String.format("Https://www.%s.com", url);
	}

	public int getSpeed() {
		return this.linkSpeed;
	}
}
