package liamdastream.exStream2;

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
