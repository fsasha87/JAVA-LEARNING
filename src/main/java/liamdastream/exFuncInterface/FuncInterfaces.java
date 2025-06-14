package liamdastream.exFuncInterface;

import java.util.Comparator;
import java.util.function.*;

public class FuncInterfaces {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = x -> x > 0;
        System.out.println(isPositive.test(5));//true

        BinaryOperator<Integer> multiply = (x, y) -> x * y;
        System.out.println(multiply.apply(3, 5));//15

        UnaryOperator<Integer> square = x -> x * x;
        System.out.println(square.apply(5));//25

        Function<Integer, String> covert = x -> String.valueOf(x + "%");
        System.out.println(covert.apply(5));//5%

        BiFunction<Integer, Integer, Double>  biFunction = (x, y) -> Math.pow(x, y);
        System.out.println(biFunction.apply(3, 4));//81.0

        Consumer<String> printer = x -> System.out.println(x);
        printer.accept("Hi");//Hi

        BiConsumer<Integer, String> bc = (Integer x, String s) -> System.out.println(x+s);
        bc.accept(5, "$");//5$

        String s = "hi";
        Supplier<String> c = () -> s.toUpperCase();
        System.out.println(c.get());//HI

        BiPredicate<String, Integer> filter = (x, y) -> x.length() == y;
        System.out.println(filter.test("mkyong", 6));// true

    }
}
