package proxyPattern;

import java.util.Arrays;
import java.util.List;

public class InternetProxy implements InternetServiceProvider {

	List<String> blockedSites = Arrays.asList("x1bet", "Twitter");
	
	@Override
	public String checksite(String url) {
		logActivity(url);
		
		if(blockedSites.contains(url)) {
			return "Website is blocked!";
		}
		return new We().checksite(url);
	}
	
	public void logActivity(String url) {
		System.out.println("Requested " + url + " in " + System.currentTimeMillis()+ "\n");
	}
	
}
