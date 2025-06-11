package _Tasks.task2;

public class Book implements Cloneable{
    private String name;
    private Author author;

    public Book(String name, Author author) {
        this.name = name;
        this.author = author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                '}';
    }

//    @Override
//    public Book clone() throws CloneNotSupportedException {
//        return (Book)super.clone();
//    }


    @Override
    public Book clone() throws CloneNotSupportedException {
        Book book = (Book)super.clone();
        book.author = (Author) this.author.clone();
        return book;
    }
}
