package enums.ex4;

public class OperationMain {
    public static void main (String [] args){
        Operation op = Operation.SUM;
        System.out.println(op.action(5, 6));
        System.out.println(op);
        op = Operation.SUBTRACT;
        System.out.println(op);
        System.out.println(op.action(6,5));
    }
}
