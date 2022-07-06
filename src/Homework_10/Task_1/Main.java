package Homework_10.Task_1;

//+- Кстати, названия пакетов пишутся маленькими буквами (snake_case)
public class Main {
    public static void main(String[] args) {
        Summer<Integer> summer = new Summer<>(22, "class");
        //метод должен быть у класса Summer
        System.out.println(summer.getComment().getClass().getName());
//лишняя строчка
    }
}
