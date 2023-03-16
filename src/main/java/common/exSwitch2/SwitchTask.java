package common.exSwitch2;
import java.util.Scanner;
public class SwitchTask {
    public static void main (String[] args){
        Scanner str = new Scanner(System.in);
        System.out.println("Введите номер операции: 1.Сложение  2.Вычитание  3.Умножение");
        int num = str.nextInt();
        System.out.println("ВВедите 2 числа");
        int a = str.nextInt();
        int b = str.nextInt();
        switch (num) {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            default:
                System.out.println("unknown");
                break;
        }

    }
}

