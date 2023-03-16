package oop.exCasting3;

public class Client extends People{
    String bank;
    int sum;
    Client (String name, String bank, int sum){
        super(name);
        this.bank=bank;
        this.sum=sum;
    }
    public void display () {
        System.out.printf("Client %s has account in bank %s \n", super.getName(), bank);
    }

}
