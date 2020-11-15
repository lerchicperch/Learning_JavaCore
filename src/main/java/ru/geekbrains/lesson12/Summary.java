package ru.geekbrains.lesson12;

import java.util.stream.IntStream;

public class Summary {
    public static void main(String[] args) {
        System.out.println(sum100200());
    }

    public static int sum100200() {
        IntStream stream = IntStream.rangeClosed(100, 200);
        return stream
                .filter(n -> n % 2 == 0)
                .reduce(Integer::sum)
                .getAsInt();
    }
}
