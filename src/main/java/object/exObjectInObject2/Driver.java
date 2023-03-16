package object.exObjectInObject2;

public class Driver implements Cloneable {
    public String name;
    public int age;

    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public Driver clone() throws CloneNotSupportedException {
        return (Driver) super.clone();
    }
}