package oop.exCasting3;

public class Worker extends People{
    private String company;
    public String getCompany() {
        return company;
    }
    Worker(String name, String company) {
        super(name);
        this.company = company;
    }
    public void display (){
        System.out.printf("%s works in %s \n", super.getName(), getCompany());
    }
}
