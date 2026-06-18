// Problem 9.10
// QuadraticEquation class
// Chapter_9

public class Problem9_10_QuadraticEquation {
    public static class QuadraticEquation {
        private double a, b, c;

        public QuadraticEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double getA() {
            return a;
        }

        public double getB() {
            return b;
        }

        public double getC() {
            return c;
        }

        public double getDiscriminant() {
            return b * b - 4 * a * c;
        }

        public double getRoot1() {
            double d = getDiscriminant();
            if (d < 0)
                return 0;
            return (-b + Math.sqrt(d)) / (2 * a);
        }

        public double getRoot2() {
            double d = getDiscriminant();
            if (d < 0)
                return 0;
            return (-b - Math.sqrt(d)) / (2 * a);
        }
    }

    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = in.nextDouble(), b = in.nextDouble(), c = in.nextDouble();
        QuadraticEquation q = new QuadraticEquation(a, b, c);
        double d = q.getDiscriminant();
        if (d > 0)
            System.out.printf("Root1=%.4f Root2=%.4f\n", q.getRoot1(), q.getRoot2());
        else if (d == 0)
            System.out.printf("Root=%.4f\n", q.getRoot1());
        else
            System.out.println("The equation has no roots.");
        in.close();
    }
}