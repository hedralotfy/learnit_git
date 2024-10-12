package builderPattern.carBuilder;

public class Director {
	
    public void buildChevrolet(CarBuilder carBuilder) {
        carBuilder.Brand("Chevrolet");
        carBuilder.Color("red");
        carBuilder.NbrDoors(4);
        carBuilder.Screentype("Big");
        carBuilder.Weight(5000);
        carBuilder.Height(1000);
    }

    public void buildHyundai(CarBuilder carBuilder) {
        carBuilder.Brand("Hyundai");
        carBuilder.Color("blue");
        carBuilder.NbrDoors(4);
        carBuilder.Screentype("Medium");
        carBuilder.Weight(4000);
        carBuilder.Height(900);
    }

}
