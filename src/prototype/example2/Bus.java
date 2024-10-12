package prototype.example2;

class Bus implements Vehicle {
    private String brand;
    private String color;
    private int nbrDoors;

    public Bus() {}
    
    public Bus(Vehicle v) {
		this.brand = v.getBrand();
		this.color = v.getColor();
		this.nbrDoors = v.getNbrDoors();
	}
    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int getNbrDoors() {
        return nbrDoors;
    }

    @Override
    public void setNbrDoors(int nbrDoors) {
        this.nbrDoors = nbrDoors;
    }

    @Override
    public Bus clone() {
        return new Bus(this);
    }
}