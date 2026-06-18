// Problem 8.7
// Nearest two points in 3D
// Chapter_8

public class Problem8_7 {
    public static double distance(double[] p1, double[] p2) {
        double dx = p1[0] - p2[0];
        double dy = p1[1] - p2[1];
        double dz = p1[2] - p2[2];
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    public static void main(String[] args) {
        double[][] points = { { -1, 0, 3 }, { -1, -1, -1 }, { 4, 1, 1 }, { 2, 0.5, 9 }, { 3.5, 2, -1 }, { 3, 1.5, 3 },
                { -1.5, 4, 2 }, { 5.5, 4, -0.5 } };
        int p1 = 0, p2 = 1;
        double minDist = distance(points[0], points[1]);
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double d = distance(points[i], points[j]);
                if (d < minDist) {
                    minDist = d;
                    p1 = i;
                    p2 = j;
                }
            }
        }
        System.out.printf("The closest two points are (%.1f, %.1f, %.1f) and (%.1f, %.1f, %.1f)\n",
                points[p1][0], points[p1][1], points[p1][2],
                points[p2][0], points[p2][1], points[p2][2]);
        System.out.println("Their distance is " + minDist);
    }
}
