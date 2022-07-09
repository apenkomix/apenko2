package Homework_7.Task_6;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

//+ Красивое
public class Main {
    public static void main(String[] args) {
//Лишние пустые строчки

        String string = "";

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        long startTime = System.currentTimeMillis();
        //Только количество итераций лучше закинуть в переменную, чтобы везде было точно 
        //одинаковое и при изменении значения было  достаточно изменить в одном месте 
        for (int i = 0; i < 400_000; i++) {
            string += "A";
        }
        long endTime = System.currentTimeMillis();

        LocalDateTime date =
                Instant.ofEpochMilli(endTime - startTime)
                        .atZone(ZoneId.of("UTC"))
                        .toLocalDateTime();

        System.out.println("String " + dateTimeFormatter.format(date));
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 400_000; i++) {
            sb.append("A");
        }
        endTime = System.currentTimeMillis();
        date =
                Instant.ofEpochMilli(endTime - startTime)
                        .atZone(ZoneId.of("UTC"))
                        .toLocalDateTime();
        System.out.println("StringBuilder " + dateTimeFormatter.format(date));

        startTime = System.currentTimeMillis();
        StringBuffer sbb = new StringBuffer();
        for (int i = 0; i < 400_000; i++) {
            sb.append("A");
        }
        endTime = System.currentTimeMillis();
        date =
                Instant.ofEpochMilli(endTime - startTime)
                        .atZone(ZoneId.of("UTC"))
                        .toLocalDateTime();
        System.out.println("StringBuffer " + dateTimeFormatter.format(date));
    }
}

