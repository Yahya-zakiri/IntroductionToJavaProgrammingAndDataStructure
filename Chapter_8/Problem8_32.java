// Problem 8.32
// Area of a triangle
// Chapter_8

import java.util.Scanner;

public class Problem8_32 {
    public static double getTriangleArea(double[][] p) {
        double x1 = p[0][0], y1 = p[0][1];
        double x2 = p[1][0], y2 = p[1][1];
        double x3 = p[2][0], y3 = p[2][1];
        double area = Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0;
        return area;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
        double[][] p = new double[3][2];
        for (int i = 0; i < 3; i++) {
            p[i][0] = in.nextDouble();
            p[i][1] = in.nextDouble();
        }
        double area = getTriangleArea(p);
        if (Math.abs(area) < 1e-12)
            System.out.println("The three points are on the same line");
        else
            System.out.printf("The area of the triangle is %.2f\n", area);
        in.close();
    }
}
