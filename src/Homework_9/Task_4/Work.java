package Homework_9.Task_4;

import java.io.Serializable;

//+ Только не хватает private static final long serialVersionUID, чтобы (де)сериализация не ломалась при изменении класса
public class Work implements Serializable {
    private String name;
    private int experience;

    public Work(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }
}
