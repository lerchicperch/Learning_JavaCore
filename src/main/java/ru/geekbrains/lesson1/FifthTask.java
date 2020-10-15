package ru.geekbrains.lesson1;

import java.util.Arrays;

public class FifthTask {
    public static void main(String[] args) {
        int [] NewArray = {0, 1, 1, 1, 1, 0};
        System.out.println(Arrays.toString(NewArray));
        for (int i = 0; i< NewArray.length; i++)
        {
            if (NewArray[i] == 0)
                NewArray[i] =  1;
            else NewArray[i] =  0;
        }
        System.out.print(Arrays.toString(NewArray));
    }
}
