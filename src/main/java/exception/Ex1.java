package exception;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        try{
            Scanner in = new Scanner(System.in);
            int x = in.nextInt();
            if(x>=30){
                throw new Exception("Число х должно быть меньше 30");
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
//            ex.printStackTrace();
        }
        System.out.println("Программа завершена");
    }
}
