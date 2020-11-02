package ru.geekbrains.lesson4;

public class Track extends Obstacle {

    private final int length;

    public Track (String name, int length) {
        super(name);
        this.length = length;
    }

    @Override
    public boolean Pass(Participant participant) {
        if (participant instanceof Run) {
            Run run= (Run) participant;
            boolean result = run.getMaxRunResult() >= length;
            if (result)
            {
                System.out.printf("Участник %s пробежал дорожку длинной %d%n",
                        participant.getName(), length);
            }
            else System.out.printf("Участник %s не пробежал дорожку длинной %d%n",
                    participant.getName(), length);
            return result;
        }
        return false;
    }
}