package ru.geekbrains.lesson1;

import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        String input_string;
        Scanner in = new Scanner(System.in);
        System.out.print("Please, enter your name : ");
        input_string = in.nextLine();
        in.close();
        System.out.print("Привет, " + input_string + "!");
    }
}
