package ru.geekbrains.lesson4;

public class Human extends Participant implements Run, Jump, Swim {

    private final int maxRunResult;
    private final int maxJumpResult;
    private final int maxSwimResult;

    public Human(String name, int maxRunResult, int maxJumpResult, int maxSwimResult) {
        super(name);
        this.maxRunResult = maxRunResult;
        this.maxJumpResult = maxJumpResult;
        this.maxSwimResult = maxSwimResult;
    }

    @Override
    public int getMaxJumpResult() {
        return maxJumpResult;
    }

    @Override
    public int getMaxRunResult() {
        return maxRunResult;
    }

    @Override
    public int getMaxSwimResult() {
        return maxSwimResult;
    }
}