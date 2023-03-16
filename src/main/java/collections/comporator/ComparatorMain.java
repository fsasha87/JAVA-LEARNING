package collections.comporator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain {
    public static void main(String[] args) {
        List<Man> list = new ArrayList<>();
        list.add(new Man(301, "Tom"));
        list.add(new Man(509, "Jack"));
        System.out.println(list);//[Man{id=301, name=Tom}, Man{id=509, name=Jack}]

        //реализация с внешним классом
//        list.sort(new ManNameComparator());//1й способ с внешним класом
//        Collections.sort(list, new ManNameComparator());//2й способ
        list.sort(new Man.NameComparator());
//        Collections.sort(list, new Man.NameComparator());//2й способ
//        list.sort(new Man.IdComparator().thenComparing(new Man.NameComparator()));//цепочка сортировок

        //реализация с анонимным классом
        Comparator <Man> nameComparator = new Comparator<Man>() {
            @Override
            public int compare(Man o1, Man o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Comparator <Man> idComparator = new Comparator<Man>() {
            @Override
            public int compare(Man o1, Man o2) {
                return (o1.getId()-o2.getId());
            }
        };
        Collections.sort(list, nameComparator);
        Collections.sort(list, idComparator);

        System.out.println(list);//[Man{manId=509, name=Jack}, Man{manId=301, name=Tom}]

        for (Man m : list) {
//            System.out.println(m.getName() +" " + m.getId());
            System.out.println(m);
        }
    }
}

class Man {
    private int id;
    private String name;

    public Man(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Man{id=" + id + ", name=" + name + "}";
    }

    public static class NameComparator implements Comparator<Man> {


        @Override
        public int compare(Man o1, Man o2) {
            return o1.getName().compareTo(o2.getName());//реализация компаратора как внутренего статического класса
        }
    }

    public static class IdComparator implements Comparator<Man> {


        @Override
        public int compare(Man o1, Man o2) {
            if (o1.getId()>o2.getId())
                return 1;
            else if (o1.getId()<o2.getId())
                return -1;
            else
                return 0;
        }
    }


}