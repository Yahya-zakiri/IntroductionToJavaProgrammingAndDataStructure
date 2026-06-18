// Problem 8.15
// Geometry: same line? check if all points are collinear
// Chapter_8

import java.util.Scanner;

public class Problem8_15 {
    public static boolean sameLine(double[][] points) {
        int n = points.length;
        if (n < 3)
            return true;
        double x0 = points[0][0], y0 = points[0][1];
        double x1 = points[1][0], y1 = points[1][1];
        double dx = x1 - x0, dy = y1 - y0;
        double eps = 1e-8;
        for (int i = 2; i < n; i++) {
            double xi = points[i][0], yi = points[i][1];
            if (Math.abs(dx * (yi - y0) - dy * (xi - x0)) > eps)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter five points: ");
        double[][] pts = new double[5][2];
        for (int i = 0; i < 5; i++) {
            pts[i][0] = in.nextDouble();
            pts[i][1] = in.nextDouble();
        }
        if (sameLine(pts))
            System.out.println("The five points are on the same line");
        else
            System.out.println("The five points are not on the same line");
        in.close();
    }
}
