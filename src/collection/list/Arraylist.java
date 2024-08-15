package collection.list;

import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(10);
        a.add(40);
        a.add(50);

        System.out.println(a);

        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }

        System.out.println();

        Iterator<Integer> i = a.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
    }
}
