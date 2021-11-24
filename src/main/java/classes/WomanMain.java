package classes;

public class WomanMain {
    public static void main (String [] args){
        Woman kate = new Woman("Kate", 18);
        kate.city="Kiev";
        kate.show();
        Woman vera = new Woman ("Vera");
        vera.show();
        Woman lena =  new Woman(12);
        lena.show();

    }
}
