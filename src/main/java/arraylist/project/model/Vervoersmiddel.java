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

    public abstract String geefAandrijfkracht();

    @Override
    public String toString() {
        return String.format("Vervoermiddel #%d %s %s aangedreven door %s",
                id, merk, type, geefAandrijfkracht());
    }
}
