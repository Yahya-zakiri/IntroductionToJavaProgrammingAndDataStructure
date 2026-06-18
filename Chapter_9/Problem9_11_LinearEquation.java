// Problem 9.11
// LinearEquation class
// Chapter_9

public class Problem9_11_LinearEquation {
    public static class LinearEquation {
        private double a, b, c, d, e, f;

        public LinearEquation(double a, double b, double c, double d, double e, double f) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
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

        public double getD() {
            return d;
        }

        public double getE() {
            return e;
        }

        public double getF() {
            return f;
        }

        public boolean isSolvable() {
            return a * d - b * c != 0;
        }

        public double getX() {
            return (e * d - b * f) / (a * d - b * c);
        }

        public double getY() {
            return (a * f - e * c) / (a * d - b * c);
        }
    }

    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.print("Enter a b c d e f: ");
        double a = in.nextDouble(), b = in.nextDouble(), c = in.nextDouble(), d = in.nextDouble(), e = in.nextDouble(),
                f = in.nextDouble();
        LinearEquation le = new LinearEquation(a, b, c, d, e, f);
        if (!le.isSolvable())
            System.out.println("The equation has no solution.");
        else
            System.out.printf("x=%.4f y=%.4f\n", le.getX(), le.getY());
        in.close();
    }
}