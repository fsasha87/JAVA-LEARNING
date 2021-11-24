package inheritance.ex1;

public class Cat extends Amimals{
    Cat (String name){
        super(name);
    }
    @Override
    public void say() {
        System.out.print("Мяу"+name);
        super.say();

    }
    public void run() {
        System.out.println("Беги "+name);
    }
}
