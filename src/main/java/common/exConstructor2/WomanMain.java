package common.exConstructor2;

public class WomanMain {
    public static void main (String [] args){
        Woman kate = new Woman("Kate", 18);
        kate.show();//Name Kate	Age 18	Country Ukraine	City null
        kate.city="Kiev";
        kate.show();//Name Kate	Age 18	Country Ukraine	City Kiev
        Woman vera = new Woman ("Vera");
        vera.show();//Name Vera	Age 18	Country Ukraine	City null
        Woman lena =  new Woman(12);
        lena.show();//Name Lena	Age 12	Country Ukraine	City null

    }
}
