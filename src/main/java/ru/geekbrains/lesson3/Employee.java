package ru.geekbrains.lesson3;

public class Employee {

    private String fio;

    private String email;

    private int age;

    private String post;

    public Employee(String fio, String email, int age, String post) {
        this.fio = fio;
        this.email = email;
        this.age = age;
        this.post = post;
    }

    public String getFio() {
        return fio;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getPost() {
        return post;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void PrintPerson() {
        System.out.println("ФИО: " + this.fio + ", email: " + this.email + ", возраст: " + this.age + ", должность: " + this.post);
    }
}
