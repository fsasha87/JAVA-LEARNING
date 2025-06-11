package object.exCloneConstructor;

public class ClassA {
    private int field1 = 100;
    private String field2 = "Hello";
    public int getField1() {
        return field1;
    }
    public String getField2() {
        return field2;
    }
    public ClassA() {}
    public ClassA(ClassA other) {
        this.field1 = other.getField1();
        this.field2 = new String(other.getField2());
    }

    @Override
    public String toString() {
        return "ClassA{" +
                "field1=" + field1 +
                ", field2='" + field2 + '\'' +
                '}';
    }
}

