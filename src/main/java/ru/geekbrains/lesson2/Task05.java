package ru.geekbrains.lesson2;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Task05 {
    public static void main(String[] args) {
        int[] Array = new int[11];
        Random rand = new Random();
        for (int i = 0; i < Array.length; i++)
            Array[i] = rand.nextInt(100 - 1);
        System.out.println(Arrays.toString(Array));
        System.out.print(Arrays.toString(Shuffle(Array)));
    }

    public static int[] Shuffle(int[] arr) {
        int n = arr.length;
        Random random = new Random();
        random.nextInt();
        for (int i = 0; i < n; i++) {
            int index = i + random.nextInt(n - i);
            Replace(arr, i, index);
        }
        return arr;
    }

    private static void Replace(int[] a, int old_ind, int new_ind) {
        int cash = a[old_ind];
        a[old_ind] = a[new_ind];
        a[new_ind] = cash;
    }

}
