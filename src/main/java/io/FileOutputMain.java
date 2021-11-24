package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputMain {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("data/out.txt");//символы запишутся в файл поверх старых
//            FileOutputStream output = new FileOutputStream("data/out.txt", true);//символы запишутся после старых
            fos.write(48);
            byte [] value = {65, 67,100};
            fos.write(value);//дописали массив в файл
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
