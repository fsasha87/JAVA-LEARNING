package io;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NIOPath {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\38093\\IdeaProjects\\EPAM WEB\\notes.txt");
        System.out.println(path.getFileName());//   notes.txt
        System.out.println(path.getParent());// C:\Users\38093\IdeaProjects\EPAM WEB
        System.out.println(path.getRoot());//   C:\
        System.out.println(path.endsWith("notes.txt"));
        System.out.println(path.startsWith("C:\\"));
        System.out.println(path.isAbsolute());



    }
}
