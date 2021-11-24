package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader2 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\Progs\\Pushkin.txt"))){
            while (br.ready()){
                System.out.println(br.readLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
