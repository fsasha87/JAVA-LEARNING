package collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMain2 {
    public static void main(String[] args) {
//        Map<Integer, String> states = new HashMap<Integer, String>();
        Map<Integer, String> states = new HashMap<>();
        states.put(1, "Germany");
        states.put(2, "Spain");
        states.put(4, "France");
        states.put(3, "Italy");
        System.out.println(states.values());
        String first = states.get(2);
        System.out.println(first);
        System.out.println(states.get(1));//получили значение по ключу
        Set<Integer> keys = states.keySet();
        System.out.println(keys);//[1, 2, 3, 4] получили набор всех ключей
        System.out.println(states.keySet());//[1, 2, 3, 4]
        Collection<String> values = states.values();
        System.out.println(values);//получили набор всех значений [Germany, Spain, Italy, France]
        System.out.println(states.values());//[Germany, Spain, Italy, France]
        states.replace(1, "Poland");
        states.remove(2);
        System.out.println(states);//{1=Poland, 3=Italy, 4=France}
        for (Map.Entry<Integer, String> item : states.entrySet()) {
            System.out.printf("Key: %d, value: %s; ", item.getKey(), item.getValue());//Key: 1, value: Poland; Key: 3, value: Italy; Key: 4, value: France;
        }
//        Map<String, Persona> people = new HashMap<String, Persona>();//создали мапу объектов
        Map<String, Persona> people = new HashMap<>();
        people.put("124i124", new Persona("Tom"));
        people.put("125i125", new Persona("Bill"));
        people.put("2555i25", new Persona("Nick"));
        System.out.println();
        for (Map.Entry<String, Persona> item : people.entrySet()) {//перебор
            System.out.println();
            System.out.printf("Key: %s value: %s; ", item.getKey(), item.getValue().getName());
        }
    }
}

class Persona {
    private String name;

    public Persona(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                '}';
    }
}


