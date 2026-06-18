// Problem 10.19
// Mersenne primes for p <= 100
// Chapter_10

import java.math.BigInteger;

public class Problem10_19_MersennePrimes {
    public static void main(String[] args) {
        for (int p = 2; p <= 100; p++) {
            if (!BigInteger.valueOf(p).isProbablePrime(10))
                continue;
            BigInteger m = BigInteger.TWO.pow(p).subtract(BigInteger.ONE);
            if (m.isProbablePrime(20))
                System.out.println(p + "\t" + m);
        }
    }
}