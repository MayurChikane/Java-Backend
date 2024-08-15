package collection.set;

import java.util.HashSet;
import java.util.*;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();
        h.add(25);
        h.add(26);
        h.add(26);
        h.add(27);
        h.add(28);
        h.add(25);
        h.add(29);
        h.add(30);

        System.out.println(h);

        HashSet<String> hs = new HashSet<>();
        hs.add("Mayur");
        hs.add("Sakharam");
        hs.add("Chikane");
        hs.add("Mayur");

        System.out.println(hs);
        Iterator<String> i = hs.iterator();
        while (i.hasNext()) {
            System.out.println(i.next() + " ");
        }
    }
}
