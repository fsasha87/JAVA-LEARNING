package _Tasks.task5;

import java.io.Serializable;

public class Woman implements Serializable {
    transient private int age;
    private String name;
    private static final long serialVersionUID = 1L;

    public Woman(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Woman{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

