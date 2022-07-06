package Homework_10.Task_2;

//+-
//В енаме лучше хранить разные стратегии переименования (нижний, верхний регистр, первая большая и маленькие) и переопределить у них метод, который будет преобразовыввать строку
//Класс, который будет искать все файлы в дериктории переименовывать, основываясь на стратегии, которую передали, должен быть отдельно (класс и внутри паблик метод, который принимает путь к папке и стратегию) 
public enum Direct {
    FILES("files");
    private String name;

    Direct(String name) {
        this.name = name;
    }
    public void LC() {
        System.out.println(name.toLowerCase());
    }
    public void Caps(){
        System.out.println(name.toUpperCase());
    }
    public void  FirstLetter(){
        System.out.println(name.substring(0,1).toUpperCase() + name.substring(1));
    }
}
