package arraylist.project.controller;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListMethoden {

    public static ArrayList<Integer> maakRijWillekeurigeGetallen(int aantal, int maximum) {
        ArrayList<Integer> getallenLijst = new ArrayList<>();
        Random generator = new Random();
        for (int i = 0; i < aantal; i++) {
            getallenLijst.add(generator.nextInt(maximum) + 1);
        }
        return getallenLijst;
    }

    public static int somVanRij(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer number : list) {
            sum += number;
        }
        return sum;
    }

    public static double gemiddeldeVanRij(ArrayList<Integer> list) {
        int sum = somVanRij(list);
        return (double) sum / list.size();
    }
}
