package oop.exInheritance;

public class Program {
    public static void main(String[] args) {
        Person tom = new Person("Tom");
        tom.display();
        Employee jack = new Employee("Jack", "Microsoft");
        jack.work();
        jack.display();
        Person sam = new Employee("Sam", "Oracle");//объект подкласса является в то же время объектом суперкласса
        sam.display();//вызовится переопределенный метода подкласса, а не метод суперкласса (динамическая диспетчеризация (поиск) методов)

    }
}
