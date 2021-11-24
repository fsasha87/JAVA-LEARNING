package clone.ex2;

public class Program{

    public static void main(String[] args) {

        try{
            Person tom = new Person("Tom", 23);
            Person bob = tom.clone();
            bob.setName("Bob");
            tom.display();      // Person Tom
        }
        catch(CloneNotSupportedException ex){

            System.out.println("Clonable not implemented");
        }

    }
}
