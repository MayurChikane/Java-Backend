package collection.queue;

import java.util.ArrayDeque;

public class ArrayDequeEx {
    public static void main(String[] args) {
        ArrayDeque<Integer> a = new ArrayDeque<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);

        System.out.println(a);

        a.clear();
        a.addFirst(5);
        a.add(6);
        a.addLast(7);
        a.add(9);
        a.addFirst(1);
        a.addFirst(5);
        System.out.println(a);
    }
}
