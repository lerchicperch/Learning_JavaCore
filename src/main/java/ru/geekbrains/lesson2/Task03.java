package ru.geekbrains.lesson2;

public class Task03 {
    public static void main(String[] args) {
        long number = 3800;
        System.out.println(number + " секунд - это " + NumberToTime(number));
    }

    public static String NumberToTime(long nmb) {
        long seconds = nmb % 60;
        long minutes = (nmb / 60) % 60;
        long hours = (nmb / (60 * 60)) % 24;
        return String.format("%d:%02d:%02d", hours, minutes, seconds);
    }
}
