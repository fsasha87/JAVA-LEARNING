package io;

import java.io.*;
import java.util.ArrayList;

public class ObjectInputOutputStream {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Sasha", 123, "qwe"));
        students.add(new Student("Vasia", 124, "asd"));
        students.add(new Student("Alla", 125, "zxc"));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data/students.dat"))) {
            oos.writeObject(students);
            Student student = new Student("Katye", 120, "qaz");
            oos.writeObject(student);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<Student> newStudents = new ArrayList<>();
        Student newStudent = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data/students.dat"))) {
                newStudents = ((ArrayList<Student>)ois.readObject());
                newStudent = (Student) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(newStudents);
        System.out.println(newStudent);

    }
}
