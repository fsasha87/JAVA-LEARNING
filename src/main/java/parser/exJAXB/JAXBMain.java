package parser.exJAXB;

//import javax.xml.bind.JAXBContext;
//import javax.xml.bind.JAXBException;
//import javax.xml.bind.Marshaller;
//import javax.xml.bind.Unmarshaller;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.StringReader;
import java.io.StringWriter;

public class JAXBMain {
    public static void main(String[] args) throws JAXBException
    {
        //создание объекта для сериализации в XML
//        Cat cat = new Cat();
//        cat.name = "Murka";
//        cat.age = 5;
//        cat.weight = 4;

        Cat cat = new Cat("Burka", 3, 2);

        //писать результат сериализации будем в Writer(StringWriter)
        StringWriter writer = new StringWriter();

        //создание объекта Marshaller, который выполняет сериализацию
        JAXBContext context = JAXBContext.newInstance(Cat.class);//создаем «контекст» (аналог ObjectMapper)
        Marshaller marshaller = context.createMarshaller();//создаем объект Marshaller для сериализации
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);//текст с переносами слов и пробелами

        marshaller.marshal(cat, writer);// сама сериализация

        //преобразовываем в строку все записанное в StringWriter
        String result = writer.toString();
        System.out.println(result);

        //десерелизация
        String xmldata = "<cat><name>Murka</name><age>5</age><weight>4</weight></cat>";//строка хранит xml для десериализации
        StringReader reader = new StringReader(xmldata);//оборачиваем xml-строку в StringReader

        JAXBContext context2 = JAXBContext.newInstance(Cat.class);//создаем JAXB-контекст
        Unmarshaller unmarshaller = context2.createUnmarshaller();//создаем объект Unmarshaller для десериализации

        Cat cat2 = (Cat) unmarshaller.unmarshal(reader);//десериализуем xml из объекта reader и получаем объект cat типа Cat.
        System.out.println(cat2);//Cat{name='Murka', age=5, weight=4}
    }


}


//<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
//<cat>
//<name>Murka</name>
//<age>5</age>
//<weight>4</weight>
//</cat>
