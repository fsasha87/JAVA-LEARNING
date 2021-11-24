package inheritance.ex2;

public class Person {
    private String name;
    public String getName(){
        return this.name;
    }
    public Person (String name) {
        this.name=name;
    }
    public void display(){
        System.out.println("Name: "+name);
    }
}
