package ru.geekbrains.lesson8;

public class Task2 {

    public static void main(String[] args) {

        Phonebook phonebook = new Phonebook();

        phonebook.add(2304578, "Ivanov");
        phonebook.add(5678794, "Ivanov");
        phonebook.add(3456783, "Petrov");
        phonebook.add(3456278, "Sidorov");

        phonebook.get("Ivanov");
        phonebook.get("Petrov");
        phonebook.get("Sidorov");
        phonebook.get("Trololo");
    }
}


