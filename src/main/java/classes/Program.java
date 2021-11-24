package classes;

public class Program {
    public static void main(String[] args) {

        Person tom = new Person();
        tom.name = "Oleg";
        tom.age = 18;
        tom.displayInfo();
    }
}
class Person{

    String name;    // имя
    int age;        // возраст
    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}
