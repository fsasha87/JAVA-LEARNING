package oop.exInheritance;

public class Employee extends Person {
    private String company;
    public Employee (String name, String company){
        super(name);
        this.company=company;
    }//обязательно вызываем конструктор суперкласса и делегируем установку значения суперклассу
    public void work(){
        System.out.printf("%s works in %s \n", getName(), company);
    }


    @Override
    public void display() {//переопределяем метод суперкласса и меняем его реализацию
        super.display();//старый функционал оставляем
        System.out.printf("works in %s \n", company);//добавляем новый функционал
    }
}
