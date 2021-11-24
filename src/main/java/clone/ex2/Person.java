package clone.ex2;

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
    void display(){
        System.out.printf("Person %s \n", name);
    }

    public Person clone() throws CloneNotSupportedException{

        return (Person) super.clone();
    }
}
