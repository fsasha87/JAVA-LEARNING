package treads.exSynchron1;

public class SynchronizeMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.name);
        new Thread(()->{
          synchronized (dog){
              dog.name = "Boss";
          }
            System.out.println(dog.name+"1");
        } );
        System.out.println(dog.name+"2");
    }
}

class Dog{
    String name = "Murka";
}
