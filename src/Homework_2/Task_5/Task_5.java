package Homework_2.Task_5;

public class Task_5 {
    public static void main(String[] args) {
        double a = 2.54;
        double b = 0;
        for (int i = 1; i <= 20; i++) {
            b = a * i;
            System.out.println(i + " дюймов = " + b + " см");
        }
    }
}

