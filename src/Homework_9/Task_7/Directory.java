package Homework_9.Task_7;

import java.io.File;

public class Directory {
    public static void main(String[] args) {
       final File folder = new File("src");
        for (File file : folder.listFiles()) {
            System.out.println(file.getName());
        }
    }
}