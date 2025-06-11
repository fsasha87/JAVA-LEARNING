package _Tasks.task3;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
//3-1: ArrayList: создать arraylist -> add -> sort -> foreach -> list.forEach(->;::) -> L<S>_listIterator() (while (hasNext))
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Spring", "Summer", "Winter", "Autumn");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        list.forEach(e-> System.out.print(e+ " "));
        list.forEach(System.out::println);
        for (String item : list)
            System.out.print(item+ "-");
        ListIterator<String> listIter = list.listIterator();
        while (listIter.hasNext())
            System.out.print(listIter.next()+"->");

//3-2: set -> Collections.addAll -> set.iterator() -> while (hasNext)
        Set<String> set = new HashSet<>();
        Collections.addAll(set, "Summer", "Winter", "Autumn", "Spring");
        System.out.println(set);
        Iterator<String> iter = set.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());

//3-3: HashMap => put => for Map.Entry<k,v> + sout(k+v) -> map.keySet() -> map.values() -> map.entrySet()+sout -> map.entrySet().iterator()
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "num1");
        map.put(2, "num2");
        map.put(3, "num3");
        for (Map.Entry<Integer,String> item : map.entrySet())
            System.out.println(item.getKey() + " " + item.getValue());
        Set<Integer> setKeys = map.keySet();
        System.out.println(setKeys);
        Collection<String> col = map.values();
        System.out.println(col);
        Set<Map.Entry<Integer,String>> entrySet = map.entrySet();
        System.out.println(entrySet);
        Iterator iter1 = map.entrySet().iterator();
        while (iter1.hasNext())
            System.out.println(iter1.next());

//        3-4: Deque => StackLIFO(push+while sout(pop)) => FIFO(offer+sout(poll))
        Deque<String> deque = new ArrayDeque();
        deque.push("el1");
        deque.push("el2");
        System.out.println(deque);//[el2, el1]
        System.out.println(deque);//[el2, el1]
        while (!deque.isEmpty())
            System.out.println(deque.pop());
        System.out.println(deque);//[]
        Deque<String> dequeFifo = new ArrayDeque<>();
        dequeFifo.offer("fifo-1");
        dequeFifo.offer("fifo-2");
        System.out.println(dequeFifo);//[fifo-1, fifo-2]
        System.out.println(dequeFifo);//[fifo-1, fifo-2]
        while (!dequeFifo.isEmpty())
            System.out.println(dequeFifo.poll());
        System.out.println(dequeFifo);//[]

//3-5: comporator: Worker(name,age)=>List+add+sort=>1сп(ан.кл.):newComparator<W>{@O+id/name}); => 2сп:(o1,o2)->o1.get-o2.get)+Comparator.comparing(Worker::getName)
// =>3сп.:вн.ст.кл.impl.Comporator<W>+@compare() => 4сп:comporable<Obj>+@compareTo()
        ArrayList<Worker> workers = new ArrayList<>();
        Collections.addAll(workers, new Worker("Ivan", 25), new Worker("Ann", 25), new Worker("Valera", 18));
        System.out.println(workers);
        Collections.sort(workers, new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
//                return o1.getName().compareTo(o2.getName());
                if (o1.getAge() > o2.getAge())
                    return 1;
                else if (o1.getAge() < o2.getAge())
                    return -1;
                else return 0;
            }
        });
        System.out.println(workers);
        Collections.sort(workers, ((o1, o2) -> o1.getAge() - o2.getAge()));
        Collections.sort(workers, Comparator.comparing(Worker::getAge).thenComparing(Worker::getName));
        System.out.println(workers);
        Collections.sort(workers, new Worker.AgeComporator());
        System.out.println(workers);
        Collections.sort(workers, new Worker.NameComporator());
        System.out.println(workers);
//        Collections.sort(workers);
//        System.out.println(workers);
    }
}
