package proxyPattern;

import java.util.Arrays;
import java.util.List;

public class ProxyDemo {

	public static void main(String[] args) {
		
		List<String> requestedSites = Arrays.asList("Facebook", "YotTube", "x1bet", "Twitter");
		
		InternetServiceProvider ISP = new InternetProxy();
		
		for(String site : requestedSites) {
			System.out.println(ISP.checksite(site));
		}
	}

}
