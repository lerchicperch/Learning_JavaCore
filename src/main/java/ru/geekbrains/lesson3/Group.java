package ru.geekbrains.lesson3;

public class Group {

    private String name;

    private Employee [] members = new Employee[10];

    public Group (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Employee[] getMembers() {
        return members;
    }

    public void setMembers(Employee[] members) {
        this.members = members;
    }

    private int getIndex(Employee employee) {
        int index = -1;
        for (int i = 0; i < members.length; i++) {
            if (members[i] == employee) {
                index = i;
                break;
            }
            else
                index = -1;
        }
        return index;
    }

    public void addMember(Employee employee) {
        if (getIndex(employee) != -1)
            System.out.println("Данный сотрудник уже существует в данной группе");
        else {
            for (int i = 0; i < members.length; i++) {
                if (members[i] == null) {
                    members[i] = employee;
                    setMembers(members);
                    break;
                }
            }
        }
    }
    public void deleteMember(Employee employee) {
        if (getIndex(employee) == -1)
            System.out.println("Данного сотрудника не существует в заданной группе");
        else {
            members[getIndex(employee)] = null;
            setMembers(members);
        }
    }

    public void deleteAll() {
        for (int i = 0; i < members.length; i++)
            members[i] = null;
        setMembers(members);
    }

    public void printGroup() {
        boolean empty = true;
        System.out.println("В группе " + name + " состоят следующие сотрудники:");
        for (int i = 0; i < members.length; i++)
        if (members[i] != null) {
            System.out.println(members[i].getFio() + ", " + members[i].getPost());
            empty = false;
        }
        if (empty == true)
            System.out.println("Группа пуста");
    }

}
