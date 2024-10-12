package solid.dependencyInversion;

public class DeliveryCompany {
	public DeliveryService ds;
	
	public DeliveryCompany(DeliveryService ds) {
		this.ds = ds;
	}
	
	public void sendProduct(Product product) {
		ds.deliverProduct(product);
	}

}
