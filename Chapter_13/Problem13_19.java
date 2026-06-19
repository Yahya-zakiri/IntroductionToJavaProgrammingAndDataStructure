// Problem13_19
// Chapter 13 - Convert decimal to fraction using BigR

import java.util.Scanner;

public class Problem13_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        String s = sc.next();
        boolean neg = s.startsWith("-");
        if (neg)
            s = s.substring(1);
        String[] parts = s.split("\\.");
        java.math.BigInteger intPart = new java.math.BigInteger(parts[0]);
        java.math.BigInteger num = java.math.BigInteger.ZERO, den = java.math.BigInteger.ONE;
        if (parts.length > 1) {
            den = java.math.BigInteger.TEN.pow(parts[1].length());
            num = new java.math.BigInteger(parts[1]);
            num = intPart.multiply(den).add(num);
        } else {
            num = intPart;
        }
        if (neg)
            num = num.negate();
        BigR r = new BigR(num, den);
        System.out.println("The fraction number is " + r);
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
