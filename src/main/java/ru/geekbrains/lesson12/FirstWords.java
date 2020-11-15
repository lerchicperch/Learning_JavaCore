package ru.geekbrains.lesson12;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstWords {

    public static void main(String[] args) {
        String[] string = {"a","b","a","c","d","d"};
        System.out.println(firstThree(string));
    }

    public static List<String> firstThree(String[] string) {
        Stream<String> stream = Stream.of(string);
        return stream
                .sorted()
                .limit(3)
                .collect(Collectors.toList());
    }
}