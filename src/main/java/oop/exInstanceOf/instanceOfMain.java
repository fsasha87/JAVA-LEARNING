package oop.exInstanceOf;

public class instanceOfMain {
    public static void main(String[] args) {
        Animal dog = new Dog();
        System.out.println(dog instanceof Dog);//true
        System.out.println(dog instanceof Animal);//true
        Animal an = new Animal();
        System.out.println(an instanceof Animal);//true
        System.out.println(an instanceof Dog);//false

        Object o = new Dog();
        System.out.println(o instanceof Animal);//true
        System.out.println(o instanceof Dog);//true
        Object animal = new Animal();
        System.out.println(animal instanceof Animal);//true
        System.out.println(animal instanceof Dog);//false
    }

    public static class Animal {

    }
    public static class Dog extends Animal{
    }
}
