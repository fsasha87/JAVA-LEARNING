package collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeMain {
    public static void main(String[] args) {
        //ArrayDeque as stack:
        Deque <Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        //поведение стека - FirstInLastOut
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

        //ArrayDeque as Queue:
        Deque <Integer> queue = new ArrayDeque<>();
        queue.offer(11);
        queue.offer(22);
        queue.offer(33);
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
