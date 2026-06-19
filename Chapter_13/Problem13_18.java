// Problem13_18
// Chapter 13 - Sum series using BigR (to avoid overflow)

public class Problem13_18 {
    public static void main(String[] args) {
        // sum_{i=1..99} i/(i+1) ? The problem text is ambiguous; implement sum of
        // 1/2+2/3+...+99/100
        BigR sum = new BigR(java.math.BigInteger.ZERO, java.math.BigInteger.ONE);
        for (int i = 1; i <= 99; i++)
            sum = sum.add(new BigR(java.math.BigInteger.valueOf(i), java.math.BigInteger.valueOf(i + 1)));
        System.out.println("Sum = " + sum);
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

    public BigR add(BigR o) {
        return new BigR(n.multiply(o.d).add(o.n.multiply(d)), d.multiply(o.d));
    }

    public String toString() {
        return n + "/" + d;
    }
}
