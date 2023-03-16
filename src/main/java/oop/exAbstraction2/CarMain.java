package oop.exAbstraction2;

public class CarMain {
    public static void main (String [] args){
        Sedan sedan = new Sedan("red", 4);
        sedan.gas();//Газуем
        sedan.brake();//Тормозим
    }
}
