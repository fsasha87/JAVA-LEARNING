package incapsulation;

public class Girl {
    private int age;
    public Girl (int age){
        this.age=age;
    }//конструктор

        public int getAge(){
        return this.age;
    }//геттер для получения этого значения извне
    public void setAge(int age){
        if (age>0 && age<110)//можно добавить логику
        this.age=age;
    }//сеттер для изменения извне этого значения
}
