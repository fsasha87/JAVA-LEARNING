package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
//потоки символьные для считывания информации
public class ReaderWriterMain {
    public static void main(String[] args) {
//        FileReader reader = null;
        try (FileReader fr = new FileReader("data/info.txt");
             FileWriter writer = new FileWriter("data/out.txt")) {//такая запись (трай с ресурсами) закрывает поток автоматом(неявно) и блок finally не нужен
//            reader = new FileReader("data/info.txt");

//            int i= fr.read();//считали символ (0);
//            System.out.println(i);//48
//            System.out.println(fr.read());
//            System.out.println((char)i);//0
//            System.out.println((char)fr.read());//1
//            fr.skip(2);//пропустили 2 символа
            char [] ar = new char[300];
//            fr.read(ar);//считали символі в массив
//            System.out.println(Arrays.toString(ar));//вывели масив согласно размера
            int k;
            while ((k=fr.read(ar))>0){
                if (k<300){
                    ar=Arrays.copyOf(ar, k);
                }
                System.out.print(ar);
            }

//            int c;
//            while((c=fr.read())!=-1)
//                System.out.print((char)c);//вывели содержимое файла посимвольно (любой размер)



//            writer.write(i);//в файл запишется 0ew
//            writer.append("\n");//записали символ
//            writer.write("Java");//записали строку в файл
//            char [] arr = new char[8];
//            fr.read(arr);//считали символі в массив
//            writer.write(arr);//записали массив в файл
//            int n = fr.read(arr);//считали символі в массив
//            writer.write(arr, 0, n);//задали с какого символа писать и кол-во символов
//            while (n != -1) {//цикл скопирует файл
//                writer.write(arr, 0, n);
//                n = fr.read(arr);
//            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
//        } finally {
//            try {
//                if (reader != null)
//                reader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        }
    }
}
