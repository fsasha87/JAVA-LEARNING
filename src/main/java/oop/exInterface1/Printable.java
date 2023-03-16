package oop.exInterface1;

public interface Printable {
    void print ();
    default void check (){
        System.out.println("Checked");
    }
    static void read (){
        System.out.println("I read");
    }
}
