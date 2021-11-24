package objects;

public class PersonMain {
    public static void main (String [] args){
        Person tom = new Person("Tom");
        System.out.println(tom.toString());//строковое представления объекта
        System.out.println(tom.hashCode());//выводим числовое значение объекта, а если переопределить этот метод то можно установить числовой код
        System.out.println(tom.getClass());//позволяет получить тип данного объекта
        Person nick = new Person ("Nick");
        System.out.println(tom.equals(nick));
        Person tom2 = new Person ("Tom");
        System.out.println(tom.equals(tom2));
        System.out.println(tom.hashCode()==tom2.hashCode());
    }
}
