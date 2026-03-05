package arraylist.project.controller;

import arraylist.project.model.Auto;

import java.util.ArrayList;

public class ArrayListLauncher {

    public static void main(String[] args) {
        // Opgave 1. Lijst van Woorden.
        ArrayList<String> woordenLijst = new ArrayList<>();
        woordenLijst.add("Morgen");
        woordenLijst.add("wordt");
        woordenLijst.add("het");
        woordenLijst.add("mooi");
        woordenLijst.add("weer");
        for (String woord : woordenLijst) {
            System.out.print(woord + " ");
        }
        System.out.println();
        woordenLijst.remove(1);
        woordenLijst.add(1,"is");
        for (String woord : woordenLijst) {
            System.out.print(woord + " ");
        }
        System.out.println();

        // Opgave 2. Lijst van Random gehele getallen.
        ArrayList<Integer> lijstGeheelGetallen;
        lijstGeheelGetallen = ArrayListMethoden.maakRijWillekeurigeGetallen(25, 100);
        System.out.println(lijstGeheelGetallen);

        // Opgave 3. Som van een rij getallen
        System.out.println("De som van de rij is: " + ArrayListMethoden.somVanRij(lijstGeheelGetallen));

        // Opgave 4. Gemiddelde van een rij getallen
        System.out.println("Het gemiddelde van de rij is: " + ArrayListMethoden.gemiddeldeVanRij(lijstGeheelGetallen));

        // Opgave 5. Lijst van getallen
        ArrayList<Number> tweedeLijst = new ArrayList<>();
        tweedeLijst.add(5);
        tweedeLijst.add(8);
        tweedeLijst.add(13);
        tweedeLijst.add(21);
        tweedeLijst.add(34);
        tweedeLijst.add(3.14);
        tweedeLijst.add(2.72);
        tweedeLijst.add(1.62);
        System.out.println(tweedeLijst);

        // Opgave 5a: toon alleen gehele getallen, dus de integers.
        for (Number number : tweedeLijst) {
            if (number instanceof Integer) {
                System.out.println(number);
            }
        }

        // Opgave 5b: tel alleen de gebroken getallen, de doubles, op.
        double sum = 0;
        for (Number getal : tweedeLijst) {
            if (getal instanceof Double) {
                sum += (double) getal;
            }
        }
        System.out.println("De som van de gebroken getallen is: " + sum);

        // Opgave 5c: gemiddelde van een rij getallen
        System.out.println("Het gemiddelde van de rij is: " + gemiddeldeVanGetalRij(tweedeLijst));

        // Opgave 6. Lijst van auto's
        ArrayList<Auto> autoLijst = new ArrayList<>();
        autoLijst.add(new Auto("Dacia", "Logan", 1150, "benzine"));
        autoLijst.add(new Auto("Tesla", "S 100D", 2200, "elektrisch"));
        autoLijst.add(new Auto("Fiat", "Ducato", 2700, "diesel"));
        autoLijst.add(new Auto("Citroën", "C1", 2075, "benzine"));
        autoLijst.add(new Auto("Ford", "Focus", 1150, "benzine"));
        autoLijst.add(new Auto("Toyota", "Prius", 1750, "hybride"));
        autoLijst.add(new Auto("Volkswagen", "Golf", 1150, "diesel"));
        autoLijst.add(new Auto("Honda", "Civic", 1075, "benzine"));
        System.out.println(geefZwaarsteAuto(autoLijst));

    }

    // Methode bij Opgave 5c. eerst de som van de rij getallen (Numbers)
    public static double somVanGetalRij(ArrayList<Number> list) {
        double sum = 0;
        for (Number getal : list) {
            sum += getal.doubleValue();
        }
        return sum;

/*      Alternatief dat onderscheidt maakt tussen Double en Integer
        double somDoubles = 0;
        int somIntegers = 0;
        for (Number getal : rij) {
            if (getal instanceof Integer) {
                somIntegers += (int) getal;
            } else {
                somDoubles += (double) getal;
            }
        }
        return somDoubles + somIntegers;
*/
    }

    // Methode bij Opgave 5c. gemiddelde van een rij getallen (Numbers)
    public static double gemiddeldeVanGetalRij(ArrayList<Number> list) {
        double sum = somVanGetalRij(list);
        return  (double) sum / list.size();
    }

    // Methode bij Opgave 6. Lijst van auto's
    public static Auto geefZwaarsteAuto(ArrayList<Auto> autos) {
        Auto zwaarsteAuto = null;
        for (Auto auto : autos) {
            if (zwaarsteAuto == null) {
                zwaarsteAuto = auto;
            } else if (auto.getGewicht() > zwaarsteAuto.getGewicht()) {
                zwaarsteAuto = auto;
            }
        }
        return zwaarsteAuto;
    }
}
