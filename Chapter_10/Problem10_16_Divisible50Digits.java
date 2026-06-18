// Problem 10.16
// First 10 numbers with 50 digits divisible by 2 or 3
// Chapter_10

import java.math.BigInteger;

public class Problem10_16_Divisible50Digits {
    public static void main(String[] args) {
        BigInteger start = BigInteger.TEN.pow(49); // smallest 50-digit number
        int found = 0;
        BigInteger n = start;
        while (found < 10) {
            if (n.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)
                    || n.mod(BigInteger.valueOf(3)).equals(BigInteger.ZERO)) {
                System.out.println(n);
                found++;
            }
            n = n.add(BigInteger.ONE);
        }
    }
}