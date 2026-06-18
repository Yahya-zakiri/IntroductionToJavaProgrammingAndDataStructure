// Problem 11.14
// union of two ArrayLists
// Chapter_11

import java.util.ArrayList;
import java.util.Scanner;

public class Problem11_14 {
    public static ArrayList<Integer> union(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> r = new ArrayList<>(a);
        r.addAll(b);
        return r;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>(), b = new ArrayList<>();
        System.out.print("Enter five integers for list1: ");
        for (int i = 0; i < 5; i++)
            a.add(in.nextInt());
        System.out.print("Enter five integers for list2: ");
        for (int i = 0; i < 5; i++)
            b.add(in.nextInt());
        ArrayList<Integer> u = union(a, b);
        System.out.print("The combined list is ");
        for (int v : u)
            System.out.print(v + " ");
        System.out.println();
        in.close();
    }
}