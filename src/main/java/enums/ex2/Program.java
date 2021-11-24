package enums.ex2;



public class Program {
    public static void main (String [] args){
        Book b1 = new Book("War and Peace", "L.Tolstoy", Typ.BELLETRE);
        System.out.println(b1.name +"\t"+b1.typ );
        Typ [] typs = Typ.values();//метод возвращает массив всех констант
        for (Typ s: typs) {
            System.out.println(s);
        }
        System.out.println(Typ.PHANTASY.ordinal());//метод показывает порядковый номер константы
    }
}
