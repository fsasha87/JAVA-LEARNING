package exception;

public class Ex2 {
    public static String errorMessage = "не повезло";

    public static void main(String[] args) {

        try {
            generateLuckyNumber();//твое счастливое число: 50
        } catch (Exception e) {
            System.out.println(errorMessage);//не повезло
            e.printStackTrace();//java.lang.Exception: Unsuccess   at...
        }
    }
//напечатаем исключение
    static void generateLuckyNumber() throws Exception {
//        int luckyNumber = 13;
        int luckyNumber = (int) (Math.random() * 100);
        if (luckyNumber == 13) {
            throw new Exception("Unsuccess");
        }
        System.out.println("твое счастливое число: " + luckyNumber);
    }
}


