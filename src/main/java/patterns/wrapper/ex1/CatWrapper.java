package patterns.wrapper.ex1;

public class CatWrapper extends Cat{
    private Cat original;

    public CatWrapper(Cat cat) {
        super(cat.getName());
//        super(cat);
        this.original = cat;
    }

    public String getName() {
        return "Кот по имени "+original.getName();
    }

    public void setName(String name) {
       original.setName(name);
    }
}
