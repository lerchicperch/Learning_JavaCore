package ru.geekbrains.lesson2;

public class Task01 {

    public static void main(String[] args) {
        triangle(5);
    }

    public static void triangle(int side) {

        //for (int i = 0; i <= side; ++i) {
        //    for (int j = 0; j < i; ++j)
        //        System.out.print('*' + " ");
        //    System.out.println();
        //}

        if (side % 2 == 0)
        {
        System.out.println("Введено четное число");
        return;
        }
        int i, j;
        for (i = (side / 2 + 1); i <= side; i++) {
            for (j = 0; j <= i; j++)
                if (j < side - i + 1) System.out.print(" " + " ");
                else System.out.print(" " + '*');
            System.out.println();
        }
    }
}
