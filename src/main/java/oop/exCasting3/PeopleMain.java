package oop.exCasting3;

public class PeopleMain {
    public static void main (String [] args){
        People sam = new People("Sam");
        sam.display();//Name: Sam
        Object sam2 = new People("Sam");// восходящее преобразование (от подкласса внизу к суперклассу вверху иерархии) или upcasting. Такое преобразование осуществляется автоматически.
        People people = (People)sam2;//нисходящее преобразование или downcasting от суперкласса к подклассу
        people.display();//Name: Sam
        People aleks = new Worker("Aleks", "Lenovo");
        aleks.display();//Aleks works in Lenovo

        Object aleks2 = new Worker("Aleks", "Lenovo");
        Worker wor = (Worker)aleks2;
        wor.display();//Aleks works in Lenovo
        ((Worker)aleks2).display();//Aleks works in Lenovo
        System.out.println(((Worker)aleks2).getCompany());//Lenovo

        People rita = new Client("Rita", "PUMB", 10000);
        rita.display();//Client Rita has account in bank PUMB
        Object rita2 = new Client("Rita", "PUMB", 10000);
        ((People)rita2).display();//Client Rita has account in bank PUMB
        if (rita2 instanceof Worker){//проверяем, является ли переменная объктом типа
            ((Worker)rita).display();
        }
        else {
            System.out.println("Conversion invalid");
        }
    }
}
