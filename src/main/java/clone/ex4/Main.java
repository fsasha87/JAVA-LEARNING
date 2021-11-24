package clone.ex4;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
//        try {
            DollySheet dollySheet = new DollySheet("Ovca");//создали объект овечки
            DollySheet dollySheet2 = (DollySheet) dollySheet.clone();//вторая овечка
            System.out.println(dollySheet.getName());
            System.out.println(dollySheet2.getName());
            dollySheet.setName("Dolly");//дали  имя овечкам другого класса
            dollySheet2.setName("Sheet");
            System.out.println(dollySheet.getName());
            System.out.println(dollySheet2.getName());

//        } catch (CloneNotSupportedException ex) {
//
//            System.out.println("Clonable not implemented");
//        }
    }
}
//    public static DollySheet foo(DollySheet dollySheet2){
//        DollySheet sheet = null;//создали ссылку на результат
//        try {//обработали ошибку блоком try-catch
//            sheet = (DollySheet)dollySheet2.clone();//привели результат к типу объекта dollySheet, вызвали переопределенный метод клон и присвоили ссылку к объкту клона
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();        }
//        return sheet;//метод вернет овечку    }   }
