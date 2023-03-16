package parser.exGson;

import com.google.gson.annotations.Expose;

public class Car {
    public String brand;
    public int doors;
    public transient String kuzov;
//    @Expose(serialize = false, deserialize = false)
//    public transient String kuzov;

    Car(){}

    public Car(String brand, int doors, String kuzov) {
        this.brand = brand;
        this.doors = doors;
        this.kuzov = kuzov;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", doors=" + doors +
                ", kuzov='" + kuzov + '\'' +
                '}';
    }
}
