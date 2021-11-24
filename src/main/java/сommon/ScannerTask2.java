package сommon;
import java.util.Scanner;
public class ScannerTask2 {
    public static void main(String[] args){
        Scanner str = new Scanner(System.in);
        System.out.println("input your age: ");
        int age = str.nextInt();
        System.out.printf("My age is %d \n", age);
        System.out.println("My age is "+str.nextInt());//тоже самое

    }
}
