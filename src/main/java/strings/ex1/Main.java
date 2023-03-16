package strings.ex1;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String name = "Саша";
        int age = 40;
        System.out.println(String.format("Я %s. Мне %d лет.", name, age));//Я Саша. Мне 40 лет.

        String str1 = "Hello";
        System.out.println(str1.charAt(2));//l
        char[] chars = new char[3];
                str1.getChars(0,3, chars, 0);
        System.out.println(chars);//Hel

        String str2 = "How are you";
        StringBuilder sb = new StringBuilder(str2);
        sb.insert(2, "EEE");
        System.out.println(sb);//HoEEEw are you
        sb.reverse();//перевернули строку
        System.out.println(sb.toString());//uoy era wEEEoH

        System.out.println(new StringBuilder("Java").append(" best"));//Java best

        String str = "Good. news/ every-one";
        StringTokenizer st = new StringTokenizer(str, "./-");
        while (st.hasMoreTokens()){
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}
