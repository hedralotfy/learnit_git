package deoratorPattern;

public class Shatta extends SandwichDecorator{

	public Shatta(Sandwich sandwich) {
		super(sandwich);
		
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription() + " with shatta";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return super.getCost() + 0.8;
	}
}
