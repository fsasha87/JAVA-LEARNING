package common.enums.ex5;

import java.util.Arrays;

public class MonthMain {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Month.getSummerMonth()));//[Month{name='Июнь', quantityDays=30}, Month{name='Июль', quantityDays=31}, Month{name='Август', quantityDays=31}]
        System.out.println(Month.JUNY.ordinal());//0    порядковый номер
        Month[] months = Month.values();
        System.out.println(Arrays.toString(months));//[Month{name='Июнь', quantityDays=30}, Month{name='Июль', quantityDays=31}, Month{name='Август', quantityDays=31}]
        System.out.println(months[1]);//Month{name='Июль', quantityDays=31}
        for(Month month: months){
            System.out.println(month);//все месяца со свойствами
        }
    }
}
