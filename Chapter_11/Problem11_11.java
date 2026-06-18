// Problem 11.11
// sort(ArrayList<Integer>)
// Chapter_11

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem11_11 {
    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter five numbers:");
        for (int i = 0; i < 5; i++)
            list.add(in.nextInt());
        sort(list);
        for (int v : list)
            System.out.print(v + " ");
        System.out.println();
        in.close();
    }
}