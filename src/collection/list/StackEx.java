package collection.list;

import java.util.*;

public class StackEx {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(1);

        System.out.println(s);

        s.pop();
        System.out.println(s);

        for (int i = 0; i < s.size(); i++) {
            System.out.print(s.get(i) + " ");
        }
    }
}
