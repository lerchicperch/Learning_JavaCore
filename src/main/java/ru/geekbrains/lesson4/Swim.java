package ru.geekbrains.lesson4;

public interface Swim {

    default int getMaxSwimResult() {
        return 0;
    }

    static void staticMethod() {
    }


}