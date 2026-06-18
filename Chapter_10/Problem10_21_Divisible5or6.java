// Problem 10.21
// First 10 numbers greater than Long.MAX_VALUE divisible by 5 or 6
// Chapter_10

import java.math.BigInteger;

public class Problem10_21_Divisible5or6 {
    public static void main(String[] args) {
        BigInteger start = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE);
        int found = 0;
        BigInteger n = start;
        while (found < 10) {
            if (n.mod(BigInteger.valueOf(5)).equals(BigInteger.ZERO)
                    || n.mod(BigInteger.valueOf(6)).equals(BigInteger.ZERO)) {
                System.out.println(n);
                found++;
            }
            n = n.add(BigInteger.ONE);
        }
    }
}