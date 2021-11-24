package abstraction;

public class CarMain {
    public static void main (String [] args){
        Sedan sedan = new Sedan("red");
        sedan.gas();
        sedan.brake();
    }
}
