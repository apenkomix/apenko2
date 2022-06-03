package Homework_2.Task_2;

public class Task_2 {
    public static void main(String[] args) {
        int a = 1;
        for (int i = 3; i <= 24; i = i + 3) {
            a = a + a;
            System.out.print("за " + i + " часа будет ");
            System.out.println(a + " амеб");
        }
    }
}