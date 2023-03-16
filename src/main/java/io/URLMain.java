package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class URLMain {

    public static void main(String[] args) throws IOException {
        //получаем html-код страницы
        URL url = new URL("https://javarush.ru");//сохранили путь к ресурсу
        try (InputStream is = url.openStream()) {//получили объект типа InputStream
            byte[] buffer = new byte[is.available()];
            is.read(buffer);//
            String str = new String(buffer);
            System.out.println(str);
        }
//сохраняем картинку
        String image = "https://pic.sport.ua/images/news/0/14/0/orig_560081.jpg";
        URL url1 = new URL(image);
        try (InputStream is = url1.openStream()) {
            Path path = Paths.get("D:\\Progs\\Wikipedia.jpg");
            Files.copy(is, path);
        }
//получаем данные по API
        URL url2 = new URL("https://javarush.ru/api/1.0/rest/projects");
        InputStream is = url2.openStream();
        byte[] ar = new byte[is.available()];
        is.read(ar);
        String str = new String(ar);
        System.out.println(str);

        System.out.println("=======================");

//отправляем данные
        URL url3 = new URL("https://javarush.ru");
        URLConnection connection = url3.openConnection();//устанавливаем стабильное двустороннее соединение
        connection.setDoOutput(true);
        try (
                OutputStream os = connection.getOutputStream();//получаем поток для отправки данных
                InputStream is1 = connection.getInputStream()) {//получаем поток для чтения данных
            os.write(1);//отправляем данные серверу
            byte[] ar1 = new byte[is1.available()];
            is1.read(ar1);
            System.out.println(new String(ar1));
        }
    }
}
