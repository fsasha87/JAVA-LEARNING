package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintMain2 {
    public static void main(String[] args) {

        try (PrintStream ps = new PrintStream(new FileOutputStream("D:\\out2.txt"))) {
//        try (PrintStream ps = new PrintStream("data/out2.txt")) {
//            String text = "Hello world";
//            ps.println(text);//записали строку в выходной поток (файл)
//            byte [] textToBytes = text.getBytes();
//            ps.write(textToBytes);//2сп записали строку в выходной поток (файл)

            double [] ar = {1.10 , 1.2, 1.401, 5.01, 6.017, 7, 8};
            for (double value : ar) {
                ps.printf("Java %.2g\n", value);//запишет в файл поток
                System.setOut(ps);//перенаправит поток (ниже) в файл вместо консоли
                System.out.printf("%.2g%n", value);//кинет в файл вместо консоли

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
