package ru.geekbrains.lesson4;

public class RobotVersion2 extends Participant implements Run, Jump, Swim, Fly {

    private final int maxRunResult;
    private final int maxJumpResult;
    private final int maxSwimResult;
    private final int maxFlyResult;

    public RobotVersion2(String name, int maxRunResult, int maxJumpResult, int maxSwimResult, int maxFlyResult) {
        super(name);
        this.maxRunResult = maxRunResult;
        this.maxJumpResult = maxJumpResult;
        this.maxSwimResult = maxSwimResult;
        this.maxFlyResult = maxFlyResult;
    }

    @Override
    public int getMaxRunResult() {
        return maxRunResult;
    }

    @Override
    public int getMaxFlyResult() {
        return maxFlyResult;
    }

    @Override
    public int getMaxJumpResult() {
        return maxJumpResult;
    }

    @Override
    public int getMaxSwimResult() {
        return maxSwimResult;
    }
}