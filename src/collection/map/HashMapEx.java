package collection.map;

import java.util.*;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<Integer, String> h = new HashMap<>();
        h.put(1, "Mayur");
        h.put(2, "Sakharam");
        h.put(3, "Chikane");
        h.put(4, "Samarth");
        h.put(5, "Engineering");

        System.out.println(h);

        for (Map.Entry<Integer, String> e : h.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
