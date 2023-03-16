package object.exClone2;

public class Person implements Cloneable{
    private String name;
    private int age;

    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person clone() throws CloneNotSupportedException{

        return (Person) super.clone();
    }
}
