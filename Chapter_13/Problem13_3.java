// Problem13_3
// Chapter 13 - Sort ArrayList<Number>

import java.util.ArrayList;
import java.util.Collections;

public class Problem13_3 {
    public static void sort(ArrayList<Number> list) {
        Collections.sort(list, (a, b) -> Double.compare(a.doubleValue(), b.doubleValue()));
    }

    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(5);
        list.add(2.2);
        list.add(9);
        list.add(1.5);
        System.out.println("Before: " + list);
        sort(list);
        System.out.println("After: " + list);
    }
}
