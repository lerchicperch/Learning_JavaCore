package ru.geekbrains.lesson4;

public abstract class Participant {

    private final String name;

    public Participant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
