package сommon;
import java.util.Scanner;
public class ScannerTask {
    public static void main(String [] args){
          int a, b;
          Scanner sum = new Scanner(System.in);
        System.out.println("Input a: ");
        a = sum.nextInt();
        System.out.println("Input b: ");
        b = sum.nextInt();
        if (a>b&&a>7) {
        System.out.println("a more than b");}
        else if (a<b) {
            System.out.println("a smaller than b");
        }
        else {
            System.out.println("a is equal b");
        }

    }
}
