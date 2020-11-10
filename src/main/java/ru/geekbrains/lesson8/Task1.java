package ru.geekbrains.lesson8;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        List<String> city = Arrays.asList("Москва", "Волгоград", "Тула", "Москва", "Красноярск", "Калининград",
                "Москва", "Москва", "Тула", "Воронеж");
        System.out.println("Исходный список:");
        city.forEach(System.out::println);
        System.out.println("\nСводка:");
        Map<String, Integer> wordsCount = new HashMap<>();
        for (String s : city) {
            wordsCount.put(s, wordsCount.getOrDefault(s, 0) + 1);
        }
        wordsCount.entrySet().forEach(System.out::println);
        System.out.println("\nБез повторов: ");
        Set<String> unique = new HashSet<>(city);
        unique.forEach(System.out::println);

    }
}
