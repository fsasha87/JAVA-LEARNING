package inheritance.casting2;

public class PeMain {
    public static void main (String [] args){
//        People vasia = new Worker("Vasia", "Oscar");//восходящее преобразование (от подкласса внизу к суперклассу вверху иерархии) или upcasting. Такое преобразование осуществляется автоматически.
//        vasia.display();

        People ivan = new Worker("Ivan", "Karat");//объект наследника приведен к типу родителя (с потерей уникальных методов потомка)
// переменной типа иван присваиваем объект класса Воркер
        ivan.display();
        System.out.println(ivan.getName()); //доступ к методам родителя
        Worker wk = (Worker)ivan;//операция преобразования типов - нисходящее преобразование от People к типу Worker
        wk.display();//через объект wk мы можем обратиться к функционалу объекта Worker

        ((Worker)ivan).display();//2й способ
        System.out.println(((Worker)ivan).getCompany());//доступны методы потомка, недоступны методы родителя
        if (ivan instanceof Worker){//проверка является ли переменная ivan объектом типа Worker
            ((Worker)ivan).display();
        } else {
            System.out.println("NOT");
        }

    }

}
