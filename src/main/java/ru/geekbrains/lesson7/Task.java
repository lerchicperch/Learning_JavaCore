package ru.geekbrains.lesson7;

public class Task {
    public static void main(String[] args) {
        FruitBox<Apple> box1 = new FruitBox<>();
        FruitBox<Orange> box2 = new FruitBox<>();
        FruitBox<Apple> box3 = new FruitBox<>();

        box1.add(new Apple(), new Apple(), new Apple(), new Apple());
        box2.add(new Orange(), new Orange(), new Orange(), new Orange());

        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());
        System.out.println(box3.getWeight());

        if (box1.compare(box2))
            System.out.println("Вес коробок совпадает");
        else System.out.println("Вес коробок не совпадает");
    }
}
