package collections.set;

import java.util.*;

public class SetMain2 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();//new TreeSet<>()-по возрастанию; new LinkedHashSet<>()-по порядку добавления
        set1.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0}));
        System.out.println(set1);//[0, 1, 2, 3, 4, 8, 9]
        Set<Integer> set2 = new TreeSet<>();
        set2.addAll(Arrays.asList(new Integer []{1, 3, 7, 5, 4, 0, 7, 5}));
        System.out.println(set2);//[0, 1, 3, 4, 5, 7]
        Set <Integer> set3 = new LinkedHashSet<>();
        set3.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0}));
//        set3.addAll(set2);//[1, 3, 2, 4, 8, 9, 0, 5, 7] объединили все эл-ты
//        set3.retainAll(set2);//[1, 3, 4, 0] только общие эл-ты
//        set3.removeAll(set2);//[2, 8, 9]    только разные эл-нты
        System.out.println(set3);//[1, 3, 2, 4, 8, 9, 0]


    }
}
