package wrappers.ex1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer i = new Integer(682);
        String s = i.toString();
        System.out.println(s);//682
        System.out.println(i);//682
        String s2 = "82";
        Integer i2 = Integer.parseInt(s2);
        System.out.println(s2);//82
        System.out.println(i2);//82
        System.out.println(Integer.MAX_VALUE);//макс число int
        System.out.println(Integer.MIN_VALUE);//мин число int

        Integer a = new Integer(0);
        Integer b = new Integer(0);
        b = a;
        a = 1;
        System.out.println(b);//0

        int x = 2;
        Integer y = 5;
        x = y; //5 - автораспаковка
        System.out.println(x);
        y = x; // автоупаковка
        System.out.println(y);

        printNumber(new Integer(632));
    }

    public static void printNumber(int i) {
        System.out.println("Вы ввели число " + i);
        printNumber(7);//обычный int, даже без переменной
    }

    public static void printNumber(Integer i) {
        System.out.println("Вы ввели число " + i);
        int[] v = {1, 2, 3, 4, 5};
        printArray(v);//ошибка, не компилируется!
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}

