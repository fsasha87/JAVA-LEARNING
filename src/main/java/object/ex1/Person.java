package object.ex1;

public class Person {
    private String name;
    Person(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Person "+name;
    }//Person Tom

    @Override
    public int hashCode() {
        return 10*name.hashCode()+1;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) return false;
        Person p = (Person)obj;
        return this.name.equals(p.name);
    }
}
