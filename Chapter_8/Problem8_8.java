// Problem 8.8
// All closest pairs of points
// Chapter_8

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem8_8 {
    public static double distanceSquared(double[] p1, double[] p2) {
        double dx = p1[0] - p2[0];
        double dy = p1[1] - p2[1];
        return dx * dx + dy * dy;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int n = input.nextInt();
        System.out.print("Enter " + n + " points: ");
        double[][] points = new double[n][2];
        for (int i = 0; i < n; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        double minDistSq = Double.POSITIVE_INFINITY;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double d2 = distanceSquared(points[i], points[j]);
                if (d2 < minDistSq)
                    minDistSq = d2;
            }
        }

        double eps = 1e-12;
        List<int[]> pairs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double d2 = distanceSquared(points[i], points[j]);
                if (Math.abs(d2 - minDistSq) < eps)
                    pairs.add(new int[] { i, j });
            }
        }

        for (int[] p : pairs) {
            System.out.printf("The closest two points are (%.1f, %.1f) and (%.1f, %.1f)\n",
                    points[p[0]][0], points[p[0]][1], points[p[1]][0], points[p[1]][1]);
        }
        System.out.println("Their distance is " + Math.sqrt(minDistSq));
        input.close();
    }
}
