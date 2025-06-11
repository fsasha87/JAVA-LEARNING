package _Tasks.task4;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {
//4-1: встр.функц.интерфейсы: Predicate(T->b)/BiPredicate(T,U->b)/UnaryOperator(T->T)/BinaryOperator(T,T->T)/Function(T->R)/BiFunction(T,U->R)/Consumer(T->())/BiConsumer(T,U->())/Supplier(()->T)
//=> Predicate<I>isPositive=x->x>0;sout(isPositive.test(-4)) => BiPredicate<S,I>=(x,y)->x.length()==y;
//=> UnaryOperator<I>=x->x*x; => BinaryOperator<I>=(x,y)->x*y; =>
//=> Function<I,S>=x->String.valueOf(x+"%"); => BiFunction<I,I<D>=(x,y)->Math.pow(x,y);
//=> Consumer<S>=x->sout(x);=>ан.кл.=> BiConsumer<I,S>=(I_x,S_s)->sout(x+s); => Supplier<S>=()->s.toUpperCase();
        Predicate<Integer> isPositive = x -> x > 0;
        System.out.println(isPositive.test(5));
        BiPredicate<String,Integer> biPredicate = (x, y) -> x.length() == y;
        System.out.println(biPredicate.test("Sasha", 5));
        BinaryOperator<Integer> multiply = (x, y) -> x * y;
        System.out.println(multiply.apply(5,6));
        UnaryOperator<Integer> square = x -> x * x;
        System.out.println(square.apply(5));
        Function<Integer, String> convert = x -> String.valueOf(x+"%");
        System.out.println(convert.apply(6));
        BiFunction<Integer, Integer, Double>  biFunction = (x, y) -> Math.pow(x, y);
        System.out.println(biFunction.apply(3, 4));//81.0
        Consumer<String> consumer = x -> System.out.println(x);
        consumer.accept("=5");
        new Consumer<String>(){
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        }.accept("=6");
        BiConsumer<Integer, String> biConsumer = (Integer x, String y) -> System.out.println(x+y);
        biConsumer.accept(5, "5");//55
        String s = "hello";
        Supplier<String> supplier = () -> s.toUpperCase();
        System.out.println(supplier.get());

//4-2: создать функц.инт. ISum с методом sum => реализ.через анон.кл. => 2сп: коротко (а+b) => 3сп: коротко с {return (a + b);};
        ISum iSum = new ISum() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };
        System.out.println(iSum.sum(5,7));
        ISum iSum2 = (a, b) -> a+b;
        System.out.println(iSum2.sum(2,4));
        ISum iSum3 = (int a, int b) -> {return (a + b);};
        System.out.println(iSum3.sum(1,2));

//4-3: Stream.of: to Object[]/int[]/double[]/List/Set/S_joining/Map(newWoman)
        Object[] arObj = Stream.of(1,2,3,5,7).toArray();
        System.out.println(Arrays.toString(arObj));
        int[] arInt = IntStream.of(0,-3,-7,9,20).toArray();
        System.out.println(Arrays.toString(arInt));
        double[] array3 = DoubleStream.of(2.0, 3.0, 4.12, 5.16).toArray();
        System.out.println(Arrays.toString(array3));
        List<Integer> list = Stream.of(2,3,1,5,0).toList();
        System.out.println(list);
        Set<Integer> set = Stream.of(0,5,2,-1).collect(Collectors.toSet());
        String str = Stream.of("How", "I", "am", "being?").collect(Collectors.joining(" "));
        System.out.println(str);
        Map<String, Integer> women = Stream.of(new Woman("Nadine", 12), new Woman("Kate", 33), new Woman("Ira", 30))
                .collect(Collectors.toMap(e->e.getName(), e->e.getAge()));
        System.out.println(women);

//4-4: Stream: Stream.of+anyMatch(Predicate)=>filter+findFirst()=>reduce(BiOperator(x,y->x+y); => count() => max(->/::compareTo/comparing)
//=> sorted(по возраст./убыв.)+foreach(->/::) =>map(" "+toUpperCase) => skip(n)/limit(n) => flatMap(e->Stream.of(e.split(" ")))
        boolean result = Stream.of(5, 2, 0, -1, 10).anyMatch(x->x<0);
        System.out.println(result);
        int result2 = Stream.of(5, 2, 0, -1, 10).filter(x->x<1).findFirst().get();
        System.out.println(result2);
        int res3 = Stream.of(5, 2, 0, -1, 10).reduce((x, y) -> x + y).get();
        System.out.println(res3);
        long res4 = Stream.of(5, 2, 0, -1, 10).filter(x->x>0).count();
        System.out.println(res4);
        int res5 = Stream.of(5, 2, 0, -1, 10).max(Integer::compareTo).get();
        System.out.println(res5);
        int res6 = Stream.of(5, 2, 0, -1, 10).max((x, y) -> x - y).get();
        System.out.println(res6);
        String max = Stream.of("How", "I", "am", "being&").max(Comparator.comparing(String::length)).get();
        System.out.println(max);
        Stream.of(5, 2, 0, -1, 10).sorted().forEach(e-> System.out.print(e+", "));
        Stream.of(5, 2, 0, -1, 10).sorted((x, y) -> (y - x)).forEach(e-> System.out.print(e+" "));
        Stream.of("How", "I", "am", "being?").sorted(CharSequence::compare).forEach(System.out::println);
        System.out.println(Stream.of("How", "I", "am", "being?").map(e->e+" ").map(e->e.toUpperCase()).collect(Collectors.joining()));
        Stream.of(1,2,3,4,5).skip(2).limit(3).forEach(System.out::print);
        Stream.of("A B C", "2 3 1").flatMap(e->Stream.of(e.split(" "))).forEach(e-> System.out.print(e+","));

//4-5: ???Collectors.groupingBy/partitioningBy/counting()/summingInt/comparing/summarizingInt

//4-6: Optional: emptyList<I>.min().get() => min().ifPresent => min().OrElse(-1) => min()ifPresentOrElse(v->(),()->())
        List<Integer> emptyList = new ArrayList<>();
        Collections.addAll(emptyList, 2, 3, 4, 5, 1);
        System.out.println(emptyList.stream().min(Integer::compareTo).get());//NoSuchElementException
        emptyList.stream().min(Integer::compare).ifPresent(System.out::println);
        System.out.println(emptyList.stream().min(Integer::compare).orElse(-1));
        emptyList.stream().min(Integer::compareTo).ifPresentOrElse(v -> System.out.println(v), () -> System.out.println("Value Not found"));


    }
}
