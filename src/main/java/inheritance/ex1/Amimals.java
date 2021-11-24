package inheritance.ex1;

public class Amimals {
    String name;
    Amimals (String name){
        this.name = name;
    }
    public void say(){
        System.out.println("Голос"+name);
    }
    public void move() {
        System.out.println("move " + name);
    }
}
