package collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeMain {
    public static void main(String[] args) {
        //ArrayDeque as stack:
        Deque <Integer> stack = new ArrayDeque<>();
        stack.push(2);
        stack.push(1);
        stack.push(3);
        //поведение стека - FirstInLastOut
        while(!stack.isEmpty()){
            System.out.println(stack.pop());// 3 1 2
        }

        //ArrayDeque as Queue:
        Deque <Integer> queue = new ArrayDeque<>();
        queue.offer(2);
        queue.offer(1);
        queue.offer(3);
        while (!queue.isEmpty()){
            System.out.println(queue.poll());// 2 1 3
        }
    }
}
