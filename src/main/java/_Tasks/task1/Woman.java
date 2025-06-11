package _Tasks.task1;

public class Woman {
    private String name;
    private int age;

    public Woman(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Woman{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void showWoman(){
        System.out.printf("Woman with name %s and age %d\n", name, age);
        System.out.println(String.format("Woman: name-%s, age-%d", name, age));
    }
}
