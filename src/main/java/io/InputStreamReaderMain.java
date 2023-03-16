package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputStreamReaderMain {
    public static void main(String[] args) throws IOException {
//1сп
        InputStream str = System.in;
        BufferedReader br = new BufferedReader(new InputStreamReader(str));
        String line = br.readLine();
        System.out.println(line);
//2сп
        Scanner sc = new Scanner(System.in);
        String str2 = sc.nextLine();
        System.out.println(str2);

    }
}
