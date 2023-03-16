package io;

import java.io.File;
import java.io.IOException;

public class FileClass {
    public static void main(String[] args) {
        //получаем все файлы и папки по пути
        File dir = new File("D:\\Progs");
        if (dir.isDirectory()) {
            for (File item : dir.listFiles()) {
                if (item.isDirectory()) {
                    System.out.println(item.getName() + "\t папка");
                } else if (item.isFile()) {
                    System.out.println(item.getName() + "\t файл");
                }
            }
        }
        //создаем, переименовываием, удаляем папку
        File newDir = new File("D:\\Progs\\NewDir");
        newDir.mkdir();//создали папку
        File renamedDir = new File("D:\\Progs\\RenamedDir");
        newDir.renameTo(renamedDir);//переименовали
        boolean deleted = renamedDir.delete();//удалили папку
        if (deleted) System.out.println("Succesfully deleted");
//создаем, удаляем файл
        File newFile = new File("src\\main\\resources\\notes.txt");
        try {
            newFile.createNewFile();
        }//создали файл
        catch (IOException ex) {
            ex.printStackTrace();
        }
        if (newFile.exists())
            System.out.println(newFile.getParent() + "\\" + newFile.getName());//получили путь и имя файла
        System.out.println(newFile.length());//кол-во символов в файле
        newFile.delete();//удалили файл
    }
}
