package parser.exJackson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Collections;

public class CatJsonMain {
    public static void main(String[] args) throws IOException {
        //создание объекта для сериализации в JSON
        Cat cat = new Cat();
        cat.name = "Murka";
        cat.age = 5;
        cat.weight = 4;

        //писать результат сериализации будем во Writer(StringWriter)
        StringWriter writer = new StringWriter();

        //это объект Jackson, который выполняет сериализацию
        ObjectMapper mapper = new ObjectMapper();

        // сама сериализация: 1-куда, 2-что
        mapper.writeValue(writer, cat);
        mapper.writeValue(new File("src/main/java/parser/exJackson/cat.json"), cat);

        //преобразовываем все записанное во StringWriter в строку
        String result = writer.toString();
        System.out.println(result);//{"name":"Murka","age":5}


        String jsonString = "{\"name\":\"Durka\",\"age\":2,\"weight\":14}";
        StringReader reader = new StringReader(jsonString);

//        ObjectMapper mapper = new ObjectMapper();

        Cat cat2 = mapper.readValue(reader, Cat.class);//создает Java-объект
//        Cat cat2 = mapper.readValue(new File("src/main/java/parser/exJackson/cat.json"), Cat.class);//создает Java-объект
        System.out.println(cat2);//Cat{name='Durka', age=2, weight=0}
    }
}
