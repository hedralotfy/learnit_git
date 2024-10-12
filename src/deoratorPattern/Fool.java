package deoratorPattern;

public class Fool extends SandwichDecorator{

	public Fool(Sandwich sandwich) {
		super(sandwich);
		
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription() + " with fool";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return super.getCost() + 10;
	}

}
