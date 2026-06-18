// Problem 11.4
// max(ArrayList<Integer>)
// Chapter_11

import java.util.ArrayList;
import java.util.Scanner;

public class Problem11_4 {
    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.size() == 0)
            return null;
        Integer m = list.get(0);
        for (Integer v : list)
            if (v > m)
                m = v;
        return m;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter numbers ending with 0:");
        while (true) {
            int v = in.nextInt();
            if (v == 0)
                break;
            list.add(v);
        }
        System.out.println("Max: " + max(list));
        in.close();
    }
}