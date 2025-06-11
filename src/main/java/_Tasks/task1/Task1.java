package _Tasks.task1;

import org.apache.logging.log4j.util.Chars;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
//1-1: i_array - создать, Arrays.sort, Arrays.toString, foreach, fori, while
        int[] array = {1,5,0,2,9,-1,8};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        for (int item : array)
            System.out.print(item + " ");
        System.out.println();
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i]+ " ");
        System.out.println();
        int k = 0;
        while (k < array.length) {
            System.out.print(array[k] + " ");
            k++;
        }

//1-2: array: найти сумму элементов двумерного массива, вывести 2хмерный массив (foreach, fori)
        int[][] array2D = {{2, 5, 0, 1},
                {3, 1, -1, 6},
                {0, -2, 6, 1}};
        int sum = 0;
        for (int[] arrayRow : array2D  ){
            for (int i : arrayRow){
               sum = sum + i;
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("Sum=" + sum);
        int sum2 = 0;
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[0].length; j++) {
                sum2 = sum2 + array2D[i][j];
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum="+sum2);
        System.out.println(Arrays.deepToString(array2D));

//1-3: String: S=>int(s_I_parseInt)=>S(s_S_valueOf); I=>i(i_intValue)=>I(s_I_valueof); S=>by[]=>sout=>S(newS); S=>char[]=>sout=>(2сп:newS/valueOf)S; S=>chars=>mapToObj(char)=>sout/joining()
        String str1 = "5";
        int num1 = Integer.parseInt(str1);
        String str2 = String.valueOf(num1);
//        Integer a = new Integer(25);
//        int a1 = a;
        Integer b = 25;
        int b1 = b.intValue();
        Integer c = Integer.valueOf(b1);
        String str3 = "Sasha";
        byte[] arBy = str3.getBytes();
        System.out.println(Arrays.toString(arBy));
        String str5 = new String(arBy);
        System.out.println(str5);
        char[] arChars = str3.toCharArray();
        System.out.println(Arrays.toString(arChars));
//        String str4 = String.valueOf(arChars);
        String str4 = new String(arChars);
        System.out.println(str4);
        str3.chars().mapToObj(e->(char)e).forEach(System.out::print);
        str3.chars().mapToObj(e->String.valueOf((char)e)).forEach(System.out::print);
        String s10 = str3.chars().mapToObj(e->String.valueOf((char)e)).collect(Collectors.joining());
        System.out.println(s10);

// 1-4: String=>SB->append=>insert=>reverse=>2сп(newS/toString):sb-String=>concat=>split=>sout=>s_S_join=>S_substring=>toUpperCase => StringJoiner(add(S).add(S).toString)
        String s2 = "Hello";
        StringBuilder sb = new StringBuilder(s2);
        sb.append(" world!");
        sb.insert(6, "my ");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        String s3 = sb.toString();
        String s4 = new String(sb);
        String s5 = s3.concat(s4);
        String[] strings = s5.split(" ");
        System.out.println(Arrays.toString(strings));
        String s6 = String.join("-", strings);
        System.out.println(s6);
        String s7 = s6.substring(5,9);
        System.out.println(s7.toUpperCase());
        StringJoiner joiner = new StringJoiner(" ");
        String result = joiner.add("Hello").add("world").add("!").toString();
        System.out.println(result);

//1-5: regex: S_str => p=Pattern.compile("[,:;]") => p.split(str) => sout(ar);
        String st1 = "Один два,три!четыре;пять шесть.семь";
        Pattern pattern = Pattern.compile("[ ,!:;.]");
        String[] arrayReg = pattern.split(st1);
        System.out.println(Arrays.toString(arrayReg));

//1-6: regex: sout(Pattern.matches("\\w*", "Thanks!")) => 2сп: (pattern => matcher => sout(m.matches()|m.lookingAt()))
        String regex1 = "\\w*";
        String text = "Thanks!";
        System.out.println(Pattern.matches(regex1, text));//1сп
        Pattern p1 = Pattern.compile(regex1);
        Matcher m1 = p1.matcher(text);
        System.out.println(m1.matches());//2сп
        System.out.println(m1.lookingAt());

//1-7: regex: pattern("\\b[\\w]{2}\\b")=>matcher(s)=>while(m.find())sout(s.substring(m.start,m.end))=>m.replaceAll("X")
        String text2 = "This is my second java 45 project.\n";
        String regex2 = "\\b[\\w]{2}\\b";
        Pattern p2 = Pattern.compile(regex2);
        Matcher m2 = p2.matcher(text2);
        while (m2.find())
            System.out.println(text2.substring(m2.start(), m2.end()));
        System.out.println(m2.replaceAll("XX"));

//1-8: конструктор: Woman (name, age)), геттер-сетер-тустринг, showWoman(printf, String.format)
        Woman woman = new Woman("Alla", 30);
        System.out.println(woman);
        woman.showWoman();

//1-9: Exception: 5/0 => catch(e.printStackTrace/throw e/ throw new ArifmeticException => catch{arifExc} => finally
        try {
            System.out.println(5 / 0);
//        } catch (Exception e){
        } catch (ArithmeticException e){
            System.out.println("This is mistake");
//            e.printStackTrace();
//            throw e;
//            throw new ArithmeticException();
        } finally{
            System.out.println("Executes always");
        }

//1-10: Exception: Scanner => if<10 throw new ArEx(без try)/ throw new Exception(S_message)+catch(e.getMassage)/ throw MyException(C)+констр(super(message);)+тустринг)
//        Scanner sc = new Scanner(System.in);
//                try {
//                    int num = sc.nextInt();
//                    if (num < 10)
////                        throw new ArithmeticException();
////                        throw new Exception("Some exception");
//                        throw new MyException("My exception");
//                    System.out.println("Done");
//                } catch (Exception e) {
////                }catch (MyException e){
//                    e.printStackTrace();
////                    System.out.println(e.getMessage());;
//                }

//1-11: Сканнер - ввести 2 числа, switch(a|b), if (a>b), ternar z= разница или сложение если а>b
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter two numbers");
//        try{
//            int n1 = scanner.nextInt();
//            int n2 = scanner.nextInt();
//            switch (n1 | n2){
//                case 10:
//                    System.out.println("=10");
//                    break;
//                default:
//                    System.out.println("not 10");
//            }
//            if (n1 > n2)
//                System.out.println("More");
//            else if (n1 < n2)
//                System.out.println("Less");
//            else
//                System.out.println("Equals");
//            int z = (n1>n2) ? (n1-n2) : (n1+n2);
//            System.out.println(z);
//        } catch (Exception e){
//            System.out.println("It is not a number");
//        }

//1-12: enum - Month=i_days+конструкор+геттер+тустринг(+name())+JAN(31), => sout(Jan/name()/ordinal)=>sout(Mon[]_values/Mon_valueOf)
        System.out.println(Month.FEBRUARY);
        System.out.println(Month.FEBRUARY.name());
        System.out.println(Month.JANUARY.getQuantity());
        System.out.println(Month.FEBRUARY.ordinal());
        System.out.println(Arrays.toString(Month.values()));
        System.out.println(Month.valueOf("JANUARY"));

//1-13: inner class: веловипед(S_outname) - поехали, getWheel(wheel.inName); колесо(S_inName) - повернули+S_Outname+getOutName). => B.W w=b.w()
        Bicycle bicycle = new Bicycle();
        bicycle.go();
        bicycle.getWheel();
        Bicycle.Wheel wheel = bicycle.new Wheel();
        wheel.turnLeft();

//1-14: static inner class: веловипед(S_outname) - поехали, getWheel(wheel.inName); колесо(S_inName) - повернули+o.S_Outname+o.getOutName).=> B.W w=newB.W()

//1-15: ???локальный класс
    }
}
