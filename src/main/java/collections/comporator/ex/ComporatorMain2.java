package collections.comporator.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComporatorMain2 {
    public static void main(String[] args) {
        List<Woman> list = new ArrayList<>();
        Collections.addAll(list, new Woman("Kate", 15), new Woman("Ann", 30), new Woman("Lisa", 25));
//Реализация компаратора с помощью функционального интерфейса:
        list.sort(Comparator.comparing(Woman::getName).thenComparing(Woman::getId));
        list.sort(Comparator.comparing(Woman::getId));
        list.sort((o1, o2)->o2.getId()- o1.getId());//по убыванию
        list.sort(((o1, o2) -> o1.getName().length()-o2.getName().length()));//по длине строки
        System.out.println(list.toString());

//Реализация компаратора с помощью анонимного класса
        Comparator<Woman> idComparator = new Comparator<Woman>() {
            @Override
            public int compare(Woman o1, Woman o2) {
                return o1.getId()-o2.getId();
            }
        };

        Comparator<Woman> nameComparator = new Comparator<Woman>() {
            @Override
            public int compare(Woman o1, Woman o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        list.sort(idComparator);
        list.sort(nameComparator);
        list.sort(new Comparator<Woman>() {
            @Override
            public int compare(Woman o1, Woman o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });//реализация через анонимный класс


//Реализация компаратора с помощью внешнего класса
        list.sort(new NameComporator());//через внешний класс
        list.sort(new Woman.IdComparator());//через внешний внутрений статический класс
        list.sort(new IDCompar());//через внутрений класс
//        Collections.sort(list, new IDCompar());//тоже самое
        System.out.println(list.toString());
    }

    public static class IDCompar implements Comparator<Woman>{
        @Override
        public int compare(Woman o1, Woman o2) {
            return o1.getId()- o2.getId();
        }
    }
}
