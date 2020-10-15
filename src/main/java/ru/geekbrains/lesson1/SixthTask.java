package ru.geekbrains.lesson1;

import java.util.Arrays;

public class SixthTask {
    public static void main(String[] args) {
        int [] NewArray = new int [8];
        NewArray[0] = 2;
        for (int i = 1; i < NewArray.length; i++)
        {
            NewArray[i] = NewArray[i-1] + 3;
        }
        System.out.print(Arrays.toString(NewArray));
    }
}
