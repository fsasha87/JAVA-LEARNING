package clone.ex4;

public class DollySheet implements  Cloneable{//реализуем интерфейс клонейбл, для возможности клонирования
    private String name;//создали внутреннюю переменную имя
    DollySheet (String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

        @Override
    public Object clone() throws CloneNotSupportedException {//переопределили метод клон с класса обжект, так как они в разных пакетах
        return super.clone();}
}//теперь можно кланировать овечку в любом пакете

