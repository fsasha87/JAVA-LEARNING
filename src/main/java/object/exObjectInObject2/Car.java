package object.exObjectInObject2;

public class Car implements Cloneable {
    public String name;
    public Driver driver;

    public Car(String name, Driver driver) {
        this.name = name;
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", driver=" + driver +
                '}';
    }
//        @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

        @Override
    public Car clone() throws CloneNotSupportedException {
            Car newCar = (Car) super.clone();
            newCar.driver = (Driver) driver.clone();//важно!
        return newCar;
    }
}