package ru.geekbrains.lesson4;

public class Cat extends Participant implements Run, Jump {

    private final int maxRunResult;
    private final int maxJumpResult;

    public Cat(String name, int maxRunResult, int maxJumpResult) {
        super(name);
        this.maxRunResult = maxRunResult;
        this.maxJumpResult = maxJumpResult;
    }

    @Override
    public int getMaxJumpResult() {
        return maxJumpResult;
    }

    @Override
    public int getMaxRunResult() {
        return maxRunResult;
    }
}
