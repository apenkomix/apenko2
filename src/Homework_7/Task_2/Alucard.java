package Homework_7.Task_2;

//+
public class Alucard {
    public static void main(String[] args) {
        String alucard = "alucard";
        //Тут он ещё не реверс, а просто массив из строки
        char[] reversArray = alucard.toCharArray();
        for (int i = reversArray.length - 1; i >= 0; i--) {
            //Идея хороша, но значение никуда не сохраняется
            //Можно использовать String.at() и закидывать в пустой reversArray, потом из него сделать строку
            System.out.print(reversArray[i]);
        }
    }
}
