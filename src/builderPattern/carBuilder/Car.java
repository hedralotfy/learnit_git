package builderPattern.carBuilder;

public class Car {
	
	private final int id;
    private final String brand;
    private final String model;
    private final String color;
    private final int nbrDoors;
    private final String Screentype;
    private final int weight;
    private final int height;

    Car(int id, String brand, String model, String color, int nbrDoors, String Screentype, int weight, int height) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.nbrDoors = nbrDoors;
        this.Screentype = Screentype;
        this.weight = weight;
        this.height = height;
    }

	public int getId() {
		return id;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public int getNbrDoors() {
		return nbrDoors;
	}

	public String getScreentype() {
		return Screentype;
	}

	public int getWeight() {
		return weight;
	}

	public int getHeight() {
		return height;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + ", model=" + model + ", color=" + color + ", nbrDoors=" + nbrDoors
				+ ", Screentype=" + Screentype + ", weight=" + weight + ", height=" + height + "]";
	}
    
    

}
