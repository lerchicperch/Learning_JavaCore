package ru.geekbrains.lesson2;

import java.util.Arrays;
import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        int [] Array = new int [10];
        Random rand = new Random();
        for (int i = 0; i < Array.length; i++)
            Array[i] = rand.nextInt(100 - 1);
        System.out.println(Arrays.toString(Array));
        System.out.print(Arrays.toString(Sort(Array)));
    }

    public static int[] Sort (int[] SortArr) {
        for (int i = 0; i < SortArr.length; i++) {
            int min = SortArr[i];
            int min_i = i;
            for (int j = i + 1; j < SortArr.length; j++) {
                if (SortArr[j] < min) {
                    min = SortArr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = SortArr[i];
                SortArr[i] = SortArr[min_i];
                SortArr[min_i] = tmp;
            }
        }
        return SortArr;
    }
}
