package object.exObjectInObject;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Book book = new Book("War and Peace", "Leo Tolstoy");
        System.out.println(book);//Book{name='War and Peace', author=Author{name='Leo Tolstoy'}}
        Book book2 = book.clone();
        System.out.println(book2);//Book{name='War and Peace', author=Author{name='Leo Tolstoy'}}
        book2.setAuthor("Ivan Turgenev");
        book2.setName("Some book");
        System.out.println(book);//Book{name='War and Peace', author=Author{name='Leo Tolstoy'}}
        System.out.println(book2);//Book{name='Some book', author=Author{name='Ivan Turgenev'}}
    }
}
