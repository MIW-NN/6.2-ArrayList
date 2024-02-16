package arraylist.project.model;

public abstract class MeansOfTransport {
    private int id;
    private static int amountOfTransportations = 0;
    private String brand;
    private String type;

    protected MeansOfTransport(String brand, String type) {
        this.amountOfTransportations++;
        this.id = this.amountOfTransportations;
        this.brand = brand;
        this.type = type;
    }

    /**
     * Specificeer dat elke concrete subclass van Vervoermiddel
     * een concrete geefAandrijfkracht method moet hebben.
     * @return bezinemotor, 2 paarden, windkracht, menskracht, enz.
     */
    public abstract String giveMotivePower();

    /**
     * Deze toString gebruikt de abstract method geefAandrijfkracht,
     * maar de echte code staat dus in Auto, Koets, Zeilboot, Fiets, enz.
     */
    @Override
    public String toString() {
        return String.format("Vervoermiddel #%d %s %s aangedreven door %s",
                id, brand, type, giveMotivePower());
    }
}
