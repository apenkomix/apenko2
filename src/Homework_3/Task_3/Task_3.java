package Homework_3.Task_3;

public class Task_3 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                array[i] = 0;
            }
            System.out.println(array[i]);
        }
    }
}
