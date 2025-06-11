package io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class NIOFiles {
    public static void main(String[] args) throws IOException {
        Path file = Files.createFile(Paths.get("D:\\Progs\\note.txt"));//создали файл
        System.out.println(Files.exists(Paths.get("D:\\Progs\\note.txt")));//проверили наличие файла

        Path dir = Files.createDirectory(Paths.get("D:\\Progs\\test"));//создали папку
        System.out.println(Files.exists(Paths.get("D:\\Progs\\test")));//
//        file = Files.move(file, Paths.get("D:\\Progs\\test\\note.txt"), REPLACE_EXISTING);//переместили в другую папку
        file = Files.move(file, Paths.get("D:\\Progs\\test\\note.txt"));//переместили
//        file = Files.copy(file, Paths.get("D:\\Progs\\test\\note2.txt"));//скопировали
        System.out.println(Files.exists(Paths.get("D:\\Progs\\note.txt")));
        System.out.println(Files.exists(Paths.get("D:\\Progs\\test\\note.txt")));
        Files.delete(file);//удалили
        System.out.println(Files.exists(Paths.get("D:\\Progs\\test\\note.txt")));
        Files.delete(dir);
        System.out.println(Files.exists(Paths.get("D:\\Progs\\test")));

        List<String> lines = Files.readAllLines(Paths.get("src/main/resources/Pushkin.txt"), UTF_8);//читаем построчно файл
        for (String item : lines) {
            System.out.println(item);
        }

        try (DirectoryStream<Path> files = Files.newDirectoryStream(Paths.get("D:\\Progs"))){
            for (Path path : files){
                System.out.println(path);
            }
        }
    }
}
