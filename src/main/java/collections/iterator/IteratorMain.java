package collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMain {
    public static void main(String[] args) {
        ArrayList <String> states = new ArrayList<>();
        states.add("Spain");
        states.add(new String("France"));
        states.add("Italy");
        states.add("Germany");
        System.out.println(states);
        Iterator<String> iter = states.iterator();
        System.out.println(iter.next());//выведет следующий(1й) эл-нт
        System.out.println(iter.hasNext());//выведет тру/фолс
        while (iter.hasNext()){
        System.out.println(iter.next());}
    }
}
