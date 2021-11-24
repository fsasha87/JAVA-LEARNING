package clone.ex3;

public class Main {
    public static void main (String [] args) throws CloneNotSupportedException {
            Book book = new Book("War and Peace", "Leo Tolstoy");
            Book book2 = book.clone();
            System.out.println(book.getAuthor());//Leo Tolstoy
            System.out.println(book2.getAuthor());//Leo Tolstoy
            book2.setAuthor("Ivan Turgenev");
            System.out.println(book.getAuthor());//Leo Tolstoy
            System.out.println(book2.getAuthor());//Ivan Turgenev
        System.out.println(4%2==0);
    }
}
