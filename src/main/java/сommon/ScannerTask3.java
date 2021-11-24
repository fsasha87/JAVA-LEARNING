package сommon;

import java.util.Scanner;

public class ScannerTask3 {
    public static void main (String[] args){
        Scanner str = new Scanner(System.in);
        System.out.print("Input text: ");
        String name = str.nextLine();
        System.out.print("Input age: ");
        int age = str.nextInt();
        System.out.print("Input height: ");
        float height = str.nextFloat();
        System.out.printf("%s, %d, %.2f \n", name, age, height);
//    str.close();
    }
}
