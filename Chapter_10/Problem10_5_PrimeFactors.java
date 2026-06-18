// Problem 10.5
// Display the prime factors
// Chapter_10

import java.util.Stack;
import java.util.Scanner;

public class Problem10_5_PrimeFactors {
    public static Stack<Integer> smallestFactors(int n) {
        Stack<Integer> s = new Stack<>();
        int num = n;
        for (int i = 2; i <= num / i; i++) {
            while (n % i == 0) {
                s.push(i);
                n /= i;
            }
        }
        if (n > 1)
            s.push(n);
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = in.nextInt();
        Stack<Integer> s = smallestFactors(n);
        // s has ascending factors; print in decreasing order by popping
        java.util.List<Integer> out = new java.util.ArrayList<>();
        while (!s.isEmpty())
            out.add(s.pop());
        for (int i = 0; i < out.size(); i++) {
            System.out.print(out.get(i));
            if (i < out.size() - 1)
                System.out.print(", ");
        }
        System.out.println();
        in.close();
    }
}