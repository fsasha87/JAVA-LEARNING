package io;

import java.io.*;
//это оболочка FileReader/Writer, котороя позволяет читать/записовать строками
public class BufferedWriterReader {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("data/info.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("data/out.txt"))){
            String line = br.readLine();//прочитали первую строку
            bw.write(line, 0, line.length());//записали первую строку
            // посимвольно
            int c;
            while ((c=br.read())!=-1){//чтение посимвольно
                System.out.print((char) c);//выводит в консоль посимвольно
                bw.write(c);//запись посимвольно
            }
//            все построчно
            line = null;
            while ((line=br.readLine()) != null){//цикл считывает все построчно и сохранит в буфер
                System.out.println(line);//выведет все строки в консоль
                bw.write(line, 0, line.length());//запишет все строки
                bw.newLine();//переход на новую строку(иначе запишет в одну строку)
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
