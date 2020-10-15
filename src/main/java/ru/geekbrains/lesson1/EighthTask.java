package ru.geekbrains.lesson1;

import java.util.Arrays;

public class EighthTask {
    public static void main(String[] args) {
        int c = 10;
        int[][] matrix = new int[c][c];
        for (int i = 0; i < matrix.length; i++)
        {
            matrix[i][i] = 1;
            matrix[i][(matrix.length-1)-i] = 1;
        }

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("[" + matrix[i][j]+ "] ");
            }
            System.out.println();
        }
    }
}
