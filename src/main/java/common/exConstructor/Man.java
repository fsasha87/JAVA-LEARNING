package common.exConstructor;

public class Man {
    String name;    // имя
    int age;        // возраст
    int weight;
    static int height = 180;
//    Man() { this ("Bob", 18); }
    { name = "Bob"; age = 12;
        weight=80;
    } //инициализация объекта через инициализатор
    Man(){}

    Man(String name, int a)
    {
        this.name=name;
        age=a;
    }

    Man(String name)
    {
        this (name, 18);
            }
    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}
