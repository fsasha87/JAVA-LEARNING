package liamdastream.exStream2;

public abstract class Animal {
    private String name;
    private Color color;
    private int age;

    public Animal (String name, Color color, int age){
        this.name=name;
        this.color=color;
        this.age=age;
    }

    public String getName () {
        return this.name;
    }

    public int getAge () {
        return this.age;
    }

    public Color getColor() {
        return color;
    }
}