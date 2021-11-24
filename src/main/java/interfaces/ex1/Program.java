package interfaces.ex1;

public class Program {
    public static void main (String [] args){
        Book book1 = new Book("Ledokol", "Suvorov");
        book1.print();
        book1.check();
        Printable.read();
        System.out.println(book1.author);
        Journal journal = new Journal("Viva");
        journal.print();
        System.out.println(journal.getName());
        Printable p1 = new Book("Kolesa", "Heighli");//переменная типа Printable может хранить ссылку на объект типа Journal
        p1.print();
        p1 = new Journal("Police");
        p1.print();

        System.out.println(((Journal)p1).getName());//преобразовываем тип для доступа к методам класса-реализатора интерфейсов

    }
}
