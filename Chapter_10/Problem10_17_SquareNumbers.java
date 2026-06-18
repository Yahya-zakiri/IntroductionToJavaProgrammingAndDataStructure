// Problem 10.17
// First 10 square numbers greater than Long.MAX_VALUE
// Chapter_10

import java.math.BigInteger;

public class Problem10_17_SquareNumbers {
    public static BigInteger bigIntSqrt(BigInteger n) {
        BigInteger a = BigInteger.ONE;
        BigInteger b = n.shiftRight(5).add(BigInteger.valueOf(8));
        while (b.compareTo(a) >= 0) {
            BigInteger mid = a.add(b).shiftRight(1);
            BigInteger msq = mid.multiply(mid);
            int cmp = msq.compareTo(n);
            if (cmp == 0)
                return mid;
            else if (cmp < 0)
                a = mid.add(BigInteger.ONE);
            else
                b = mid.subtract(BigInteger.ONE);
        }
        return a.subtract(BigInteger.ONE);
    }

    public static void main(String[] args) {
        BigInteger lim = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger start = bigIntSqrt(lim).add(BigInteger.ONE);
        for (int i = 0; i < 10; i++) {
            BigInteger sq = start.add(BigInteger.valueOf(i)).pow(2);
            System.out.println(sq);
        }
    }
}