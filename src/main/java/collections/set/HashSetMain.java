package collections.set;


import java.util.HashSet;
import java.util.Set;

public class HashSetMain {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("ten");
        System.out.println(set);//[one, ten, two] сортировка по хеш-коду
        set.add("two");
        System.out.println(set);//[one, ten, two] без дублей!
        set.add(new String("ten"));
        System.out.println(set);//[one, ten, two] без дублей!
        boolean value = set.add("twelve");//тоже самое
        System.out.println(set +" "+ value);//[one, twelve, ten, two] true

        Set <String> set2 = new HashSet<String>(){//2й сп: открываем аннонимный класс и создаем коллекцию
            {//логический блок
                this.add("one");
                this.add("two");
            }
        };
        System.out.println(set2);//[one, two]
    }
}
