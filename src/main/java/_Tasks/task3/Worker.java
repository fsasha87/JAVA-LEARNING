package _Tasks.task3;

import java.util.Comparator;

public class Worker {
//        implements Comparable<Worker>{
    private String name;
    private int age;

    public Worker(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

//        @Override
//    public int compareTo(Worker o) {
//        return this.name.compareTo(o.name);
//    }

//    @Override
//    public int compareTo(Worker o) {
//        int result = this.age - o.age;
//        if (result > 0)
//        return 1;
//        else if (result < 0 )
//            return -1;
//        else
//            return 0;
//    }

    static class AgeComporator implements Comparator<Worker> {
        @Override
        public int compare(Worker o1, Worker o2) {
            if (o1.getAge() - o2.getAge() > 0)
                return 1;
            else if (o1.getAge() - o2.getAge() < 0)
                return -1;
            else
                return 0;
        }
    }

    static class NameComporator implements Comparator<Worker> {
        @Override
        public int compare(Worker o1, Worker o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

}
