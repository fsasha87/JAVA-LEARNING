package collections.list;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<String> states = new LinkedList<String>();
        states.add("Ukraine");
        states.add("Russia");
        states.addLast("Belgium");
        states.addFirst("Spain");
        states.add(1, "Italy");
        System.out.println(states);
        System.out.println(states.size());
        System.out.println(states.get(1));
        states.set(1, "Portugal");
        System.out.println(states);
        for (String state : states) {
            System.out.println(state);
        }
        if (states.contains("Ukraine")) {
            System.out.println("List contains Ukraine");
        }
        states.remove("Ukraine");
        states.removeFirst();
        states.removeLast();
        System.out.println(states);


        LinkedList<Person> people = new LinkedList<Person>();
        System.out.println();
        people.add(new Person("Mike"));
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));
        System.out.println(people);
        people.remove(1);
        System.out.println(people);//без toString [collections.list.Person@1b6d3586, collections.list.Person@4554617c]
        System.out.println(people.getFirst());//Person{name='Tom'}
        for (Person p : people){System.out.println(p.getName());}//выводим все эл-ты
        Person first = people.getFirst(); System.out.println(first.getName());//получаем первій єл-нт

        Person peopleArray [] = people.toArray(new Person[2]);//преобразовали коллекцию в массив объектов и задали его размер
        System.out.println(Arrays.toString(peopleArray));//вывели массив объектов, преобразовав в стрингу
        for (Person pers : peopleArray){
            System.out.println(pers);
        }

        Object peoopleArray2 [] = people.toArray();
        System.out.println(Arrays.toString(peoopleArray2));
        for (Object person : peoopleArray2){
            System.out.println(person);
        }
    }
}
class Person{
        private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

