package exception;

public class Ex4 {
    public static void throwOne() throws Exception {
        int a = 5/0;
//        throws Exception
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (Exception e) {
            e.printStackTrace();
       }
        System.out.println("Done");
    }
}
