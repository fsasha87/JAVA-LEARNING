package _Tasks.task2;

public class Journal implements Printable{
    private String name;

    public Journal(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Print: " + name);
    }
}
