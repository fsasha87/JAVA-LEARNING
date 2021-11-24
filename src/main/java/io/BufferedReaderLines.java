package io;

import java.io.*;
import java.util.ArrayList;
import java.util.function.Consumer;

public class BufferedReaderLines {
    //метод lines позволяет считать все строки и отправить в поток
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("data/info.txt");
             BufferedReader bufferedReader = new BufferedReader(reader);
             FileWriter writer = new FileWriter("data/out.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
//                bufferedReader.lines().forEach(System.out::println);//считали все строки в консоль
            ArrayList<String> strings = new ArrayList<>();
            bufferedReader.lines().forEach(strings::add);//сохраняем информацию в список
            System.out.println(strings);//выводим коллекцию в консоль
            for (String line : strings) {//цикл запишет все строки в файл
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}