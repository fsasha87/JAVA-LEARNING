package classes;

public class Cat {
    String name;
    int age;
    static String sex = "Woman";
    public void sayMew () {
        System.out.println("Mew!");
    }
    public static void jump () {
        System.out.println("Jump-jump");
    }


    public static void main (String [] args){
        Cat murka = new Cat();
        murka.age = 13;
        murka.name = "Murka";
//        System.out.println(Cat.sex);

        Cat barsik = new Cat();
//        System.out.println(Cat.sex);

        murka.sayMew();
        barsik.sayMew();
        murka.jump();
        Cat.jump();
        jump();



    }

}