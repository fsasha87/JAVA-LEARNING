package liamdastream.exToMap;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.IntSummaryStatistics;

public class Program {
    public static void main(String[] args) {
        Stream<Phone> stream = Stream.of(new Phone("Nokia", 10000),
                new Phone("LG", 5000),
                new Phone("Iphone", 10000));

        //сохраняем в мапу
        Map<String, Integer> phones = stream.collect(Collectors.toMap(p->p.getModel(), t->t.getPrice()));
        phones.forEach((k, v)-> System.out.println(k+" "+v));//Iphone 10000  LG 5000    Nokia 10000

//        групировка моделей по цене 10000 Nokia Iphone     5000 LG
        Map<Integer, List<Phone>> phonesByPrice = stream.collect(Collectors.groupingBy(Phone::getPrice));
        for (Map.Entry<Integer, List<Phone>> item : phonesByPrice.entrySet()){
            System.out.println(item.getKey());
            for(Phone phone : item.getValue()){
                System.out.println(phone.getModel());
            }
        }
        //групировка по соответсвию на условие false Nokia Iphone   true LG
        Map<Boolean, List<Phone>> phonesByCondition = stream.collect(Collectors.partitioningBy(p -> p.getModel()=="LG"));
        for (Map.Entry<Boolean, List<Phone>> item : phonesByCondition.entrySet()){
            System.out.println(item.getKey());
            for (Phone phone : item.getValue()){
                System.out.println(phone.getModel());
            }
        }

        //подсчет элементов в группе Iphone 1   LG 1    Nokia 1
        Map<String, Long> phonesByModel = stream.collect(Collectors.groupingBy(Phone::getModel, Collectors.counting()));
        for (Map.Entry<String, Long> item : phonesByModel.entrySet()){
            System.out.println(item.getKey()+" "+item.getValue());
        }

        //суммируем все цены по моделям
        Map<String, Integer> phonesByModel1 = stream.collect(Collectors.groupingBy(Phone::getModel, Collectors.summingInt(Phone::getPrice)));
        for (Map.Entry<String, Integer> item : phonesByModel1.entrySet()){
            System.out.println(item.getKey()+"-"+item.getValue());
        }

        //выдаст мин значение по группам
        Map<String, Optional<Phone>> phonesByModel2 = stream.collect(
                Collectors.groupingBy(Phone::getModel, Collectors.minBy(Comparator.comparing(Phone::getPrice))));
        for (Map.Entry<String, Optional<Phone>> item : phonesByModel2.entrySet()){
            System.out.println(item.getKey()+"-"+item.getValue().get().getPrice());
        }

        //summarizingInt позволяет выполнить различные атомарные операции над набором значений
        Map<String, IntSummaryStatistics> priceSummary = stream.collect(
                Collectors.groupingBy(Phone::getModel, Collectors.summarizingInt(Phone::getPrice)));
        for (Map.Entry<String, IntSummaryStatistics> item : priceSummary.entrySet()){
            System.out.println(item.getKey()+"-"+item.getValue().getAverage());
            System.out.println(item.getKey()+"-"+item.getValue().getCount());
            System.out.println(item.getKey()+"-"+item.getValue().getMax());
            System.out.println(item.getKey()+"-"+item.getValue().getSum());
        }

        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "a=2", "b=3", "c=4", "d==3");

        Map<String, String> result = list.stream()
                .map( e -> e.split("=") )
                .filter( e -> e.length == 2 )
                .collect( Collectors.toMap(e -> e[0], e -> e[1]) );

        result.forEach((k, v) -> System.out.println(k+""+v));

    }


}
