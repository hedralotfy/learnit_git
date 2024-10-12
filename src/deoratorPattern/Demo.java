package deoratorPattern;

public class Demo {

	public static void main(String[] args) {
		Sandwich bs = new BasicSandwich();
		
		System.out.println("This is a " + bs.getDescription() + " with cost of " + bs.getCost());
		
		Sandwich fool = new Fool(new Salt(new Shatta(bs)));
		
		System.out.println("This is a " + fool.getDescription() + " with cost of " + fool.getCost());

	}

}
