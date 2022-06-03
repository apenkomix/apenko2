package Homework_2.Task_3;

public class Task_3 {
    public static void main(String[] args) {
        //int i = 1;
        int a = 0;
        for (int i = 1; i <= 256; i = i + i) {
            a = a + i;
        }
        System.out.println("сумма =" + a);
    }
}
