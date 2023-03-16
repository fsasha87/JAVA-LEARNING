package oop.exInterface3;

public class Main {
    public static void main (String args[]){
        Knopka tvKnopka = new Knopka(new Pult() {
            @Override
            public void execute() {
                System.out.println("ТВ выключен");
            }
        });
        Knopka wondowKnopka = new Knopka(new Pult() {
            @Override
            public void execute() {
                System.out.println("окно закрыто");
            }
        });
        tvKnopka.click();
        wondowKnopka.click();
    }

}
