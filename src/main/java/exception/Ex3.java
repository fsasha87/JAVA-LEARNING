package exception;

public class Ex3 {
    public static void main (String [] args){
    try{int[] numbers = new int[3]; numbers[4]=45; System.out.println(numbers[4]);}
catch(Exception ex){ex.printStackTrace(); System.out.println(ex);} finally{System.out.println("вып.всегда, если есть");}
//System.out.println("Элемента нет");
    }
}
//ex.printStackTrace();