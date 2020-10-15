package ru.geekbrains.lesson1;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        int number;
        boolean result;
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        number = in.nextInt();
        in.close();
        if (number<0)
        {
            result = true;
            System.out.print(result);
        }
    }
}
