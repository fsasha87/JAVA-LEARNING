package classes;

public class Man {
    String name;    // имя
    int age;        // возраст
    Man(String name, int a)
    {
        this.name=name;
        age=a;
    }
    Man()
    {
        this ("Denis", 18);
            }
    Man(String name)
    {
        this (name, 18);
            }
    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}
