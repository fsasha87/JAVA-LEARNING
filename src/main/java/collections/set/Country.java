package collections.set;

public enum Country {
    ARMENIA (3, 28000),
    BELARUS (9, 203000),
    INDIA (1270, 3000000),
    KAZAKHSTAN (18, 2700000),
    POLAND (38, 306000),
    UKRAINE (43, 580000);
    private int population;
    private int landArea;

    Country(int population, int landArea) {
        this.population = population;
        this.landArea = landArea;
    }

    public void grow (int additionalPopulation){
        population += additionalPopulation;
    }

    public int getPopulation() {
        return population;
    }

    public int getLandArea() {
        return landArea;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setLandArea(int landArea) {
        this.landArea = landArea;
    }

}
