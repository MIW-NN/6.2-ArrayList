package arraylist.project.controller;

import arraylist.project.model.Auto;

import java.util.ArrayList;

public class ArrayListLauncher {

    public static void main(String[] args) {
        // Opgave 1. Lijst van Woorden.


        // Opgave 2. Lijst van Random gehele getallen.


        // Opgave 3. Som van een rij getallen


        // Opgave 4. Gemiddelde van een rij getallen


        // Opgave 5. Lijst van getallen
        ArrayList<Number> rijGetallen = new ArrayList<>();
        rijGetallen.add(5);
        rijGetallen.add(8);
        rijGetallen.add(3.14);
        rijGetallen.add(13);
        rijGetallen.add(21);
        rijGetallen.add(2.72);
        rijGetallen.add(34);

        // Opgave 5a: toon alleen gehele getallen, dus de integers.


        // Opgave 5b: tel alleen de gebroken getallen, de doubles, op.


        // Opgave 5c: gemiddelde van een rij getallen


        // Opgave 6. Lijst van auto's
        ArrayList<Auto> autos = new ArrayList<>();
        autos.add(new Auto("Skoda", "Superb", 1400, "benzine"));
        autos.add(new Auto("Skoda", "Octavia", 1200, "diesel"));
        autos.add(new Auto("Skoda", "Fabia", 1100, "gas"));
        autos.add(new Auto("Tesla", "Model S", 1500, "elektrisch"));
        autos.add(new Auto("Tesla", "Cybertruck", 2200, "elektrisch"));

        System.out.println(geefZwaarsteAuto(autos));

    }

    // Methode bij Opgave 2. Lijst van Random gehele getallen.
    public static ArrayList<Integer> maakRandomRijGetallen(int aantal, int maximum) {
        return new ArrayList<>();
    }

    // Methode bij Opgave 3. Som van een rij getallen
    public static int somVanRij(ArrayList<Integer> list) {
        return 0;
    }


    // Methode bij Opgave 4. Gemiddelde van een rij getallen
    public static double gemiddeldeVanRij(ArrayList<Integer> list) {
        return  0;
    }

    // Methode bij Opgave 5c. De som van de rij getallen (Numbers)
    public static double somVanNumberLijst(ArrayList<Number> list) {
        return 0;
    }

    // Methode bij Opgave 5c. Gemiddelde van een rij getallen (Numbers)
    public static double gemiddeldeVanNumberLijst(ArrayList<Number> list) {
        return  0;
    }

    // Methode bij Opgave 6. Lijst van auto's
    public static Auto geefZwaarsteAuto(ArrayList<Auto> autos) {
        return autos.get(0);
    }
}
