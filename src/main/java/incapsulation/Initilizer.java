package incapsulation;

public class Initilizer {
    public static void main(String[] args) {
        Person1 kate = new Person1("Kate", 32);
        kate.displayInfo();
    }
}

class Person1 {
    String name;
    int age;

    Person1(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void displayInfo(){
        System.out.printf("Name: %s \t Age: %d \n", name, age);
    }
}
