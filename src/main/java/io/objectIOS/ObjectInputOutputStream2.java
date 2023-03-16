package io.objectIOS;

import java.io.*;

public class ObjectInputOutputStream2 {
    public static void main(String[] args) {
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("src/main/resources/out.dat"))){
            Student student = new Student("Aleks", 12345, "qwerty");
            output.writeObject(student);

        } catch (IOException e) {
            e.printStackTrace();
        }
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("src/main/resources/out.dat"))){
            Student student = (Student) input.readObject();
            System.out.println(student);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
