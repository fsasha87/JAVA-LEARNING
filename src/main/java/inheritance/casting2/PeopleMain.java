package inheritance.casting2;

public class PeopleMain {
    public static void main (String [] args){
//        People sam = new People("Sam");
//        sam.display();
        Object sam = new People("Sam");// восходящее преобразование (от подкласса внизу к суперклассу вверху иерархии) или upcasting. Такое преобразование осуществляется автоматически.
//        People aleks = new Worker("Aleks", "Lenovo");
//        aleks.display();
        People peo = (People)sam;//переменная sam приводится к типу People. И затем через объект peo мы можем обратиться к функционалу объекта peo
        //нисходящее преобразование или downcasting от суперкласса к подклассу
        peo.display();
        Object aleks = new Worker("Aleks", "Lenovo");
//        Worker wor = (Worker)aleks;
//        wor.display();
        ((Worker)aleks).display();
        System.out.println(((Worker)aleks).getCompany());

//        People rita = new Client("Rita", "PUMB", 10000);
//        rita.display();
        Object rita = new Client("Rita", "PUMB", 10000);
//        ((People)rita).display();
        if (rita instanceof Worker){//проверяем, является ли переменная объктом типа
            ((Worker)rita).display();
        }
        else {
            System.out.println("Conversion invalid");
        }




    }
}
