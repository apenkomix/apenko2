package Homework_10.Task_1;

//+-
//код не отформатирован
//но много из изученного использовано, молодец)
public class Summer <T> {
    private T day;
    private String comment;

    public <D> Summer(T day, D comment) {
        this.day = day;
        this.comment = comment.toString();
    }

    public T getDay() {
        return day;
    }

    public String getComment() {
        return comment;
    }
    //Не хватает метода который бы выводил что это за тип на экран (например, printType - в твоем случае можно вывести 2, так что даже printTypes)
}
