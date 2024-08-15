package collection.list;

import java.util.*;

public class VectorEx {
  public static void main(String[] args) {
    Vector<Integer> v = new Vector<Integer>();
    v.add(25);
    v.add(27);
    v.add(26);
    v.add(29);
    v.add(30);
    v.add(25);

    System.out.println(v);

    for (int i = 0; i < v.size(); i++) {
      System.out.print(v.get(i) + " ");
    }
  }
}
