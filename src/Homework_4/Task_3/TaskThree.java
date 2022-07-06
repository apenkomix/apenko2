package Homework_4.Task_3;

import Homework_4.Task_1.Bulldog;

//+
public class TaskThree {
    public static void main(String[] args) {
        Bulldog[] bulldogList = new Bulldog[7];
        bulldogList[0] = new Bulldog(15, "Sharik");
        bulldogList[1] = new Bulldog(9, "Tuzik");
        bulldogList[2] = new Bulldog(13, "Kuzia");
        bulldogList[3] = new Bulldog(14, "Sam");
        bulldogList[4] = new Bulldog(3, "Pug");
        bulldogList[5] = new Bulldog(8, "Richy");
        bulldogList[6] = new Bulldog(18, "Leo");
        boolean[] excludes = new boolean[7];  //размер массива берем через .length, чтобы не менять тут число при добавлении\удалении элементов

        //размер массива берем через .length, чтобы не менять тут число при добавлении\удалении элементов
        for (int i = 0; i < 7; i++) {
            if (excludes[i]) {
                continue;
            }
            int sum = 0;
            sum = 1;
            //тут тоже length
            for (int j = i + 1; j < 7; j++) {
                if (bulldogList[i].equals(bulldogList[j])) {
                    sum += 1;
                    excludes[j] = true;
                }
            }
            if (sum > 1) {
                System.out.println(bulldogList[i].show() + " is repeated " + sum + " times");
            }
        }
    }
}
