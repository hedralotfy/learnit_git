package prototype.example2;

public interface Vehicle {
	String getBrand();

	void setBrand(String brand);

	String getColor();

	void setColor(String color);

	int getNbrDoors();

	void setNbrDoors(int nbrDoors);

	abstract Vehicle clone();

}
