package exception.exMyEx;

public class Ex5Exception extends Throwable{
    public Ex5Exception myExc (){
        System.out.println("My exception");
        return this;
    }
}
