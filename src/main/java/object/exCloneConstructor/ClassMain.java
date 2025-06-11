package object.exCloneConstructor;

public class ClassMain {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        ClassA classB = new ClassA(classA);
        System.out.println(classA);//ClassA{field1=100, field2='Hello'}
        System.out.println(classB);//ClassA{field1=100, field2='Hello'}
    }
}
