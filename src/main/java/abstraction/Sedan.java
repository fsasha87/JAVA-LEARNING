package abstraction;

public class Sedan extends Car {

    Sedan(String color) {
        super(color);
    }


    @Override
    public void brake() {
        System.out.println("Тормозим");
    }

}
