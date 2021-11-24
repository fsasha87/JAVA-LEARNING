package collections.set;
import collections.Country;

import java.util.EnumSet;
import java.util.Locale;

public class EnumSetMain {
    public static void main(String[] args) {
//        EnumSet<Country> asiaCountries = EnumSet.of(Country.ARMENIA, Country.INDIA, Country.KAZAKHSTAN);//создали коллекцию констант и добавили туда єл-ты
        EnumSet<Country> asiaCountries = EnumSet.allOf(Country.class);
        String countryName = "India";
        Country current = Country.valueOf(countryName.toUpperCase());
        if (asiaCountries.contains(current)){
            System.out.println("Asia action");
        }
        asiaCountries.forEach(c -> c.grow(1));
        System.out.println(Country.ARMENIA.getPopulation());

    }
}
