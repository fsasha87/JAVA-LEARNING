package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class NIOStream {
    public static void main(String[] args) throws IOException {

        try (Scanner sc = new Scanner(System.in);
             InputStream is = Files.newInputStream(Paths.get(sc.nextLine()));
             OutputStream os = Files.newOutputStream(Paths.get(sc.nextLine()))) {
            byte[] ar = new byte[is.available()];
            is.read(ar);
            os.write(ar);
        }

        try(InputStream is =  Files.newInputStream(Paths.get("D:\\in.txt"));
        OutputStream os = Files.newOutputStream(Paths.get("D:\\out.txt"))){
            byte[] ar = new byte[is.available()];
            is.read(ar);
            os.write(ar);
            System.out.println(new String(ar));
        }
    }
}


