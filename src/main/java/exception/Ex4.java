package exception;

public class Ex4 {
        public static void main(String[] args) {
        try {
            int a = 5/0;
        } catch (Exception e) {
            e.printStackTrace();//java.lang.ArithmeticException: / by zero  at exception.Ex4.main(Ex4.java:6)
       }
        System.out.println("Done");//Done
    }

}
