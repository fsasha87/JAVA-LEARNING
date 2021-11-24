package classes;

public class Woman {
    String name;
    int age;
    String country;
    String city;
    public Woman (String name, int a){
        this.name=name;//параметры конструктора называются так же, как и поля класса
        age=a;//разные
        country = "Ukraine";//значение одинаково для всех объектов подобного конструктора
    }
    public Woman (String name){
        this(name, 18);
    }

    public Woman (int age) {
        this("Lena", age);
    }

    public void show () {
        System.out.printf("Name %s\tAge %d\tCountry %s\tCity %s\n", name, age, country, city);
    }

}