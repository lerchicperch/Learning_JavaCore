package ru.geekbrains.lesson1;

import java.util.Arrays;

public class SeventhTask {
    public static void main(String[] args) {
    int [] NewArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    System.out.println(Arrays.toString(NewArray));
    for (int i = 0; i < NewArray.length; i++)
    {
        if (NewArray[i] < 6)
            NewArray[i] *= 2;
    }
    System.out.print(Arrays.toString(NewArray));
}
}
