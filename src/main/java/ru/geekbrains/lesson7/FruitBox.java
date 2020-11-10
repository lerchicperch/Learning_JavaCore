package ru.geekbrains.lesson7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FruitBox <T extends Fruit> {

    private List <T> list = new ArrayList<>();

    public final void add(T... fruits) {
        list.addAll(Arrays.asList(fruits));
    }

    public double getWeight() {
        if (list.size() == 0) {
            return 0;
        }
        double weight = 0;
        for (T fruit : list) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare(FruitBox <?> fruitBox) {
        return this.getWeight() == fruitBox.getWeight();
    }

    public void move(FruitBox <T> fruitBox) {
        fruitBox.add(list.toArray((T[]) new Object[0]));
        list.clear();
    }

}
