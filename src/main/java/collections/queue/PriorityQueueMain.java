package collections.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueMain {
    public static void main(String[] args) {
        Queue <String> prior = new PriorityQueue<>();
//        Queue <String> prior = new PriorityQueue<>(Comparator.reverseOrder());//передаем в конструктор компаратор с обратной сортировкой
        prior.offer("J");
        prior.offer("A");
        prior.offer("V");
        prior.offer("A");
        prior.offer("2");
        while (!prior.isEmpty())
        System.out.println(prior.poll());
    }
}
