package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
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

    }
}


