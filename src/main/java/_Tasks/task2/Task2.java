package _Tasks.task2;

import jdk.swing.interop.SwingInterOpUtils;

public class Task2 {
    public static void main(String[] args) {
//2-1: casting: Animal->S_name->Con(name)->v_say->v_move; Cat->Con(name)->@say->v_run; newCat,newAn,newAnCat=>instanceOf
        Animal an = new Animal("Anim");
        an.move();
        an.say();
        System.out.println(an instanceof Animal);//true
        System.out.println(an instanceof  Cat);//false
        Cat cat = new Cat("Murka");
        cat.run();
        cat.move();
        cat.say();
        System.out.println(cat instanceof Animal);//true
        System.out.println(cat instanceof Cat);//true
        Animal anCat = new Cat("AnCatMurka");
        anCat.move();
        an.say();
        ((Cat)anCat).run();
        System.out.println(anCat instanceof Animal);//true
        System.out.println(anCat instanceof Cat);//true

//2-2: Interfaces: Printable(I)+i_SIGNAL+v_print();+d_v_check(){}+s_v_read(){} => Journal(C)+Con(name);=> newJournal/newI+вызов методов/полей
        Journal journal = new Journal("Facts");
        journal.print();
        journal.check();
        System.out.println(Journal.SIGNAL);
        Printable printable = new Journal("I_facts");
        printable.print();
        printable.check();
        Printable.read();
        System.out.println(Printable.SIGNAL);

//2-3: anonimous class: AbleToEat(I) => v_eat() => new => override
        new AbleToEat(){
            @Override
            public void eat() {
                System.out.println("I can eat!");
            }
        }.eat();

//2-4: Generic type/класс: Account<T>(C)+T_id => new Account<S/I/F>+sout(getId)
        Account<Integer> acc1 = new Account<>(31);
        System.out.println(acc1.getId());
        Account<String> acc2 = new Account<>("fd234");
        System.out.println(acc2.getId());
        Account<Float> acc3 = new Account<>(0.20f);
        System.out.println(acc3.getId());

//2-5: Generic method: Printer(C)(v_<T>_print(T_t)) => new Printer.<S,I,F,Cat...>print
            Printer printer = new Printer();
            printer.<String>print("Hello");
            printer.<Integer>print(14);
            printer.<Cat>print(new Cat("Murka"));

//2-6: Object : До/после переопределения: p1(20, "Sasha").equals(p2(20, "Sasha"))=>p1.hashcode()==p2.hashcode() => p1==p2 => p1.getClass.getName
//=> переопределить: hashcode(31*id+name.hashCode(notnull)) =>equals(проверка ссылок+ссылка null+общий класс+числовые поля+строк.поля)
        Student stud1 = new Student(20, "Sasha");
        Student stud2 = new Student(20, "Sasha");
        System.out.println(stud1.equals(stud2));
        System.out.println(stud1.hashCode() == stud2.hashCode());
        System.out.println(stud1 == stud2);
        System.out.println(stud1.getClass().getName());

//2-7: Object clone: Person(clonable+@p_O_super.clone()) => p2=(P)p1.clone() => p2.setName + sout(p2)
        try {
            Person per1 = new Person("Petro", 20);
            Person per2 = (Person) per1.clone();
            System.out.println(per1);
            System.out.println(per2);
            per2.setName("Ivan");
            System.out.println(per1);
            System.out.println(per2);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

//2-8: ObjInObj clone: Author(name)+p_A_super.clone => Book(name,author)+clone((B)super.clone();+-(A)this.author.clone())=>(создать-клонировать-изменить-sout) => сравнить ссылочное поле исходного объекта при поверхносном клонировании до/после изменения
        try {
            Book book1 = new Book("Atlant", new Author("Rand"));
            Book book2 = book1.clone();
            System.out.println(book1);
            System.out.println(book2);
            book2.setAuthor(new Author("Shevchenko"));
//            book2.setName("War");
            System.out.println(book1);
            System.out.println(book2);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }
}
