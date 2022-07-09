package Homework_9.Task_3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

//+-
public class Main {
    public static void main(String[] args) throws Exception {
        //Да, тут тоже вынести в переменную путь к файлу
        FileReader fr = new FileReader("src/Homework_9/Task_2/repeatedText.txt");
        //Вариант, но на занятии проходили BufferedReader - с ним так же работать 
        Scanner scan = new Scanner(fr);
        int i = 1;
        while (scan.hasNextLine()) {
            System.out.print(i + ":" + scan.nextLine());
            i++;
        }
        //Он может быть null, если файла нет, например. Нужно добавить проверку на null и в блок файналли или трай с ресурсами использовать
        fr.close();
    }
}
