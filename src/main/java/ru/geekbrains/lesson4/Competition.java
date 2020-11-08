package ru.geekbrains.lesson4;

public class Competition {

    private final Participant[] participants;

    private final Obstacle[] obstacles;

    public Competition(Participant[] participants, Obstacle[] obstacles) {
        this.participants = participants;
        this.obstacles = obstacles;
    }

    public void compete() {
        for (Participant participant : participants) {
            for (Obstacle obs : obstacles) {
                if (!obs.Pass(participant)) {
                    System.out.println(participant.getName() + " сошел с дистанции.");
                    break;
                }
            }
        }
    }

}