package adapterPattern.solution;

public class BicycleAdapter implements Vehicle{
	
	//Instantiating a class of type Bicycle with reference bike.
	private Bicycle bike;
	
	//Make constructor that take a reference of type Bicycle, and
	// assign it to the private property bike of type Bicycle. 
	public BicycleAdapter(Bicycle bike) {
		this.bike = bike; 
	}
	
	//Call the methods of Vehicle interface, and in them call 
	//methods of Bicycle class to adapt them as the car.

	@Override
	public void accelerate() {
		this.bike.pedal();
		
	}

	@Override
	public void pushbreak() {
		this.bike.stop();
		
	}

	@Override
	public void soundhorn() {
		this.bike.ringBell();
		
	}
	

}
