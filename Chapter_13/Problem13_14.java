// Problem13_14
// Chapter 13 - Rational using long[] r for numerator/denominator

import java.math.BigInteger;

public class Problem13_14 {
    public static void main(String[] args) {
        Rational r1 = new Rational(3, 4);
        Rational r2 = new Rational(2, 5);
        System.out.println(r1.add(r2));
    }
}

class Rational {
    private long[] r = new long[2];

    public Rational(long n, long d) {
        r[0] = n;
        r[1] = d;
        normalize();
    }

    private void normalize() {
        long g = gcd(Math.abs(r[0]), Math.abs(r[1]));
        r[0] /= g;
        r[1] /= g;
        if (r[1] < 0) {
            r[1] = -r[1];
            r[0] = -r[0];
        }
    }

    private long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public Rational add(Rational o) {
        return new Rational(r[0] * o.r[1] + o.r[0] * r[1], r[1] * o.r[1]);
    }

    public String toString() {
        return r[0] + "/" + r[1];
    }
}
