package arraylist.project.model;

public abstract class Vervoersmiddel {
    private int id;
    private static int aantalVervoersmiddelen = 0;
    private String merk;
    private String type;

    protected Vervoersmiddel(String merk, String type) {
        this.aantalVervoersmiddelen++;
        this.id = this.aantalVervoersmiddelen;
        this.merk = merk;
        this.type = type;
    }

    /**
     * Specificeer dat elke concrete subclass van Vervoermiddel
     * een concrete geefAandrijfKracht method moet hebben.
     * @return bezinemotor, 2 paarden, windkracht, menskracht, enz.
     */
    public abstract String geefAandrijfKracht();

    /**
     * Deze toString gebruikt de abstract method geefAandrijfKracht,
     * maar de echte code staat dus in Auto, Koets, Zeilboot, Fiets, enz.
     */
    @Override
    public String toString() {
        return String.format("Vervoermiddel #%d %s %s aangedreven door %s",
                id, merk, type, geefAandrijfKracht());
    }
}
