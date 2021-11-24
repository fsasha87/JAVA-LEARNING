package collections.map;

import collections.Country;

import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

public class EnumMapMain {
    public static void main(String[] args) {
        EnumMap <Country, Integer> enumMap = new EnumMap<Country, Integer>(Country.class);//создали мапу
        enumMap.put(Country.POLAND, 8);//добавляем объект в мапу
        enumMap.put(Country.UKRAINE, 1);
        enumMap.put(Country.BELARUS, 0);
        System.out.println(enumMap);//{BELARUS=0, POLAND=8, UKRAINE=1}
    }
}
