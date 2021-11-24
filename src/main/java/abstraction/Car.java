package abstraction;

public abstract class Car {
    String color;
    Car (String color){
        this.color=color;
    }
    public void gas (){
        System.out.println("Газуем");
    }
    public abstract void brake ();

}
