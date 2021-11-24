package clone.ex1;

public class Person implements Cloneable{
    String name;
    int age;
//    Car car;
    Person(int age, String name) {
//        this.car = car;
        this.age = age;
        this.name = name;
    }

//    @Override
//    public String toString() {
//        return this.name+" age=" + age;
//    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
