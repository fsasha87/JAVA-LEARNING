package collections.iterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorMain {
    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<>();
        states.add("Spain");
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        ListIterator<String> listIter = states.listIterator();
        System.out.println(listIter.next());//возвращает текущий элемент и переходит к следующему
        System.out.println(listIter.nextIndex());
        System.out.println(listIter.next());
        while (listIter.hasNext()){
            System.out.println(listIter.next());
        }
        listIter.set("Ukraine");//меняем значение текущего єлемента (сейчас последний)
        System.out.println(states.get(3));
        System.out.println(listIter.previousIndex());//выводит индекс текущего элемента
        System.out.println(listIter.previous());//возвращает текущий элемент и переходит к предыдущему
        while (listIter.hasPrevious()){
            System.out.println(listIter.previous());
        }
    }
}
