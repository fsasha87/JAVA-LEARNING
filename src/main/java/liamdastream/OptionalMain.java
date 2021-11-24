package liamdastream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;

public class OptionalMain {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Optional<Integer> min = numbers.stream().min(Integer::compare);
//        System.out.println(min.get());//NoSuchElementException
//        System.out.println(min.orElse(-1));//если пустой то -1
        if(min.isPresent()){ System.out.println(min.get()); }//выведет если не пустой
//        min.ifPresent(v-> System.out.println(v));//тоже самое

    ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "How", "are", "you?");
        print("Ho");
        print2("Ho");
        Optional<String> max = list.stream().max(Comparator.comparing(String::length));
        max.ifPresent(v-> System.out.println(v));
    }

    public static void print(String s){
        Optional<String>str= Optional.ofNullable(s);
        System.out.println(str.orElse("-1"));
    }
    public static void print2(String s){
        String str = s != null ? s : "-2";
        System.out.println(str);
    }//такая же проверка на 0

}
