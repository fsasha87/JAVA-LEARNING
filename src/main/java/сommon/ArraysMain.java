package сommon;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class ArraysMain {
    public static void main(String[] args) {
        int[] num = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
        Arrays.sort(num);//отсортировали по возрастанию массив
        System.out.println(Arrays.toString(num));//преобразование массива в строку
        int[] num2 = Arrays.copyOf(num, num.length);//скопировали массив и задали его длину
        System.out.println(Arrays.equals(num, num2));//сравнили массивы по содержимому
        int[] num3 = Arrays.copyOfRange(num, 2,5);//скопировали часть массива

        int[][] array = { {1, 1}, {2, 2}};//создали двумерный массив
        System.out.println(Arrays.deepToString(array));//вывели двумерный массив

        int[] x = new int[10];
        Arrays.fill(x, 3, 6, 999);
        System.out.println(Arrays.toString(x));


        int[] x2 = {11, -2, 3, 0, 999, -20, 8, -20, 99, -20};
        System.out.println(Arrays.toString(x2));
        Arrays.sort(x2);//отсортировали
        System.out.println(Arrays.binarySearch(x2, 3));//5  ищем значение 3 логарифмическим поиском
    }
}
