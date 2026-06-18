// Problem 11.7
// shuffle(ArrayList<Integer>)
// Chapter_11

import java.util.ArrayList;
import java.util.Collections;

public class Problem11_7 {
    public static void shuffle(ArrayList<Integer> list) {
        Collections.shuffle(list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 1; i <= 10; i++)
            l.add(i);
        shuffle(l);
        System.out.println(l);
    }
}