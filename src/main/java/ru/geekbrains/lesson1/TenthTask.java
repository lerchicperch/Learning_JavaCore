package ru.geekbrains.lesson1;

import java.util.Scanner;

public class TenthTask {
    public static void main(String[]args) {
        int year;
        boolean result;
        Scanner in = new Scanner(System.in);
        System.out.print("Please, enter year: ");
        year = in.nextInt();
        in.close();
        result = isLeapYear(year);
        if (result == true)
           System.out.println(year + " is a leap year");
        else System.out.println(year + " not a leap year");
    }

    public static boolean isLeapYear(int year) {

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            return true;
        } else {
            return false;
        }
    }
}
