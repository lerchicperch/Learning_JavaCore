package ru.geekbrains.lesson4;

public class Start {
    public static void main(String[] args) {

        Competition competition = new Competition(
                new Participant[]{
                        new Cat("Avalon", 10, 20),
                        new Human("James Peterson", 20, 15, 20),
                        new Robot("AI-01", 100),
                        new RobotVersion2("AI-1000", 100, 50, 60, 50)
                },
                new Obstacle[]{
                        new Track("Дорожка", 5),
                        new Wall("Стена", 10),
                        new Track("Дорожка", 15),
                        new Pool("Бассейн", 10),
                        new Track("Дорожка", 20),
                        new Abyss("Пропасть", 15),
                        new Track("Дорожка", 30)
                }

        );

        competition.compete();
    }
}

