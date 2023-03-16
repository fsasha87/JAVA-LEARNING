package patterns.wrapper.ex1;

public class CatMain {
    public static void main(String[] args) {
        Cat cat = new Cat("Васька");
        Cat catWrapper = new CatWrapper(cat);
        printName(catWrapper);//Кот по имени Васька
        System.out.println(cat.getName());//Васька
        System.out.println(catWrapper.getName());//Кот по имени Васька

    }

    public static void printName (Cat named){
        System.out.println(named.getName());
    }
}
