package Homework_2.Task_4;

//+-
public class Task_4 {
    public static void main(String[] args) {
        int a = 7;
        int b = 7;
        int c = 0; //название переменной должно быть более значащим (например, result)

        for (int i = 1; i <= b; i++) {
            c = c + a;
        }
        System.out.println(a + " * " + b + " = " + c);
    }
}



