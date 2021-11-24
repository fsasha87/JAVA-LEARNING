package classes;



public class Car2 {
    String color;
    public Car2 (String color) { this.color = color;}  // создали конструктор для указания цвета, при создании объекта
    void show(){
        System.out.println(color);
    }
public static void main (String [] args) { Car2 car2 = new Car2("Red");
    car2.show();
    System.out.println("It is " + car2.color);
        }
}
