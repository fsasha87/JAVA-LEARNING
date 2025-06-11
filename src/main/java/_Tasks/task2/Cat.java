package _Tasks.task2;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void say() {
//        super.say();
        System.out.println("I am a cat");
    }

    public void run(){
        System.out.println("Cat is running");
    }

}
