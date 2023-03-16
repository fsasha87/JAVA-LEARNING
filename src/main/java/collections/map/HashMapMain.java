package collections.map;

import java.util.*;

public class HashMapMain {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("T-shirt", 7);
        map.put("Jeans", 5);
        map.put("Gloves", 4);

        System.out.println(map);//{Gloves=4, T-shirt=7, Jeans=5}
        map.put("Jeans", 4);//замена значения по ключу
        System.out.println(map);//{Gloves=4, T-shirt=7, Jeans=4}
        Set<String> allKeys = map.keySet();//записываем ключи в сет
        System.out.println(allKeys);//[Gloves, T-shirt, Jeans]
        Collection<Integer> allValues = map.values();//записываем значения в коллекцию
        System.out.println(allValues);//[4, 7, 4]
        Set<Map.Entry<String, Integer>> collection = map.entrySet();//записываем коллекцию в сет
        System.out.println(collection);//[Gloves=4, T-shirt=7, Jeans=4]

        Set<Integer> sets = new HashSet<>(allValues);//создали сет для храниения уникальных значений
        System.out.println(allValues);//[4, 7, 4]
        System.out.println(sets);//[4, 7]

    }
}
