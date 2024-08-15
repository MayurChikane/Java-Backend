package collection.list;

import java.util.*;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(25);
        ll.add(0, 56);
        ll.add(1, 85);
        ll.add(87);
        ll.add(4, 85);

        System.out.println(ll);

        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + " ");
        }
    }
}
