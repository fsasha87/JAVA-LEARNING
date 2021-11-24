package liamdastream;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        boolean result = Stream.of(-1, -5, 0, 2, 5).filter(x->x>0).anyMatch(x->x<0);//false
        System.out.println(result);
        int res = Stream.of(-1, -5, 0, 2, 5).filter(x->x>0).findFirst().get();//2
        System.out.println(res);
        int sum = Stream.of(1, 2, 3, 4, 5).reduce((x, y) -> x + y).get();// = 15
        System.out.println(sum);
        int sum2 = Stream.of(1, 2, 3, 4, 5).reduce(10, (x, y) -> x + y);//25
        System.out.println(sum2);
        int max = Stream.of(-1, -5, 0, 2, 50).max(Integer::compare).get();//50
        System.out.println(max);
        String max2 = Stream.of("How", "are", "you?").max(Comparator.comparing(String::length)).get();//you?
        System.out.println(max2);

        List<Integer> list = Stream.of(-1, -5, 0, 2, 5).collect(Collectors.toList());//собрали в коллекцию
        Set<Integer> set = Stream.of(-1, -5, 0, 2, 5, -1).collect(Collectors.toSet());
        String text = Stream.of("How", "are", "you?").map(s->s.toUpperCase()).collect(Collectors.joining(" "));//HOW ARE YOU?
        System.out.println(text);

        Object[] array = Stream.of(-1, -5, 0, 2, 5).toArray();

        Stream<Integer> stream = Stream.of(-1, -5, 0, 2, 5).sorted();//по возврастанию
        stream.forEach(System.out::print);
        Stream.of(-1, -5, 0, 2, 5).sorted((o1, o2) -> o2 - o1).forEach(System.out::print);//по убыванию

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        System.out.println(min.get());//NoSuchElementException
        System.out.println(min.orElse(-1));//если пустой то -1
        if(min.isPresent()){
            System.out.println(min.get());
        }//выведет если не пустой
        min.ifPresent(v-> System.out.println(v));//тоже самое

    }
}
