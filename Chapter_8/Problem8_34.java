// Problem 8.34
// Rightmost lowest point
// Chapter_8

import java.util.Scanner;

public class Problem8_34 {
    public static double[] getRightmostLowestPoint(double[][] points) {
        int idx = 0;
        for (int i = 1; i < points.length; i++) {
            if (points[i][1] < points[idx][1] || (points[i][1] == points[idx][1] && points[i][0] > points[idx][0])) {
                idx = i;
            }
        }
        return new double[] { points[idx][0], points[idx][1] };
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 6 points: ");
        double[][] pts = new double[6][2];
        for (int i = 0; i < 6; i++) {
            pts[i][0] = in.nextDouble();
            pts[i][1] = in.nextDouble();
        }
        double[] p = getRightmostLowestPoint(pts);
        System.out.printf("The rightmost lowest point is (%.1f, %.1f)\n", p[0], p[1]);
        in.close();
    }
}
