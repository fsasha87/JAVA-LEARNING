package collections.set;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetMain {
    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(1000);
        words.add("8Y1");
        words.add("2Y");
        words.add("2Y2");
        words.add("8Y1");
        words.add("6Y");
        words.add("5Z");
        words.add("4Z4");
        words.add("Z4");
        System.out.println(words);//[8Y1, 4Z4, 2Y, 2Y2, 5Z, 6Y, Z4]
        for (String element : words) {
            System.out.print(element.hashCode() + " ");//56624 52814 1639 50859 1733 1763 2842
        }

        TreeSet<String> treeSet = new TreeSet<>(words);
        System.out.println();
        System.out.println(treeSet);//[2Y, 2Y2, 4Z4, 5Z, 6Y, 8Y1, Z4]
        for (String element : treeSet){
            System.out.print(element.hashCode()+" ");//1639 50859 52814 1733 1763 56624 2842
        }

        LinkedHashSet <String> lhs = new LinkedHashSet<>();
        lhs.add("8Y1");
        lhs.add("2Y");
        lhs.add("2Y2");
        lhs.add("8Y1");
        lhs.add("6Y");
        lhs.add("5Z");
        lhs.add("4Z4");
        lhs.add("Z4");
        System.out.println();
        System.out.println(lhs);//[8Y1, 2Y, 2Y2, 6Y, 5Z, 4Z4, Z4]

    }
}
