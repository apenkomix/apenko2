package Homework_4.Task_2;

// Так что будет выведено?) И нужно подумать почему. И не совсем верно переписано (со строки 7)
public class ExecutionQueue {
    private static String msg = "statik block";

    public ExecutionQueue() {
        msg = "regular init block";
        msg = "constructor value";
    }

    public static void main(String[] args) {
        ExecutionQueue executionQueue = new ExecutionQueue();
        System.out.println(msg);
    }
}


