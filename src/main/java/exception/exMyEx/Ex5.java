package exception.exMyEx;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) throws Ex5Exception {
        try {
            Scanner in = new Scanner(System.in);
            int x = in.nextInt();
            if (x >= 30) {
                throw new Exception("Надо х < 30");
            }
        }//создали свое исключение
        catch (Exception ex) {
            System.out.println(ex.getMessage());//
        }
    }
}

