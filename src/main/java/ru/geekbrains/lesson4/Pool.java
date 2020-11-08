package ru.geekbrains.lesson4;

public class Pool extends Obstacle {

    private final int length;

    public Pool(String name, int length) {
        super(name);
        this.length = length;
    }

    @Override
    public boolean Pass(Participant participant) {
        if (participant instanceof Swim) {
            Swim swim = (Swim) participant;
            boolean result = swim.getMaxSwimResult() >= length;
            if (result)
            {
            System.out.printf("Участник %s переплыл бассейн длинной %d%n",
                    participant.getName(), length);
            }
            else System.out.printf("Участник %s не переплыл бассейн длинной %d%n",
                    participant.getName(), length);
            return result;
        }
        return false;

    }
}