package arraylist.project.controller;

import arraylist.project.model.Car;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListLauncherTest {

    @Test
    public void testMakeRandomListOfNumbers() {
        var list = ArrayListLauncher.makeRandomListOfNumbers(10, 25);

        Assert.assertEquals(10, list.size());
        Assert.assertTrue(list.stream().noneMatch(n -> n > 25));
    }

    public void testSumOfList() {
        var list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        Assert.assertEquals(55, ArrayListLauncher.sumOfList(list));
    }

    public void testAverageOfList() {
        var list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        Assert.assertEquals(6, ArrayListLauncher.averageOfList(list), 0.00);
    }

    public void testSumOfListOfNumbers() {
        var list = new ArrayList<Number>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        Assert.assertEquals(55, ArrayListLauncher.sumOfNumberList(list));
    }

    public void testAverageOfNumberList() {
        var list = new ArrayList<Number>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        Assert.assertEquals(6, ArrayListLauncher.averageOfNumberList(list), 0.00);

    }

    public void testGiveHeaviestCar() {
        var heaviestCar = new Car("", "", 4, "");

        var list = new ArrayList<>(Arrays.asList(
                new Car("", "", 1, ""),
                new Car("", "", 2, ""),
                new Car("", "", 3, ""),
                heaviestCar
        ));
        Assert.assertEquals(heaviestCar, ArrayListLauncher.giveHeaviestCar(list));
    }
}