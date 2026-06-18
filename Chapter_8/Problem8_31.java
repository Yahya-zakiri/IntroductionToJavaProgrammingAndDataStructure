// Problem 8.31
// Intersecting point of two lines
// Chapter_8

import java.util.Scanner;

public class Problem8_31 {
    public static double[] getIntersectingPoint(double[][] p) {
        double x1 = p[0][0], y1 = p[0][1];
        double x2 = p[1][0], y2 = p[1][1];
        double x3 = p[2][0], y3 = p[2][1];
        double x4 = p[3][0], y4 = p[3][1];
        double denom = (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4);
        if (Math.abs(denom) < 1e-12)
            return null;
        double numx = (x1 * y2 - y1 * x2) * (x3 - x4) - (x1 - x2) * (x3 * y4 - y3 * x4);
        double numy = (x1 * y2 - y1 * x2) * (y3 - y4) - (y1 - y2) * (x3 * y4 - y3 * x4);
        double x = numx / denom;
        double y = numy / denom;
        return new double[] { x, y };
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter four points (x1 y1 x2 y2 x3 y3 x4 y4):");
        double[][] p = new double[4][2];
        for (int i = 0; i < 4; i++) {
            p[i][0] = in.nextDouble();
            p[i][1] = in.nextDouble();
        }
        double[] ip = getIntersectingPoint(p);
        if (ip == null)
            System.out.println("The two lines are parallel");
        else
            System.out.printf("The intersecting point is (%.4f, %.4f)\n", ip[0], ip[1]);
        in.close();
    }
}
