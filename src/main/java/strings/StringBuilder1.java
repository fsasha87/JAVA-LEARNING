package strings;

public class StringBuilder1 {
    public static void main(String[] args) {
        String string = "Учиться, учиться и еще раз учиться! ";
        System.out.println(addTo(string, new String[]{"Под ", "лежачий ", "камень ", "вода ", "не ", "течет"}));
        System.out.println(replace(string, ", ", 16, 27));
    }

    public static StringBuilder addTo(String string, String[] strings) {
        StringBuilder sb = new StringBuilder(string);
        for (String item : strings){
            sb.append(item);}
        return sb;
    }

    public static StringBuilder replace(String string, String str, int start, int end) {
        StringBuilder sb = new StringBuilder(string);
        sb.replace(start,end, str);
        return sb;
    }
}


