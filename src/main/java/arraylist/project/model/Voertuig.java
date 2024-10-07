package arraylist.project.model;

public abstract class Voertuig extends Vervoersmiddel {
    private int aantalWielen;
    private int gewicht;

    protected Voertuig(String brand, String type, int amountOfWheels, int gewicht) {
        super(brand, type);
        this.aantalWielen = amountOfWheels;
        this.gewicht = gewicht;
    }

    public int getGewicht() {
        return gewicht;
    }
}
