package collection.set;

import java.util.*;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>();
        t.add(1);
        t.add(2);
        t.add(15);
        t.add(21);
        t.add(17);
        t.add(75);

        System.out.println(t);

        Iterator<Integer> i = t.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
    }
}
