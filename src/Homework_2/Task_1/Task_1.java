package Homework_2.Task_1;

//+- В задаче указано вывести сколько пробежит спортсмен за все 7 дней
public class Task_1 {
    public static void main(String[] args) {
        double a = 10;
        for (int i = 1; i <= 7; i = i + 1) {
            System.out.println(i + "day he run" + a + "km");
            a = a * 1.1;
        }
    }
}
