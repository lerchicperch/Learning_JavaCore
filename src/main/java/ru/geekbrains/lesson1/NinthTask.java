package ru.geekbrains.lesson1;

import java.util.Arrays;
import java.util.Random;

public class NinthTask {
    public static void main(String[] args) {
        int [] NewArray = new int [10];
        int Max_value, Min_value;
        Random rand = new Random();
        for (int i = 0; i < NewArray.length; i++)
        {
            NewArray[i] = rand.nextInt(100 - 1);
        }
        System.out.println(Arrays.toString(NewArray));
        Max_value = NewArray[0];
        for (int i = 0; i < NewArray.length; i++)
        {
            if (Max_value < NewArray[i])
                Max_value = NewArray[i];
        }
        Min_value = NewArray[0];
        for (int i = 0; i < NewArray.length; i++)
        {
            if (Min_value > NewArray[i])
                Min_value = NewArray[i];
        }
        System.out.print("Minimum number in array is " + Min_value + ", maximum value in array is " + Max_value);
    }
}
