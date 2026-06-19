// Problem13_21
// Chapter 13 - Vertex form h and k as rationals using BigR

import java.util.Scanner;

public class Problem13_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong();
        // h = -b/(2a)
        BigR h = new BigR(java.math.BigInteger.valueOf(-b), java.math.BigInteger.valueOf(2 * a));
        // k = c - b^2/(4a) => (4ac - b^2)/4a
        java.math.BigInteger num = java.math.BigInteger.valueOf(4 * a * c - b * b);
        java.math.BigInteger den = java.math.BigInteger.valueOf(4 * a);
        BigR k = new BigR(num, den);
        System.out.println("h is " + h + " k is " + k);
    }
}

class BigR {
    java.math.BigInteger n, d;

    public BigR(java.math.BigInteger n, java.math.BigInteger d) {
        this.n = n;
        this.d = d;
        normalize();
    }

    private void normalize() {
        java.math.BigInteger g = n.gcd(d);
        n = n.divide(g);
        d = d.divide(g);
        if (d.signum() < 0) {
            d = d.negate();
            n = n.negate();
        }
    }

    public String toString() {
        return n + "/" + d;
    }
}
