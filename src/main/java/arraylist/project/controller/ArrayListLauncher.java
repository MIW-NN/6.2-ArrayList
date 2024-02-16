package arraylist.project.controller;

import arraylist.project.model.Car;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListLauncher {

    public static void main(String[] args) {
        // Opgave 1. Lijst van Woorden.


        // Opgave 2. Lijst van Random gehele getallen.


        // Opgave 3. Som van een rij getallen


        // Opgave 4. Gemiddelde van een rij getallen


        // Opgave 5. Lijst van getallen


        // Opgave 5a: toon alleen gehele getallen, dus de integers.


        // Opgave 5b: tel alleen de gebroken getallen, de doubles, op.


        // Opgave 5c: gemiddelde van een rij getallen


        // Opgave 6. Lijst van auto's

    }

    // Methode bij Opgave 2. Lijst van Random gehele getallen.
    public static ArrayList<Integer> makeRandomListOfNumbers(int aantal, int maximum) {
        return new ArrayList<>();
    }

    // Methode bij Opgave 3. Som van een rij getallen
    public static int sumOfList(ArrayList<Integer> list) {
        return 0;
    }


    // Methode bij Opgave 4. Gemiddelde van een rij getallen
    public static double averageOfList(ArrayList<Integer> list) {
        return  0;
    }

    // Methode bij Opgave 5c. eerst de som van de rij getallen (Numbers)
    public static double sumOfNumberList(ArrayList<Number> list) {
        return 0;
    }

    // Methode bij Opgave 5c. gemiddelde van een rij getallen (Numbers)
    public static double averageOfNumberList(ArrayList<Number> list) {
        return  0;
    }

    // Methode bij Opgave 6. Lijst van auto's
    public static Car giveHeaviestCar(ArrayList<Car> cars) {
        return new Car("","",0,"");
    }
}
