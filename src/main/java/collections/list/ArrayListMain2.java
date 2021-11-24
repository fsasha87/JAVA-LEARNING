package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMain2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
//        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,6,8}));
        System.out.println(list);
        list.add(5);
        list.add(7);
        list.add(42);
        list.add(null);
        list.add(42);
        list.add(8);
        System.out.println(list);//[5, 7, 42, null, 42, 8]
        list.add(5, 77);//создаст 61 єлемент, остальные подвинет
        System.out.println(list);//[5, 7, 42, null, 42, 77, 8]
        list.set(5, 87);//устанавливает новое значение по индексу
        System.out.println(list);//[5, 7, 42, null, 42, 87, 8]
        System.out.println(list.get(3));//null
        Integer value = list.get(3);//null, но если указать int при null, то NullPointerException
        System.out.println(value);
        System.out.println(list.indexOf(42));//индекс по значению (1я встреча)
        System.out.println(list.lastIndexOf(42));//индекс по значению (последняя встреча)
//        list.remove(0);//удаление по индексу
        list.remove(new Integer(42));//удалит 1й єл-нт с таким значением
        System.out.println(list);
        System.out.println(list.subList(1,4));//вывести часть списка

    }
}
