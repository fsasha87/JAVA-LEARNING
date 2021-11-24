package inner_class;

public class BicycleMain {
    public static void main (String [] args){
        Bicycle peugeot = new Bicycle();
        peugeot.start();//вызвали метод внешнего класса
        Bicycle.Wheel wheel = peugeot.new Wheel();
        wheel.turnRight();
        peugeot.wheel.turnRight();//вызвали метод внутренего класса черезобъект внешнего
        Bicycle.Seat seat = peugeot.new Seat();//2й способ создания объекта внутренего класса
        seat.seatUp();

    }
}
