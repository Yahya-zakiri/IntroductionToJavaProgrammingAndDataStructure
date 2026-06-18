// Problem 11.17
// Smallest n so that m*n is perfect square
// Chapter_11

import java.util.*;
import java.util.Scanner;

public class Problem11_17 {
    public static ArrayList<Integer> factors(int m) {
        ArrayList<Integer> f = new ArrayList<>();
        for (int p = 2; p <= m / p; p++) {
            while (m % p == 0) {
                f.add(p);
                m /= p;
            }
        }
        if (m > 1)
            f.add(m);
        return f;
    }

    public static int smallestN(int m) {
        ArrayList<Integer> f = factors(m);
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int v : f)
            cnt.put(v, cnt.getOrDefault(v, 0) + 1);
        int n = 1;
        for (Map.Entry<Integer, Integer> e : cnt.entrySet())
            if (e.getValue() % 2 != 0)
                n *= e.getKey();
        return n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer m: ");
        int m = in.nextInt();
        int n = smallestN(m);
        System.out.println("The smallest number n for m * n to be a perfect square is " + n);
        System.out.println("m * n is " + (m * n));
        in.close();
    }
}