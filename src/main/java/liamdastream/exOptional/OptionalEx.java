package liamdastream.exOptional;

import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {

        int ar[] = null;
        int ar2[] = {1, 2, 3};
        int sum = 0;
//    for (int item : ar)
//        sum += item;
//        System.out.println(sum);//NullPointerException
        Optional<Integer> sumOpt = sumOpt(ar);
//        System.out.println(sumOpt.get());//NoSuchElementException или правильно
        if (sumOpt.isPresent()) System.out.println(sumOpt.get());//ничего или правильно
        if (sumOpt.isEmpty()) System.out.println("It is empty");
        System.out.println(sumOpt.orElse(5));//5.0 или правильно
        sumOpt.ifPresent(System.out::println);//ничего или правильно


    }

    public static Optional<Integer> sumOpt(int[] array) {
        Optional<Integer> sumOpt;
        if (array != null && array.length > 0) {
            int sum = 0;
            for (int item : array)
                sum += item;
            sumOpt = Optional.of(sum);
        } else {
            sumOpt = Optional.empty();
        }
        return sumOpt;
    }
}
