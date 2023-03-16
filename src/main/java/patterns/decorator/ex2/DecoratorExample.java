package patterns.decorator.ex2;

public class DecoratorExample {
    public static void main(String[] args) {
        Able able = new Decorator(new Impl());
        able.operation();//12
        Impl impl = new Impl();
        impl.operation();//1
        Decorator decorator = new Decorator(new Impl());
        decorator.operation();//12

    }

}

interface Able{
    void operation();
}

class Impl implements Able{
    @Override
    public void operation() {
        System.out.println(1);
    }
}

class Decorator implements Able{
    private Able able;

    public Decorator(Able able) {
        this.able = able;
    }


    @Override
    public void operation() {
        able.operation();
        System.out.println(2);
    }
}
