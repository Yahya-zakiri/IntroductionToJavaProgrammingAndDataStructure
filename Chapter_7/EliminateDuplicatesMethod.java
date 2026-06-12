//Chapter 7
//Programming exercises
//(Eliminate duplicates)

import java.util.Scanner;
import java.util.ArrayList;

public class EliminateDuplicatesMethod {
    public static int[] eliminateDuplicates(int[] list) {
        ArrayList<Integer> out = new ArrayList<>();
        for (int v : list)
            if (!out.contains(v))
                out.add(v);
        int[] res = new int[out.size()];
        for (int i = 0; i < res.length; i++)
            res[i] = out.get(i);
        return res;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        int[] a = new int[10];
        for (int i = 0; i < 10; i++)
            a[i] = input.nextInt();
        int[] distinct = eliminateDuplicates(a);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < distinct.length; i++) {
            System.out.print(distinct[i] + (i < distinct.length - 1 ? " " : ""));
        }
        System.out.println();
        input.close();
    }
}