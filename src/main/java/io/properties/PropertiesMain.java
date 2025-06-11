package io.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesMain {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.setProperty("one", "1");//создали проперти(свойство: ключ-значение)
        System.out.println(prop.getProperty("one"));//1

        //сохраняем пропертис в файл
//        FileOutputStream fos = new FileOutputStream("my.properties");
//        prop.store(fos, "My comments");

        //сохраняем с файла в пропертис
//        one=1
//        two=2
//        max=100
        FileInputStream fis = new FileInputStream("src/main/resources/my.properties");
        prop.load(fis);//загружаем с файла пропертис
        System.out.println(prop.getProperty("max"));//100
        System.out.println(prop.getProperty("bla", "default value"));//default value так как не нашло
        System.out.println(prop.getProperty("two", "default value"));//2
        System.out.println(prop.getProperty("1"));//null

//        name=Sasha
//        surname=Ivanow
//        age=15
        FileInputStream fis2 = new FileInputStream("my2.properties");
        prop.load(fis2);
        System.out.println(prop.getProperty("name"));//Sasha
        System.out.println(prop.getProperty("one"));//1
        System.out.println(prop.getProperty("bla"));//null
        System.out.println(prop.getProperty("smth", "default"));//default
    }
}
