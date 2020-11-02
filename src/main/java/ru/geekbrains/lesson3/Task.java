package ru.geekbrains.lesson3;

public class Task {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Бармина В.","lerabananos@mail.ru", 23, "специалист-стажер");
        Employee employee2 = new Employee("Васьков Я.","vaskov@mail.ru", 23, "специалист-стажер");
        Employee employee3 = new Employee("Нгуен Н.","nguen@mail.ru", 23, "специалист-стажер");
        Employee employee4 = new Employee("Кузнецов В.","kuznetsov@mail.ru", 25, "специалист-стажер");
        Employee employee5 = new Employee("Меховский Е.","mehovsky@mail.ru", 27, "инженер-тестировщик");
        Employee employee6 = new Employee("Румянцев А.","rumyanzev@mail.ru", 27, "test-lead");

        employee1.PrintPerson();
        System.out.println();

        Group group1 = new Group("Стажеры");
        Group group2 = new Group("Специалисты");
        Group group3 = new Group("Лиды");

        group1.addMember(employee1);
        group1.addMember(employee2);
        group1.addMember(employee3);
        group1.addMember(employee4);
        group2.addMember(employee5);
        group2.addMember(employee6);
        group3.addMember(employee6);

        group1.printGroup();
        System.out.println();
        group2.printGroup();
        System.out.println();
        group3.printGroup();

        group1.deleteMember(employee1);
        group2.deleteAll();

        group1.printGroup();
        System.out.println();
        group2.printGroup();
    }
}
