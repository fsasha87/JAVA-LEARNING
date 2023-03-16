package parser.exJAXB2;

//import javax.xml.bind.JAXBContext;
//import javax.xml.bind.JAXBException;
//import javax.xml.bind.Marshaller;
//import javax.xml.bind.Unmarshaller;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Date;

public class BookMain {
    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        Book book = new Book();
        book.setId(1L);
        book.setName("Book1");
        book.setAuthor("Author1");
        book.setDate(new Date());

        JAXBContext context = JAXBContext.newInstance(Book.class);//обеспечивает точку входа клиента в JAXB API
        Marshaller mar= context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar.marshal(book, new File("src/main/java/parser/exJAXB2/book.xml"));

//десереализация
        JAXBContext context2 = JAXBContext.newInstance(Book.class);
        Unmarshaller unmarshaller = context2.createUnmarshaller();
        Book book2 = (Book) unmarshaller.unmarshal(new FileReader("src/main/java/parser/exJAXB2/book.xml"));
        System.out.println(book2);

    }
}

//<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
//<book id="1" date="2023-02-07T13:00:45.567+02:00">
//<title>Book1</title>
//</book>
