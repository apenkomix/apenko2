package Homework_9.Task_4;

import java.io.Serializable;

//+ Только не хватает private static final long serialVersionUID, чтобы (де)сериализация не ломалась при изменении класса
public class Employee implements Serializable {
    private String name;
    private Work work;
    private int age;

    public Employee(String name, Work work, int age) {
        this.name = name;
        this.work = work;
        this.age = age;
    }
}
