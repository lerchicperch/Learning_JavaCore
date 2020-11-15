package ru.geekbrains.lesson12;

import java.util.stream.Stream;

public class LengthSum {

    public static void main(String[] args) {
        String[] string = {"a","b","ccccc","d","f"};
        System.out.println(sum(string));
    }

    public static int sum (String[] string) {
        Stream<String> stream = Stream.of(string);
        return stream
                .reduce((s1, s2) -> s1 + s2)
                .get()
                .length();
    }
}
