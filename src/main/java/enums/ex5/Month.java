package enums.ex5;

public enum Month {
    JUNY("Июнь", 30),
    JULY("Июль", 31),
    AUGUST("Август", 31);
    private String name;
    private int quantityDays;

    Month(String name, int quantityDays) {
        this.name = name;
        this.quantityDays = quantityDays;
    }

    public static Month[] getSummerMonth() {
        return new Month[]{JUNY, JULY, AUGUST};
    }

    public String getName() {
        return name;
    }

    public int getQuantityDays() {
        return quantityDays;
    }

    @Override
    public String toString() {
        return "Month{" +
                "name='" + name + '\'' +
                ", quantityDays=" + quantityDays +
                '}';
    }
}
