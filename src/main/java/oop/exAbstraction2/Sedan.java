package oop.exAbstraction2;

public class Sedan extends Car {
    int doorsNumber;

    Sedan(String color , int doors) {
        super(color); this.doorsNumber=doorsNumber;
    }


    @Override
    public void brake() {
        System.out.println("Тормозим");
    }

}
