package Homework_7.Task_7;

import java.util.Arrays;

//+- Идея интересная, но машинки можно было положить в объекты класса Car
public class Main {
    public static void main(String[] args) {
        String carsEngins = "Audi 1.8,WV 1.4, BMW 1.8, OPEL 1.4,";
        String array[] = carsEngins.split(",");
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i].endsWith("1.4")) { //не будет работать, если в конце строки будет 11.4, например
                array[i] = array[i].replace("1.4", "2.0T");
            }
            if (array[i].endsWith("1.8")) {
                array[i] = array[i].replace("1.8", "1.8T");
            }
            System.out.println(array[i]);
        }
    }
}
