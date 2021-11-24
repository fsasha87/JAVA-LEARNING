package сommon;

public class Method {
    public static void main(String[] args) {
//        hello();
//        bye("Vasya");
//    }
//        static void hello () {
//            System.out.println("Hello");
//        }
//        static void bye(String name) {
//            System.out.println("Bye "+name);
//        }

//        int n=foo(3,4);
//        System.out.println(n);
//    }
//    static int foo (int a, int b){
//    return a*b;
//    }

//        foo(3,4);
//}
//    static void foo (int a, int b) {
//        int result = a*b;
//        System.out.println(result);
//        }

//        int a = 6;
//        int b = 8;
//        sum(a, b);  // 14
//        sum(3, a);  // 9
//        sum(5, 23); // 28
//    }
//    static void sum(int x, int y){
//
//        int z = x + y;
//        System.out.println(z);
//    }

//
//        sum(1, 2, 3);           // 6
//        sum(1, 2, 3, 4, 5);     // 15
//        sum();                  // 0
//    }
//    static void sum(int ...nums){
//
//        int result =0;
//        for(int n: nums)
//            result += n;
//        System.out.println(result);
//    }

//        sayHello("Яша");
//        String name = "Vasya"; sayHello(name); }
//    static void sayHello(String name){ System.out.println("Hello " + name + "!"); }

//    hello(); bye("Vasya");
//    String name = "Яша"; bye(name);
//    } //вызываем методы
//    static void hello () { System.out.println("Hello"); }//создали метод без параметров
//    static void bye(String name) { System.out.println("Bye "+name); }
        int [] array = {1, 22, 7, 10, 13};
        int sum = getSum(array);
    }
    static int getSum (int [] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
        return sum;
    }

}