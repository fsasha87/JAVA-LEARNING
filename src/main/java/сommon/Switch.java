package сommon;
import java.util.Scanner;

public class Switch {
    public static void main(String [] args){
        Scanner line = new Scanner(System.in);
        System.out.println("Enter number");
        int num = line.nextInt();
        switch (num) {
            case 10:
                System.out.println("=1");
                break;
            case 8:
                System.out.println("=8");
                break;
            default:
                System.out.println("fail");

        }

    }
}
