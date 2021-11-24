package io;

import java.io.Serializable;

public class Student implements Serializable {
    static String faculty = "MMF2";
    private String name;
    private int id;
    private transient String password;//прячем как NULL
    private static final long serialVersionUID = 1L;//не позволит классу получить некорректный объект после изменений

    public Student(String name, int id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }
    @Override
    public String toString() {
        return "\nfaculty " + faculty + "\nname " + name + "\nid " + id + "\npassword " + password;
    }
}
