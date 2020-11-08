package ru.geekbrains.lesson6;

import static ru.geekbrains.lesson6.ArrayCheck.checkArray;

public class Task {
    public static void main(String[] args) throws ArraySizeException, ArrayDataException {
        String[][] test_array = {{"1", "0", "0", "0", "0"}, {"0", "0", "0", "0", "0"}, {"0", "0", "0", "0", "0"}, {"0", "0", "0", "0", "0"}, {"0", "0", "0", "0", "1"}};
        System.out.println(checkArray(test_array));

        //пример массива с некорректным элементом
        String[][] test_array2 = {{"1", "error", "0", "0", "0"}, {"0", "0", "0", "0", "0"}, {"0", "0", "0", "0", "0"}, {"0", "0", "0", "0", "0"}, {"0", "0", "0", "0", "1"}};
        System.out.println(checkArray(test_array2));
        //пример массива с некорректным количестовм элементов
        String[][] test_array3 = {{"1", "0", "0", "0"}, {"0", "0", "0", "0", "0"}, {"0", "0", "0", "0", "0"}, {"0", "0", "0", "0", "0"}, {"0", "0", "0", "0", "1"}};
        System.out.println(checkArray(test_array3));
    }
}
