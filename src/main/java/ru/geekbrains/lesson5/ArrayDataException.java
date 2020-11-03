package ru.geekbrains.lesson5;

public class ArrayDataException extends Exception {
    private int index_i;
    private int index_j;
    private String value;

    public ArrayDataException(int index_i, int index_j, String value) {
        super(String.format("Некорректное значение элемента массива [%d][%d] - '%s'", index_i, index_j, value));
        this.index_i = index_i;
        this.index_j = index_j;
        this.value = value;
    }

    public int getIndex_i() {
        return index_i;
    }

    public int getIndex_j() {
        return index_j;
    }

    public String getValue() {
        return value;
    }
}
