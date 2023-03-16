package common.exMethod;

public class Method {
    public static void main(String[] args) {
        hello();//вызываем методы       Hello
        bye("Vasya");//Bye Vasya
        sayHello("Яша");//Hello Яша!

        int a = 6;
        int b = 8;

        sum(a, b);  // 14
        sum(3,a);  // 9
        sum(5,23); // 28
        sum(1, 2, 3);           // 6
        sum(1, 2, 3, 4, 5);     // 15
        sum();                  // 0

        int [] array = {1, 22, 7, 10, 13};
        getSum(array);//53

    }

    static void hello() {
        System.out.println("Hello");
    }//создали метод без параметров

    static void bye(String name) {
        System.out.println("Bye " + name);
    }//создали метод с параметром

    static void sayHello(String name){ System.out.println("Hello " + name + "!"); }


    static void sum(int x, int y){
        int z = x + y;
        System.out.println(z);
    }

    static void sum(int ...nums){

        int result =0;
        for(int n: nums)
            result += n;
        System.out.println(result);
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