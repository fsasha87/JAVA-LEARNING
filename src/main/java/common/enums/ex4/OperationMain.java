package common.enums.ex4;

public class OperationMain {
    public static void main (String [] args){
        Operation op = Operation.SUM;
        System.out.println(op.action(5, 6));//11
        System.out.println(op);//SUM
        op = Operation.SUBTRACT;
        System.out.println(op);//SUBTRACT
        System.out.println(op.action(6,5));//1
    }
}
