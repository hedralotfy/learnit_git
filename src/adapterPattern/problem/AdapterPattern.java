package adapterPattern.problem;

public class AdapterPattern {

	// Main class having main method and useVehicle
	public static void main(String[] args) {
		Car c = new Car();
//		Vehicle v = new Bicycle();
		useVehicle(c);
//		useVehicle(v);
	}

	public static void useVehicle(Vehicle vehicle) {
		vehicle.accelerate();
		vehicle.pushbreak();
		vehicle.soundhorn();
	}

}
