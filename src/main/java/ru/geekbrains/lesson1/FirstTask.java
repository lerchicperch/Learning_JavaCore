package ru.geekbrains.lesson1;
import java.util.Scanner;
public class FirstTask {

    public static void main(String[] args) {
        int First_number, Second_number;
        boolean result;
        Scanner in = new Scanner(System.in);
        System.out.print("Input a first number: ");
        First_number = in.nextInt();
        System.out.print("Input a second number: ");
        Second_number = in.nextInt();
        in.close();
        if ((First_number + Second_number >= 10) & (First_number + Second_number <=20))
            result = true;
        else result = false;
        System.out.print(result);
    }
}
