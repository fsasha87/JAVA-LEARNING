package generics.ex1;

public class Main {
    public static void main(String[] args) {
        System.out.println(GenericMethod.asByte(Integer.valueOf(7)));//7
        System.out.println(GenericMethod.asByte(Float.valueOf(7.0F)));//7
        System.out.println(GenericMethod.asByte(Character.valueOf('7')));//0
    }
}
