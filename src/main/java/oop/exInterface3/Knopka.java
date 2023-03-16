package oop.exInterface3;

public class Knopka {
    Pult pult;
    Knopka (Pult pult){
        this.pult=pult;
    }
    public void click(){
        pult.execute();
    }
}
