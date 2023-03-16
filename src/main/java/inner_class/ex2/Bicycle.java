package inner_class.ex2;

public class Bicycle {
    public void start (){
        System.out.println("Поехали");
    }
    class Wheel {
        public void turnRight (){
            System.out.println("Turn right");
        }
    }
    Wheel wheel = new Wheel();//создали объект внутреннего класса во внешнем класе
    public class Seat {
        void seatUp (){
            System.out.println("Seat up!");
        }
    }
}
