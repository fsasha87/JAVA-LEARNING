package enums.ex5;

import java.util.Arrays;

public class MonthMain {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Month.getSummerMonth()));
        System.out.println(Month.JUNY.ordinal());//порядковый номер
        Month[] months = Month.values();
        System.out.println(Arrays.toString(months));//все месяца со свойствами
        System.out.println(months[1]);//Month{name='Июль', quantityDays=31}
        for(Month month: months){
            System.out.println(month);//все месяца со свойствами
        }
    }
}
