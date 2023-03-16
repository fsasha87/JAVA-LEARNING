package oop.exIncapsulation;

public class Main {
    public static void main (String [] args){
        Girl kate = new Girl(19);//создали объект с параметром вызвав конструктор
        System.out.println(kate.getAge());//19  получили значение приват-переменной
        kate.setAge(33);//изменили значение приват-переменной
        System.out.println(kate.getAge());//33
        kate.setAge(200);
        System.out.println(kate.getAge());//33
    }
}
