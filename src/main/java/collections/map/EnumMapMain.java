package collections.map;

import java.util.EnumMap;

public class EnumMapMain {
    public static void main(String[] args) {
        EnumMap <EnumMapCountry, Integer> enumMap = new EnumMap<EnumMapCountry, Integer>(EnumMapCountry.class);//создали мапу
        enumMap.put(EnumMapCountry.POLAND, 8);//добавляем объект в мапу
        enumMap.put(EnumMapCountry.UKRAINE, 1);
        enumMap.put(EnumMapCountry.BELARUS, 0);
        System.out.println(enumMap);//{BELARUS=0, POLAND=8, UKRAINE=1}
    }
}
