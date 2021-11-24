package collections.comporator;

import java.util.TreeSet;

public class ComparableMain {
    public static void main(String[] args) {
        TreeSet<Person> set = new TreeSet<>();
        set.add(new Person(701, "Tom"));
        set.add(new Person(509, "Jack"));
//        set.add(new Person(847, "Robin"));
//        set.add(new Person(111, "Peter"));
        System.out.println(set);//[Person{id=701, name=Tom}, Person{PersonId=509, name=Jack}]
        for (Person m: set) {
            System.out.println(m);
        }
    }
}


class Person implements Comparable<Person>{//для возможности соритровки имплементируем этот интерфейс и переопределяем метод compareTo(o), иначе при добавлении объекта ошибка
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{id=" + id + ", name=" + name + "}";
    }

//    @Override
//    public int compareTo(Person o) {//сортировка по имени
//        return this.name.compareTo(o.name);//сортировка по имени a-z
////        return -this.name.compareTo(o.name);//сортировка по имени z-a
//    }


    @Override
    public int compareTo(Person o) {
        int result = this.id - o.id;//сортировка по возврастанию id
//        int result = -(this.id - o.id);//сортировка по убыванию id
        if (result > 0)
            return 1;
        else if (result < 0)
            return -1;
        else
            return 0;
    }
}
