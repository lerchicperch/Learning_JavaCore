package ru.geekbrains.lesson4;

public class Wall extends Obstacle {

    private final int height;

    public Wall(String name, int height) {
        super(name);
        this.height = height;
    }

    @Override
    public boolean Pass(Participant participant) {
        if (participant instanceof Jump) {
            Jump jump = (Jump) participant;
            boolean result = jump.getMaxJumpResult() >= height;
            if (result)
            {
                System.out.printf("Участник %s перепрыгнул стену высотой %d%n",
                        participant.getName(), height);
            }
            else System.out.printf("Участник %s не перепрыгнул стену высотой %d%n",
                    participant.getName(), height);
            return result;
        }
        return false;
    }

}