package ru.geekbrains.lesson2;

import java.util.Arrays;
import java.util.Random;

public class Task04 {
    public static void main(String[] args) {
        int [] Array = new int [11];
        Random rand = new Random();
        for (int i = 0; i < Array.length; i++)
            Array[i] = rand.nextInt(100 - 1);
        System.out.println(Arrays.toString(Array));
        System.out.print(Arrays.toString(Sort(Array)));
    }

    public static int[] Sort (int[] SortArr) {
        int cash;
        for (int i = 0; i < SortArr.length - 1 - i; i++) {
            cash = SortArr[i];
            SortArr[i] = SortArr[SortArr.length - 1 - i];
            SortArr[SortArr.length - 1 - i] = cash;
        }
        return SortArr;
    }
}
