package clone.ex1;

public class Car{
    public String color;

    Car(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "{" +
                "color car='" + color + '\'' +
                '}';
    }
}