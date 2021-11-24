package clone.ex1;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
//        Car car = new Car("Green");
        Person person=new Person(25,"Mike");

        Person clone = (Person) person.clone();
        System.out.println(person);
        System.out.println(clone);
        clone.name=new String("Ivan");
//        clone.car.color="red";

        System.out.println(clone);
        System.out.println(person);
    }
}

