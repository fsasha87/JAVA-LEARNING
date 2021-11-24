package io;

import java.io.*;

public class PrintMain {
    public static void main(String[] args) {
//        File file = new File("data\\res.txt");
        double [] values = {1.10 , 1.2, 1.401, 5.01, 6.017, 7, 8};
//        try (PrintStream stream = new PrintStream(new FileOutputStream(file))) {
            try (PrintStream stream = new PrintStream(new FileOutputStream("data/res.txt"))) {
            for (double value : values) {
                stream.printf("Java %.2g\n", value);//запишет в файл поток
                System.setOut(stream);//перенаправит поток ниже в файл вместо консоли
                System.out.printf("%.2g%n", value);//кинет в файл вместо консоли
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } ;
    }
}
