package adapterPattern.problem;

public class Car implements Vehicle{

	@Override
	public void accelerate() {
		System.out.println("Car is accelerating");
		
	}

	@Override
	public void pushbreak() {
		System.out.println("Car is breaking");
		
	}

	@Override
	public void soundhorn() {
		System.out.println("Beeb Beeb!");
	}

}
