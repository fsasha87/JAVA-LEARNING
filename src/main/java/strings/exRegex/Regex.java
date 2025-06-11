package strings.exRegex;

import java.lang.annotation.Retention;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String str1 = "Один два,три!четыре;пять шесть.семь";
        Pattern p1 = Pattern.compile("[ ,!;.]");
        String s[] = p1.split(str1);
        System.out.println("Исходная строка -> " + str1);
        for (String i : s) {
            System.out.println("Лексема: " + i);
        }

        Pattern p2 = Pattern.compile("java");
        String[] res = p2.split("dsjava10");
        System.out.println(Arrays.toString(res));//[ds, 10]

        System.out.println(Pattern.matches("y+z", "yyyyyz"));//true

        String input = "Hello Java! Hello JavaScript! JavaSE 8.";
        Pattern pattern = Pattern.compile("Java(\\w*)");
        Matcher matcher = pattern.matcher(input);
        while(matcher.find())
            System.out.println(matcher.group());
        String newStr = matcher.replaceAll("HTML");
        System.out.println(newStr); // Hello HTML! Hello HTML! HTML 8.


        String input2 = "Hello Java! Hello JavaScript! JavaSE 8.";
//        Pattern pattern2 = Pattern.compile("[ ,.!?]");
        Pattern pattern2 = Pattern.compile("\\s*(\\s|,|!|\\.)\\s*");
        String[] words = pattern2.split(input2);
        for(String word:words)
            System.out.println(word);


        Pattern p = Pattern.compile("(cat)");
        Matcher m = p.matcher("one cat, two cats, or three cats on a fence");
        StringBuffer sb = new StringBuffer();
        while (m.find())
            m.appendReplacement(sb, "$1erpillar");
        m.appendTail(sb);
        System.out.println(sb);


        String text = "This is my second java 45 project.\n" +
                "It is wonderful to learn polysemantics and arrays.\n" +
                "The weather is cold like it should be in winter, but we are all looking forward to spring.";
        Pattern p3 = Pattern.compile("\\b[\\w]{2}\\b");
        Matcher m1 = p3.matcher(text);
        while (m1.find()) {
            int start = m1.start();
            int end = m1.end();
            System.out.println("Found matches " + text.substring(start,end) + " from "+ start + " to " + (end-1) + " positions");
        }
        System.out.println("========");

        String text4 = "It is your phone";
        Pattern p4 = Pattern.compile("\\b[\\w]{2}\\b");//скомпилировали шаблон
        Matcher m4 = p4.matcher(text4);//создали поисковик шаблона в строке
        while (m4.find()) {
            int start = m4.start();
            int end = m4.end();
            System.out.println("Found matches " + text4.substring(start,end) + " from "+ start + " to " + (end-1) + " positions");
        }
        System.out.println(m4.matches());//false
        System.out.println(m4.lookingAt());//true
        text4 = m4.replaceAll("lab2");
        System.out.println("\nAfter: " + text4);//After: lab2 lab2 your phone

    }
}
