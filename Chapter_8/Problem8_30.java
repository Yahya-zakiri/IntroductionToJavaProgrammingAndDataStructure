// Problem 8.30
// Solve 2x2 linear equations
// Chapter_8

import java.util.Scanner;

public class Problem8_30 {
    public static double[] linearEquation(double[][] a, double[] b) {
        double det = a[0][0] * a[1][1] - a[0][1] * a[1][0];
        if (Math.abs(det) < 1e-12)
            return null;
        double x = (b[0] * a[1][1] - b[1] * a[0][1]) / det;
        double y = (b[1] * a[0][0] - b[0] * a[1][0]) / det;
        return new double[] { x, y };
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a00, a01, a10, a11, b0, b1: ");
        double a00 = in.nextDouble(), a01 = in.nextDouble(), a10 = in.nextDouble(), a11 = in.nextDouble();
        double b0 = in.nextDouble(), b1 = in.nextDouble();
        double[][] a = { { a00, a01 }, { a10, a11 } };
        double[] b = { b0, b1 };
        double[] sol = linearEquation(a, b);
        if (sol == null)
            System.out.println("The equation has no solution.");
        else
            System.out.printf("x is %.4f and y is %.4f\n", sol[0], sol[1]);
        in.close();
    }
}
