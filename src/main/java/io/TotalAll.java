package io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

public class TotalAll {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fis = new FileInputStream("D:\\in.txt");
             FileOutputStream fos = new FileOutputStream("D:\\out.txt", true)) {
//            String text = "Hello world";
//            byte[] buffer = text.getBytes();
//            fos.write(buffer);

            //читаем-дозаписываем-выводим посимвольно
            int i = -1;
            while ((i = fis.read()) != -1) {
                fos.write(i);
                System.out.print((char) i);
            }
            //читаем-дозаписываем-выводим массивом
            byte[] ar = new byte[fis.available()];
            fis.read(ar);
            fos.write(ar);
            System.out.println(new String(ar));
            for (byte item : ar) System.out.print((char) item);
        }


        try (FileReader fr = new FileReader("D:\\in.txt");
             FileWriter fw = new FileWriter("D:\\out.txt")) {
            //читаем-записываем-выводим посимвольно
            int c;
            while ((c = fr.read()) != -1) {
                fw.write(c);
                System.out.print((char) c);
            }
        }

        try (BufferedReader br = new BufferedReader(new FileReader("D:\\in.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\out.txt"))) {
//            читаем-записываем-выводим строками
            String line = null;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
                System.out.println(line);
            }
            while (br.ready()){System.out.println(br.readLine());}//2сп
//            читаем-записываем или выводим строками
            br.lines().forEach(System.out::println);//считали все строки в консоль
            ArrayList<String> strings = new ArrayList<>();
            br.lines().forEach(strings::add);//сохраняем информацию в список
            for (String line1 : strings) {//цикл запишет все строки в файл
                bw.write(line1);
                bw.newLine();
            }
        }

        try (PrintStream ps = new PrintStream("D:\\out.txt")) {
            String text = "Hello world";
            //записали строку в файл
            ps.println(text);//1сп записали строку в файл
            byte[] ar = text.getBytes();
            ps.write(ar);//2сп


            double[] ar2 = {1.10, 1.2, 1.401, 5.01, 6.017, 7, 8};
            //записали массив в файл
            for (double value : ar2) {
                ps.println(value);//1сп запишет поток в файл
                System.setOut(ps);//перенаправит поток (ниже) в файл вместо консоли
                System.out.println(value);//2сп запишет поток в файл вместо консоли
            }
        }

        //прочитали-записали-вывели
        List<String> lines = Files.readAllLines(Paths.get("D:\\in.txt"), UTF_8);//читаем построчно файл
        Files.write(Paths.get("D:\\out.txt"), lines);//записали файл
        for (String item : lines) {
            System.out.println(item);
        }//вывели

        //прочитали-записали-вывели
        try (InputStream is = Files.newInputStream(Paths.get("D:\\in.txt"));
             OutputStream os = Files.newOutputStream(Paths.get("D:\\out.txt"))) {
            byte[] ar = new byte[is.available()];
            is.read(ar);
            os.write(ar);
            System.out.println(new String(ar));
        }
    }
}

