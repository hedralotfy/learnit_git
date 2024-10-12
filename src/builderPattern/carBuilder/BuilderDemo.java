package builderPattern.carBuilder;

public class BuilderDemo {
	
	public static void main(String[] args) {
		
		CarBuilder cb = new CarBuilder();
		cb.Id(0).Brand("Suzuki").Color("Black");
		
		Car c = cb.build();
		
		System.out.println(c.getId());
		System.out.println(c.getBrand());
		System.out.println(c.getColor());
		
		Director D = new Director();
		D.buildChevrolet(cb);
		cb.Model("C1");
		
		Car c2 = cb.build();
		
		System.out.println(c2.toString());
	}

}
