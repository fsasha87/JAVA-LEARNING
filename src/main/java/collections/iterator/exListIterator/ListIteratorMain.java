package collections.iterator.exListIterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorMain {
    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<>();
        states.add("Spain");
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        System.out.println(states);//[Spain, Germany, France, Italy]
        ListIterator<String> listIter = states.listIterator();
        System.out.println(listIter.next());//Spain возвращает текущий элемент и переходит к следующему
        System.out.println(listIter.nextIndex());//1
        System.out.println(listIter.next());//Germany
        while (listIter.hasNext()){
            System.out.println(listIter.next());//France Italy
        }
        listIter.set("Ukraine");//меняем значение текущего єлемента (сейчас последний)
        System.out.println(states.get(3));//Ukraine
        System.out.println(listIter.previousIndex());//3    выводит индекс текущего элемента
        System.out.println(listIter.previous());//Ukraine   возвращает текущий элемент и переходит к предыдущему
        while (listIter.hasPrevious()){
            System.out.println(listIter.previous());//France    Germany   Spain
        }
    }
}
