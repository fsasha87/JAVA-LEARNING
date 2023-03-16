package patterns.abstractfactory;
// system property
// fqn parameter
// java -DafactoryFQN=abstractfactory.Factory1
public class Test {
    public static void main(String[] args) {
        System.setProperty("afactoryFQN", "abstractfactory2.Factory1");
//		System.setProperty("afactoryFQN", "abstractfactory2.Factory2");

        AbstractFactory af;

        af = AbstractFactory.getFactory();

        A a = af.getA();
        a.m();

        B b = af.getB();
        b.n1();
        b.n2();
    }
}

interface AbstractFactory {
    A getA();
    B getB();

    static AbstractFactory getFactory() {
        AbstractFactory factory = null;
        try {
            Class<?> c = Class.forName(System.getProperty("afactoryFQN"));
//			c.newInstance(); // <-- not so good!
            factory = (AbstractFactory) c.getDeclaredConstructor().newInstance();
        } catch (ReflectiveOperationException ex) {
            throw new IllegalStateException(ex);
        }
        return factory;
    }
}

interface A {
    void m();
}

interface B {
    void n1();
    void n2();
}

///////////

class Factory1 implements AbstractFactory {

    public A getA() {
        return new A1();
    }

    public B getB() {
        return new B1();
    }

}

class A1 implements A {
    public void m() {
        System.out.println("A1#m");
    }
}

class B1 implements B {
    public void n1() {
        System.out.println("B1#n1");
    }

    public void n2() {
        System.out.println("B1#n2");
    }
}

///////////

class Factory2 implements AbstractFactory {

    public A getA() {
        return new A2();
    }

    public B getB() {
        return new B2();
    }

}

class A2 implements A {
    public void m() {
        System.out.println("A2#m");
    }
}

class B2 implements B {
    public void n1() {
        System.out.println("B2#n1");
    }

    public void n2() {
        System.out.println("B2#n2");
    }
}

/*

abstractfactory
	AbstractFactory
	A
	B
abstractfactory.factory1
	Factory1
	A1
	B1
abstractfactory.factory2
	Factory2
	A2
	B2

 */





