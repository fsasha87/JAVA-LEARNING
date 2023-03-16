package exception;

public class Ex3 {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[3];
            numbers[4] = 45;
            System.out.println(numbers[4]);
        } catch (Exception ex) {
            ex.printStackTrace();//java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 3     at...
            System.out.println(ex);//java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 3
        } finally {
            System.out.println("вып.всегда, если есть");
        }
        System.out.println("Элемента нет");//Элемента нет (выполнился потому, что есть catch)
    }
}
