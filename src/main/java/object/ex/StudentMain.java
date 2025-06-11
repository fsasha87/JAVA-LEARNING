package object.ex;

public class StudentMain {
    public static void main(String[] args) {
        Student stud1 = new Student(20, "Sasha");
        Student stud2 = new Student(20, "Sasha");
        System.out.println(stud1 == stud2);//false
        System.out.println(stud1.equals(stud2));//true
        System.out.println(stud1.hashCode() == stud2.hashCode());//true

        Student stud4 = stud2;
        System.out.println(stud4 == stud2);//true
        System.out.println(stud4.equals(stud2));//true
        System.out.println(stud4.hashCode() == stud2.hashCode());//true

        Student stud3 = new Student(20);
        System.out.println(stud1.equals(stud3));//false
        System.out.println(stud1.hashCode() == stud3.hashCode());//false




    }
}
