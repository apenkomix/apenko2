package Homework_6.Task_2;

//+ Код не отформатирован
public class Engine {
    private boolean on = false;

    public boolean engineOn() {
        return on;
    }

    public void startEngine() {
        if (!on) {
            System.out.println("Engine started");
        }
        //можно использовать if (on) {..} else {...}
        if (on = true) {
            System.out.println("Engine already started");
        }
    }

    public void stopEngine() {
        if (!on) {
            System.out.println("Engine already off");
        }
        //можно использовать if (on) {..} else {...}
        on = false;
        }
    }

//лишняя пустая строчка
