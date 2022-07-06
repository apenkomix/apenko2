package Homework_5.Task_3;

//+- Тут лучше использовать абстрактый класс, ведь он может хранить состояние (иметь заполненные значениями поля) Тогда в классы-дети автоматом унаследуют и поля, и методы
public interface HouseMain {
    int getFloresNumber();

    int getResidentsNumber();

    boolean turnOnTheHeating();
}

