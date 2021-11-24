package collections.map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
//import java.util.*;

public class TreeMapMain {
    public static void main(String[] args) {
        TreeMap<Integer, String> states = new TreeMap<>();
        states.put(10, "Germany");
        states.put(2, "Spain");
        states.put(14, "France");
        states.put(3, "Italy");
//        states.replace(10, "Ukraine");
//        states.remove(2, "Spain");
        System.out.println(states.get(2));//поиск значения по ключу
        System.out.println(states);//{2=Spain, 3=Italy, 10=Germany, 14=France}
        for (Map.Entry<Integer, String> item : states.entrySet()){// перебор элементов
            System.out.printf("Key: %d Value: %s \n",item.getKey(), item.getValue());
        }
        Set<Integer> keys = states.keySet();
        System.out.println(keys);//[2, 3, 10, 14] получим весь набор ключей
        Collection<String> values = states.values();
        System.out.println(values);//[Spain, Italy, Germany, France] весь набор значений
        Map<Integer, String> afterMap = states.tailMap(4);
        System.out.println(afterMap);//{10=Germany, 14=France}
        Map<Integer, String> beforeMap = states.headMap(4);
        System.out.println(beforeMap);//{2=Spain, 3=Italy}
        Map.Entry<Integer, String> lastItem = states.lastEntry();
        System.out.println(lastItem);//14=France
        System.out.println("Key: "+lastItem.getKey()+" Value: "+lastItem.getValue());

        Map<Integer, PersonT> people = new TreeMap<>();
        people.put(1, new PersonT("Tom"));
        people.put(2, new PersonT("Nick"));
        people.put(3, new PersonT("Eduard"));
        for (Map.Entry<Integer, PersonT> item : people.entrySet()){
            System.out.println("Key: "+item.getKey()+" Value: "+item.getValue().getName());
        }
    }
}
class PersonT {
    private String name;
    public PersonT(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
