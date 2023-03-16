package common.exArrays;


import java.util.Arrays;

public class ArraysMain {
    public static void main(String[] args) {
        int[] num = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
        Arrays.sort(num);//отсортировали по возрастанию массив
        System.out.println(Arrays.toString(num));//[-234, -2, 16, 26, 35, 43, 80, 92, 99, 167]
        int[] num2 = Arrays.copyOf(num, num.length);//скопировали массив и задали его длину
        System.out.println(Arrays.equals(num, num2));//true сравнили массивы по содержимому
        int[] num3 = Arrays.copyOfRange(num, 2,5);//скопировали часть массива
        System.out.println(num3);//[I@66a29884
        System.out.println(Arrays.toString(num3));//[16, 26, 35]

        int[][] array = { {1, 1}, {2, 2}};//создали двумерный массив
        System.out.println(Arrays.deepToString(array));//[[1, 1], [2, 2]]   вывели двумерный массив

        int[] x = new int[10];
        Arrays.fill(x, 3, 6, 999);
        System.out.println(Arrays.toString(x));//[0, 0, 0, 999, 999, 999, 0, 0, 0, 0]


        int[] x2 = {11, -2, 3, 0, 999, -20, 8, -20, 99, -20};
        Arrays.sort(x2);//отсортировали
        System.out.println(Arrays.toString(x2));//[-20, -20, -20, -2, 0, 3, 8, 11, 99, 999]
        System.out.println(Arrays.binarySearch(x2, 3));//5  ищем значение 3 логарифмическим поиском
    }
}
