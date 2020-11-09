package ru.geekbrains.lesson6;

public class ArraySizeException extends Exception {

    private int index;
    private int length;

    public ArraySizeException(int index, int length) {
        super(String.format("Размерность подмассива (%d) - [%d] - не удовлетворяет условиям", index, length));
        this.index = index;
        this.length = length;
    }

    public ArraySizeException(int length) {
        super(String.format("Размерность массива - [%d] - не удовлетворяет условиям", length));
    }

    public int getIndex() {
        return index;
    }

    public int getLength() {
        return length;
    }
}
