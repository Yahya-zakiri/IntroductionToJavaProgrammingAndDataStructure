// Problem13_20
// Chapter 13 - Quadratic solver using Complex class

import java.util.Scanner;

public class Problem13_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        double disc = b * b - 4 * a * c;
        if (disc >= 0) {
            double r1 = (-b + Math.sqrt(disc)) / (2 * a);
            double r2 = (-b - Math.sqrt(disc)) / (2 * a);
            if (Math.abs(r1 - r2) < 1e-9)
                System.out.println("The root is " + r1);
            else
                System.out.println("The roots are " + r1 + " and " + r2);
        } else {
            Complex r = new Complex(-b / (2 * a), Math.sqrt(-disc) / (2 * a));
            Complex s = new Complex(-b / (2 * a), -Math.sqrt(-disc) / (2 * a));
            System.out.println("The roots are " + r + " and " + s);
        }
    }
}

class Complex {
    double a, b;

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public String toString() {
        return String.format("%s + %si", a, b);
    }
}
