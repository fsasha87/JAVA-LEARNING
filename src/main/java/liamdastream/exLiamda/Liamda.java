package liamdastream.exLiamda;

@FunctionalInterface
interface ISum {
    int sum (int a, int b);
}

public class Liamda {

    public static void main(String[] args) {
        ISum isum = new ISum() {//анонимный класс
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        };
        ISum isum2 = (a, b) -> a + b;;//2сп. тоже самое
        ISum isum3 = (int a, int b) -> {return a + b;};//3сп. тоже самое
        System.out.println(isum.sum(5, 7));//12
        System.out.println(isum2.sum(4, 9));//13
        System.out.println(isum3.sum(2,6));//8
    }

}
