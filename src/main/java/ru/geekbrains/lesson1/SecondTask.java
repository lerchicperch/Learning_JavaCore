package ru.geekbrains.lesson1;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        int number;
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        number = in.nextInt();
        in.close();
        if (number>=0)
            System.out.print("This is a positive number");
        else System.out.print("This is a negative number");
    }
}
