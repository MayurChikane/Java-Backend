package collection.set;

import java.util.*;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        LinkedHashSet<Integer> l = new LinkedHashSet<>();

        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(1);
        l.addFirst(10);
        System.out.println(l);
        l.remove(5);
        System.out.println(l);

        Iterator<Integer> i = l.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
    }
}
