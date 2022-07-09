package Homework_8.Task_3;

import java.nio.channels.ScatteringByteChannel;
import java.util.InputMismatchException;
import java.util.Scanner;

//+
public class Main {
    public static void main(String[] args) {
        int maxLength = 20;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Type array length");
                int arraySize = scanner.nextInt();
                if (arraySize > maxLength || arraySize < 0) {
                    throw new SizeLimitException();
                }
                Integer[] array = new Integer[arraySize];
                break;
            } catch (SizeLimitException e) {
                //Тут тоже стоит использовать значение переменной maxLength - избегаем "магических цифр"
                System.out.println("Max length 20");
            } catch (InputMismatchException exception){
                System.out.println("Type number pls");
                //Если тут сделать брейк, пользователь не сможет ещё раз попробовать ввести значение
                break;
            }
        }
    }
}

