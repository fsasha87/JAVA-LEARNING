package common.exInitialization;

public class Initializing {
    public static void main(String[] args) {

        //порядок инициализации класса
        System.out.println(A.stA+" main");//выведет стат.блокА=>это
        System.out.println(B.stB+" main");//выведет стат.блокА=>стат.блокВ=>это
        A a = new A();//выведет стат.блокА=>нестат.блокА=>конструкторА
        B b = new B();//выведет стат.блокА=>стат.блокВ=>нестат.блокА=>конструкторА=>нестат.блокВ=>конструкторВ

    }
}
class A {
    String strA;
    int intA;
    static String stA = "static field A";

    {
        System.out.println("Нестатический блок A");
        System.out.println(strA + "-" + intA);
        strA = "AHello";
        intA = 1;
        System.out.println(strA + "-" + intA);
    }
    static {
        System.out.println("Статический блок A");
        System.out.println(stA);
        stA = "new static field A";
        System.out.println(stA);
    }
    public A () {
        System.out.println("Конструктор А");
    }
}

class B extends A {
    String strB;
    int intB;
    static String stB = "static field B";

    {
        System.out.println("Нестатический блок B");
        System.out.println(strB + "-" + intB);
        strB = "B-Hello";
        intB = 2;
        System.out.println(strB + "-" + intB);
    }
    static {
        System.out.println("Статический блок B");
        System.out.println(stB);
        stB = "new static field B";
        System.out.println(stB);
    }
    public B () {
        System.out.println("Конструктор B");
    }
}

//        Статический блок A
//        static field A
//        new static field A
//        new static field A main
//        Статический блок B
//        static field B
//        new static field B
//        new static field B main
//        Нестатический блок A
//        null-0
//        AHello-1
//        Конструктор А
//        Нестатический блок A
//        null-0
//        AHello-1
//        Конструктор А
//        Нестатический блок B
//        null-0
//        B-Hello-2
//        Конструктор B

