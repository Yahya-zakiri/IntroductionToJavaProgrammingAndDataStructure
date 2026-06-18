// Problem 10.18
// Five prime numbers larger than Long.MAX_VALUE
// Chapter_10

import java.math.BigInteger;
import java.util.Random;

public class Problem10_18_LargePrimes {
    public static void main(String[] args) {
        Random rnd = new Random();
        int found = 0;
        while (found < 5) {
            BigInteger p = BigInteger.probablePrime(65, rnd); // > 2^64
            if (p.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) {
                System.out.println(p);
                found++;
            }
        }
    }
}