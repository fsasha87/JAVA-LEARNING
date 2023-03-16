package parser.exJAXB;

//import javax.xml.bind.annotation.XmlRootElement;
//import javax.xml.bind.annotation.XmlType;


import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "cat")//указывает, что класс участвует в JAXB сериализации (имя XML-тега)
@XmlRootElement//указывает на то, что этот объект может быть «корнем дерева»
class Cat
{
    public String name;
    public int age;
    public int weight;

    Cat()
    {
    }

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
//JAXB после java 11 не работает