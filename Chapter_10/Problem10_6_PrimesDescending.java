// Problem 10.6
// Display primes less than 120 in decreasing order
// Chapter_10

import java.util.Stack;

public class Problem10_6_PrimesDescending {
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2)
            if (n % i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        for (int i = 2; i < 120; i++)
            if (isPrime(i))
                s.push(i);
        while (!s.isEmpty())
            System.out.println(s.pop());
    }
}