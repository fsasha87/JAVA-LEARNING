package oop.exCasting3;

public class People {
    private String name;
    People (String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void display(){
        System.out.printf("Name: %s \n", getName());
    }
}
