package inner_class;

public class Bicycle {
//    private String model;
//    private int weight;
//    Bicycle (String model, int weight){
//        this.model=model;
//        this.weight = weight;
//    }
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
