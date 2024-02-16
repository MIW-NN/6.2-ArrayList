package arraylist.project.model;

public abstract class Vehicle extends MeansOfTransport {
    private int amountOfWheels;

    private int weight;

    protected Vehicle(String brand, String type, int amountOfWheels, int weight) {
        super(brand, type);
        this.amountOfWheels = amountOfWheels;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
