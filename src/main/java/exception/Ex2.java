package exception;

public class Ex2 {
    public static String errorMessage = "не повезло";

    public static void main(String[] args) {

        try {
            generateLuckyNumber();
        } catch (Exception e) {
//            System.out.println(errorMessage);;
            e.printStackTrace();
        }
    }
//напечатаем исключение
    static void generateLuckyNumber() throws Exception {
        int luckyNumber = 13;
//        int luckyNumber = (int) (Math.random() * 100);
        if (luckyNumber == 13) {
            throw new Exception();
        }
        System.out.println("твое счастливое число: " + luckyNumber);
    }
}


