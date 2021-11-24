package collections.comporator;

import java.util.ArrayList;
import java.util.Comparator;
//реализация с помощью функционального интерфейса
public class FuncComporatorMain {
    public static void main(String[] args) {
        ArrayList <Woman> list = new ArrayList<>();
        list.add(new Woman(117, "Ann"));
        list.add(new Woman(110, "Kate"));
        list.add(new Woman(87, "Ann"));
        list.add(new Woman(127, "Kate"));
        list.add(new Woman(111, "Kate"));
        System.out.println(list);
        list.sort((o1, o2) -> o1.id - o2.id);//отсортировали по id с помощью лямбда-выражений
//        list.sort(Comparator.comparing(Woman::getName).thenComparing(Woman::getId));//сортировка внутри другой сортировки
        System.out.println(list);

    }
}

class Woman {
    int id;
    String name;

    public Woman(int id, String name) {
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
        return "Woman{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
