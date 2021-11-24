package classes;

public class ManMain {
    public static void main(String[] args) {

        Man bob = new Man();      // вызов первого конструктора без параметров
        bob.displayInfo();

        Man tom = new Man("Tom"); // вызов второго конструктора с одним параметром
        tom.displayInfo();

        Man sam = new Man("Sam", 25); // вызов третьего конструктора с двумя параметрами
        sam.displayInfo();
    }
}
