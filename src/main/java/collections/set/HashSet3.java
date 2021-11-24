package collections.set;

import java.util.*;

public class HashSet3 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();//new TreeSet<>()-по возрастанию; new LinkedHashSet<>()-по порядку добавления
        set1.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0}));
        Set<Integer> set2 = new TreeSet<>();
        set2.addAll(Arrays.asList(new Integer []{1, 3, 7, 5, 4, 0, 7, 5}));
        Set <Integer> set3 = new LinkedHashSet<>(set1);
        set3.addAll(set2);//объединили все эл-ты
//        set3.retainAll(set2);//только общие эл-ты
//        set3.removeAll(set2);//только разные эл-нты
        System.out.println(set3);

    }
}
