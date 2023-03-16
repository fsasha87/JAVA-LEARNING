package object.exClone1;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person=new Person(25,"Mike");

        Person clone = (Person) person.clone();
        System.out.println(person);//Person{name='Mike', age=25}
        System.out.println(clone);//Person{name='Mike', age=25}
        clone.name="Ivan";
        System.out.println(clone);//Person{name='Ivan', age=25}
        System.out.println(person);//Person{name='Mike', age=25}
    }
}

