package Homework_5.Task_2;

import javax.xml.namespace.QName;

//+- Не хватает метода next() и getArray()
public class Warehouse {
    //"сделать класс Warehouse, внутри которого массив"
    private final String name;

    //"При создании объекта создается массив, заносятся в него данные, изменять или добавлять значения в массив после  этого  нельзя"
    //Немного кривая формулировка, но смысл в том, что в конструктор передаем уже заполненный массив
    public Warehouse(String name) {
        this.name = name;
    }
    //конструктор без параметров не нужен - мы хотим хранить массив в любом случае
    public Warehouse() {
        this("Uncknown");
    }
    //main не пишем вутри класса, создаем отдельный класс без полей с main - я иногда пишу так на занятиях для удобства, но вообще так не пишем
    public static void main(String[] args) {
        Warehouse[] warehouse = new Warehouse[4];
        warehouse[0] = new Warehouse("Books");
        warehouse[1] = new Warehouse("Hats");
        warehouse[2] = new Warehouse("Shoes");
        warehouse[3] = new Warehouse("Computers");

        for (int i = 0; i < warehouse.length; i++) {
            System.out.println(warehouse[i].name);
        }
    }
}

