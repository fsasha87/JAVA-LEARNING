package common.exCycle;


import java.util.Scanner;

public class Cycle {
    public static void main (String args[]) {
//цикл for
        for (int i = 1; i < 9; i++) {
            System.out.printf("Квадрат числа %d равен %d \n", i, i * i);
        }
//цикл do while
        int j = 1;
        do {
            System.out.print(j + " ");//1 2 3 4 5 6
            j++;
        }
        while (j < 7);
//цикл while
        System.out.println();
        int k = 0;
        while (k <= 5) {
            System.out.print(k + " ");//0 1 2 3 4 5
            k++;
        }
//break & continue
        System.out.println();
        for (int l=0; l<5; l++) {
            if (l == 3)
            break;
            System.out.print(l+" ");//0 1 2
        }
        System.out.println();
        for (int n=0; n<5; n++) {
            if (n==3)
            continue;
            System.out.print(n+" ");//0 1 2 4
        }
//задача таблица умножения
        for (int x=1; x<10; x++){
            for (int z=1; z<10; z++){
                int y = x*z;
                System.out.printf("%d\t", y);
            }
            System.out.println();
        }//программа выводит таблицу умножения
//задача
        System.out.println();
        int num1, num2;
        Scanner str = new Scanner(System.in);
        int n = 0;
        do {
            System.out.println("Введите первое число");
            num1 = str.nextInt();
            System.out.println("введите 2е число");
            num2 = str.nextInt();
            System.out.println("Сумма: " + num1 * num2);
            System.out.println("Для выхода нажмите 1, а если хотите продолжить то нажмите другое число");
            n = str.nextInt();
        } while (n != 1);



    }

}
