package oop.exCasting1;

public class Main {
    public static void main(String[] args) {
        Amimals an1 = new Amimals(" XXX");//доступны sayAn, moveAn
        Cat an2 = new Cat(" Barsik");//доступны sayCat runcat moveAn
        Amimals an3 = new Cat(" Murka");//sayCat,moveAn
        an1.say();//доступны say, move
        an1.move();
        an2.say();//доступны say run move
        an2.move();
        an2.run();
        an3.say();//доступны say move
        an3.move();
        ((Cat) an3).move();
        if (an3 instanceof Cat) {
            ((Cat) an3).say();
        } else {
            System.out.println("NOT");
        }

        ((Cat) an3).say();
        ((Cat) an3).run();
        Cat an4 = (Cat) an3;
        an4.run();
        an4.say();
        an4.move();
    }
}
