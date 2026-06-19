// Problem13_16
// Chapter 13 - Rational-number calculator using BigR from Problem13_15

public class Problem13_16 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: operand1 operator operand2 where operand is num/den");
            return;
        }
        BigR a = parse(args[0]), b = parse(args[2]);
        String op = args[1];
        switch (op) {
            case "+":
                System.out.println(a.add(b));
                break;
            case "-":
                System.out.println(a.subtract(b));
                break;
            case "*":
                System.out.println(a.multiply(b));
                break;
            case "/":
                System.out.println(a.divide(b));
                break;
        }
    }

    static BigR parse(String s) {
        String[] t = s.split("/");
        return new BigR(new java.math.BigInteger(t[0]), new java.math.BigInteger(t[1]));
    }
}

// Minimal BigR class reused
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

    public BigR subtract(BigR o) {
        return new BigR(n.multiply(o.d).subtract(o.n.multiply(d)), d.multiply(o.d));
    }

    public BigR multiply(BigR o) {
        return new BigR(n.multiply(o.n), d.multiply(o.d));
    }

    public BigR divide(BigR o) {
        return new BigR(n.multiply(o.d), d.multiply(o.n));
    }

    public String toString() {
        return n + "/" + d;
    }
}
