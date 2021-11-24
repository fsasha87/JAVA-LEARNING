package liamdastream.ex1;

import liamdastream.ex1.Animal;

import java.util.ArrayList;

public class Owner {
    private String name;
    private ArrayList<Animal> pets = new ArrayList<>();

    public Owner(String name) {
        this.name = name;
    }

    public ArrayList<Animal> getPets (){
        return pets;
    }



}
