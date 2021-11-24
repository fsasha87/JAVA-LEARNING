package collections.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;

public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList <String> people = new ArrayList<String>();//создал коллекцию список
        people.add("Tom");//добавили объект в массив
        people.add("Alisa");
        people.add("Kate");
        people.add("Sam");
        people.add(1, "Bob");//добавили 2й элемент (остальные здвинулись)
        System.out.println(people.get(1));//получили 2й элемент коллекции
        people.set(1, "Robert");//заменили 2й эл-нт
        System.out.println(people.get(1));
        System.out.println(people.size());//узнали размер коллекции
        for (String person: people){
            System.out.println(person);
        }//перебрали коллекции (напечатали все єлементы коллекции)
        if (people.contains("Tom")){//поверка наличия элемента
            System.out.println("ArrayList contains tom");
        }
        people.remove("Robert");//удалили элемент по содерржанию
        people.remove(0);//удалили элемент по индексу
        Object[] peopleArray = people.toArray();//преобразовали коллекцию в массив
        for (Object person : peopleArray){
            System.out.println(person);
        }
        people.forEach(x-> System.out.println(x));//тоже самое
        people.forEach(new Consumer<String>() {//тоже самое
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

    }
}
