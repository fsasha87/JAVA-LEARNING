package common.exTernar.taskCycle;

import java.util.Arrays;

public class CycleArrayTask {
    public static void main(String[] args) {
        System.out.println("java".regionMatches(1, "avatar", 0, 3));
        task1();
        task2();
    }
    public static void task1(){
        int[] array = {5, 0, 3, -10, 10, -2};
        //1.найти максимальное значение массива; 2.найти максимальное значение
        System.out.println(Arrays.toString(array));
        int max = array[0];
        for (int value : array) {
            if (value > max)
                max = value;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0)
                array[i] = max;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void task2(){
        int[][] array2D = { { 1, 2, 3, 4, 5 },
                { 5, 4, 3, 2, 1 },
                { 0, 2, 0, 4, 0 } };
//найти сумму элементов двумерного массива и вывести 2хмерній массив
        int sum = 0;
        for (int arrayRow[] : array2D){
            for (int item : arrayRow){
                sum = item + sum;
            }
        }
        System.out.println(sum);

        for (int arrayRow[] : array2D){
            for (int item : arrayRow){
                System.out.print(item + " ");
            }
            System.out.println();
        }




    }
}
