package common.exStatic;

public class Cat {
    String name;
    int age;
    static String sex = "Woman";

    public void sayMew() {
        System.out.println("Mew!");
    }

    public static void jump() {
        System.out.println("Jump-jump");
    }


    public static void main(String[] args) {
        Cat murka = new Cat();
        murka.age = 13;
        murka.name = "Murka";
        System.out.println(Cat.sex);//Woman
        System.out.println(murka.sex);//Woman

        Cat barsik = new Cat();
        System.out.println(Cat.sex);//Woman

        murka.sayMew();//Mew!
        barsik.sayMew();//Mew!
        Cat.jump();//Jump-jump
        murka.jump();//Jump-jump
        jump();//Jump-jump


    }

}