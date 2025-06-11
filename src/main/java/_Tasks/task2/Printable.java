package _Tasks.task2;

public interface Printable {
    int SIGNAL = 5;
    void print();
    default void check(){
        System.out.println("checked");
    }
    static void read(){
        System.out.println("read");
    }
}
