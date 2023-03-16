package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileISMain {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/main/resources/Pushkin.txt");//предварительно создали папку и файл в корне
            int code = fis.read();//считываем 1 символ с файла
            System.out.println(code +" char = "+(char)code);//48 char = 0
            byte [] ar = new byte[16];
            int num = fis.read(ar);//возвращает количество считаных символов и передает параметром массив в который символы будут записаны
            System.out.println("num = " + num);
            System.out.println(Arrays.toString(ar));
//            input.close();//wrong
        } catch (FileNotFoundException e) {//обработали на случай отсутсвия файла
            e.printStackTrace();
        } catch (IOException e) {//обработали ошибку ввода/вывода
            e.printStackTrace();
        } finally {
            try {
                if (fis != null){
                fis.close();//закрыть поток независимо с ощибкой или нет
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
