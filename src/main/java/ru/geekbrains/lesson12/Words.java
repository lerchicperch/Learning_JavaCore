package ru.geekbrains.lesson12;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Words {

    public static void main(String[] args) {
        String string = "Когда Монти было 16 лет, задали ему написать сочинение о том, что он хочет, когда вырастет. Монти долго мучился и потратил множество часов на описание своей мечты. Он хотел когда-нибудь стать владельцем ранчо. Он исписал семь страниц, описывая в самых мельчайших подробностях ранчо площадью 200 акров, и нарисовал план расположения всех строений, конюшен и дорог. Он даже нарисовал очень подробный план дома, который он построит площадью 4000 квадратных футов. На следующий день Монти отдал свое сочинение учителю. Два дня спустя его учитель вернул сочинение, поставив жирную красную двойку, приписав: «Останься после урока». После урока мальчик с мечтой подошел к учителю и спросил, почему он получил двойку за свое сочинение.";
        System.out.println(findWords(string));
    }

    public static String findWords(String string) {
        Stream<String> stream = Stream.of(string.split(" "));
        return stream
                .filter(w -> w.length() >= 5)
                .collect(Collectors.joining(" "));
    }
}
