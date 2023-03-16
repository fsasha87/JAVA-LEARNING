package common.enums.ex2;

public class Book {
    String name;
    Typ typ;//добавили перечисления в конструктор
    String author;
    Book (String name, String author, Typ typ){
        this.name=name;
        this.author=author;
        this.typ=typ;
    }
}

