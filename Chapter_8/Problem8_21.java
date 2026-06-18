// Problem 8.21
// Central city
// Chapter_8

import java.util.Scanner;

public class Problem8_21 {
    public static double distance(double x1, double y1, double x2, double y2) {
        double dx = x1 - x2, dy = y1 - y2;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of cities: ");
        int n = in.nextInt();
        System.out.println("Enter the coordinates of the cities:");
        double[][] pts = new double[n][2];
        for (int i = 0; i < n; i++) {
            pts[i][0] = in.nextDouble();
            pts[i][1] = in.nextDouble();
        }
        int center = 0;
        double minSum = Double.POSITIVE_INFINITY;
        for (int i = 0; i < n; i++) {
            double sum = 0;
            for (int j = 0; j < n; j++)
                sum += distance(pts[i][0], pts[i][1], pts[j][0], pts[j][1]);
            if (sum < minSum) {
                minSum = sum;
                center = i;
            }
        }
        System.out.printf("The central city is at (%.1f, %.1f)\n", pts[center][0], pts[center][1]);
        System.out.printf("The total distance to all other cities is %.2f\n", minSum);
        in.close();
    }
}