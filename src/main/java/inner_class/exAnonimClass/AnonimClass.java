package inner_class.exAnonimClass;

public class AnonimClass {
    public static void main(String[] args) {
        AbleToEat ableToEat = new AbleToEat() {//создали аннонимный/безыменный класс (и его объект со ссылкой интерфейса) для одноразовой реализации метода интерфейса
            @Override
            public void eat() {
                System.out.println("eating...");
            }
        };
        ableToEat.eat();
    }
}

//тоже самое
//    public static void main(String[] args) {
//        AbleToEat ableToEat = new Animal();
//        ableToEat.eat();
//    }
//}
//
//class Animal implements AbleToEat {
//    @Override
//    public void eat() {
//        System.out.println("Eating");
//    }
//}
