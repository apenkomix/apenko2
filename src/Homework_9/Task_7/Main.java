package Homework_9.Task_7;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

// Хорошо, что погуглил) после занятия 13 ты будешь больше понимать, что тут происходит ;)
public class Main {
    public static void main(String[] args) {
        try (Stream<Path> paths = Files.walk(Paths.get("src"))) {
            paths
                    .filter(Files::isRegularFile)
                    .forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



