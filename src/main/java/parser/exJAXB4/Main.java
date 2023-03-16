package parser.exJAXB4;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

//import javax.xml.bind.JAXBContext;
//import javax.xml.bind.JAXBException;
//import javax.xml.bind.Marshaller;
//import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main {
    public static void main(String[] args) throws JAXBException {

        Student student = new Student(1, "Nikola", 21, "Java","somepass");

        JAXBContext context = JAXBContext.newInstance(Student.class);//обеспечивает точку входа клиента в JAXB API
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        // маршаллинг объекта в файл
        marshaller.marshal(student, new File("src/main/java/parser/exJAXB4/students.xml"));

//<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
//<student id="1">
//    <name>Nikola</name>
//    <age>21</age>
//    <lang>Java</lang>
//</student>

        Unmarshaller unmarshaller = context.createUnmarshaller();
        Student student2 = (Student) unmarshaller.unmarshal(new File("src/main/java/parser/exJAXB4/students.xml"));
        System.out.println(student2);//Student{id=1, age=21, name='Nikola', language='Java', studPassword='null'}

    }
}
