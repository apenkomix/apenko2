package Homework_3.Task_2;

public class Task_2 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int sum = 0;
        int average = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = sum / array.length;
        System.out.println("The average of array is " + average);
    }
}

