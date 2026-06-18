// Problem 8.33
// Polygon subareas (four-vertex polygon)
// Chapter_8

import java.util.Arrays;
import java.util.Scanner;

public class Problem8_33 {
    public static double triArea(double[] a, double[] b, double[] c) {
        double area = Math.abs(a[0] * (b[1] - c[1]) + b[0] * (c[1] - a[1]) + c[0] * (a[1] - b[1])) / 2.0;
        return area;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4:");
        double[][] v = new double[4][2];
        for (int i = 0; i < 4; i++) {
            v[i][0] = in.nextDouble();
            v[i][1] = in.nextDouble();
        }
        double[] areas = new double[4];
        areas[0] = triArea(v[0], v[1], v[2]);
        areas[1] = triArea(v[0], v[1], v[3]);
        areas[2] = triArea(v[0], v[2], v[3]);
        areas[3] = triArea(v[1], v[2], v[3]);
        Arrays.sort(areas);
        System.out.print("The areas are ");
        for (double a : areas)
            System.out.printf("%.2f ", a);
        System.out.println();
        in.close();
    }
}
