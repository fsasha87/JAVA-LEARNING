package collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        //создаем очередь с помощью инициализации объекта LinkedList
        Queue<String> queue = new LinkedList<String>() {//добавляем эл-нт в очередб, используя анонимный класс
            {
                this.offer("Jeans");
            }
        };
        queue.add("Dress");//2сп добавление эл-та
        queue.offer("T-shirt");
        queue.forEach(System.out::println);//выведет все эл-ты очереди
        queue.remove();//удалит первый элемент FIFO
        queue.remove("Dress");//удалит указанный эл-нт
        queue.removeIf(s -> s.endsWith("t"));//удаляет эл-ты с указаным окончанием
        queue.clear();//очищает очередь
        System.out.println(queue.peek());//возвращает не удаляя 1й єл-нт, если пусто то null
        System.out.println(queue.element());//возвращает не удаляя 1й єл-нт, если пусто то NoSuchElementException
        queue.stream().filter(s -> s.endsWith("s")).forEach(System.out::println);//выводит эл-т с указаным окончанием
            


    }
}
