// Problem13_2
// Chapter 13 - Shuffle ArrayList<Number>

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Problem13_2 {
    public static void shuffle(ArrayList<Number> list) {
        Collections.shuffle(list, new Random());
    }

    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++)
            list.add(i);
        System.out.println("Before: " + list);
        shuffle(list);
        System.out.println("After: " + list);
    }
}
