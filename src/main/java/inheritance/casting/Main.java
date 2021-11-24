package inheritance.casting;

public class Main {
    public static void main (String args []){

        //upcasting - восходящее (неявное) преобразование
    Animal an2 = new Dog();//переменной типа an2 присваиваем объект класса Dog

    an2.eat();//объект наследника приведен к типу родителя (с потерей уникальных методов наследника)
        //2й способ: делаем из наследника родителя
        Dog dog2 = new Dog();
    Animal an3 = dog2;
    an3.eat();
        //downcasting - нисходящее (явное) преобразование
    Dog dog3 = (Dog)an2; //объект родителя приведен к типу наследника обратно (доступны методы потомка, недоступны методы родителя)
        dog3.sayWuf();
        dog3.eat();
        //2й способ
        ((Dog)an2).sayWuf();
        ((Dog)an2).eat();
        if (an2 instanceof Dog){//проверка является ли переменная an2 объектом типа Dog
            ((Dog)an2).sayWuf();
        }
        else {
            System.out.println("NOT");
        }
    }
}
