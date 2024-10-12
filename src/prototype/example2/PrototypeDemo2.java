package prototype.example2;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDemo2 {

	public static void main(String[] args) {
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		
		Bus bus = new Bus();
		bus.setBrand("Toyota");
		bus.setColor("White");
		bus.setNbrDoors(4);
		
		Car car = new Car();
		car.setBrand("Nissan GTR");
		car.setColor("Black");
		car.setNbrDoors(4);
		
		vehicles.add(car);
		vehicles.add(bus);
		
		List<Vehicle> vehiclesClone = new ArrayList<Vehicle>();
		for(Vehicle v1: vehicles) {
			vehiclesClone.add(v1.clone());
		}
		
		for(Vehicle v1: vehiclesClone) {
			System.out.println(v1.getBrand() + " " + v1.getColor() + " " + v1.getNbrDoors());
		}

	}

}
