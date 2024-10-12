package deoratorPattern;

public class Salt extends SandwichDecorator {

	
	public Salt(Sandwich sandwich) {
		super(sandwich);
		
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription() + " with salt";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return super.getCost() + 0.2;
	}
	
	

}
