package arraylist.project.controller;

import arraylist.project.model.Auto;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListLauncherTest {

    @Test
    public void testMaakRandomRijGetallen() {
        var list = ArrayListLauncher.maakRandomRijGetallen(10, 25);

        Assert.assertEquals(10, list.size());
        Assert.assertTrue(list.stream().noneMatch(n -> n > 25));
    }

    public void testSomVanRij() {
        var list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        Assert.assertEquals(55, ArrayListLauncher.somVanRij(list));
    }

    public void testGemiddeldeVanRij() {
        var list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        Assert.assertEquals(6, ArrayListLauncher.gemiddeldeVanRij(list), 0.00);
    }

    public void testSumOfListOfNumbers() {
        var list = new ArrayList<Number>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        Assert.assertEquals(55, ArrayListLauncher.somVanNumberLijst(list));
    }

    public void testGemiddeldeVanNumberLijst() {
        var list = new ArrayList<Number>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        Assert.assertEquals(6, ArrayListLauncher.gemiddeldeVanNumberLijst(list), 0.00);

    }

    public void testGeefZwaarsteAuto() {
        var heaviestCar = new Auto("", "", 4, "");

        var list = new ArrayList<>(Arrays.asList(
                new Auto("", "", 1, ""),
                new Auto("", "", 2, ""),
                new Auto("", "", 3, ""),
                heaviestCar
        ));
        Assert.assertEquals(heaviestCar.getGewicht(), ArrayListLauncher.geefZwaarsteAuto(list).getGewicht());
    }
}