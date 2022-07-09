package Homework_7.Task_5;

//+
public class Main {
    public static void main(String[] args) {
        String strArray = "well,good,bad, will, Wood, bear";
        String[] array = strArray.split("\\W"); //клёвый сплит, его же можно было использовать в задании 4
        for (String s : array) {
            if (s.toLowerCase().startsWith("w")) {
                System.out.println(s);
            }
        }
    }
}
