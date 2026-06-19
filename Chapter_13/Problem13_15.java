// Problem13_15
// Chapter 13 - Rational using BigInteger

import java.math.BigInteger;
import java.util.Scanner;

public class Problem13_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first rational (num denom): ");
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        System.out.print("Enter second rational (num denom): ");
        BigInteger c = sc.nextBigInteger();
        BigInteger d = sc.nextBigInteger();
        BigR r1 = new BigR(a, b), r2 = new BigR(c, d);
        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r2 + " is " + r2.toDouble());
    }
}

class BigR {
    BigInteger n, d;

    public BigR(BigInteger n, BigInteger d) {
        this.n = n;
        this.d = d;
        normalize();
    }

    private void normalize() {
        BigInteger g = n.gcd(d);
        n = n.divide(g);
        d = d.divide(g);
        if (d.signum() < 0) {
            d = d.negate();
            n = n.negate();
        }
    }

    public BigR add(BigR o) {
        return new BigR(n.multiply(o.d).add(o.n.multiply(d)), d.multiply(o.d));
    }

    public BigR subtract(BigR o) {
        return new BigR(n.multiply(o.d).subtract(o.n.multiply(d)), d.multiply(o.d));
    }

    public BigR multiply(BigR o) {
        return new BigR(n.multiply(o.n), d.multiply(o.d));
    }

    public BigR divide(BigR o) {
        return new BigR(n.multiply(o.d), d.multiply(o.n));
    }

    public double toDouble() {
        return new java.math.BigDecimal(n).divide(new java.math.BigDecimal(d), 16, java.math.RoundingMode.HALF_UP)
                .doubleValue();
    }

    public String toString() {
        return n + "/" + d;
    }
}
