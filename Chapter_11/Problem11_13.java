// Problem 11.13
// removeDuplicate(ArrayList<Integer>)
// Chapter_11

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Problem11_13 {
    public static void removeDuplicate(ArrayList<Integer> list) {
        LinkedHashSet<Integer> s = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(s);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++)
            list.add(in.nextInt());
        removeDuplicate(list);
        System.out.print("The distinct integers are ");
        for (int v : list)
            System.out.print(v + " ");
        System.out.println();
        in.close();
    }
}