package prototype.example1;

public class PrototypeDemo1 {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.setBrand("Toyota");
		c1.setColor("Black");
		
		System.out.println(c1.getBrand());
		System.out.println(c1.getColor());
		
		Car c2 = c1.clone();
		System.out.println(c2.getBrand());
		System.out.println(c2.getColor());
		

	}

}
