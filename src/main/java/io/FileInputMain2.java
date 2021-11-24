package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileInputMain2 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("data/out2.txt")) {
            System.out.println(fis.available());//покажет кол-во байтов(символов) в файле
//            int i = -1;
//            while ((i=fis.read())!=-1){//цикл считывает каждый байт файла, и выведет все преобразовав их в символы
//                System.out.print((char)i);}
            byte [] buffer = new byte[fis.available()];
            fis.read(buffer, 0, buffer.length);
            for (int i = 0; i < buffer.length; i++) {
                System.out.print((char)buffer[i]);//вывели посимвольно
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
