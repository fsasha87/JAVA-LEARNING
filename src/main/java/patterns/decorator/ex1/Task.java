package patterns.decorator.ex1;

public class Task {
    public static void main(String[] args) {
        Developer dev = new JavaDeveloper();
        System.out.println(dev.makeJob());
        Developer dev2 = new SeniorJavaDeveloper(new JavaDeveloper());
        System.out.println(dev2.makeJob());
    }
}
