package collection.queue;

import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        p.add(25);
        p.add(26);
        p.add(27);
        p.add(28);
        p.add(29);
        p.add(30);
        p.add(25);

        System.out.println(p);
        System.out.println(p.peek());
        System.out.println(p.poll());
        System.out.println(p.poll());
        System.out.println(p.peek());
    }
}
