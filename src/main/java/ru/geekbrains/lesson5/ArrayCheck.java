package ru.geekbrains.lesson5;

public class ArrayCheck {

    static int N = 5;

    public static int checkArray(String[][] test_array) throws ArraySizeException, ArrayDataException {
        if (test_array.length != N) {
            throw new ArraySizeException(test_array.length);
        }
        for (int i = 0; i < test_array.length; i++) {
            if (test_array[i].length != N) {
                throw new ArraySizeException(i, test_array[i].length);
            }
        }

        int result = 0;
        for (int i = 0; i < test_array.length; i++) {
            for (int j = 0; j < test_array[i].length; j++) {
                try {
                    result += Integer.parseInt(test_array[i][j]);
                } catch (NumberFormatException exception) {
                    throw new ArrayDataException(i, j, test_array[i][j]);
                }
            }
        }
        return result;
    }
}
