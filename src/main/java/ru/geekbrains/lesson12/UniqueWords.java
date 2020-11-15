package ru.geekbrains.lesson12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UniqueWords {

    public static void main(String[] args) {
        String[][] list = {{"a","a01","a02","a03","a04"},
                          {"a03","a","a02","a01","a04"},
                          {"a","a01","a02","a03","a04"},
                          {"a03","a","a02","a01","a04"},
                          {"a","a01","a02","a03","a04"}};
        System.out.println(findWords(list));
    }

    public static List<String> findWords(String[][] list) {
        Stream<String> stream = Stream.of(list).flatMap(Arrays::stream);
        return stream
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}