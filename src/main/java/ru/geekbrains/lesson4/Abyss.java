package ru.geekbrains.lesson4;

public class Abyss extends Obstacle {

    private final int length;

    public Abyss (String name, int length) {
        super(name);
        this.length = length;
    }

    @Override
    public boolean Pass(Participant participant) {
        if (participant instanceof Fly) {
            Fly fly = (Fly) participant;
            boolean result = fly.getMaxFlyResult() >= length;
            if (result)
            {
                System.out.printf("Участник %s пролетел пропасть длинной %d%n",
                        participant.getName(), length);
            }
            else System.out.printf("Участник %s не пролетел пропасть длинной %d%n",
                    participant.getName(), length);
            return result;
        }
        return false;
    }
}
