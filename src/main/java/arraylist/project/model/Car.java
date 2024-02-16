package arraylist.project.model;

public class Car extends Vehicle {
    private String typeOfFuel;
    private static final int AMOUNT_OF_WHEELS = 4;

    public Car(String brand, String type, int weight, String typeOfFuel) {
        super(brand, type, AMOUNT_OF_WHEELS, weight);
        this.typeOfFuel = typeOfFuel;
    }

    @Override
    public String giveMotivePower() {
        return (this.typeOfFuel + "motor");
    }
}
