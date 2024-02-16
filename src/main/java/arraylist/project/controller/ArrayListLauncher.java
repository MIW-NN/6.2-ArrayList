package arraylist.project.controller;

import arraylist.project.model.Car;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListLauncher {

    public static void main(String[] args) {
        // Opgave 1. Lijst van Woorden.
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("Morgen");
        wordList.add("wordt");
        wordList.add("het");
        wordList.add("mooi");
        wordList.add("weer");
        for (String woord : wordList) {
            System.out.print(woord + " ");
        }
        System.out.println();
        wordList.remove(1);
        wordList.add(1,"is");
        for (String woord : wordList) {
            System.out.print(woord + " ");
        }
        System.out.println();

        // Opgave 2. Lijst van Random gehele getallen.
        ArrayList<Integer> listOfWholeNumbers;
        listOfWholeNumbers = makeRandomListOfNumbers(25, 100);
        System.out.println(listOfWholeNumbers);

        // Opgave 3. Som van een rij getallen
        System.out.println("De som van de rij is: " + sumOfList(listOfWholeNumbers));

        // Opgave 4. Gemiddelde van een rij getallen
        System.out.println("Het gemiddelde van de rij is: " + averageOfList(listOfWholeNumbers));

        // Opgave 5. Lijst van getallen
        ArrayList<Number> secondList = new ArrayList<>();
        secondList.add(5);
        secondList.add(8);
        secondList.add(13);
        secondList.add(21);
        secondList.add(34);
        secondList.add(3.14);
        secondList.add(2.72);
        secondList.add(1.62);
        System.out.println(secondList);

        // Opgave 5a: toon alleen gehele getallen, dus de integers.
        for (Number number : secondList) {
            if (number instanceof Integer) {
                System.out.println(number);
            }
        }

        // Opgave 5b: tel alleen de gebroken getallen, de doubles, op.
        double sum = 0;
        for (Number getal : secondList) {
            if (getal instanceof Double) {
                sum += (double) getal;
            }
        }
        System.out.println("De som van de gebroken getallen is: " + sum);

        // Opgave 5c: gemiddelde van een rij getallen
        System.out.println("Het gemiddelde van de rij is: " + averageOfNumberList(secondList));

        // Opgave 6. Lijst van auto's
        ArrayList<Car> carList = new ArrayList<>();
        carList.add(new Car("Dacia", "Logan", 1150, "benzine"));
        carList.add(new Car("Tesla", "S 100D", 2200, "elektrisch"));
        carList.add(new Car("Fiat", "Ducato", 2700, "diesel"));
        carList.add(new Car("Citroën", "C1", 2075, "benzine"));
        carList.add(new Car("Ford", "Focus", 1150, "benzine"));
        carList.add(new Car("Toyota", "Prius", 1750, "hybride"));
        carList.add(new Car("Volkswagen", "Golf", 1150, "diesel"));
        carList.add(new Car("Honda", "Civic", 1075, "benzine"));
        System.out.println(giveHeaviestCar(carList));

    }

    // Methode bij Opgave 2. Lijst van Random gehele getallen.
    public static ArrayList<Integer> makeRandomListOfNumbers(int aantal, int maximum) {
        ArrayList<Integer> numberList = new ArrayList<>();
        // Naast de Math.random() methode uit Programming kan ook de onderstaande code gebruikt worden.
        Random generator = new Random();
        for (int i = 0; i < aantal; i++) {
            numberList.add(generator.nextInt(maximum));
        }
        return numberList;
    }

    // Methode bij Opgave 3. Som van een rij getallen
    public static int sumOfList(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer number : list) {
            sum += number;
        }
        return sum;
    }


    // Methode bij Opgave 4. Gemiddelde van een rij getallen
    public static double averageOfList(ArrayList<Integer> list) {
        int sum = sumOfList(list);
        return  (double) sum / list.size();
    }

    // Methode bij Opgave 5c. eerst de som van de rij getallen (Numbers)
    public static double sumOfNumberList(ArrayList<Number> list) {
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
    public static double averageOfNumberList(ArrayList<Number> list) {
        double sum = sumOfNumberList(list);
        return  (double) sum / list.size();
    }

    // Methode bij Opgave 6. Lijst van auto's
    public static Car giveHeaviestCar(ArrayList<Car> cars) {
        Car heaviestCar = null;
        for (Car car : cars) {
            if (heaviestCar == null) {
                heaviestCar = car;
            } else if (car.getWeight() > heaviestCar.getWeight()) {
                heaviestCar = car;
            }
        }
        return heaviestCar;
    }
}
