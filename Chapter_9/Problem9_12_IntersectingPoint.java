// Problem 9.12
// Intersecting point of two line segments using LinearEquation
// Chapter_9

public class Problem9_12_IntersectingPoint {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.println("Enter four endpoints x1 y1 x2 y2 x3 y3 x4 y4:");
        double x1 = in.nextDouble(), y1 = in.nextDouble(), x2 = in.nextDouble(), y2 = in.nextDouble();
        double x3 = in.nextDouble(), y3 = in.nextDouble(), x4 = in.nextDouble(), y4 = in.nextDouble();
        // Solve using linear equations as in 3.25
        double a = y1 - y2;
        double b = x2 - x1;
        double c = y3 - y4;
        double d = x4 - x3;
        double e = a * x1 + b * y1;
        double f = c * x3 + d * y3;
        Problem9_11_LinearEquation.LinearEquation le = new Problem9_11_LinearEquation.LinearEquation(a, b, c, d, e, f);
        if (!le.isSolvable())
            System.out.println("The two lines are parallel");
        else
            System.out.printf("The intersecting point is (%.4f, %.4f)\n", le.getX(), le.getY());
        in.close();
    }
}