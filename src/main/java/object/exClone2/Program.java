package object.exClone2;

public class Program{

    public static void main(String[] args) {

        try{
            Person tom = new Person("Tom", 23);
            System.out.println(tom);//Person{name='Tom', age=23}
            Person bob = tom.clone();
            System.out.println(bob);//Person{name='Tom', age=23}
            bob.setName("Bob");
            System.out.println(bob);//Person{name='Bob', age=23}
        }
        catch(CloneNotSupportedException ex){

            System.out.println("Clonable not implemented");
        }

    }
}
