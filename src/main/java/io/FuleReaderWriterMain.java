package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FuleReaderWriterMain {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("src/main/resources/in.txt");
            fw = new FileWriter("src/main/resources/out.txt");
            int i = fr.read();//считали символ h
            System.out.println(i);//104 по ASCII
            System.out.println((char) i);//h
            System.out.println((char) fr.read());//e
            fr.skip(2);//пропустили 2 символа
            fw.write(i);//h в файл запишется 0ew
            fw.append("\n");//записали символ
            fw.write("Java");//записали строку в файл


            //считываем в массив символов
            char [] ar = new char[300];
            int k;
            while ((k=fr.read(ar))>0){
                if (k<300){
                    ar=Arrays.copyOf(ar, k);
                }
                System.out.print(ar);
            }

            //считываем одержимое файла посимвольно (любой размер)
            int c;
            while((c=fr.read())!=-1)
                System.out.print((char)c);//вывели содержимое файла посимвольно (любой размер)

          //записываем массив в файл
            char[] arr = new char[20];
            int n = fr.read(arr);//считали символі в массив
//            fw.write(arr, 0, n);//задали с какого символа писать и кол-во символов
            while (n != -1) {//цикл скопирует файл
                fw.write(arr, 0, n);
                n = fr.read(arr);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null)
                    fr.close();
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
