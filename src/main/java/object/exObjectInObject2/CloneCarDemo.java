package object.exObjectInObject2;

public class CloneCarDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car("Грузовик", new Driver("Василий", 45));

        Car clonedCar = car.clone();
        System.out.println(car);
        System.out.println(clonedCar);

        Driver clonedCarDriver = clonedCar.driver;
        clonedCarDriver.name = "Петя";

        System.out.println(car);
        System.out.println(clonedCar);
    }
}