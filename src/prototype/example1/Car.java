package prototype.example1;

public class Car implements Prototype {
	private String brand;
	private String color;

	public Car() {}

	public Car(Car car) {
		this.brand = car.brand;
		this.color = car.color;
	}

	// Getters and Setters
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// Implement the clone() method from Prototype interface
	@Override
	public Car clone() {
		return new Car(this);
	}
	
	
}
