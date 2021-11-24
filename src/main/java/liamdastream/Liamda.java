package liamdastream;

@FunctionalInterface
interface ISum {
    public int sum (int a, int b);
}

public class Liamda {

    public static void main(String[] args) {
        ISum isum = new ISum() {//анонимный класс
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        };
        ISum isum2 = (a, b) -> a + b;;//тоже самое
//        ISum isum2 = (int a, int b) -> {return a + b;};//тоже самое
        System.out.println(isum.sum(5, 7));
        System.out.println(isum2.sum(3, 9));
    }

}
