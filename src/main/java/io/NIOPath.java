package io;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NIOPath {
    public static void main(String[] args) {
        Path path = Paths.get("D:\\Progs\\note.txt");
        System.out.println(path.getFileName());//   note.txt
        System.out.println(path.getParent());// D:\Progs
        System.out.println(path.getRoot());//   D:\
        System.out.println(path.endsWith("note.txt"));//true
        System.out.println(path.startsWith("D:\\"));//true
        System.out.println(path.isAbsolute());//true
    }
}
