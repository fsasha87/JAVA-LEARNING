package common.exConstructor;

public class ManMain {
    public static void main(String[] args) {

        Man bob = new Man();      // вызов первого конструктора без параметров
        bob.displayInfo();//Name: Bob 	Age: 12

        Man tom = new Man("Tom"); // вызов второго конструктора с одним параметром
        tom.displayInfo();//Name: Tom 	Age: 18
        System.out.println(tom.weight);//80

        Man sam = new Man("Sam", 25); // вызов третьего конструктора с двумя параметрами
        sam.displayInfo();//Name: Sam 	Age: 25
        System.out.println(sam.weight);//80
        System.out.println(Man.height);//180
        System.out.println(sam.height);//180
    }
}
