package common.exConstructor1;

public class Car {
    String model;//объявили переменные
    int maxSpeed;

    public Car(String model, int maxSpeed) {//создали конструктор с двумя параметрами (свойствами)
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public Car(String model) {//конструктор с одним параметром
        this.model = model;
    }

    public Car() {
    }//конструктор по умолчанию без параметров(скрытый)

    public static void main(String[] args) {
        Car bugatti = new Car("Vesta", 400);//создали объект и вызвали конструктор для заполнения значений параметров
        Car kia = new Car("Stonic");
        Car opel = new Car();
        System.out.println(bugatti.model + " " + bugatti.maxSpeed);
        System.out.println(kia.model);
    }
}
