package generics;

public class PrinterMain {
    public static void main(String[] args) {

        Printer printer = new Printer();
        String name = "Tom";
        printer.<String>print(name);
    }
}
