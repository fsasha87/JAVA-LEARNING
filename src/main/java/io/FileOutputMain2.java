package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputMain2 {
    public static void main(String[] args) {
        String text = "Hello world";
        try (FileOutputStream fos = new FileOutputStream("data/out2.txt")) {
            byte [] buffer = text.getBytes();
//            fos.write(buffer, 0, buffer.length);
            fos.write(buffer[0]);//запись первого байта
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
