// Problem13_17
// Chapter 13 - Complex class with add/sub/mul/div/abs, Comparable, Cloneable

import java.util.Scanner;

public class Problem13_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first complex number: ");
        double a = sc.nextDouble(), b = sc.nextDouble();
        System.out.print("Enter the second complex number: ");
        double c = sc.nextDouble(), d = sc.nextDouble();
        Complex x = new Complex(a, b), y = new Complex(c, d);
        System.out.println(x + " + " + y + " = " + x.add(y));
        System.out.println(x + " - " + y + " = " + x.subtract(y));
        System.out.println(x + " * " + y + " = " + x.multiply(y));
        System.out.println(x + " / " + y + " = " + x.divide(y));
        System.out.println("|" + x + "| = " + x.abs());
        System.out.println(x.equals(y));
        System.out.println(x.getRealPart());
        System.out.println(x.getImaginaryPart());
    }
}

class Complex implements Cloneable, Comparable<Complex> {
    private double a, b;

    public Complex() {
        this(0, 0);
    }

    public Complex(double a) {
        this(a, 0);
    }

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getRealPart() {
        return a;
    }

    public double getImaginaryPart() {
        return b;
    }

    public Complex add(Complex o) {
        return new Complex(a + o.a, b + o.b);
    }

    public Complex subtract(Complex o) {
        return new Complex(a - o.a, b - o.b);
    }

    public Complex multiply(Complex o) {
        return new Complex(a * o.a - b * o.b, b * o.a + a * o.b);
    }

    public Complex divide(Complex o) {
        double denom = o.a * o.a + o.b * o.b;
        return new Complex((a * o.a + b * o.b) / denom, (b * o.a - a * o.b) / denom);
    }

    public double abs() {
        return Math.hypot(a, b);
    }

    public String toString() {
        if (b == 0)
            return String.valueOf(a);
        return String.format("%s + %si", a, b);
    }

    public int compareTo(Complex o) {
        return Double.compare(this.abs(), o.abs());
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
