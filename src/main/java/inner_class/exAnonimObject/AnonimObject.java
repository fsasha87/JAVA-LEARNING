package inner_class.exAnonimObject;

public class AnonimObject {
    public static void main(String[] args) {
        new Student().say();

    }
}
class Student {
    public void say() {
        System.out.println("I am student");
    }
}
