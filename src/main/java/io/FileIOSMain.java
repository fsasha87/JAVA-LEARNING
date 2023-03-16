package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileIOSMain {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("src/main/resources/in.txt");
             FileOutputStream fos = new FileOutputStream("src/main/resources/out.txt")) {//символы запишутся поверх старых
//             FileOutputStream fos = new FileOutputStream("src/main/resources/out.txt", true)) {//символы запишутся после старых
            fos.write(48);//,записали символ “0” в файл
            byte[] ar = {65, 67, 100};
            fos.write(ar);//записали массив ACd
            String text = "Hello world";
            byte[] buffer = text.getBytes();
            fos.write(buffer, 0, buffer.length);//записали строку в файл
//            fos.write(buffer);
//            fos.write(buffer[0]);//запись первого байта в файл

            System.out.println(fis.available());//покажет кол-во байтов (символов) в файле
            int s = fis.read();
            System.out.println(s + " char=" + (char) s);//48 char=0
            byte[] arr = new byte[3];
            int n = fis.read(arr);
            System.out.println(n);//3
            System.out.println(Arrays.toString(arr));
            int i = -1;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }//считываем каждый байт файла, и выводит посимвольно
//            byte [] array = new byte[fis.available()]; fis.read(array, 0, array.length);
//            for (int j = 0; j < array.length; j++) {
//                System.out.print((char)array[j]);}//2й сп.

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}