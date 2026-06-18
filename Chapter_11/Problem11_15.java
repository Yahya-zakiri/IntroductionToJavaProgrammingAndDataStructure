// Problem 11.15
// Area of convex polygon (shoelace formula)
// Chapter_11

import java.util.Scanner;

public class Problem11_15 {
    public static double polygonArea(double[][] pts) {
        int n = pts.length;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            int j = (i + 1) % n;
            sum += pts[i][0] * pts[j][1] - pts[j][0] * pts[i][1];
        }
        return Math.abs(sum) / 2.0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int n = in.nextInt();
        double[][] pts = new double[n][2];
        System.out.println("Enter the coordinates of the points:");
        for (int i = 0; i < n; i++) {
            pts[i][0] = in.nextDouble();
            pts[i][1] = in.nextDouble();
        }
        System.out.printf("The total area is %.2f\n", polygonArea(pts));
        in.close();
    }
}