package Homework_4.Task_1;

//+
public class DemoBulldog {
    public static void main(String[] args) {
        Bulldog bulldog = new Bulldog(7, "Jhonny");
        Bulldog bulldog1 = new Bulldog(null, "unknown");//стараемся не называть переменные 1,2.....
        System.out.println(bulldog.show());
        System.out.println(bulldog1.show());
    }
}
