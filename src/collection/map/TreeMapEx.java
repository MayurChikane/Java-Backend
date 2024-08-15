package collection.map;

import java.util.*;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<Integer, String> t = new TreeMap<>();

        t.put(3, "Mayur");
        t.put(4, "Sakharam");
        t.put(5, "Chikane");
        t.put(6, "Sawargaon");
        t.put(1, "Parner");
        t.put(7, "A.Nagar");
        t.put(2, "Maharashtra");

        System.out.println(t);

        for (Map.Entry<Integer, String> e : t.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
