package generics.ex2;

public class PrinterMain {
    public static void main(String[] args) {

        Printer printer = new Printer();
        String name = "Tom";
        printer.<String>print(name);//Tom
        printer.print(name);//Tom
        Integer text = 10;
        printer.<Integer>print(text);//10
        Float count = 2.2f;
        printer.<Float>print(count);//2.2
        Character letter = 'A';
        printer.<Character>print(letter);//A
        Man man = new Man("Igor", 14);
        printer.print(man);//Man{name='Igor', age=14}
        printer.<Man>print(man);//Man{name='Igor', age=14}

    }
}
