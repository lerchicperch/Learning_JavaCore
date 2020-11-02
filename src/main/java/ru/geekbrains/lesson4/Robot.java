package ru.geekbrains.lesson4;

public class Robot extends Participant implements Run {

    private final int maxRunResult;

    public Robot(String name, int maxRunResult) {
        super(name);
        this.maxRunResult = maxRunResult;
    }

    @Override
    public int getMaxRunResult() {
        return maxRunResult;
    }

}
