package ru.geekbrains.lesson8;

import java.util.*;

public class Phonebook {

    private Map<Integer, String> phonebook;

    public Phonebook() {
        phonebook = new HashMap<>();
    }

    public void add(int number, String name) {
        phonebook.put(number, name);
    }

    public void get(String name){
        if(phonebook.containsValue(name)) {
            Set<Map.Entry<Integer, String>> set = phonebook.entrySet();
            for (Map.Entry<Integer, String> temp : set) {
                if (temp.getValue().equals(name)) {
                    System.out.println(temp.getValue() + " : " + temp.getKey());
                }
            }
        }
        else {
            System.out.println(name + " - такой записи не существует :(");
        }
    }
}